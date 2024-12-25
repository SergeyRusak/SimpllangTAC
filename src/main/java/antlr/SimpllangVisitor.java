// Generated from C:/Users/Kevin/IdeaProjects/SimpleLangTACgen/src/Simpllang.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpllangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpllangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpllangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SimpllangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(SimpllangParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(SimpllangParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(SimpllangParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(SimpllangParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(SimpllangParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(SimpllangParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(SimpllangParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(SimpllangParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link SimpllangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SimpllangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#compOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperator(SimpllangParser.CompOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SimpllangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpllangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SimpllangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(SimpllangParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#elifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifstmt(SimpllangParser.ElifstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#elsestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmt(SimpllangParser.ElsestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(SimpllangParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(SimpllangParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#varDeclFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclFor(SimpllangParser.VarDeclForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#assignmentFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentFor(SimpllangParser.AssignmentForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpllangParser#blockstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstmt(SimpllangParser.BlockstmtContext ctx);
}