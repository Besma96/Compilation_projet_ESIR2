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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhile_lParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOLE", "RULE_VARIABLE", "RULE_NIL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'if'", "'then'", "'else'", "'fi'", "'nop'", "':='", "'for'", "'do'", "'od'", "'while'", "'('", "')'", "'and'", "'or'", "'cons'", "'list'", "'hd'", "'tl'", "'not'", "'=?'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int RULE_NIL=6;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOLE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWhile_lParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhile_lParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhile_lParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWhile_l.g"; }



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




    // $ANTLR start "entryRuleWh"
    // InternalWhile_l.g:64:1: entryRuleWh returns [EObject current=null] : iv_ruleWh= ruleWh EOF ;
    public final EObject entryRuleWh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWh = null;


        try {
            // InternalWhile_l.g:64:43: (iv_ruleWh= ruleWh EOF )
            // InternalWhile_l.g:65:2: iv_ruleWh= ruleWh EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWh=ruleWh();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWh; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWh"


    // $ANTLR start "ruleWh"
    // InternalWhile_l.g:71:1: ruleWh returns [EObject current=null] : ( (lv_elements_0_0= ruleProgram ) ) ;
    public final EObject ruleWh() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:77:2: ( ( (lv_elements_0_0= ruleProgram ) ) )
            // InternalWhile_l.g:78:2: ( (lv_elements_0_0= ruleProgram ) )
            {
            // InternalWhile_l.g:78:2: ( (lv_elements_0_0= ruleProgram ) )
            // InternalWhile_l.g:79:3: (lv_elements_0_0= ruleProgram )
            {
            // InternalWhile_l.g:79:3: (lv_elements_0_0= ruleProgram )
            // InternalWhile_l.g:80:4: lv_elements_0_0= ruleProgram
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_elements_0_0=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getWhRule());
              				}
              				add(
              					current,
              					"elements",
              					lv_elements_0_0,
              					"org.xtext.compilation.While_l.Program");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWh"


    // $ANTLR start "entryRuleProgram"
    // InternalWhile_l.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWhile_l.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWhile_l.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWhile_l.g:107:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:113:2: ( ( (lv_functions_0_0= ruleFunction ) )+ )
            // InternalWhile_l.g:114:2: ( (lv_functions_0_0= ruleFunction ) )+
            {
            // InternalWhile_l.g:114:2: ( (lv_functions_0_0= ruleFunction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhile_l.g:115:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalWhile_l.g:115:3: (lv_functions_0_0= ruleFunction )
            	    // InternalWhile_l.g:116:4: lv_functions_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"functions",
            	      					lv_functions_0_0,
            	      					"org.xtext.compilation.While_l.Function");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWhile_l.g:136:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWhile_l.g:136:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWhile_l.g:137:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWhile_l.g:143:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:149:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWhile_l.g:150:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWhile_l.g:150:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWhile_l.g:151:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_SYMBOLE ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalWhile_l.g:155:3: ( (lv_name_1_0= RULE_SYMBOLE ) )
            // InternalWhile_l.g:156:4: (lv_name_1_0= RULE_SYMBOLE )
            {
            // InternalWhile_l.g:156:4: (lv_name_1_0= RULE_SYMBOLE )
            // InternalWhile_l.g:157:5: lv_name_1_0= RULE_SYMBOLE
            {
            lv_name_1_0=(Token)match(input,RULE_SYMBOLE,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameSYMBOLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.compilation.While_l.SYMBOLE");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalWhile_l.g:177:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWhile_l.g:178:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWhile_l.g:178:4: (lv_definition_3_0= ruleDefinition )
            // InternalWhile_l.g:179:5: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_3_0,
              						"org.xtext.compilation.While_l.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWhile_l.g:200:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWhile_l.g:200:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWhile_l.g:201:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWhile_l.g:207:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_input_1_0 = null;

        EObject lv_commands_3_0 = null;

        EObject lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:213:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalWhile_l.g:214:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalWhile_l.g:214:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalWhile_l.g:215:3: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            // InternalWhile_l.g:219:3: ( (lv_input_1_0= ruleInput ) )
            // InternalWhile_l.g:220:4: (lv_input_1_0= ruleInput )
            {
            // InternalWhile_l.g:220:4: (lv_input_1_0= ruleInput )
            // InternalWhile_l.g:221:5: lv_input_1_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_input_1_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"input",
              						lv_input_1_0,
              						"org.xtext.compilation.While_l.Input");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
              		
            }
            // InternalWhile_l.g:242:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhile_l.g:243:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhile_l.g:243:4: (lv_commands_3_0= ruleCommands )
            // InternalWhile_l.g:244:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.xtext.compilation.While_l.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
              		
            }
            // InternalWhile_l.g:269:3: ( (lv_output_6_0= ruleOutput ) )
            // InternalWhile_l.g:270:4: (lv_output_6_0= ruleOutput )
            {
            // InternalWhile_l.g:270:4: (lv_output_6_0= ruleOutput )
            // InternalWhile_l.g:271:5: lv_output_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"output",
              						lv_output_6_0,
              						"org.xtext.compilation.While_l.Output");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWhile_l.g:292:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWhile_l.g:292:46: (iv_ruleInput= ruleInput EOF )
            // InternalWhile_l.g:293:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWhile_l.g:299:1: ruleInput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWhile_l.g:305:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhile_l.g:306:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhile_l.g:306:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhile_l.g:307:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhile_l.g:307:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWhile_l.g:308:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWhile_l.g:308:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWhile_l.g:309:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.compilation.While_l.VARIABLE");
              				
            }

            }


            }

            // InternalWhile_l.g:325:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhile_l.g:326:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhile_l.g:330:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWhile_l.g:331:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhile_l.g:331:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWhile_l.g:332:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.compilation.While_l.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWhile_l.g:353:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWhile_l.g:353:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWhile_l.g:354:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWhile_l.g:360:1: ruleOutput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWhile_l.g:366:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhile_l.g:367:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhile_l.g:367:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhile_l.g:368:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhile_l.g:368:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWhile_l.g:369:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWhile_l.g:369:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWhile_l.g:370:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.compilation.While_l.VARIABLE");
              				
            }

            }


            }

            // InternalWhile_l.g:386:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWhile_l.g:387:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhile_l.g:391:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWhile_l.g:392:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhile_l.g:392:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWhile_l.g:393:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.compilation.While_l.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWhile_l.g:414:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhile_l.g:414:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhile_l.g:415:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWhile_l.g:421:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:427:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWhile_l.g:428:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWhile_l.g:428:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWhile_l.g:429:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWhile_l.g:429:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWhile_l.g:430:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWhile_l.g:430:4: (lv_commands_0_0= ruleCommand )
            // InternalWhile_l.g:431:5: lv_commands_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_commands_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"commands",
              						lv_commands_0_0,
              						"org.xtext.compilation.While_l.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhile_l.g:448:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWhile_l.g:449:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWhile_l.g:453:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWhile_l.g:454:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWhile_l.g:454:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWhile_l.g:455:6: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commands",
            	      							lv_commands_2_0,
            	      							"org.xtext.compilation.While_l.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWhile_l.g:477:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhile_l.g:477:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhile_l.g:478:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWhile_l.g:484:1: ruleCommand returns [EObject current=null] : ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_cmd_0_1 = null;

        EObject lv_cmd_0_2 = null;

        EObject lv_cmd_0_3 = null;

        EObject lv_cmd_0_4 = null;

        EObject lv_cmd_0_5 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:490:2: ( ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile ) ) ) )
            // InternalWhile_l.g:491:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile ) ) )
            {
            // InternalWhile_l.g:491:2: ( ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile ) ) )
            // InternalWhile_l.g:492:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile ) )
            {
            // InternalWhile_l.g:492:3: ( (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile ) )
            // InternalWhile_l.g:493:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile )
            {
            // InternalWhile_l.g:493:4: (lv_cmd_0_1= ruleNop | lv_cmd_0_2= ruleAffect | lv_cmd_0_3= ruleIf | lv_cmd_0_4= ruleFor | lv_cmd_0_5= ruleWhile )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWhile_l.g:494:5: lv_cmd_0_1= ruleNop
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_1=ruleNop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_1,
                      						"org.xtext.compilation.While_l.Nop");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalWhile_l.g:510:5: lv_cmd_0_2= ruleAffect
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_2=ruleAffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_2,
                      						"org.xtext.compilation.While_l.Affect");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalWhile_l.g:526:5: lv_cmd_0_3= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdIfParserRuleCall_0_2());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_3=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_3,
                      						"org.xtext.compilation.While_l.If");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalWhile_l.g:542:5: lv_cmd_0_4= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdForParserRuleCall_0_3());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_4=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_4,
                      						"org.xtext.compilation.While_l.For");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalWhile_l.g:558:5: lv_cmd_0_5= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getCmdWhileParserRuleCall_0_4());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cmd_0_5=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"cmd",
                      						lv_cmd_0_5,
                      						"org.xtext.compilation.While_l.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleIf"
    // InternalWhile_l.g:579:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalWhile_l.g:579:43: (iv_ruleIf= ruleIf EOF )
            // InternalWhile_l.g:580:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalWhile_l.g:586:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands1_3_0 = null;

        EObject lv_commands2_5_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:592:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalWhile_l.g:593:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalWhile_l.g:593:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalWhile_l.g:594:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands1_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalWhile_l.g:598:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhile_l.g:599:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhile_l.g:599:4: (lv_expr_1_0= ruleExpr )
            // InternalWhile_l.g:600:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
              		
            }
            // InternalWhile_l.g:621:3: ( (lv_commands1_3_0= ruleCommands ) )
            // InternalWhile_l.g:622:4: (lv_commands1_3_0= ruleCommands )
            {
            // InternalWhile_l.g:622:4: (lv_commands1_3_0= ruleCommands )
            // InternalWhile_l.g:623:5: lv_commands1_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCommands1CommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_commands1_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"commands1",
              						lv_commands1_3_0,
              						"org.xtext.compilation.While_l.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhile_l.g:640:3: (otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhile_l.g:641:4: otherlv_4= 'else' ( (lv_commands2_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalWhile_l.g:645:4: ( (lv_commands2_5_0= ruleCommands ) )
                    // InternalWhile_l.g:646:5: (lv_commands2_5_0= ruleCommands )
                    {
                    // InternalWhile_l.g:646:5: (lv_commands2_5_0= ruleCommands )
                    // InternalWhile_l.g:647:6: lv_commands2_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getCommands2CommandsParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_commands2_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"commands2",
                      							lv_commands2_5_0,
                      							"org.xtext.compilation.While_l.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleNop"
    // InternalWhile_l.g:673:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalWhile_l.g:673:44: (iv_ruleNop= ruleNop EOF )
            // InternalWhile_l.g:674:2: iv_ruleNop= ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalWhile_l.g:680:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalWhile_l.g:686:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalWhile_l.g:687:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalWhile_l.g:687:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalWhile_l.g:688:3: (lv_nop_0_0= 'nop' )
            {
            // InternalWhile_l.g:688:3: (lv_nop_0_0= 'nop' )
            // InternalWhile_l.g:689:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNopRule());
              				}
              				setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleAffect"
    // InternalWhile_l.g:704:1: entryRuleAffect returns [EObject current=null] : iv_ruleAffect= ruleAffect EOF ;
    public final EObject entryRuleAffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffect = null;


        try {
            // InternalWhile_l.g:704:47: (iv_ruleAffect= ruleAffect EOF )
            // InternalWhile_l.g:705:2: iv_ruleAffect= ruleAffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAffect=ruleAffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffect"


    // $ANTLR start "ruleAffect"
    // InternalWhile_l.g:711:1: ruleAffect returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* ) ;
    public final EObject ruleAffect() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_4_0 = null;

        EObject lv_exprs_6_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:717:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* ) )
            // InternalWhile_l.g:718:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* )
            {
            // InternalWhile_l.g:718:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )* )
            // InternalWhile_l.g:719:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* otherlv_3= ':=' ( (lv_exprs_4_0= ruleExpr ) ) (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
            {
            // InternalWhile_l.g:719:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWhile_l.g:720:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWhile_l.g:720:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWhile_l.g:721:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAffectRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.compilation.While_l.VARIABLE");
              				
            }

            }


            }

            // InternalWhile_l.g:737:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWhile_l.g:738:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAffectAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhile_l.g:742:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWhile_l.g:743:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhile_l.g:743:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWhile_l.g:744:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAffectRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.compilation.While_l.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAffectAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalWhile_l.g:765:3: ( (lv_exprs_4_0= ruleExpr ) )
            // InternalWhile_l.g:766:4: (lv_exprs_4_0= ruleExpr )
            {
            // InternalWhile_l.g:766:4: (lv_exprs_4_0= ruleExpr )
            // InternalWhile_l.g:767:5: lv_exprs_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_exprs_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAffectRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_4_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhile_l.g:784:3: (otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWhile_l.g:785:4: otherlv_5= ',' ( (lv_exprs_6_0= ruleExpr ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getAffectAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalWhile_l.g:789:4: ( (lv_exprs_6_0= ruleExpr ) )
            	    // InternalWhile_l.g:790:5: (lv_exprs_6_0= ruleExpr )
            	    {
            	    // InternalWhile_l.g:790:5: (lv_exprs_6_0= ruleExpr )
            	    // InternalWhile_l.g:791:6: lv_exprs_6_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_exprs_6_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAffectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_6_0,
            	      							"org.xtext.compilation.While_l.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffect"


    // $ANTLR start "entryRuleFor"
    // InternalWhile_l.g:813:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalWhile_l.g:813:44: (iv_ruleFor= ruleFor EOF )
            // InternalWhile_l.g:814:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalWhile_l.g:820:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_cmds_3_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:826:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhile_l.g:827:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhile_l.g:827:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhile_l.g:828:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
              		
            }
            // InternalWhile_l.g:832:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhile_l.g:833:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhile_l.g:833:4: (lv_expr_1_0= ruleExpr )
            // InternalWhile_l.g:834:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
              		
            }
            // InternalWhile_l.g:855:3: ( (lv_cmds_3_0= ruleCommands ) )
            // InternalWhile_l.g:856:4: (lv_cmds_3_0= ruleCommands )
            {
            // InternalWhile_l.g:856:4: (lv_cmds_3_0= ruleCommands )
            // InternalWhile_l.g:857:5: lv_cmds_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCmdsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_cmds_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"cmds",
              						lv_cmds_3_0,
              						"org.xtext.compilation.While_l.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalWhile_l.g:882:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalWhile_l.g:882:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalWhile_l.g:883:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalWhile_l.g:889:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_cmds_3_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:895:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhile_l.g:896:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhile_l.g:896:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhile_l.g:897:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_cmds_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalWhile_l.g:901:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhile_l.g:902:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhile_l.g:902:4: (lv_expr_1_0= ruleExpr )
            // InternalWhile_l.g:903:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalWhile_l.g:924:3: ( (lv_cmds_3_0= ruleCommands ) )
            // InternalWhile_l.g:925:4: (lv_cmds_3_0= ruleCommands )
            {
            // InternalWhile_l.g:925:4: (lv_cmds_3_0= ruleCommands )
            // InternalWhile_l.g:926:5: lv_cmds_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCmdsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_cmds_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"cmds",
              						lv_cmds_3_0,
              						"org.xtext.compilation.While_l.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleExpr"
    // InternalWhile_l.g:951:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhile_l.g:951:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhile_l.g:952:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWhile_l.g:958:1: ruleExpr returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprOr ) ) | ( (lv_expr_2_0= ruleExprSimple ) ) | ( (lv_expr_3_0= ruleExprCons ) ) | ( (lv_expr_4_0= ruleExprList ) ) | ( (lv_expr_5_0= ruleExprHd ) ) | ( (lv_expr_6_0= ruleExprTl ) ) | ( (lv_expr_7_0= ruleExprSym ) ) | ( (lv_expr_8_0= ruleExprNot ) ) | ( (lv_exprEq_9_0= ruleExprEq ) ) | (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_expr_0_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_expr_7_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_exprEq_9_0 = null;

        EObject lv_expr_11_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:964:2: ( ( ( (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprOr ) ) | ( (lv_expr_2_0= ruleExprSimple ) ) | ( (lv_expr_3_0= ruleExprCons ) ) | ( (lv_expr_4_0= ruleExprList ) ) | ( (lv_expr_5_0= ruleExprHd ) ) | ( (lv_expr_6_0= ruleExprTl ) ) | ( (lv_expr_7_0= ruleExprSym ) ) | ( (lv_expr_8_0= ruleExprNot ) ) | ( (lv_exprEq_9_0= ruleExprEq ) ) | (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' ) ) )
            // InternalWhile_l.g:965:2: ( ( (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprOr ) ) | ( (lv_expr_2_0= ruleExprSimple ) ) | ( (lv_expr_3_0= ruleExprCons ) ) | ( (lv_expr_4_0= ruleExprList ) ) | ( (lv_expr_5_0= ruleExprHd ) ) | ( (lv_expr_6_0= ruleExprTl ) ) | ( (lv_expr_7_0= ruleExprSym ) ) | ( (lv_expr_8_0= ruleExprNot ) ) | ( (lv_exprEq_9_0= ruleExprEq ) ) | (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' ) )
            {
            // InternalWhile_l.g:965:2: ( ( (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprOr ) ) | ( (lv_expr_2_0= ruleExprSimple ) ) | ( (lv_expr_3_0= ruleExprCons ) ) | ( (lv_expr_4_0= ruleExprList ) ) | ( (lv_expr_5_0= ruleExprHd ) ) | ( (lv_expr_6_0= ruleExprTl ) ) | ( (lv_expr_7_0= ruleExprSym ) ) | ( (lv_expr_8_0= ruleExprNot ) ) | ( (lv_exprEq_9_0= ruleExprEq ) ) | (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' ) )
            int alt9=11;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalWhile_l.g:966:3: ( (lv_expr_0_0= ruleExprAnd ) )
                    {
                    // InternalWhile_l.g:966:3: ( (lv_expr_0_0= ruleExprAnd ) )
                    // InternalWhile_l.g:967:4: (lv_expr_0_0= ruleExprAnd )
                    {
                    // InternalWhile_l.g:967:4: (lv_expr_0_0= ruleExprAnd )
                    // InternalWhile_l.g:968:5: lv_expr_0_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprAndParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_0_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_0_0,
                      						"org.xtext.compilation.While_l.ExprAnd");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhile_l.g:986:3: ( (lv_expr_1_0= ruleExprOr ) )
                    {
                    // InternalWhile_l.g:986:3: ( (lv_expr_1_0= ruleExprOr ) )
                    // InternalWhile_l.g:987:4: (lv_expr_1_0= ruleExprOr )
                    {
                    // InternalWhile_l.g:987:4: (lv_expr_1_0= ruleExprOr )
                    // InternalWhile_l.g:988:5: lv_expr_1_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprOrParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_1_0=ruleExprOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_1_0,
                      						"org.xtext.compilation.While_l.ExprOr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhile_l.g:1006:3: ( (lv_expr_2_0= ruleExprSimple ) )
                    {
                    // InternalWhile_l.g:1006:3: ( (lv_expr_2_0= ruleExprSimple ) )
                    // InternalWhile_l.g:1007:4: (lv_expr_2_0= ruleExprSimple )
                    {
                    // InternalWhile_l.g:1007:4: (lv_expr_2_0= ruleExprSimple )
                    // InternalWhile_l.g:1008:5: lv_expr_2_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprSimpleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_2_0,
                      						"org.xtext.compilation.While_l.ExprSimple");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhile_l.g:1026:3: ( (lv_expr_3_0= ruleExprCons ) )
                    {
                    // InternalWhile_l.g:1026:3: ( (lv_expr_3_0= ruleExprCons ) )
                    // InternalWhile_l.g:1027:4: (lv_expr_3_0= ruleExprCons )
                    {
                    // InternalWhile_l.g:1027:4: (lv_expr_3_0= ruleExprCons )
                    // InternalWhile_l.g:1028:5: lv_expr_3_0= ruleExprCons
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprConsParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_3_0=ruleExprCons();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_3_0,
                      						"org.xtext.compilation.While_l.ExprCons");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWhile_l.g:1046:3: ( (lv_expr_4_0= ruleExprList ) )
                    {
                    // InternalWhile_l.g:1046:3: ( (lv_expr_4_0= ruleExprList ) )
                    // InternalWhile_l.g:1047:4: (lv_expr_4_0= ruleExprList )
                    {
                    // InternalWhile_l.g:1047:4: (lv_expr_4_0= ruleExprList )
                    // InternalWhile_l.g:1048:5: lv_expr_4_0= ruleExprList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprListParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=ruleExprList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_4_0,
                      						"org.xtext.compilation.While_l.ExprList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalWhile_l.g:1066:3: ( (lv_expr_5_0= ruleExprHd ) )
                    {
                    // InternalWhile_l.g:1066:3: ( (lv_expr_5_0= ruleExprHd ) )
                    // InternalWhile_l.g:1067:4: (lv_expr_5_0= ruleExprHd )
                    {
                    // InternalWhile_l.g:1067:4: (lv_expr_5_0= ruleExprHd )
                    // InternalWhile_l.g:1068:5: lv_expr_5_0= ruleExprHd
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprHdParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_5_0=ruleExprHd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_5_0,
                      						"org.xtext.compilation.While_l.ExprHd");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalWhile_l.g:1086:3: ( (lv_expr_6_0= ruleExprTl ) )
                    {
                    // InternalWhile_l.g:1086:3: ( (lv_expr_6_0= ruleExprTl ) )
                    // InternalWhile_l.g:1087:4: (lv_expr_6_0= ruleExprTl )
                    {
                    // InternalWhile_l.g:1087:4: (lv_expr_6_0= ruleExprTl )
                    // InternalWhile_l.g:1088:5: lv_expr_6_0= ruleExprTl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprTlParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_6_0=ruleExprTl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_6_0,
                      						"org.xtext.compilation.While_l.ExprTl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalWhile_l.g:1106:3: ( (lv_expr_7_0= ruleExprSym ) )
                    {
                    // InternalWhile_l.g:1106:3: ( (lv_expr_7_0= ruleExprSym ) )
                    // InternalWhile_l.g:1107:4: (lv_expr_7_0= ruleExprSym )
                    {
                    // InternalWhile_l.g:1107:4: (lv_expr_7_0= ruleExprSym )
                    // InternalWhile_l.g:1108:5: lv_expr_7_0= ruleExprSym
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprSymParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_7_0=ruleExprSym();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_7_0,
                      						"org.xtext.compilation.While_l.ExprSym");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalWhile_l.g:1126:3: ( (lv_expr_8_0= ruleExprNot ) )
                    {
                    // InternalWhile_l.g:1126:3: ( (lv_expr_8_0= ruleExprNot ) )
                    // InternalWhile_l.g:1127:4: (lv_expr_8_0= ruleExprNot )
                    {
                    // InternalWhile_l.g:1127:4: (lv_expr_8_0= ruleExprNot )
                    // InternalWhile_l.g:1128:5: lv_expr_8_0= ruleExprNot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprExprNotParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_8_0=ruleExprNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_8_0,
                      						"org.xtext.compilation.While_l.ExprNot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalWhile_l.g:1146:3: ( (lv_exprEq_9_0= ruleExprEq ) )
                    {
                    // InternalWhile_l.g:1146:3: ( (lv_exprEq_9_0= ruleExprEq ) )
                    // InternalWhile_l.g:1147:4: (lv_exprEq_9_0= ruleExprEq )
                    {
                    // InternalWhile_l.g:1147:4: (lv_exprEq_9_0= ruleExprEq )
                    // InternalWhile_l.g:1148:5: lv_exprEq_9_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprAccess().getExprEqExprEqParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprEq_9_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprRule());
                      					}
                      					set(
                      						current,
                      						"exprEq",
                      						lv_exprEq_9_0,
                      						"org.xtext.compilation.While_l.ExprEq");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalWhile_l.g:1166:3: (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' )
                    {
                    // InternalWhile_l.g:1166:3: (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' )
                    // InternalWhile_l.g:1167:4: otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')'
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprAccess().getLeftParenthesisKeyword_10_0());
                      			
                    }
                    // InternalWhile_l.g:1171:4: ( (lv_expr_11_0= ruleExpr ) )
                    // InternalWhile_l.g:1172:5: (lv_expr_11_0= ruleExpr )
                    {
                    // InternalWhile_l.g:1172:5: (lv_expr_11_0= ruleExpr )
                    // InternalWhile_l.g:1173:6: lv_expr_11_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprAccess().getExprExprParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_expr_11_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_11_0,
                      							"org.xtext.compilation.While_l.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExprAccess().getRightParenthesisKeyword_10_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // InternalWhile_l.g:1199:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWhile_l.g:1199:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWhile_l.g:1200:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalWhile_l.g:1206:1: ruleExprSimple returns [EObject current=null] : ( ( ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL ) ) | ( (lv_varSimple_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOLE ) ) | (otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;
        Token lv_varSimple_1_0=null;
        Token lv_sym_2_0=null;
        Token otherlv_3=null;
        Token lv_nameFunction_4_0=null;
        Token otherlv_6=null;
        EObject lv_vars_5_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1212:2: ( ( ( ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL ) ) | ( (lv_varSimple_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOLE ) ) | (otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')' ) ) )
            // InternalWhile_l.g:1213:2: ( ( ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL ) ) | ( (lv_varSimple_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOLE ) ) | (otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')' ) )
            {
            // InternalWhile_l.g:1213:2: ( ( ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL ) ) | ( (lv_varSimple_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOLE ) ) | (otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')' ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NIL) && (synpred1_InternalWhile_l())) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_VARIABLE) ) {
                alt10=2;
            }
            else if ( (LA10_0==RULE_SYMBOLE) ) {
                alt10=3;
            }
            else if ( (LA10_0==31) ) {
                alt10=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalWhile_l.g:1214:3: ( ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL ) )
                    {
                    // InternalWhile_l.g:1214:3: ( ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL ) )
                    // InternalWhile_l.g:1215:4: ( ( RULE_NIL ) )=> (lv_str_0_0= RULE_NIL )
                    {
                    // InternalWhile_l.g:1219:4: (lv_str_0_0= RULE_NIL )
                    // InternalWhile_l.g:1220:5: lv_str_0_0= RULE_NIL
                    {
                    lv_str_0_0=(Token)match(input,RULE_NIL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_str_0_0, grammarAccess.getExprSimpleAccess().getStrNILTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"str",
                      						lv_str_0_0,
                      						"org.xtext.compilation.While_l.NIL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhile_l.g:1237:3: ( (lv_varSimple_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWhile_l.g:1237:3: ( (lv_varSimple_1_0= RULE_VARIABLE ) )
                    // InternalWhile_l.g:1238:4: (lv_varSimple_1_0= RULE_VARIABLE )
                    {
                    // InternalWhile_l.g:1238:4: (lv_varSimple_1_0= RULE_VARIABLE )
                    // InternalWhile_l.g:1239:5: lv_varSimple_1_0= RULE_VARIABLE
                    {
                    lv_varSimple_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_varSimple_1_0, grammarAccess.getExprSimpleAccess().getVarSimpleVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"varSimple",
                      						lv_varSimple_1_0,
                      						"org.xtext.compilation.While_l.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhile_l.g:1256:3: ( (lv_sym_2_0= RULE_SYMBOLE ) )
                    {
                    // InternalWhile_l.g:1256:3: ( (lv_sym_2_0= RULE_SYMBOLE ) )
                    // InternalWhile_l.g:1257:4: (lv_sym_2_0= RULE_SYMBOLE )
                    {
                    // InternalWhile_l.g:1257:4: (lv_sym_2_0= RULE_SYMBOLE )
                    // InternalWhile_l.g:1258:5: lv_sym_2_0= RULE_SYMBOLE
                    {
                    lv_sym_2_0=(Token)match(input,RULE_SYMBOLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sym_2_0, grammarAccess.getExprSimpleAccess().getSymSYMBOLETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sym",
                      						lv_sym_2_0,
                      						"org.xtext.compilation.While_l.SYMBOLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhile_l.g:1275:3: (otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')' )
                    {
                    // InternalWhile_l.g:1275:3: (otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')' )
                    // InternalWhile_l.g:1276:4: otherlv_3= '(' ( (lv_nameFunction_4_0= RULE_SYMBOLE ) ) ( (lv_vars_5_0= ruleInput ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalWhile_l.g:1280:4: ( (lv_nameFunction_4_0= RULE_SYMBOLE ) )
                    // InternalWhile_l.g:1281:5: (lv_nameFunction_4_0= RULE_SYMBOLE )
                    {
                    // InternalWhile_l.g:1281:5: (lv_nameFunction_4_0= RULE_SYMBOLE )
                    // InternalWhile_l.g:1282:6: lv_nameFunction_4_0= RULE_SYMBOLE
                    {
                    lv_nameFunction_4_0=(Token)match(input,RULE_SYMBOLE,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nameFunction_4_0, grammarAccess.getExprSimpleAccess().getNameFunctionSYMBOLETerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprSimpleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"nameFunction",
                      							lv_nameFunction_4_0,
                      							"org.xtext.compilation.While_l.SYMBOLE");
                      					
                    }

                    }


                    }

                    // InternalWhile_l.g:1298:4: ( (lv_vars_5_0= ruleInput ) )
                    // InternalWhile_l.g:1299:5: (lv_vars_5_0= ruleInput )
                    {
                    // InternalWhile_l.g:1299:5: (lv_vars_5_0= ruleInput )
                    // InternalWhile_l.g:1300:6: lv_vars_5_0= ruleInput
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getVarsInputParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_vars_5_0=ruleInput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"vars",
                      							lv_vars_5_0,
                      							"org.xtext.compilation.While_l.Input");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleExprAnd"
    // InternalWhile_l.g:1326:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWhile_l.g:1326:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWhile_l.g:1327:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // InternalWhile_l.g:1333:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'and' ( (lv_arg2_2_0= ruleExpr ) ) ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_arg1_0_0 = null;

        EObject lv_arg2_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1339:2: ( ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'and' ( (lv_arg2_2_0= ruleExpr ) ) ) )
            // InternalWhile_l.g:1340:2: ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'and' ( (lv_arg2_2_0= ruleExpr ) ) )
            {
            // InternalWhile_l.g:1340:2: ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'and' ( (lv_arg2_2_0= ruleExpr ) ) )
            // InternalWhile_l.g:1341:3: ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'and' ( (lv_arg2_2_0= ruleExpr ) )
            {
            // InternalWhile_l.g:1341:3: ( (lv_arg1_0_0= ruleExprSimple ) )
            // InternalWhile_l.g:1342:4: (lv_arg1_0_0= ruleExprSimple )
            {
            // InternalWhile_l.g:1342:4: (lv_arg1_0_0= ruleExprSimple )
            // InternalWhile_l.g:1343:5: lv_arg1_0_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getArg1ExprSimpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_arg1_0_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprAndRule());
              					}
              					set(
              						current,
              						"arg1",
              						lv_arg1_0_0,
              						"org.xtext.compilation.While_l.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAndKeyword_1());
              		
            }
            // InternalWhile_l.g:1364:3: ( (lv_arg2_2_0= ruleExpr ) )
            // InternalWhile_l.g:1365:4: (lv_arg2_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1365:4: (lv_arg2_2_0= ruleExpr )
            // InternalWhile_l.g:1366:5: lv_arg2_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getArg2ExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_arg2_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprAndRule());
              					}
              					set(
              						current,
              						"arg2",
              						lv_arg2_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // InternalWhile_l.g:1387:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWhile_l.g:1387:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWhile_l.g:1388:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // InternalWhile_l.g:1394:1: ruleExprOr returns [EObject current=null] : ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'or' ( (lv_arg2_2_0= ruleExpr ) ) ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_arg1_0_0 = null;

        EObject lv_arg2_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1400:2: ( ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'or' ( (lv_arg2_2_0= ruleExpr ) ) ) )
            // InternalWhile_l.g:1401:2: ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'or' ( (lv_arg2_2_0= ruleExpr ) ) )
            {
            // InternalWhile_l.g:1401:2: ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'or' ( (lv_arg2_2_0= ruleExpr ) ) )
            // InternalWhile_l.g:1402:3: ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= 'or' ( (lv_arg2_2_0= ruleExpr ) )
            {
            // InternalWhile_l.g:1402:3: ( (lv_arg1_0_0= ruleExprSimple ) )
            // InternalWhile_l.g:1403:4: (lv_arg1_0_0= ruleExprSimple )
            {
            // InternalWhile_l.g:1403:4: (lv_arg1_0_0= ruleExprSimple )
            // InternalWhile_l.g:1404:5: lv_arg1_0_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getArg1ExprSimpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_arg1_0_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprOrRule());
              					}
              					set(
              						current,
              						"arg1",
              						lv_arg1_0_0,
              						"org.xtext.compilation.While_l.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getOrKeyword_1());
              		
            }
            // InternalWhile_l.g:1425:3: ( (lv_arg2_2_0= ruleExpr ) )
            // InternalWhile_l.g:1426:4: (lv_arg2_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1426:4: (lv_arg2_2_0= ruleExpr )
            // InternalWhile_l.g:1427:5: lv_arg2_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getArg2ExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_arg2_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprOrRule());
              					}
              					set(
              						current,
              						"arg2",
              						lv_arg2_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprCons"
    // InternalWhile_l.g:1448:1: entryRuleExprCons returns [EObject current=null] : iv_ruleExprCons= ruleExprCons EOF ;
    public final EObject entryRuleExprCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprCons = null;


        try {
            // InternalWhile_l.g:1448:49: (iv_ruleExprCons= ruleExprCons EOF )
            // InternalWhile_l.g:1449:2: iv_ruleExprCons= ruleExprCons EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprCons=ruleExprCons();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprCons; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprCons"


    // $ANTLR start "ruleExprCons"
    // InternalWhile_l.g:1455:1: ruleExprCons returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'cons' ( (lv_arg1_2_0= ruleExpr ) ) ( (lv_arg2_3_0= ruleExpr ) ) otherlv_4= ')' ) ;
    public final EObject ruleExprCons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_arg1_2_0 = null;

        EObject lv_arg2_3_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1461:2: ( (otherlv_0= '(' otherlv_1= 'cons' ( (lv_arg1_2_0= ruleExpr ) ) ( (lv_arg2_3_0= ruleExpr ) ) otherlv_4= ')' ) )
            // InternalWhile_l.g:1462:2: (otherlv_0= '(' otherlv_1= 'cons' ( (lv_arg1_2_0= ruleExpr ) ) ( (lv_arg2_3_0= ruleExpr ) ) otherlv_4= ')' )
            {
            // InternalWhile_l.g:1462:2: (otherlv_0= '(' otherlv_1= 'cons' ( (lv_arg1_2_0= ruleExpr ) ) ( (lv_arg2_3_0= ruleExpr ) ) otherlv_4= ')' )
            // InternalWhile_l.g:1463:3: otherlv_0= '(' otherlv_1= 'cons' ( (lv_arg1_2_0= ruleExpr ) ) ( (lv_arg2_3_0= ruleExpr ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprConsAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprConsAccess().getConsKeyword_1());
              		
            }
            // InternalWhile_l.g:1471:3: ( (lv_arg1_2_0= ruleExpr ) )
            // InternalWhile_l.g:1472:4: (lv_arg1_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1472:4: (lv_arg1_2_0= ruleExpr )
            // InternalWhile_l.g:1473:5: lv_arg1_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprConsAccess().getArg1ExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_arg1_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprConsRule());
              					}
              					set(
              						current,
              						"arg1",
              						lv_arg1_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhile_l.g:1490:3: ( (lv_arg2_3_0= ruleExpr ) )
            // InternalWhile_l.g:1491:4: (lv_arg2_3_0= ruleExpr )
            {
            // InternalWhile_l.g:1491:4: (lv_arg2_3_0= ruleExpr )
            // InternalWhile_l.g:1492:5: lv_arg2_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprConsAccess().getArg2ExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_arg2_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprConsRule());
              					}
              					set(
              						current,
              						"arg2",
              						lv_arg2_3_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getExprConsAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprCons"


    // $ANTLR start "entryRuleExprList"
    // InternalWhile_l.g:1517:1: entryRuleExprList returns [EObject current=null] : iv_ruleExprList= ruleExprList EOF ;
    public final EObject entryRuleExprList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprList = null;


        try {
            // InternalWhile_l.g:1517:49: (iv_ruleExprList= ruleExprList EOF )
            // InternalWhile_l.g:1518:2: iv_ruleExprList= ruleExprList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprList=ruleExprList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprList"


    // $ANTLR start "ruleExprList"
    // InternalWhile_l.g:1524:1: ruleExprList returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'list' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleExprList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1530:2: ( (otherlv_0= '(' otherlv_1= 'list' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // InternalWhile_l.g:1531:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // InternalWhile_l.g:1531:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' )
            // InternalWhile_l.g:1532:3: otherlv_0= '(' otherlv_1= 'list' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprListAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprListAccess().getListKeyword_1());
              		
            }
            // InternalWhile_l.g:1540:3: ( (lv_arg_2_0= ruleExpr ) )
            // InternalWhile_l.g:1541:4: (lv_arg_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1541:4: (lv_arg_2_0= ruleExpr )
            // InternalWhile_l.g:1542:5: lv_arg_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprListAccess().getArgExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_arg_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprListRule());
              					}
              					add(
              						current,
              						"arg",
              						lv_arg_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExprListAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprList"


    // $ANTLR start "entryRuleExprHd"
    // InternalWhile_l.g:1567:1: entryRuleExprHd returns [EObject current=null] : iv_ruleExprHd= ruleExprHd EOF ;
    public final EObject entryRuleExprHd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprHd = null;


        try {
            // InternalWhile_l.g:1567:47: (iv_ruleExprHd= ruleExprHd EOF )
            // InternalWhile_l.g:1568:2: iv_ruleExprHd= ruleExprHd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprHdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprHd=ruleExprHd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprHd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprHd"


    // $ANTLR start "ruleExprHd"
    // InternalWhile_l.g:1574:1: ruleExprHd returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'hd' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleExprHd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1580:2: ( (otherlv_0= '(' otherlv_1= 'hd' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // InternalWhile_l.g:1581:2: (otherlv_0= '(' otherlv_1= 'hd' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // InternalWhile_l.g:1581:2: (otherlv_0= '(' otherlv_1= 'hd' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' )
            // InternalWhile_l.g:1582:3: otherlv_0= '(' otherlv_1= 'hd' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprHdAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprHdAccess().getHdKeyword_1());
              		
            }
            // InternalWhile_l.g:1590:3: ( (lv_arg_2_0= ruleExpr ) )
            // InternalWhile_l.g:1591:4: (lv_arg_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1591:4: (lv_arg_2_0= ruleExpr )
            // InternalWhile_l.g:1592:5: lv_arg_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprHdAccess().getArgExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_arg_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprHdRule());
              					}
              					set(
              						current,
              						"arg",
              						lv_arg_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExprHdAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprHd"


    // $ANTLR start "entryRuleExprTl"
    // InternalWhile_l.g:1617:1: entryRuleExprTl returns [EObject current=null] : iv_ruleExprTl= ruleExprTl EOF ;
    public final EObject entryRuleExprTl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTl = null;


        try {
            // InternalWhile_l.g:1617:47: (iv_ruleExprTl= ruleExprTl EOF )
            // InternalWhile_l.g:1618:2: iv_ruleExprTl= ruleExprTl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprTlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprTl=ruleExprTl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprTl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprTl"


    // $ANTLR start "ruleExprTl"
    // InternalWhile_l.g:1624:1: ruleExprTl returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'tl' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleExprTl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_arg_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1630:2: ( (otherlv_0= '(' otherlv_1= 'tl' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // InternalWhile_l.g:1631:2: (otherlv_0= '(' otherlv_1= 'tl' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // InternalWhile_l.g:1631:2: (otherlv_0= '(' otherlv_1= 'tl' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')' )
            // InternalWhile_l.g:1632:3: otherlv_0= '(' otherlv_1= 'tl' ( (lv_arg_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprTlAccess().getLeftParenthesisKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprTlAccess().getTlKeyword_1());
              		
            }
            // InternalWhile_l.g:1640:3: ( (lv_arg_2_0= ruleExpr ) )
            // InternalWhile_l.g:1641:4: (lv_arg_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1641:4: (lv_arg_2_0= ruleExpr )
            // InternalWhile_l.g:1642:5: lv_arg_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprTlAccess().getArgExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_arg_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprTlRule());
              					}
              					set(
              						current,
              						"arg",
              						lv_arg_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExprTlAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprTl"


    // $ANTLR start "entryRuleExprSym"
    // InternalWhile_l.g:1667:1: entryRuleExprSym returns [EObject current=null] : iv_ruleExprSym= ruleExprSym EOF ;
    public final EObject entryRuleExprSym() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSym = null;


        try {
            // InternalWhile_l.g:1667:48: (iv_ruleExprSym= ruleExprSym EOF )
            // InternalWhile_l.g:1668:2: iv_ruleExprSym= ruleExprSym EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSymRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSym=ruleExprSym();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSym; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSym"


    // $ANTLR start "ruleExprSym"
    // InternalWhile_l.g:1674:1: ruleExprSym returns [EObject current=null] : (otherlv_0= '(' ( (lv_arg1_1_0= RULE_SYMBOLE ) ) ( (lv_arg2_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleExprSym() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_arg1_1_0=null;
        Token otherlv_3=null;
        EObject lv_arg2_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1680:2: ( (otherlv_0= '(' ( (lv_arg1_1_0= RULE_SYMBOLE ) ) ( (lv_arg2_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // InternalWhile_l.g:1681:2: (otherlv_0= '(' ( (lv_arg1_1_0= RULE_SYMBOLE ) ) ( (lv_arg2_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // InternalWhile_l.g:1681:2: (otherlv_0= '(' ( (lv_arg1_1_0= RULE_SYMBOLE ) ) ( (lv_arg2_2_0= ruleExpr ) ) otherlv_3= ')' )
            // InternalWhile_l.g:1682:3: otherlv_0= '(' ( (lv_arg1_1_0= RULE_SYMBOLE ) ) ( (lv_arg2_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprSymAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalWhile_l.g:1686:3: ( (lv_arg1_1_0= RULE_SYMBOLE ) )
            // InternalWhile_l.g:1687:4: (lv_arg1_1_0= RULE_SYMBOLE )
            {
            // InternalWhile_l.g:1687:4: (lv_arg1_1_0= RULE_SYMBOLE )
            // InternalWhile_l.g:1688:5: lv_arg1_1_0= RULE_SYMBOLE
            {
            lv_arg1_1_0=(Token)match(input,RULE_SYMBOLE,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_arg1_1_0, grammarAccess.getExprSymAccess().getArg1SYMBOLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExprSymRule());
              					}
              					setWithLastConsumed(
              						current,
              						"arg1",
              						lv_arg1_1_0,
              						"org.xtext.compilation.While_l.SYMBOLE");
              				
            }

            }


            }

            // InternalWhile_l.g:1704:3: ( (lv_arg2_2_0= ruleExpr ) )
            // InternalWhile_l.g:1705:4: (lv_arg2_2_0= ruleExpr )
            {
            // InternalWhile_l.g:1705:4: (lv_arg2_2_0= ruleExpr )
            // InternalWhile_l.g:1706:5: lv_arg2_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprSymAccess().getArg2ExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_arg2_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprSymRule());
              					}
              					add(
              						current,
              						"arg2",
              						lv_arg2_2_0,
              						"org.xtext.compilation.While_l.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExprSymAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSym"


    // $ANTLR start "entryRuleExprNot"
    // InternalWhile_l.g:1731:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWhile_l.g:1731:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWhile_l.g:1732:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // InternalWhile_l.g:1738:1: ruleExprNot returns [EObject current=null] : (otherlv_0= 'not' ( (lv_arg1_1_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_arg1_1_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1744:2: ( (otherlv_0= 'not' ( (lv_arg1_1_0= ruleExprEq ) ) ) )
            // InternalWhile_l.g:1745:2: (otherlv_0= 'not' ( (lv_arg1_1_0= ruleExprEq ) ) )
            {
            // InternalWhile_l.g:1745:2: (otherlv_0= 'not' ( (lv_arg1_1_0= ruleExprEq ) ) )
            // InternalWhile_l.g:1746:3: otherlv_0= 'not' ( (lv_arg1_1_0= ruleExprEq ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getNotKeyword_0());
              		
            }
            // InternalWhile_l.g:1750:3: ( (lv_arg1_1_0= ruleExprEq ) )
            // InternalWhile_l.g:1751:4: (lv_arg1_1_0= ruleExprEq )
            {
            // InternalWhile_l.g:1751:4: (lv_arg1_1_0= ruleExprEq )
            // InternalWhile_l.g:1752:5: lv_arg1_1_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprNotAccess().getArg1ExprEqParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_arg1_1_0=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprNotRule());
              					}
              					set(
              						current,
              						"arg1",
              						lv_arg1_1_0,
              						"org.xtext.compilation.While_l.ExprEq");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // InternalWhile_l.g:1773:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWhile_l.g:1773:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWhile_l.g:1774:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // InternalWhile_l.g:1780:1: ruleExprEq returns [EObject current=null] : ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_arg2_2_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_arg1_0_0 = null;

        EObject lv_arg2_2_0 = null;



        	enterRule();

        try {
            // InternalWhile_l.g:1786:2: ( ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_arg2_2_0= ruleExprSimple ) ) ) )
            // InternalWhile_l.g:1787:2: ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_arg2_2_0= ruleExprSimple ) ) )
            {
            // InternalWhile_l.g:1787:2: ( ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_arg2_2_0= ruleExprSimple ) ) )
            // InternalWhile_l.g:1788:3: ( (lv_arg1_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_arg2_2_0= ruleExprSimple ) )
            {
            // InternalWhile_l.g:1788:3: ( (lv_arg1_0_0= ruleExprSimple ) )
            // InternalWhile_l.g:1789:4: (lv_arg1_0_0= ruleExprSimple )
            {
            // InternalWhile_l.g:1789:4: (lv_arg1_0_0= ruleExprSimple )
            // InternalWhile_l.g:1790:5: lv_arg1_0_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprEqAccess().getArg1ExprSimpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_arg1_0_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprEqRule());
              					}
              					set(
              						current,
              						"arg1",
              						lv_arg1_0_0,
              						"org.xtext.compilation.While_l.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1());
              		
            }
            // InternalWhile_l.g:1811:3: ( (lv_arg2_2_0= ruleExprSimple ) )
            // InternalWhile_l.g:1812:4: (lv_arg2_2_0= ruleExprSimple )
            {
            // InternalWhile_l.g:1812:4: (lv_arg2_2_0= ruleExprSimple )
            // InternalWhile_l.g:1813:5: lv_arg2_2_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprEqAccess().getArg2ExprSimpleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_arg2_2_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprEqRule());
              					}
              					set(
              						current,
              						"arg2",
              						lv_arg2_2_0,
              						"org.xtext.compilation.While_l.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEq"

    // $ANTLR start synpred1_InternalWhile_l
    public final void synpred1_InternalWhile_l_fragment() throws RecognitionException {   
        // InternalWhile_l.g:1215:4: ( ( RULE_NIL ) )
        // InternalWhile_l.g:1215:5: ( RULE_NIL )
        {
        // InternalWhile_l.g:1215:5: ( RULE_NIL )
        // InternalWhile_l.g:1216:5: RULE_NIL
        {
        match(input,RULE_NIL,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalWhile_l

    // Delegated rules

    public final boolean synpred1_InternalWhile_l() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWhile_l_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\uffff\3\6\17\uffff\1\6\1\uffff\1\6";
    static final String dfa_3s = "\5\4\5\uffff\1\4\5\uffff\1\23\1\uffff\1\5\1\4\1\23\1\4";
    static final String dfa_4s = "\1\47\3\50\1\47\5\uffff\1\50\5\uffff\1\50\1\uffff\1\5\1\50\1\40\1\50";
    static final String dfa_5s = "\5\uffff\1\11\1\3\1\2\1\1\1\12\1\uffff\1\6\1\4\1\13\1\5\1\7\1\uffff\1\10\4\uffff";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\2\1\1\30\uffff\1\4\7\uffff\1\5",
            "\3\6\12\uffff\1\6\1\uffff\2\6\1\uffff\3\6\3\uffff\2\6\1\uffff\2\6\1\10\1\7\4\uffff\1\6\1\11",
            "\3\6\12\uffff\1\6\1\uffff\2\6\1\uffff\3\6\3\uffff\2\6\1\uffff\2\6\1\10\1\7\4\uffff\1\6\1\11",
            "\3\6\12\uffff\1\6\1\uffff\2\6\1\uffff\3\6\3\uffff\2\6\1\uffff\2\6\1\10\1\7\4\uffff\1\6\1\11",
            "\1\12\2\15\30\uffff\1\15\3\uffff\1\14\1\16\1\13\1\17\1\15",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\20\1\21\30\uffff\1\21\3\15\4\uffff\1\21\1\15",
            "",
            "",
            "",
            "",
            "",
            "\1\22\14\uffff\1\23\2\21\5\uffff\1\21",
            "",
            "\1\24",
            "\3\6\12\uffff\1\6\1\uffff\2\6\1\uffff\3\6\3\uffff\2\6\1\uffff\2\6\1\10\1\7\4\uffff\1\6\1\11",
            "\1\22\14\uffff\1\25",
            "\3\6\12\uffff\1\6\1\uffff\2\6\1\uffff\3\6\3\uffff\2\6\1\uffff\2\6\1\10\1\7\4\uffff\1\6\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "965:2: ( ( (lv_expr_0_0= ruleExprAnd ) ) | ( (lv_expr_1_0= ruleExprOr ) ) | ( (lv_expr_2_0= ruleExprSimple ) ) | ( (lv_expr_3_0= ruleExprCons ) ) | ( (lv_expr_4_0= ruleExprList ) ) | ( (lv_expr_5_0= ruleExprHd ) ) | ( (lv_expr_6_0= ruleExprTl ) ) | ( (lv_expr_7_0= ruleExprSym ) ) | ( (lv_expr_8_0= ruleExprNot ) ) | ( (lv_exprEq_9_0= ruleExprEq ) ) | (otherlv_10= '(' ( (lv_expr_11_0= ruleExpr ) ) otherlv_12= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000004A200020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008080000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});

}