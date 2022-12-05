// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FoolParserParser}.
 */
public interface FoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FoolParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FoolParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#importDec}.
	 * @param ctx the parse tree
	 */
	void enterImportDec(FoolParserParser.ImportDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#importDec}.
	 * @param ctx the parse tree
	 */
	void exitImportDec(FoolParserParser.ImportDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(FoolParserParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(FoolParserParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FoolParserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FoolParserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FoolParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FoolParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#typelist}.
	 * @param ctx the parse tree
	 */
	void enterTypelist(FoolParserParser.TypelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#typelist}.
	 * @param ctx the parse tree
	 */
	void exitTypelist(FoolParserParser.TypelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#functype}.
	 * @param ctx the parse tree
	 */
	void enterFunctype(FoolParserParser.FunctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#functype}.
	 * @param ctx the parse tree
	 */
	void exitFunctype(FoolParserParser.FunctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FoolParserParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FoolParserParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterlist(FoolParserParser.ParameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#parameterlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterlist(FoolParserParser.ParameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(FoolParserParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(FoolParserParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#exprblock}.
	 * @param ctx the parse tree
	 */
	void enterExprblock(FoolParserParser.ExprblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#exprblock}.
	 * @param ctx the parse tree
	 */
	void exitExprblock(FoolParserParser.ExprblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoolParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FoolParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoolParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FoolParserParser.ExprContext ctx);
}