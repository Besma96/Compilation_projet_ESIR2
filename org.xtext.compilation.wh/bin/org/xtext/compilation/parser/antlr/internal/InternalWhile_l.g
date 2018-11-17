/*
 * generated by Xtext 2.15.0
 */
grammar InternalWhile_l;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.compilation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.compilation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.compilation.services.While_lGrammarAccess;

}

@parser::members {

 	private While_lGrammarAccess grammarAccess;

    public InternalWhile_lParser(TokenStream input, While_lGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Wh";
   	}

   	@Override
   	protected While_lGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleWh
entryRuleWh returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhRule()); }
	iv_ruleWh=ruleWh
	{ $current=$iv_ruleWh.current; }
	EOF;

// Rule Wh
ruleWh returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0());
			}
			lv_elements_0_0=ruleProgram
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getWhRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.compilation.While_l.Program");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
			}
			lv_functions_0_0=ruleFunction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgramRule());
				}
				add(
					$current,
					"functions",
					lv_functions_0_0,
					"org.xtext.compilation.While_l.Function");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_SYMBOLE
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameSYMBOLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.compilation.While_l.SYMBOLE");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
				}
				lv_definition_3_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"definition",
						lv_definition_3_0,
						"org.xtext.compilation.While_l.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='read'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
				}
				lv_input_1_0=ruleInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"input",
						lv_input_1_0,
						"org.xtext.compilation.While_l.Input");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='%'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"commands",
						lv_commands_3_0,
						"org.xtext.compilation.While_l.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='%'
		{
			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
		}
		otherlv_5='write'
		{
			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
				}
				lv_output_6_0=ruleOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"output",
						lv_output_6_0,
						"org.xtext.compilation.While_l.Output");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_vars_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.compilation.While_l.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_vars_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInputRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.compilation.While_l.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_vars_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.compilation.While_l.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_vars_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOutputRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.compilation.While_l.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
				}
				lv_commands_0_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandsRule());
					}
					add(
						$current,
						"commands",
						lv_commands_0_0,
						"org.xtext.compilation.While_l.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
					}
					lv_commands_2_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						add(
							$current,
							"commands",
							lv_commands_2_0,
							"org.xtext.compilation.While_l.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0());
				}
				lv_cmd_0_1=ruleNop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_1,
						"org.xtext.compilation.While_l.Nop");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1());
				}
				lv_cmd_0_2=ruleAffect
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_2,
						"org.xtext.compilation.While_l.Affect");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdIfParserRuleCall_0_2());
				}
				lv_cmd_0_3=ruleIf
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_3,
						"org.xtext.compilation.While_l.If");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdForParserRuleCall_0_3());
				}
				lv_cmd_0_4=ruleFor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_4,
						"org.xtext.compilation.While_l.For");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCmdWhileParserRuleCall_0_4());
				}
				lv_cmd_0_5=ruleWhile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"cmd",
						lv_cmd_0_5,
						"org.xtext.compilation.While_l.While");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getCommands1CommandsParserRuleCall_3_0());
				}
				lv_commands1_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"commands1",
						lv_commands1_3_0,
						"org.xtext.compilation.While_l.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='else'
			{
				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfAccess().getCommands2CommandsParserRuleCall_4_1_0());
					}
					lv_commands2_5_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfRule());
						}
						set(
							$current,
							"commands2",
							lv_commands2_5_0,
							"org.xtext.compilation.While_l.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='fi'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
		}
	)
;

// Entry rule entryRuleNop
entryRuleNop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNopRule()); }
	iv_ruleNop=ruleNop
	{ $current=$iv_ruleNop.current; }
	EOF;

// Rule Nop
ruleNop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_nop_0_0='nop'
			{
				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNopRule());
				}
				setWithLastConsumed($current, "nop", lv_nop_0_0, "nop");
			}
		)
	)
;

// Entry rule entryRuleAffect
entryRuleAffect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAffectRule()); }
	iv_ruleAffect=ruleAffect
	{ $current=$iv_ruleAffect.current; }
	EOF;

// Rule Affect
ruleAffect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_vars_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_vars_0_0, grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAffectRule());
					}
					addWithLastConsumed(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.compilation.While_l.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getAffectAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_vars_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_vars_2_0, grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAffectRule());
						}
						addWithLastConsumed(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.compilation.While_l.VARIABLE");
					}
				)
			)
		)*
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getAffectAccess().getColonEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_3_0());
				}
				lv_exprs_4_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAffectRule());
					}
					add(
						$current,
						"exprs",
						lv_exprs_4_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getAffectAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_4_1_0());
					}
					lv_exprs_6_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAffectRule());
						}
						add(
							$current,
							"exprs",
							lv_exprs_6_0,
							"org.xtext.compilation.While_l.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFor
entryRuleFor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForRule()); }
	iv_ruleFor=ruleFor
	{ $current=$iv_ruleFor.current; }
	EOF;

// Rule For
ruleFor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getCmdsCommandsParserRuleCall_3_0());
				}
				lv_cmds_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"cmds",
						lv_cmds_3_0,
						"org.xtext.compilation.While_l.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='od'
		{
			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
		}
	)
;

// Entry rule entryRuleWhile
entryRuleWhile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileRule()); }
	iv_ruleWhile=ruleWhile
	{ $current=$iv_ruleWhile.current; }
	EOF;

// Rule While
ruleWhile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getCmdsCommandsParserRuleCall_3_0());
				}
				lv_cmds_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"cmds",
						lv_cmds_3_0,
						"org.xtext.compilation.While_l.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='od'
		{
			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
		}
	)
;

// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	iv_ruleExpr=ruleExpr
	{ $current=$iv_ruleExpr.current; }
	EOF;

// Rule Expr
ruleExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprAndParserRuleCall_0_0());
				}
				lv_expr_0_0=ruleExprAnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_0_0,
						"org.xtext.compilation.While_l.ExprAnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprOrParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExprOr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.xtext.compilation.While_l.ExprOr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprSimpleParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleExprSimple
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.xtext.compilation.While_l.ExprSimple");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprConsParserRuleCall_3_0());
				}
				lv_expr_3_0=ruleExprCons
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_3_0,
						"org.xtext.compilation.While_l.ExprCons");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprListParserRuleCall_4_0());
				}
				lv_expr_4_0=ruleExprList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_4_0,
						"org.xtext.compilation.While_l.ExprList");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprHdParserRuleCall_5_0());
				}
				lv_expr_5_0=ruleExprHd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_5_0,
						"org.xtext.compilation.While_l.ExprHd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprTlParserRuleCall_6_0());
				}
				lv_expr_6_0=ruleExprTl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_6_0,
						"org.xtext.compilation.While_l.ExprTl");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprSymParserRuleCall_7_0());
				}
				lv_expr_7_0=ruleExprSym
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_7_0,
						"org.xtext.compilation.While_l.ExprSym");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprExprNotParserRuleCall_8_0());
				}
				lv_expr_8_0=ruleExprNot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"expr",
						lv_expr_8_0,
						"org.xtext.compilation.While_l.ExprNot");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAccess().getExprEqExprEqParserRuleCall_9_0());
				}
				lv_exprEq_9_0=ruleExprEq
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprRule());
					}
					set(
						$current,
						"exprEq",
						lv_exprEq_9_0,
						"org.xtext.compilation.While_l.ExprEq");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			otherlv_10='('
			{
				newLeafNode(otherlv_10, grammarAccess.getExprAccess().getLeftParenthesisKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAccess().getExprExprParserRuleCall_10_1_0());
					}
					lv_expr_11_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprRule());
						}
						set(
							$current,
							"expr",
							lv_expr_11_0,
							"org.xtext.compilation.While_l.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12=')'
			{
				newLeafNode(otherlv_12, grammarAccess.getExprAccess().getRightParenthesisKeyword_10_2());
			}
		)
	)
;

// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	iv_ruleExprSimple=ruleExprSimple
	{ $current=$iv_ruleExprSimple.current; }
	EOF;

// Rule ExprSimple
ruleExprSimple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				RULE_NIL
			)
			)=>
			(
				lv_str_0_0=RULE_NIL
				{
					newLeafNode(lv_str_0_0, grammarAccess.getExprSimpleAccess().getStrNILTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"str",
						lv_str_0_0,
						"org.xtext.compilation.While_l.NIL");
				}
			)
		)
		    |
		(
			(
				lv_varSimple_1_0=RULE_VARIABLE
				{
					newLeafNode(lv_varSimple_1_0, grammarAccess.getExprSimpleAccess().getVarSimpleVARIABLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"varSimple",
						lv_varSimple_1_0,
						"org.xtext.compilation.While_l.VARIABLE");
				}
			)
		)
		    |
		(
			(
				lv_sym_2_0=RULE_SYMBOLE
				{
					newLeafNode(lv_sym_2_0, grammarAccess.getExprSimpleAccess().getSymSYMBOLETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"sym",
						lv_sym_2_0,
						"org.xtext.compilation.While_l.SYMBOLE");
				}
			)
		)
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					lv_nameFunction_4_0=RULE_SYMBOLE
					{
						newLeafNode(lv_nameFunction_4_0, grammarAccess.getExprSimpleAccess().getNameFunctionSYMBOLETerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprSimpleRule());
						}
						setWithLastConsumed(
							$current,
							"nameFunction",
							lv_nameFunction_4_0,
							"org.xtext.compilation.While_l.SYMBOLE");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getVarsInputParserRuleCall_3_2_0());
					}
					lv_vars_5_0=ruleInput
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"vars",
							lv_vars_5_0,
							"org.xtext.compilation.While_l.Input");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
			}
		)
	)
;

// Entry rule entryRuleExprAnd
entryRuleExprAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprAndRule()); }
	iv_ruleExprAnd=ruleExprAnd
	{ $current=$iv_ruleExprAnd.current; }
	EOF;

// Rule ExprAnd
ruleExprAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAndAccess().getArg1ExprSimpleParserRuleCall_0_0());
				}
				lv_arg1_0_0=ruleExprSimple
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprAndRule());
					}
					set(
						$current,
						"arg1",
						lv_arg1_0_0,
						"org.xtext.compilation.While_l.ExprSimple");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='and'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAndKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAndAccess().getArg2ExprParserRuleCall_2_0());
				}
				lv_arg2_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprAndRule());
					}
					set(
						$current,
						"arg2",
						lv_arg2_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExprOr
entryRuleExprOr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprOrRule()); }
	iv_ruleExprOr=ruleExprOr
	{ $current=$iv_ruleExprOr.current; }
	EOF;

// Rule ExprOr
ruleExprOr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprOrAccess().getArg1ExprSimpleParserRuleCall_0_0());
				}
				lv_arg1_0_0=ruleExprSimple
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprOrRule());
					}
					set(
						$current,
						"arg1",
						lv_arg1_0_0,
						"org.xtext.compilation.While_l.ExprSimple");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='or'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getOrKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprOrAccess().getArg2ExprParserRuleCall_2_0());
				}
				lv_arg2_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprOrRule());
					}
					set(
						$current,
						"arg2",
						lv_arg2_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExprCons
entryRuleExprCons returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprConsRule()); }
	iv_ruleExprCons=ruleExprCons
	{ $current=$iv_ruleExprCons.current; }
	EOF;

// Rule ExprCons
ruleExprCons returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExprConsAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='cons'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprConsAccess().getConsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprConsAccess().getArg1ExprParserRuleCall_2_0());
				}
				lv_arg1_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprConsRule());
					}
					set(
						$current,
						"arg1",
						lv_arg1_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExprConsAccess().getArg2ExprParserRuleCall_3_0());
				}
				lv_arg2_3_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprConsRule());
					}
					set(
						$current,
						"arg2",
						lv_arg2_3_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getExprConsAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleExprList
entryRuleExprList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprListRule()); }
	iv_ruleExprList=ruleExprList
	{ $current=$iv_ruleExprList.current; }
	EOF;

// Rule ExprList
ruleExprList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExprListAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='list'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprListAccess().getListKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprListAccess().getArgExprParserRuleCall_2_0());
				}
				lv_arg_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprListRule());
					}
					add(
						$current,
						"arg",
						lv_arg_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getExprListAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleExprHd
entryRuleExprHd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprHdRule()); }
	iv_ruleExprHd=ruleExprHd
	{ $current=$iv_ruleExprHd.current; }
	EOF;

// Rule ExprHd
ruleExprHd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExprHdAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='hd'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprHdAccess().getHdKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprHdAccess().getArgExprParserRuleCall_2_0());
				}
				lv_arg_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprHdRule());
					}
					set(
						$current,
						"arg",
						lv_arg_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getExprHdAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleExprTl
entryRuleExprTl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprTlRule()); }
	iv_ruleExprTl=ruleExprTl
	{ $current=$iv_ruleExprTl.current; }
	EOF;

// Rule ExprTl
ruleExprTl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExprTlAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='tl'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprTlAccess().getTlKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprTlAccess().getArgExprParserRuleCall_2_0());
				}
				lv_arg_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprTlRule());
					}
					set(
						$current,
						"arg",
						lv_arg_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getExprTlAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleExprSym
entryRuleExprSym returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprSymRule()); }
	iv_ruleExprSym=ruleExprSym
	{ $current=$iv_ruleExprSym.current; }
	EOF;

// Rule ExprSym
ruleExprSym returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExprSymAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_arg1_1_0=RULE_SYMBOLE
				{
					newLeafNode(lv_arg1_1_0, grammarAccess.getExprSymAccess().getArg1SYMBOLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSymRule());
					}
					setWithLastConsumed(
						$current,
						"arg1",
						lv_arg1_1_0,
						"org.xtext.compilation.While_l.SYMBOLE");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExprSymAccess().getArg2ExprParserRuleCall_2_0());
				}
				lv_arg2_2_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprSymRule());
					}
					add(
						$current,
						"arg2",
						lv_arg2_2_0,
						"org.xtext.compilation.While_l.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getExprSymAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleExprNot
entryRuleExprNot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprNotRule()); }
	iv_ruleExprNot=ruleExprNot
	{ $current=$iv_ruleExprNot.current; }
	EOF;

// Rule ExprNot
ruleExprNot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='not'
		{
			newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getNotKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprNotAccess().getArg1ExprEqParserRuleCall_1_0());
				}
				lv_arg1_1_0=ruleExprEq
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprNotRule());
					}
					set(
						$current,
						"arg1",
						lv_arg1_1_0,
						"org.xtext.compilation.While_l.ExprEq");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExprEq
entryRuleExprEq returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprEqRule()); }
	iv_ruleExprEq=ruleExprEq
	{ $current=$iv_ruleExprEq.current; }
	EOF;

// Rule ExprEq
ruleExprEq returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprEqAccess().getArg1ExprSimpleParserRuleCall_0_0());
				}
				lv_arg1_0_0=ruleExprSimple
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprEqRule());
					}
					set(
						$current,
						"arg1",
						lv_arg1_0_0,
						"org.xtext.compilation.While_l.ExprSimple");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='=?'
		{
			newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExprEqAccess().getArg2ExprSimpleParserRuleCall_2_0());
				}
				lv_arg2_2_0=ruleExprSimple
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprEqRule());
					}
					set(
						$current,
						"arg2",
						lv_arg2_2_0,
						"org.xtext.compilation.While_l.ExprSimple");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_NIL : ('Nil'|'nil');

RULE_VARIABLE : 'A'..'Z' RULE_ID?;

RULE_SYMBOLE : 'a'..'z' RULE_ID?;

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
