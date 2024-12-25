package org.example;

import antlr.SimpllangParser;
import antlr.SimpllangVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class SimpleVisitor extends AbstractParseTreeVisitor<String> implements SimpllangVisitor<String> {

    private int tempCount = 0;
    private int labelCount = 1;

    private String newTemp() {
        return "t" + (++tempCount);
    }

    private String newLabel() {
        return "L" + (labelCount++);
    }

    @Override
    public String visitProgram(SimpllangParser.ProgramContext ctx) {
        StringBuilder code = new StringBuilder();
        for (SimpllangParser.StmtContext stmt : ctx.stmt()) {
            code.append(visit(stmt)).append("\n");
        }
        return code.toString();
    }

    @Override
    public String visitStmt(SimpllangParser.StmtContext ctx) {
        if (ctx.varDecl() != null) return visit(ctx.varDecl());
        if (ctx.assignment() != null) return visit(ctx.assignment());
        if (ctx.print() != null) return visit(ctx.print());
        if (ctx.ifstmt() != null) return visit(ctx.ifstmt());
        if (ctx.whilestmt() != null) return visit(ctx.whilestmt());
        if (ctx.forstmt() != null) return visit(ctx.forstmt());
        if (ctx.blockstmt() != null) return visit(ctx.blockstmt());
        return "";

    }

    @Override
    public String visitStringExpr(SimpllangParser.StringExprContext ctx) {
        return ctx.STRING().getText();  // Строка
    }

    @Override
    public String visitLogicalExpr(SimpllangParser.LogicalExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        return left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitCompExpr(SimpllangParser.CompExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        return left + " " + ctx.compOperator().getText() + " " + right;
    }

    @Override
    public String visitPlusMinusExpr(SimpllangParser.PlusMinusExprContext ctx) {
        String left = visit(ctx.left);  // Обрабатываем левую часть выражения
        String right = visit(ctx.right);  // Обрабатываем правую часть выражения
        // Генерируем код для операции
        return left + " " + ctx.op.getText() + " " + right;

    }
    @Override
    public String visitBoolExpr(SimpllangParser.BoolExprContext ctx) {
        return ctx.BOOL().getText();  // Булевое значение
    }
    @Override
    public String visitParenthesisExpr(SimpllangParser.ParenthesisExprContext ctx) {
        return visit(ctx.expr());  // Просто возвращаем результат внутри скобок
    }
    @Override
    public String visitMulDivExpr(SimpllangParser.MulDivExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        return left + " " + ctx.op.getText() + " " + right;
    }
    @Override
    public String visitNumExpr(SimpllangParser.NumExprContext ctx) {
        return ctx.NUM().getText();
    }
    @Override
    public String visitIdExpr(SimpllangParser.IdExprContext ctx) {
        return ctx.ID().getText();  // Идентификатор в выражении
    }
    @Override
    public String visitCompOperator(SimpllangParser.CompOperatorContext ctx) {
        return ctx.op.getText();
    }
    @Override
    public String visitVarDecl(SimpllangParser.VarDeclContext ctx) {
        String varName = ctx.ID().getText();
        String expr = ctx.expr() != null ? visit(ctx.expr()) : "null";
        return varName + " = " + expr;
    }

    @Override
    public String visitAssignment(SimpllangParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        String expr = visit(ctx.expr());
        return id + " = " + expr;
    }

    @Override
    public String visitPrint(SimpllangParser.PrintContext ctx) {
        //        return "print " + visit(ctx.expr());

        StringBuilder code = new StringBuilder();
        // Получаем выражение для печати
        SimpllangParser.ExprContext exprCtx = ctx.expr();

        if (exprCtx instanceof SimpllangParser.PlusMinusExprContext plusMinusCtx) {

            String left = visit(plusMinusCtx.left); // Например, "Result is: "
            String tempLeft = newTemp();
            code.append(tempLeft).append(" = ").append(left).append("\n");

            // Обработка правой части
            String right = visit(plusMinusCtx.right); // Например, result
            String tempRight = newTemp();
            code.append(tempRight).append(" = ").append(tempLeft).append(" + ").append(right).append("\n");

            // Конкатенация
//            String tempConcat = newTemp();
//            code.append(tempConcat).append(" = ").append(tempLeft).append(" + ").append(tempRight).append("\n");

            // Печать результата
            code.append("print ").append(tempRight);
        } else {
            // Если это не бинарное выражение, просто выводим результат
            String expr = visit(exprCtx);
            code.append("print ").append(expr);
        }
        return code.toString();

    }

    @Override
    public String visitIfstmt(SimpllangParser.IfstmtContext ctx) {
        StringBuilder code = new StringBuilder();
        String condition = visit(ctx.expr()); // Генерация кода условия (включая t0 = x < y)
        String ifResult = visit(ctx.stmt());
        String elifResult = "";
        String elseResult;

        String label1 = newLabel();
        String label2 = newLabel();
        String label3 = newLabel();

        // Добавляем код условия
        code.append("t").append(tempCount).append(" = ").append(condition).append("\n");
        code.append("if ").append("t").append(tempCount).append(" goto ").append(label1).append("\n");

        for (SimpllangParser.ElifstmtContext elifCtx : ctx.elifstmt()) {
            String elifCondition = visit(elifCtx.expr()); // Получаем условие elif
            elifResult = visit(elifCtx.stmt());
            String tempElif = newTemp();
            code.append(tempElif).append(" = ").append(elifCondition).append("\n");

            // Генерация кода для условия elif
            code.append("if ").append("t").append(tempCount).append(" goto ").append(label2).append("\n");

            visit(elifCtx.stmt()); // Обрабатываем тело elif
        }

        // Обрабатываем else, если он есть
        if (ctx.elsestmt() != null) {
            elseResult = visit(ctx.elsestmt());
            code.append(elseResult);
            code.append("goto ").append(label3).append("\n");
        } else {
            code.append(label3).append(":").append("\n"); // Метка конца конструкции
        }

        code.append(label1).append(": ").append(ifResult);
        code.append("goto ").append(label3).append("\n");
        code.append(label2).append(": ").append(elifResult);
        code.append(label3).append(":");

        return code.toString();

    }

    @Override
    public String visitElifstmt(SimpllangParser.ElifstmtContext ctx) {
        return visit(ctx.stmt());
    }

    @Override
    public String visitElsestmt(SimpllangParser.ElsestmtContext ctx) {
        return visit(ctx.stmt());
    }

    @Override
    public String visitWhilestmt(SimpllangParser.WhilestmtContext ctx) {
        String condition = visit(ctx.expr());
        String startLabel = newLabel();
        String endLabel = newLabel();
        String temp1 = newTemp();

        return startLabel + ": " +
                temp1 + " = " + condition + "\n" +
                "if not " + temp1 + " goto " + endLabel + "\n" +
                visit(ctx.stmt()) +
                "goto " + startLabel + "\n" +
                endLabel + ":";
    }

    @Override
    public String visitForstmt(SimpllangParser.ForstmtContext ctx) {
        StringBuilder code = new StringBuilder();
        String initialization = visit(ctx.varDeclFor());
        code.append(initialization).append("\n");
        String startLabel = newLabel();
        String endLabel = newLabel();
        code.append(startLabel).append(": ");
        String condition = visit(ctx.expr());
        String tempCondition = newTemp();
        code.append(tempCondition).append(" = ").append(condition).append("\n");
        code.append("if not ").append(tempCondition).append(" goto ").append(endLabel).append("\n");
        code.append(visit(ctx.stmt()));
        String update = visit(ctx.assignmentFor(0));
        code.append(update).append("\n");
        code.append("goto ").append(startLabel).append("\n");
        code.append(endLabel).append(":\n");
        return code.toString();

    }

    @Override
    public String visitVarDeclFor(SimpllangParser.VarDeclForContext ctx) {
        String varName = ctx.ID().getText();
        String expr = ctx.expr() != null ? visit(ctx.expr()) : "null";
        return varName + " = " + expr;

    }

    @Override
    public String visitAssignmentFor(SimpllangParser.AssignmentForContext ctx) {
        String varName = ctx.ID().getText();
        String expr = visit(ctx.expr());
        return varName + " = " + expr;

    }

    @Override
    public String visitBlockstmt(SimpllangParser.BlockstmtContext ctx) {
        StringBuilder code = new StringBuilder();
        for (SimpllangParser.StmtContext stmt : ctx.stmt()) {
            code.append(visit(stmt)).append("\n");
        }
        return code.toString();

    }
}
