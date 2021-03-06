/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compilation.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.compilation.ide.contentassist.antlr.internal.InternalWhile_lParser;
import org.xtext.compilation.services.While_lGrammarAccess;

public class While_lParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(While_lGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, While_lGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getCmdAlternatives_0(), "rule__Command__CmdAlternatives_0");
			builder.put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
			builder.put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup_1(), "rule__Output__Group_1__0");
			builder.put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
			builder.put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup_4(), "rule__If__Group_4__0");
			builder.put(grammarAccess.getAffectAccess().getGroup(), "rule__Affect__Group__0");
			builder.put(grammarAccess.getAffectAccess().getGroup_1(), "rule__Affect__Group_1__0");
			builder.put(grammarAccess.getAffectAccess().getGroup_4(), "rule__Affect__Group_4__0");
			builder.put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
			builder.put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
			builder.put(grammarAccess.getExprAccess().getGroup_10(), "rule__Expr__Group_10__0");
			builder.put(grammarAccess.getExprSimpleAccess().getGroup_3(), "rule__ExprSimple__Group_3__0");
			builder.put(grammarAccess.getExprAndAccess().getGroup(), "rule__ExprAnd__Group__0");
			builder.put(grammarAccess.getExprOrAccess().getGroup(), "rule__ExprOr__Group__0");
			builder.put(grammarAccess.getExprConsAccess().getGroup(), "rule__ExprCons__Group__0");
			builder.put(grammarAccess.getExprListAccess().getGroup(), "rule__ExprList__Group__0");
			builder.put(grammarAccess.getExprHdAccess().getGroup(), "rule__ExprHd__Group__0");
			builder.put(grammarAccess.getExprTlAccess().getGroup(), "rule__ExprTl__Group__0");
			builder.put(grammarAccess.getExprSymAccess().getGroup(), "rule__ExprSym__Group__0");
			builder.put(grammarAccess.getExprNotAccess().getGroup(), "rule__ExprNot__Group__0");
			builder.put(grammarAccess.getExprEqAccess().getGroup(), "rule__ExprEq__Group__0");
			builder.put(grammarAccess.getWhAccess().getElementsAssignment(), "rule__Wh__ElementsAssignment");
			builder.put(grammarAccess.getProgramAccess().getFunctionsAssignment(), "rule__Program__FunctionsAssignment");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getDefinitionAssignment_3(), "rule__Function__DefinitionAssignment_3");
			builder.put(grammarAccess.getDefinitionAccess().getInputAssignment_1(), "rule__Definition__InputAssignment_1");
			builder.put(grammarAccess.getDefinitionAccess().getCommandsAssignment_3(), "rule__Definition__CommandsAssignment_3");
			builder.put(grammarAccess.getDefinitionAccess().getOutputAssignment_6(), "rule__Definition__OutputAssignment_6");
			builder.put(grammarAccess.getInputAccess().getVarsAssignment_0(), "rule__Input__VarsAssignment_0");
			builder.put(grammarAccess.getInputAccess().getVarsAssignment_1_1(), "rule__Input__VarsAssignment_1_1");
			builder.put(grammarAccess.getOutputAccess().getVarsAssignment_0(), "rule__Output__VarsAssignment_0");
			builder.put(grammarAccess.getOutputAccess().getVarsAssignment_1_1(), "rule__Output__VarsAssignment_1_1");
			builder.put(grammarAccess.getCommandsAccess().getCommandsAssignment_0(), "rule__Commands__CommandsAssignment_0");
			builder.put(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1(), "rule__Commands__CommandsAssignment_1_1");
			builder.put(grammarAccess.getCommandAccess().getCmdAssignment(), "rule__Command__CmdAssignment");
			builder.put(grammarAccess.getIfAccess().getExprAssignment_1(), "rule__If__ExprAssignment_1");
			builder.put(grammarAccess.getIfAccess().getCommands1Assignment_3(), "rule__If__Commands1Assignment_3");
			builder.put(grammarAccess.getIfAccess().getCommands2Assignment_4_1(), "rule__If__Commands2Assignment_4_1");
			builder.put(grammarAccess.getNopAccess().getNopAssignment(), "rule__Nop__NopAssignment");
			builder.put(grammarAccess.getAffectAccess().getVarsAssignment_0(), "rule__Affect__VarsAssignment_0");
			builder.put(grammarAccess.getAffectAccess().getVarsAssignment_1_1(), "rule__Affect__VarsAssignment_1_1");
			builder.put(grammarAccess.getAffectAccess().getExprsAssignment_3(), "rule__Affect__ExprsAssignment_3");
			builder.put(grammarAccess.getAffectAccess().getExprsAssignment_4_1(), "rule__Affect__ExprsAssignment_4_1");
			builder.put(grammarAccess.getForAccess().getExprAssignment_1(), "rule__For__ExprAssignment_1");
			builder.put(grammarAccess.getForAccess().getCmdsAssignment_3(), "rule__For__CmdsAssignment_3");
			builder.put(grammarAccess.getWhileAccess().getExprAssignment_1(), "rule__While__ExprAssignment_1");
			builder.put(grammarAccess.getWhileAccess().getCmdsAssignment_3(), "rule__While__CmdsAssignment_3");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_0(), "rule__Expr__ExprAssignment_0");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_1(), "rule__Expr__ExprAssignment_1");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_2(), "rule__Expr__ExprAssignment_2");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_3(), "rule__Expr__ExprAssignment_3");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_4(), "rule__Expr__ExprAssignment_4");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_5(), "rule__Expr__ExprAssignment_5");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_6(), "rule__Expr__ExprAssignment_6");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_7(), "rule__Expr__ExprAssignment_7");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_8(), "rule__Expr__ExprAssignment_8");
			builder.put(grammarAccess.getExprAccess().getExprEqAssignment_9(), "rule__Expr__ExprEqAssignment_9");
			builder.put(grammarAccess.getExprAccess().getExprAssignment_10_1(), "rule__Expr__ExprAssignment_10_1");
			builder.put(grammarAccess.getExprSimpleAccess().getStrAssignment_0(), "rule__ExprSimple__StrAssignment_0");
			builder.put(grammarAccess.getExprSimpleAccess().getVarSimpleAssignment_1(), "rule__ExprSimple__VarSimpleAssignment_1");
			builder.put(grammarAccess.getExprSimpleAccess().getSymAssignment_2(), "rule__ExprSimple__SymAssignment_2");
			builder.put(grammarAccess.getExprSimpleAccess().getNameFunctionAssignment_3_1(), "rule__ExprSimple__NameFunctionAssignment_3_1");
			builder.put(grammarAccess.getExprSimpleAccess().getVarsAssignment_3_2(), "rule__ExprSimple__VarsAssignment_3_2");
			builder.put(grammarAccess.getExprAndAccess().getArg1Assignment_0(), "rule__ExprAnd__Arg1Assignment_0");
			builder.put(grammarAccess.getExprAndAccess().getArg2Assignment_2(), "rule__ExprAnd__Arg2Assignment_2");
			builder.put(grammarAccess.getExprOrAccess().getArg1Assignment_0(), "rule__ExprOr__Arg1Assignment_0");
			builder.put(grammarAccess.getExprOrAccess().getArg2Assignment_2(), "rule__ExprOr__Arg2Assignment_2");
			builder.put(grammarAccess.getExprConsAccess().getArg1Assignment_2(), "rule__ExprCons__Arg1Assignment_2");
			builder.put(grammarAccess.getExprConsAccess().getArg2Assignment_3(), "rule__ExprCons__Arg2Assignment_3");
			builder.put(grammarAccess.getExprListAccess().getArgAssignment_2(), "rule__ExprList__ArgAssignment_2");
			builder.put(grammarAccess.getExprHdAccess().getArgAssignment_2(), "rule__ExprHd__ArgAssignment_2");
			builder.put(grammarAccess.getExprTlAccess().getArgAssignment_2(), "rule__ExprTl__ArgAssignment_2");
			builder.put(grammarAccess.getExprSymAccess().getArg1Assignment_1(), "rule__ExprSym__Arg1Assignment_1");
			builder.put(grammarAccess.getExprSymAccess().getArg2Assignment_2(), "rule__ExprSym__Arg2Assignment_2");
			builder.put(grammarAccess.getExprNotAccess().getArg1Assignment_1(), "rule__ExprNot__Arg1Assignment_1");
			builder.put(grammarAccess.getExprEqAccess().getArg1Assignment_0(), "rule__ExprEq__Arg1Assignment_0");
			builder.put(grammarAccess.getExprEqAccess().getArg2Assignment_2(), "rule__ExprEq__Arg2Assignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private While_lGrammarAccess grammarAccess;

	@Override
	protected InternalWhile_lParser createParser() {
		InternalWhile_lParser result = new InternalWhile_lParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public While_lGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(While_lGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
