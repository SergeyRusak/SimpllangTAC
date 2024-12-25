// Generated from C:/Users/Kevin/IdeaProjects/SimpleLangTACgen/src/Simpllang.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpllangParser}.
 */
public interface SimpllangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpllangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpllangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimpllangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimpllangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(SimpllangParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(SimpllangParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(SimpllangParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(SimpllangParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(SimpllangParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(SimpllangParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(SimpllangParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(SimpllangParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(SimpllangParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(SimpllangParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(SimpllangParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(SimpllangParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SimpllangParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SimpllangParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(SimpllangParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(SimpllangParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SimpllangParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SimpllangParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompOperator(SimpllangParser.CompOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompOperator(SimpllangParser.CompOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SimpllangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SimpllangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpllangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpllangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpllangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpllangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(SimpllangParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(SimpllangParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElifstmt(SimpllangParser.ElifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElifstmt(SimpllangParser.ElifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(SimpllangParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(SimpllangParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(SimpllangParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(SimpllangParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(SimpllangParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(SimpllangParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#varDeclFor}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclFor(SimpllangParser.VarDeclForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#varDeclFor}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclFor(SimpllangParser.VarDeclForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#assignmentFor}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentFor(SimpllangParser.AssignmentForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#assignmentFor}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentFor(SimpllangParser.AssignmentForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpllangParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(SimpllangParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpllangParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(SimpllangParser.BlockstmtContext ctx);
}