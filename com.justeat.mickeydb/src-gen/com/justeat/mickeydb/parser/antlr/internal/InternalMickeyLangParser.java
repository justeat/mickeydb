package com.justeat.mickeydb.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.justeat.mickeydb.services.MickeyLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMickeyLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'function'", "'('", "','", "')'", "'{'", "';'", "'}'", "'action'", "'/'", "':'", "'#'", "'*'", "'migration'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'as'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'unique'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'check'", "'constraint'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=5;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMickeyLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMickeyLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMickeyLangParser.tokenNames; }
    public String getGrammarFileName() { return "../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g"; }



     	private MickeyLangGrammarAccess grammarAccess;
     	
        public InternalMickeyLangParser(TokenStream input, MickeyLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MickeyLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) ( (lv_blocks_2_0= ruleMickeyBlock ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_databaseName_1_0 = null;

        EObject lv_blocks_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:80:28: ( (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) ( (lv_blocks_2_0= ruleMickeyBlock ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:81:1: (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) ( (lv_blocks_2_0= ruleMickeyBlock ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:81:1: (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) ( (lv_blocks_2_0= ruleMickeyBlock ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:81:3: otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) ( (lv_blocks_2_0= ruleMickeyBlock ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDatabaseKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:85:1: ( (lv_databaseName_1_0= ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:86:1: (lv_databaseName_1_0= ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:86:1: (lv_databaseName_1_0= ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:87:3: lv_databaseName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getDatabaseNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_databaseName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"databaseName",
                      		lv_databaseName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:103:2: ( (lv_blocks_2_0= ruleMickeyBlock ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==20||LA1_0==25||LA1_0==91||LA1_0==105||LA1_0==108) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:104:1: (lv_blocks_2_0= ruleMickeyBlock )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:104:1: (lv_blocks_2_0= ruleMickeyBlock )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:105:3: lv_blocks_2_0= ruleMickeyBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getBlocksMickeyBlockParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMickeyBlock_in_ruleModel164);
            	    lv_blocks_2_0=ruleMickeyBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"blocks",
            	              		lv_blocks_2_0, 
            	              		"MickeyBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMickeyBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:129:1: entryRuleMickeyBlock returns [EObject current=null] : iv_ruleMickeyBlock= ruleMickeyBlock EOF ;
    public final EObject entryRuleMickeyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMickeyBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:130:2: (iv_ruleMickeyBlock= ruleMickeyBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:131:2: iv_ruleMickeyBlock= ruleMickeyBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMickeyBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMickeyBlock_in_entryRuleMickeyBlock201);
            iv_ruleMickeyBlock=ruleMickeyBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMickeyBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMickeyBlock211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMickeyBlock"


    // $ANTLR start "ruleMickeyBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:138:1: ruleMickeyBlock returns [EObject current=null] : (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock ) ;
    public final EObject ruleMickeyBlock() throws RecognitionException {
        EObject current = null;

        EObject this_MickeyFunction_0 = null;

        EObject this_ActionStatement_1 = null;

        EObject this_DDLStatement_2 = null;

        EObject this_MigrationBlock_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:141:28: ( (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:142:1: (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:142:1: (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 91:
            case 105:
            case 108:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:143:5: this_MickeyFunction_0= ruleMickeyFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getMickeyFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMickeyFunction_in_ruleMickeyBlock258);
                    this_MickeyFunction_0=ruleMickeyFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MickeyFunction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:153:5: this_ActionStatement_1= ruleActionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getActionStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActionStatement_in_ruleMickeyBlock285);
                    this_ActionStatement_1=ruleActionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActionStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:163:5: this_DDLStatement_2= ruleDDLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getDDLStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMickeyBlock312);
                    this_DDLStatement_2=ruleDDLStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DDLStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:173:5: this_MigrationBlock_3= ruleMigrationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getMigrationBlockParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMigrationBlock_in_ruleMickeyBlock339);
                    this_MigrationBlock_3=ruleMigrationBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MigrationBlock_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleMickeyBlock"


    // $ANTLR start "entryRuleMickeyFunction"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:189:1: entryRuleMickeyFunction returns [EObject current=null] : iv_ruleMickeyFunction= ruleMickeyFunction EOF ;
    public final EObject entryRuleMickeyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMickeyFunction = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:190:2: (iv_ruleMickeyFunction= ruleMickeyFunction EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:191:2: iv_ruleMickeyFunction= ruleMickeyFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMickeyFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMickeyFunction_in_entryRuleMickeyFunction374);
            iv_ruleMickeyFunction=ruleMickeyFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMickeyFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMickeyFunction384); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMickeyFunction"


    // $ANTLR start "ruleMickeyFunction"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:198:1: ruleMickeyFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';' )* otherlv_10= '}' ) ;
    public final EObject ruleMickeyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_statements_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:201:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';' )* otherlv_10= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:202:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';' )* otherlv_10= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:202:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';' )* otherlv_10= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:202:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';' )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleMickeyFunction421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMickeyFunctionAccess().getFunctionKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:206:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:207:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:207:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:208:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMickeyFunction438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMickeyFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMickeyFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMickeyFunction455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMickeyFunctionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:228:1: ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=127 && LA4_0<=130)||LA4_0==133) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:228:2: ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:228:2: ( (lv_args_3_0= ruleFunctionArg ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:229:1: (lv_args_3_0= ruleFunctionArg )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:229:1: (lv_args_3_0= ruleFunctionArg )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:230:3: lv_args_3_0= ruleFunctionArg
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getArgsFunctionArgParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctionArg_in_ruleMickeyFunction477);
                    lv_args_3_0=ruleFunctionArg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_3_0, 
                              		"FunctionArg");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:246:2: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:246:4: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMickeyFunction490); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMickeyFunctionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:250:1: ( (lv_args_5_0= ruleFunctionArg ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:251:1: (lv_args_5_0= ruleFunctionArg )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:251:1: (lv_args_5_0= ruleFunctionArg )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:252:3: lv_args_5_0= ruleFunctionArg
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getArgsFunctionArgParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFunctionArg_in_ruleMickeyFunction511);
                    	    lv_args_5_0=ruleFunctionArg();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_5_0, 
                    	              		"FunctionArg");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleMickeyFunction527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMickeyFunctionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMickeyFunction539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMickeyFunctionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:276:1: ( ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==71||(LA5_0>=99 && LA5_0<=101)||LA5_0==119) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:276:2: ( (lv_statements_8_0= ruleDMLStatement ) ) otherlv_9= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:276:2: ( (lv_statements_8_0= ruleDMLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:277:1: (lv_statements_8_0= ruleDMLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:277:1: (lv_statements_8_0= ruleDMLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:278:3: lv_statements_8_0= ruleDMLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getStatementsDMLStatementParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleMickeyFunction561);
            	    lv_statements_8_0=ruleDMLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_8_0, 
            	              		"DMLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMickeyFunction573); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getMickeyFunctionAccess().getSemicolonKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleMickeyFunction587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMickeyFunctionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleMickeyFunction"


    // $ANTLR start "entryRuleActionStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:310:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:311:2: (iv_ruleActionStatement= ruleActionStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:312:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleActionStatement_in_entryRuleActionStatement623);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStatement633); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:319:1: ruleActionStatement returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_uri_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:322:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:323:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:323:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:323:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleActionStatement670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:327:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:328:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:328:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:329:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStatement687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getActionStatementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:345:2: ( (lv_uri_2_0= ruleContentUri ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:346:1: (lv_uri_2_0= ruleContentUri )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:346:1: (lv_uri_2_0= ruleContentUri )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:347:3: lv_uri_2_0= ruleContentUri
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionStatementAccess().getUriContentUriParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContentUri_in_ruleActionStatement713);
            lv_uri_2_0=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
              	        }
                     		set(
                     			current, 
                     			"uri",
                      		lv_uri_2_0, 
                      		"ContentUri");
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
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRuleFunctionArg"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:371:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:372:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:373:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg749);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionArg"


    // $ANTLR start "ruleFunctionArg"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:380:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:383:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:384:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:384:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:384:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:384:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:385:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:385:1: (lv_type_0_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:386:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg805);
            lv_type_0_0=ruleColumnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionArgRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ColumnType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:402:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:404:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionArgAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionArgRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleFunctionArg"


    // $ANTLR start "entryRuleContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:428:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:429:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:430:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri863);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri873); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentUri"


    // $ANTLR start "ruleContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:437:1: ruleContentUri returns [EObject current=null] : (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:440:28: ( (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:441:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:441:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:441:3: otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleContentUri910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriAccess().getSolidusKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:445:1: ( (lv_type_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:446:1: (lv_type_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:446:1: (lv_type_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:447:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUri927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_1_0, grammarAccess.getContentUriAccess().getTypeIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getContentUriRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:463:2: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:463:4: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleContentUri945); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:467:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:468:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:468:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:469:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri966);
            	    lv_segments_3_0=ruleContentUriSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContentUriRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_3_0, 
            	              		"ContentUriSegment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleContentUri"


    // $ANTLR start "entryRuleContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:493:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:494:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:495:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1004);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1014); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentUriSegment"


    // $ANTLR start "ruleContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:502:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) ;
    public final EObject ruleContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_num_5_0=null;
        Token lv_text_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:505:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:506:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:506:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:506:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:506:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:507:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:507:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:508:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:526:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleContentUriSegment1089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:535:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:536:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:536:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:537:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleContentUriSegment1123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:557:1: ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==23) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==24) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:557:2: ( (lv_num_5_0= '#' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:557:2: ( (lv_num_5_0= '#' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:558:1: (lv_num_5_0= '#' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:558:1: (lv_num_5_0= '#' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:559:3: lv_num_5_0= '#'
                            {
                            lv_num_5_0=(Token)match(input,23,FOLLOW_23_in_ruleContentUriSegment1142); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_num_5_0, grammarAccess.getContentUriSegmentAccess().getNumNumberSignKeyword_1_4_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                              	        }
                                     		setWithLastConsumed(current, "num", true, "#");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:573:6: ( (lv_text_6_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:573:6: ( (lv_text_6_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:574:1: (lv_text_6_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:574:1: (lv_text_6_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:575:3: lv_text_6_0= '*'
                            {
                            lv_text_6_0=(Token)match(input,24,FOLLOW_24_in_ruleContentUriSegment1179); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_text_6_0, grammarAccess.getContentUriSegmentAccess().getTextAsteriskKeyword_1_4_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                              	        }
                                     		setWithLastConsumed(current, "text", true, "*");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleContentUriSegment1205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getContentUriSegmentAccess().getRightCurlyBracketKeyword_1_5());
                          
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
    // $ANTLR end "ruleContentUriSegment"


    // $ANTLR start "entryRuleMigrationBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:600:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:601:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:602:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1242);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1252); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMigrationBlock"


    // $ANTLR start "ruleMigrationBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:609:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' ( (lv_name_2_0= RULE_NUMBER ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_statements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:612:28: ( ( () otherlv_1= 'migration' ( (lv_name_2_0= RULE_NUMBER ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:613:1: ( () otherlv_1= 'migration' ( (lv_name_2_0= RULE_NUMBER ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:613:1: ( () otherlv_1= 'migration' ( (lv_name_2_0= RULE_NUMBER ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:613:2: () otherlv_1= 'migration' ( (lv_name_2_0= RULE_NUMBER ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:613:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:614:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMigrationBlock1298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:623:1: ( (lv_name_2_0= RULE_NUMBER ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:624:1: (lv_name_2_0= RULE_NUMBER )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:624:1: (lv_name_2_0= RULE_NUMBER )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:625:3: lv_name_2_0= RULE_NUMBER
            {
            lv_name_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMigrationBlock1315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMigrationBlockAccess().getNameNUMBERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"NUMBER");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMigrationBlock1332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:645:1: ( ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==91||LA9_0==105||LA9_0==108) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:645:2: ( (lv_statements_4_0= ruleDDLStatement ) ) otherlv_5= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:645:2: ( (lv_statements_4_0= ruleDDLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:646:1: (lv_statements_4_0= ruleDDLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:646:1: (lv_statements_4_0= ruleDDLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:647:3: lv_statements_4_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1354);
            	    lv_statements_4_0=ruleDDLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"DDLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock1366); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_4_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock1380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMigrationBlockAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleMigrationBlock"


    // $ANTLR start "entryRuleSqlExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:679:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:680:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:681:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1416);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression1426); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqlExpression"


    // $ANTLR start "ruleSqlExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:688:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:691:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:693:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression1472);
            this_ExprConcat_0=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprConcat_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleSqlExpression"


    // $ANTLR start "entryRuleExprConcat"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:709:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:710:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:711:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat1506);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat1516); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprConcat"


    // $ANTLR start "ruleExprConcat"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:718:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:721:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:722:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:722:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:723:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1563);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:731:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:731:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:731:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:732:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:737:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:738:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:738:1: (lv_op_2_0= '||' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:739:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,26,FOLLOW_26_in_ruleExprConcat1590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprConcatRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:752:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:753:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:753:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:754:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1624);
            	    lv_right_3_0=ruleExprMult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprConcatRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprMult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleExprConcat"


    // $ANTLR start "entryRuleExprMult"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:778:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:779:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:780:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1662);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1672); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprMult"


    // $ANTLR start "ruleExprMult"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:787:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:790:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:791:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:791:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:792:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1719);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:800:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21||LA12_0==24||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:800:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:800:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:806:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:807:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:807:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:808:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:808:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:809:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,24,FOLLOW_24_in_ruleExprMult1748); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprMultAccess().getOpAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:821:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,21,FOLLOW_21_in_ruleExprMult1777); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprMultAccess().getOpSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:833:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_27_in_ruleExprMult1806); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprMultAccess().getOpPercentSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:848:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:849:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:849:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:850:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1843);
            	    lv_right_3_0=ruleExprAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprMultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprAdd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:874:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:875:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:876:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd1881);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd1891); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprAdd"


    // $ANTLR start "ruleExprAdd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:883:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:886:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:887:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:887:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:888:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1938);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:896:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=28 && LA14_0<=29)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:896:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:896:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:897:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:902:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:903:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:903:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:904:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:904:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==28) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==29) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:905:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_28_in_ruleExprAdd1967); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprAddAccess().getOpPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprAddRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:917:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_29_in_ruleExprAdd1996); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprAddAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprAddRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:932:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:933:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:933:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:934:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2033);
            	    lv_right_3_0=ruleExprBit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAddRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprBit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleExprAdd"


    // $ANTLR start "entryRuleExprBit"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:958:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:959:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:960:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2071);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprBit"


    // $ANTLR start "ruleExprBit"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:967:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
    public final EObject ruleExprBit() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ExprRelate_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:970:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:971:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:971:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:972:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2128);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:980:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:980:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:980:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:981:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:986:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:987:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:987:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:988:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:988:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:989:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_30_in_ruleExprBit2157); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprBitAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1001:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,31,FOLLOW_31_in_ruleExprBit2186); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprBitAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1013:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_32_in_ruleExprBit2215); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprBitAccess().getOpAmpersandKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1025:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_33_in_ruleExprBit2244); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprBitAccess().getOpVerticalLineKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1040:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1041:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1041:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1042:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2281);
            	    lv_right_3_0=ruleExprRelate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprBitRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprRelate");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1067:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1068:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2319);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2329); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprRelate"


    // $ANTLR start "ruleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1075:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
    public final EObject ruleExprRelate() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ExprEqual_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1078:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1079:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1079:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1080:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2376);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1088:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1088:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1088:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1089:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1094:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1095:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1095:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1096:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1096:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt17=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1097:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleExprRelate2405); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprRelateAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1109:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleExprRelate2434); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprRelateAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1121:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_36_in_ruleExprRelate2463); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprRelateAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1133:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_37_in_ruleExprRelate2492); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprRelateAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1148:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1149:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1149:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1150:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2529);
            	    lv_right_3_0=ruleExprEqual();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprRelateRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprEqual");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1174:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1175:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1176:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2567);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2577); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprEqual"


    // $ANTLR start "ruleExprEqual"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1183:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
    public final EObject ruleExprEqual() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        Token lv_op_2_10=null;
        Token lv_op_2_11=null;
        Token lv_op_2_12=null;
        EObject this_ExprAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1186:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1187:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1187:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1188:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2624);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1196:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=38 && LA20_0<=49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1196:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1196:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1197:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1202:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1203:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1203:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1204:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1204:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt19=12;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt19=6;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt19=7;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt19=8;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt19=9;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt19=10;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt19=11;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt19=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1205:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,38,FOLLOW_38_in_ruleExprEqual2653); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprEqualAccess().getOpEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1217:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,39,FOLLOW_39_in_ruleExprEqual2682); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1229:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,40,FOLLOW_40_in_ruleExprEqual2711); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1241:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2740); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprEqualAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1253:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2769); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_5, grammarAccess.getExprEqualAccess().getOpIsKeyword_1_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1265:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2798); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_6, grammarAccess.getExprEqualAccess().getOpIsNotKeyword_1_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1277:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2827); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_7, grammarAccess.getExprEqualAccess().getOpInKeyword_1_1_0_6());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_7, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1289:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual2856); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpNotInKeyword_1_1_0_7());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_8, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1301:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual2885); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_8());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_9, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1313:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual2914); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_9());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_10, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1325:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual2943); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_11, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_10());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_11, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1337:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual2972); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_12, grammarAccess.getExprEqualAccess().getOpRegexpKeyword_1_1_0_11());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_12, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1352:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1353:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1353:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1354:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3009);
            	    lv_right_3_0=ruleExprAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprEqualRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1378:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1379:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1380:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3047);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3057); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1387:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1390:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1391:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1391:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1392:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3104);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1400:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1400:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1400:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1401:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1406:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1407:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1407:1: (lv_op_2_0= 'and' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1408:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,50,FOLLOW_50_in_ruleExprAnd3131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprAndRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1421:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1422:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1422:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1423:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3165);
            	    lv_right_3_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1447:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1448:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1449:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3203);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3213); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1456:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1459:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1460:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1460:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1461:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3260);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1469:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1469:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1469:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1470:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1475:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1476:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1476:1: (lv_op_2_0= 'or' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1477:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,51,FOLLOW_51_in_ruleExprOr3287); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprOrRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1490:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1491:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1491:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1492:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3321);
            	    lv_right_3_0=ruleNullCheckExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"NullCheckExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleNullCheckExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1516:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1517:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1518:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3359);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullCheckExpression"


    // $ANTLR start "ruleNullCheckExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1525:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1528:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1529:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1529:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1530:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3416);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1538:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=52 && LA23_0<=54)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1538:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1538:2: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1539:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1544:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1545:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1545:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1546:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3446);
                    lv_right_2_0=ruleNullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNullCheckExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"NullExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleNullCheckExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1570:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1571:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1572:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3484);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3494); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1579:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1582:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=53 && LA25_0<=54)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:2: ( () otherlv_1= 'is null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:3: () otherlv_1= 'is null'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1584:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleNullExpression3541); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1594:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1594:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1594:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1594:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1595:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1600:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==53) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==54) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1600:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleNullExpression3571); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1605:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleNullExpression3589); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNullExpressionAccess().getNotnullKeyword_1_1_1());
                                  
                            }

                            }
                            break;

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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1617:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1618:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1619:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3627);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3637); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1626:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_all_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_not_21_0=null;
        Token lv_exists_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token lv_name_34_0=null;
        Token otherlv_35=null;
        Token lv_all_36_0=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        EObject lv_literalValue_15_0 = null;

        EObject lv_expression_18_0 = null;

        EObject lv_select_24_0 = null;

        EObject lv_caseExpression_28_0 = null;

        EObject lv_cases_29_0 = null;

        EObject lv_elseExpression_31_0 = null;

        EObject lv_arguments_37_0 = null;

        EObject lv_arguments_39_0 = null;

        EObject lv_expression_44_0 = null;

        Enumerator lv_type_46_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1629:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1630:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1630:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt35=10;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1630:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1630:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1630:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1630:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1631:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1640:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1641:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1641:1: (otherlv_2= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1642:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1654:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1654:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1654:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1654:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1655:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1664:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1665:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1665:1: (otherlv_5= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1666:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1679:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt27=3;
                    alt27 = dfa27.predict(input);
                    switch (alt27) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1690:1: (otherlv_7= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1691:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3804); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3816); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1707:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1707:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1707:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1707:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1708:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1708:1: (otherlv_9= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1709:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3844); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3856); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1724:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==24) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==RULE_ID) ) {
                                alt26=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1724:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1724:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:1: (lv_all_11_0= '*' )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1726:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression3875); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_all_11_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_2_1_1_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                             		setWithLastConsumed(current, "all", true, "*");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1740:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1740:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1741:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1741:1: (otherlv_12= RULE_ID )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1742:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3914); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_1_1_2_1_0()); 
                                      	
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1754:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1754:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1755:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1755:1: (otherlv_13= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1756:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3942); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_1_2_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1768:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1768:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1768:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1768:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1769:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1774:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1775:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1775:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1776:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3981);
                    lv_literalValue_15_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literalValue",
                              		lv_literalValue_15_0, 
                              		"LiteralValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1793:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1793:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1793:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1793:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1794:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1803:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1805:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4031);
                    lv_expression_18_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_18_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1826:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1826:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1826:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1826:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1827:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1832:2: ( (lv_not_21_0= 'not' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==58) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1833:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1833:1: (lv_not_21_0= 'not' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1834:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression4078); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_not_21_0, grammarAccess.getPrimaryExpressionAccess().getNotNotKeyword_5_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "not", true, "not");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1847:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==59) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1848:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1848:1: (lv_exists_22_0= 'exists' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1849:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression4110); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_exists_22_0, grammarAccess.getPrimaryExpressionAccess().getExistsExistsKeyword_5_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "exists", true, "exists");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1866:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1867:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1867:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1868:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4157);
                    lv_select_24_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"select",
                              		lv_select_24_0, 
                              		"SelectStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1889:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1889:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1889:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1889:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1890:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1899:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==14||LA30_0==29||(LA30_0>=55 && LA30_0<=56)||(LA30_0>=58 && LA30_0<=60)||LA30_0==63||LA30_0==65||(LA30_0>=87 && LA30_0<=90)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1900:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1900:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1901:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4219);
                            lv_caseExpression_28_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"caseExpression",
                                      		lv_caseExpression_28_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1917:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==66) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1919:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4241);
                    	    lv_cases_29_0=ruleCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"cases",
                    	              		lv_cases_29_0, 
                    	              		"Case");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1935:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==61) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1935:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4255); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1939:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1940:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1940:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1941:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4276);
                            lv_elseExpression_31_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"elseExpression",
                                      		lv_elseExpression_31_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1962:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1962:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1962:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1962:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1963:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1968:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1969:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1969:1: (lv_name_34_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1970:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_34_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_34_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1990:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==24) ) {
                        alt34=1;
                    }
                    else if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==14||LA34_0==29||(LA34_0>=55 && LA34_0<=56)||(LA34_0>=58 && LA34_0<=60)||LA34_0==63||LA34_0==65||(LA34_0>=87 && LA34_0<=90)) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1990:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1990:2: ( (lv_all_36_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1991:1: (lv_all_36_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1991:1: (lv_all_36_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1992:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression4360); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_all_36_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_7_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "all", true, "*");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2006:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2006:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2006:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2006:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2007:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2007:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2008:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4401);
                            lv_arguments_37_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_37_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2024:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==15) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2024:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression4414); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2028:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2029:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2029:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2030:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4435);
                            	    lv_arguments_39_0=ruleSqlExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_39_0, 
                            	              		"SqlExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2051:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2051:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2051:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2051:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2052:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2065:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2066:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2066:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2067:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4513);
                    lv_expression_44_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_44_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2087:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2088:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2088:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4546);
                    lv_type_46_0=ruleSqliteDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_46_0, 
                              		"SqliteDataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_47=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2110:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2110:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2110:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2110:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2111:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2120:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2121:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2121:1: (otherlv_50= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2122:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_50, grammarAccess.getPrimaryExpressionAccess().getArgFunctionArgCrossReference_9_2_0()); 
                      	
                    }

                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCase"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2141:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2142:2: (iv_ruleCase= ruleCase EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2143:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4644);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4654); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2150:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2153:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2154:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2154:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2154:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleCase4691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2158:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2159:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2159:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2160:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4712);
            lv_whenExpression_1_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"whenExpression",
                      		lv_whenExpression_1_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleCase4724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2180:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2181:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2181:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2182:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4745);
            lv_thenExpression_3_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_3_0, 
                      		"SqlExpression");
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2206:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2207:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2208:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4781);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement4791); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2215:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_core_0_0 = null;

        EObject lv_orderby_2_0 = null;

        EObject lv_limit_4_0 = null;

        EObject lv_limitOffset_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2218:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2219:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2219:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2219:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2219:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2220:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2220:1: (lv_core_0_0= ruleSelectCore )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2221:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement4837);
            lv_core_0_0=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"core",
                      		lv_core_0_0, 
                      		"SelectCore");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2237:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==68) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2237:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleSelectStatement4850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2241:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2242:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2242:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2243:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4871);
                    lv_orderby_2_0=ruleOrderingTermList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"orderby",
                              		lv_orderby_2_0, 
                              		"OrderingTermList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2259:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==69) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2259:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleSelectStatement4886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2263:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2264:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2264:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2265:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement4907);
                    lv_limit_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"limit",
                              		lv_limit_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2281:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==15||LA38_0==70) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2281:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2281:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==70) ) {
                                alt37=1;
                            }
                            else if ( (LA37_0==15) ) {
                                alt37=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2281:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleSelectStatement4921); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2286:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSelectStatement4939); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2290:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2291:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2291:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2292:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement4961);
                            lv_limitOffset_7_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"limitOffset",
                                      		lv_limitOffset_7_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleOrderingTermList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2316:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2317:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2318:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5001);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5011); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderingTermList"


    // $ANTLR start "ruleOrderingTermList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2325:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2328:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2329:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2329:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2329:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2329:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2330:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2330:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2331:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5057);
            lv_orderingTerms_0_0=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderingTermListRule());
              	        }
                     		add(
                     			current, 
                     			"orderingTerms",
                      		lv_orderingTerms_0_0, 
                      		"OrderingTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2347:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==15) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2347:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleOrderingTermList5070); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2351:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2352:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2352:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2353:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5091);
            	    lv_orderingTerms_2_0=ruleOrderingTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrderingTermListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"orderingTerms",
            	              		lv_orderingTerms_2_0, 
            	              		"OrderingTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleOrderingTermList"


    // $ANTLR start "entryRuleSelectCore"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2377:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2378:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2379:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5129);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5139); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectCore"


    // $ANTLR start "ruleSelectCore"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2389:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2390:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2390:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2391:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5186);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2399:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=123 && LA41_0<=126)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2399:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2399:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2400:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2405:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2406:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2406:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2407:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5216);
            	    lv_op_2_0=ruleCompoundOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"CompoundOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2425:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5237);
            	    lv_right_3_0=ruleSelectExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SelectExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleSelectCore"


    // $ANTLR start "entryRuleSelectExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2449:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2450:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2451:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5275);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5285); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2458:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distinct_2_0=null;
        Token lv_all_3_0=null;
        Token lv_allColumns_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_selectList_5_0 = null;

        EObject lv_source_7_0 = null;

        EObject lv_where_9_0 = null;

        EObject lv_groupBy_11_0 = null;

        EObject lv_having_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2461:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2462:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2462:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2462:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2462:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2463:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSelectExpression5331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2472:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==72) ) {
                alt42=1;
            }
            else if ( (LA42_0==73) ) {
                alt42=2;
            }
            switch (alt42) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2472:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2472:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2473:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2473:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2474:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,72,FOLLOW_72_in_ruleSelectExpression5350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_distinct_2_0, grammarAccess.getSelectExpressionAccess().getDistinctDistinctKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "distinct", true, "distinct");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2488:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2488:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2489:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2489:1: (lv_all_3_0= 'all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2490:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,73,FOLLOW_73_in_ruleSelectExpression5387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_all_3_0, grammarAccess.getSelectExpressionAccess().getAllAllKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "all", true, "all");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2503:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==24) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==14||LA43_0==29||(LA43_0>=55 && LA43_0<=56)||(LA43_0>=58 && LA43_0<=60)||LA43_0==63||LA43_0==65||(LA43_0>=87 && LA43_0<=90)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2503:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2503:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2504:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2504:1: (lv_allColumns_4_0= '*' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2505:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,24,FOLLOW_24_in_ruleSelectExpression5421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_allColumns_4_0, grammarAccess.getSelectExpressionAccess().getAllColumnsAsteriskKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "allColumns", true, "*");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2519:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2519:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2520:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2520:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2521:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5461);
                    lv_selectList_5_0=ruleSelectList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"selectList",
                              		lv_selectList_5_0, 
                              		"SelectList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2537:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==74) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2537:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2541:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2542:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2542:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2543:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5496);
                    lv_source_7_0=ruleJoinSource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_7_0, 
                              		"JoinSource");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2559:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==75) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2559:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2563:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2564:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2564:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2565:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5532);
                    lv_where_9_0=ruleWhereExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"where",
                              		lv_where_9_0, 
                              		"WhereExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2581:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==76) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2581:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression5547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2585:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2586:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2586:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2587:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5568);
                    lv_groupBy_11_0=ruleGroupByExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"groupBy",
                              		lv_groupBy_11_0, 
                              		"GroupByExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2603:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==77) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2603:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression5583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2607:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2608:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2608:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2609:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5604);
                    lv_having_13_0=ruleHavingExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"having",
                              		lv_having_13_0, 
                              		"HavingExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleSelectList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2633:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2634:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2635:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5642);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5652); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectList"


    // $ANTLR start "ruleSelectList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2642:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2645:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2646:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2646:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2646:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2646:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2647:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2647:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2648:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5698);
            lv_resultColumns_0_0=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectListRule());
              	        }
                     		add(
                     			current, 
                     			"resultColumns",
                      		lv_resultColumns_0_0, 
                      		"ResultColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==15) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSelectList5711); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2668:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2669:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2669:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2670:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5732);
            	    lv_resultColumns_2_0=ruleResultColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resultColumns",
            	              		lv_resultColumns_2_0, 
            	              		"ResultColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2694:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2695:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2696:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5770);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions5780); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhereExpressions"


    // $ANTLR start "ruleWhereExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2703:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2706:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2707:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2707:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2708:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2708:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2709:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5825);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereExpressionsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
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
    // $ANTLR end "ruleWhereExpressions"


    // $ANTLR start "entryRuleGroupByExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2733:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2734:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2735:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5860);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions5870); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroupByExpressions"


    // $ANTLR start "ruleGroupByExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2742:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2745:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2746:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2746:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2746:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2746:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2747:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2747:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2748:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5916);
            lv_groupByExpressions_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupByExpressionsRule());
              	        }
                     		add(
                     			current, 
                     			"groupByExpressions",
                      		lv_groupByExpressions_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2764:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==15) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2764:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGroupByExpressions5929); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2768:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2769:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2769:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2770:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5950);
            	    lv_groupByExpressions_2_0=ruleSqlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroupByExpressionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"groupByExpressions",
            	              		lv_groupByExpressions_2_0, 
            	              		"SqlExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // $ANTLR end "ruleGroupByExpressions"


    // $ANTLR start "entryRuleHavingExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2794:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2795:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2796:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5988);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions5998); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHavingExpressions"


    // $ANTLR start "ruleHavingExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2803:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2806:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2808:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2808:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2809:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6043);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHavingExpressionsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
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
    // $ANTLR end "ruleHavingExpressions"


    // $ANTLR start "entryRuleOrderingTerm"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2833:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2834:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2835:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6078);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6088); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderingTerm"


    // $ANTLR start "ruleOrderingTerm"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2842:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2845:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2846:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2846:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2846:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2846:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2847:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2847:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2848:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6134);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderingTermRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2864:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==78) ) {
                alt50=1;
            }
            else if ( (LA50_0==79) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2864:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2864:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2865:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2865:1: (lv_asc_1_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2866:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,78,FOLLOW_78_in_ruleOrderingTerm6153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_1_0, grammarAccess.getOrderingTermAccess().getAscAscKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderingTermRule());
                      	        }
                             		setWithLastConsumed(current, "asc", true, "asc");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2880:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2880:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2881:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2881:1: (lv_desc_2_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2882:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,79,FOLLOW_79_in_ruleOrderingTerm6190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_2_0, grammarAccess.getOrderingTermAccess().getDescDescKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderingTermRule());
                      	        }
                             		setWithLastConsumed(current, "desc", true, "desc");
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleOrderingTerm"


    // $ANTLR start "entryRuleJoinSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2903:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2904:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2905:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6241);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6251); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJoinSource"


    // $ANTLR start "ruleJoinSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2912:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2915:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2917:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2917:1: (lv_source_0_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2918:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6297);
            lv_source_0_0=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinSourceRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"SingleSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2934:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=80 && LA51_0<=81)||(LA51_0>=83 && LA51_0<=85)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2935:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2935:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2936:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6318);
            	    lv_joinStatements_1_0=ruleJoinStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJoinSourceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"joinStatements",
            	              		lv_joinStatements_1_0, 
            	              		"JoinStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleJoinSource"


    // $ANTLR start "entryRuleSingleSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2960:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2961:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2962:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource6355);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource6365); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSource"


    // $ANTLR start "ruleSingleSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2969:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2972:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2973:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2973:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==14) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==71) ) {
                    alt52=2;
                }
                else if ( (LA52_2==RULE_ID||LA52_2==14) ) {
                    alt52=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2974:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6412);
                    this_SingleSourceTable_0=ruleSingleSourceTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceTable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2984:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6439);
                    this_SingleSourceSelectStatement_1=ruleSingleSourceSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceSelectStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2994:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6466);
                    this_SingleSourceJoin_2=ruleSingleSourceJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceJoin_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleSingleSource"


    // $ANTLR start "entryRuleSingleSourceTable"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3010:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3012:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6501);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6511); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSourceTable"


    // $ANTLR start "ruleSingleSourceTable"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3019:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3022:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3023:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3023:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3023:2: () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3023:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3029:2: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3030:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3030:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3031:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable6568);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3044:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==64) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3044:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleSingleSourceTable6581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3048:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3049:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3049:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3050:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getSingleSourceTableAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSingleSourceTable"


    // $ANTLR start "entryRuleSingleSourceSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3074:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3075:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3076:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6641);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6651); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSourceSelectStatement"


    // $ANTLR start "ruleSingleSourceSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3083:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3086:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3087:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3087:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3087:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3087:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3088:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceSelectStatement6697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3097:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3098:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3098:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3099:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6718);
            lv_selectStatement_2_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleSourceSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_2_0, 
                      		"SelectStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceSelectStatement6730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3119:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3119:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleSingleSourceSelectStatement6743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3123:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3124:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3124:1: (lv_name_5_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getSingleSourceSelectStatementAccess().getNameIDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSingleSourceSelectStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSingleSourceSelectStatement"


    // $ANTLR start "entryRuleSingleSourceJoin"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3149:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3150:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3151:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6803);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin6813); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSourceJoin"


    // $ANTLR start "ruleSingleSourceJoin"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3158:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3161:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3162:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3162:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3162:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceJoin6850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3166:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3167:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3167:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3168:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6871);
            lv_joinSource_1_0=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleSourceJoinRule());
              	        }
                     		set(
                     			current, 
                     			"joinSource",
                      		lv_joinSource_1_0, 
                      		"JoinSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceJoin6883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSingleSourceJoinAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleSingleSourceJoin"


    // $ANTLR start "entryRuleJoinStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3196:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3197:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3198:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6919);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement6929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJoinStatement"


    // $ANTLR start "ruleJoinStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3205:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleJoinStatement() throws RecognitionException {
        EObject current = null;

        Token lv_natural_1_0=null;
        Token lv_left_2_0=null;
        Token lv_outer_3_0=null;
        Token lv_inner_4_0=null;
        Token lv_cross_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_singleSource_7_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3208:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3209:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3209:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3209:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3209:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3215:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==80) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3216:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3216:1: (lv_natural_1_0= 'natural' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3217:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,80,FOLLOW_80_in_ruleJoinStatement6981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "natural", true, "natural");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt57=4;
            switch ( input.LA(1) ) {
                case 81:
                    {
                    alt57=1;
                    }
                    break;
                case 83:
                    {
                    alt57=2;
                    }
                    break;
                case 84:
                    {
                    alt57=3;
                    }
                    break;
            }

            switch (alt57) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3231:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3231:1: (lv_left_2_0= 'left' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3232:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement7015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "left", true, "left");
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3245:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==82) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3246:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3246:1: (lv_outer_3_0= 'outer' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,82,FOLLOW_82_in_ruleJoinStatement7046); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_outer_3_0, grammarAccess.getJoinStatementAccess().getOuterOuterKeyword_2_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getJoinStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "outer", true, "outer");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3261:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3261:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3262:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3262:1: (lv_inner_4_0= 'inner' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3263:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement7085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_inner_4_0, grammarAccess.getJoinStatementAccess().getInnerInnerKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "inner", true, "inner");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3277:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3277:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3278:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3278:1: (lv_cross_5_0= 'cross' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3279:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cross_5_0, grammarAccess.getJoinStatementAccess().getCrossCrossKeyword_2_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "cross", true, "cross");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3296:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3297:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3297:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3298:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7170);
            lv_singleSource_7_0=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
              	        }
                     		set(
                     			current, 
                     			"singleSource",
                      		lv_singleSource_7_0, 
                      		"SingleSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3318:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3319:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3319:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3320:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7203);
            lv_expression_9_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_9_0, 
                      		"SqlExpression");
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
    // $ANTLR end "ruleJoinStatement"


    // $ANTLR start "entryRuleResultColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3344:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3345:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3346:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7239);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7249); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResultColumn"


    // $ANTLR start "ruleResultColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3353:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3356:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3363:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3364:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3364:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3365:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7304);
            lv_expression_1_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResultColumnRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3381:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==64) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3381:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleResultColumn7317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3385:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3386:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3386:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3387:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getResultColumnAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResultColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleResultColumn"


    // $ANTLR start "entryRuleLiteralValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3411:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3412:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3413:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7377);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7387); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3420:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Token lv_literal_5_0=null;
        Token lv_literal_7_0=null;
        Token lv_literal_9_0=null;
        Token lv_literal_11_0=null;
        AntlrDatatypeRuleToken lv_number_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3423:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt59=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 29:
                {
                alt59=1;
                }
                break;
            case RULE_STRING:
                {
                alt59=2;
                }
                break;
            case 87:
                {
                alt59=3;
                }
                break;
            case 88:
                {
                alt59=4;
                }
                break;
            case 89:
                {
                alt59=5;
                }
                break;
            case 90:
                {
                alt59=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3425:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3430:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3431:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3431:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3432:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7443);
                    lv_number_1_0=ruleSignedNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralValueRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_1_0, 
                              		"SignedNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3449:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3449:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3449:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3449:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3450:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3455:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3456:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3456:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3457:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralValueAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"literal",
                              		lv_literal_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3474:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3474:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3474:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3474:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3475:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3480:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3481:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3481:1: (lv_literal_5_0= 'null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3482:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralValue7517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_5_0, grammarAccess.getLiteralValueAccess().getLiteralNullKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_5_0, "null");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3496:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3496:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3496:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3496:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3497:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3502:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3503:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3503:1: (lv_literal_7_0= 'current_time' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3504:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,88,FOLLOW_88_in_ruleLiteralValue7565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_7_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timeKeyword_3_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_7_0, "current_time");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3524:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3525:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3525:1: (lv_literal_9_0= 'current_date' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3526:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,89,FOLLOW_89_in_ruleLiteralValue7613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_9_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_dateKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_9_0, "current_date");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3540:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3540:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3540:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3540:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3541:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3546:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3547:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3547:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3548:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue7661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_11_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timestampKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_11_0, "current_timestamp");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleDDLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3569:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3570:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3571:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7711);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDDLStatement"


    // $ANTLR start "ruleDDLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3578:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
    public final EObject ruleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableStatement_0 = null;

        EObject this_CreateViewStatement_1 = null;

        EObject this_CreateTriggerStatement_2 = null;

        EObject this_CreateIndexStatement_3 = null;

        EObject this_AlterTableRenameStatement_4 = null;

        EObject this_AlterTableAddColumnStatement_5 = null;

        EObject this_DropTableStatement_6 = null;

        EObject this_DropTriggerStatement_7 = null;

        EObject this_DropViewStatement_8 = null;

        EObject this_DropIndexStatement_9 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3581:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3582:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3582:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt60=10;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3583:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7768);
                    this_CreateTableStatement_0=ruleCreateTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateTableStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3593:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7795);
                    this_CreateViewStatement_1=ruleCreateViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateViewStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3603:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7822);
                    this_CreateTriggerStatement_2=ruleCreateTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateTriggerStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement7849);
                    this_CreateIndexStatement_3=ruleCreateIndexStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateIndexStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3623:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7876);
                    this_AlterTableRenameStatement_4=ruleAlterTableRenameStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableRenameStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3633:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7903);
                    this_AlterTableAddColumnStatement_5=ruleAlterTableAddColumnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableAddColumnStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3643:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7930);
                    this_DropTableStatement_6=ruleDropTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTableStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3653:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7957);
                    this_DropTriggerStatement_7=ruleDropTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTriggerStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3663:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7984);
                    this_DropViewStatement_8=ruleDropViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropViewStatement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3673:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8011);
                    this_DropIndexStatement_9=ruleDropIndexStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropIndexStatement_9; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleDDLStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3689:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3690:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3691:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8046);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8056); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3698:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_temporary_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_columnDefs_6_0 = null;

        EObject lv_columnDefs_8_0 = null;

        EObject lv_constraints_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3701:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3702:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3702:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3702:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3702:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3703:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateTableStatement8102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3712:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==92) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3713:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3713:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3714:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateTableStatement8120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_2_0, grammarAccess.getCreateTableStatementAccess().getTemporaryTempKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,93,FOLLOW_93_in_ruleCreateTableStatement8146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3731:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3732:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3732:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3733:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCreateTableStatementAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCreateTableStatement8180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3753:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3754:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3754:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3755:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8201);
            lv_columnDefs_6_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columnDefs",
                      		lv_columnDefs_6_0, 
                      		"ColumnDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3771:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==15) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==RULE_ID) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3771:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3775:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3776:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3776:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3777:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8235);
            	    lv_columnDefs_8_0=ruleColumnDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columnDefs",
            	              		lv_columnDefs_8_0, 
            	              		"ColumnDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3793:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==15) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3793:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8250); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3797:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3798:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3798:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3799:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8271);
            	    lv_constraints_10_0=ruleTableConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_10_0, 
            	              		"TableConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCreateTableStatement8285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_9());
                  
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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleCreateViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3827:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3828:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3829:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8321);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement8331); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateViewStatement"


    // $ANTLR start "ruleCreateViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3836:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_temporary_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_selectStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3839:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3840:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3840:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3840:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3840:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3841:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateViewStatement8377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3850:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==92) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3851:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3851:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3852:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateViewStatement8395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_2_0, grammarAccess.getCreateViewStatementAccess().getTemporaryTempKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_94_in_ruleCreateViewStatement8421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3869:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3870:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3870:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3871:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement8438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCreateViewStatementAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleCreateViewStatement8455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3891:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3892:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3892:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3893:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8476);
            lv_selectStatement_6_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_6_0, 
                      		"SelectStatement");
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
    // $ANTLR end "ruleCreateViewStatement"


    // $ANTLR start "entryRuleCreateTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3917:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3918:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3919:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8512);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateTriggerStatement"


    // $ANTLR start "ruleCreateTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3926:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
    public final EObject ruleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_temporary_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_when_4_1=null;
        Token lv_when_4_2=null;
        Token lv_when_4_3=null;
        Token lv_eventType_5_0=null;
        Token lv_eventType_6_0=null;
        Token lv_eventType_7_0=null;
        Token otherlv_8=null;
        Token lv_updateColumnNames_9_0=null;
        Token otherlv_10=null;
        Token lv_updateColumnNames_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_forEachRow_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_whenExpression_16_0 = null;

        EObject lv_statements_18_0 = null;

        EObject lv_statements_20_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3929:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3930:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3930:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3930:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleCreateTriggerStatement8559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3934:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==92) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3935:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3935:1: (lv_temporary_1_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3936:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateTriggerStatement8577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_1_0, grammarAccess.getCreateTriggerStatementAccess().getTemporaryTempKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3953:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3954:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3954:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3955:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateTriggerStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3971:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=96 && LA67_0<=98)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3972:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3972:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3973:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3973:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case 96:
                        {
                        alt66=1;
                        }
                        break;
                    case 97:
                        {
                        alt66=2;
                        }
                        break;
                    case 98:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3974:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement8645); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_1, grammarAccess.getCreateTriggerStatementAccess().getWhenBeforeKeyword_4_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3986:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement8674); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_2, grammarAccess.getCreateTriggerStatementAccess().getWhenAfterKeyword_4_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3998:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8703); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_3, grammarAccess.getCreateTriggerStatementAccess().getWhenInsteadOfKeyword_4_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4013:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt70=1;
                }
                break;
            case 100:
                {
                alt70=2;
                }
                break;
            case 101:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4013:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4013:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4014:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4014:1: (lv_eventType_5_0= 'delete' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4015:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_5_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeDeleteKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_5_0, "delete");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4029:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4029:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4030:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4030:1: (lv_eventType_6_0= 'insert' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4031:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_6_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeInsertKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_6_0, "insert");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4045:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4045:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4045:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4045:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4046:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4046:1: (lv_eventType_7_0= 'update' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4047:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_7_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeUpdateKeyword_5_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_7_0, "update");
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4060:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==102) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4060:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement8840); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4064:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4065:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4065:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4066:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8857); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_updateColumnNames_9_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_5_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		addWithLastConsumed(
                                     			current, 
                                     			"updateColumnNames",
                                      		lv_updateColumnNames_9_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4082:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==15) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4082:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCreateTriggerStatement8875); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4086:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4087:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4087:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4088:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8892); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      			newLeafNode(lv_updateColumnNames_11_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_5_2_1_2_1_0()); 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	      	        }
                            	             		addWithLastConsumed(
                            	             			current, 
                            	             			"updateColumnNames",
                            	              		lv_updateColumnNames_11_0, 
                            	              		"ID");
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop68;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,86,FOLLOW_86_in_ruleCreateTriggerStatement8915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4108:1: ( (otherlv_13= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4109:1: (otherlv_13= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4109:1: (otherlv_13= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4110:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4121:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==103) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4122:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4122:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4123:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement8953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_forEachRow_14_0, grammarAccess.getCreateTriggerStatementAccess().getForEachRowForEachRowKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "forEachRow", lv_forEachRow_14_0, "for each row");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4136:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==66) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4136:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,66,FOLLOW_66_in_ruleCreateTriggerStatement8980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4140:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4141:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4141:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4142:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9001);
                    lv_whenExpression_16_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whenExpression",
                              		lv_whenExpression_16_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4162:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==71||(LA74_0>=99 && LA74_0<=101)||LA74_0==119) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4162:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4162:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4163:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4163:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4164:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9037);
                    lv_statements_18_0=ruleDMLStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_18_0, 
                              		"DMLStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleCreateTriggerStatement9049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4184:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==71||(LA73_0>=99 && LA73_0<=101)||LA73_0==119) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4184:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4184:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4185:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4185:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4186:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9071);
                    	    lv_statements_20_0=ruleDMLStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_20_0, 
                    	              		"DMLStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleCreateTriggerStatement9083); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,62,FOLLOW_62_in_ruleCreateTriggerStatement9099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getCreateTriggerStatementAccess().getEndKeyword_12());
                  
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
    // $ANTLR end "ruleCreateTriggerStatement"


    // $ANTLR start "entryRuleAlterTableRenameStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4218:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4219:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4220:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9135);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9145); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlterTableRenameStatement"


    // $ANTLR start "ruleAlterTableRenameStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4227:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4230:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4232:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,105,FOLLOW_105_in_ruleAlterTableRenameStatement9191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,93,FOLLOW_93_in_ruleAlterTableRenameStatement9203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4245:1: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4246:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4246:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4247:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,106,FOLLOW_106_in_ruleAlterTableRenameStatement9235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4262:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4263:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4263:1: (lv_name_5_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4264:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getAlterTableRenameStatementAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleAlterTableRenameStatement"


    // $ANTLR start "entryRuleAlterTableAddColumnStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4288:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4289:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4290:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9293);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlterTableAddColumnStatement"


    // $ANTLR start "ruleAlterTableAddColumnStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4297:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4300:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4301:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4301:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4301:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleAlterTableAddColumnStatement9340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleAlterTableAddColumnStatement9352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4309:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4310:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4310:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4311:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,107,FOLLOW_107_in_ruleAlterTableAddColumnStatement9384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4327:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4327:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4328:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9405);
            lv_columnDef_4_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"columnDef",
                      		lv_columnDef_4_0, 
                      		"ColumnDef");
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
    // $ANTLR end "ruleAlterTableAddColumnStatement"


    // $ANTLR start "entryRuleDropTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4352:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4353:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4354:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9441);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement9451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropTableStatement"


    // $ANTLR start "ruleDropTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4361:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4364:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropTableStatement9488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleDropTableStatement9500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4373:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==109) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4374:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4374:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4375:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropTableStatement9518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTableStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropTableStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4388:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4389:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4389:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4390:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropTableStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
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
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleDropTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4409:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4410:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4411:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9588);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9598); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropTriggerStatement"


    // $ANTLR start "ruleDropTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4418:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4421:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropTriggerStatement9635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleDropTriggerStatement9647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4430:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==109) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4431:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4431:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4432:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropTriggerStatement9665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTriggerStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4445:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4446:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4446:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4447:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropTriggerStatementAccess().getTriggerCreateTriggerStatementCrossReference_3_0()); 
              	
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
    // $ANTLR end "ruleDropTriggerStatement"


    // $ANTLR start "entryRuleDropViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4466:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4467:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4468:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9735);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9745); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropViewStatement"


    // $ANTLR start "ruleDropViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4475:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4478:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4479:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4479:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4479:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropViewStatement9782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleDropViewStatement9794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4487:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==109) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4488:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4488:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4489:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropViewStatement9812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropViewStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropViewStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4502:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4503:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4503:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4504:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement9846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropViewStatementAccess().getViewCreateViewStatementCrossReference_3_0()); 
              	
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
    // $ANTLR end "ruleDropViewStatement"


    // $ANTLR start "entryRuleCreateIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4523:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4524:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4525:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement9882);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement9892); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateIndexStatement"


    // $ANTLR start "ruleCreateIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4532:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
    public final EObject ruleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unique_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columns_7_0 = null;

        EObject lv_columns_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4535:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4536:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4536:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4536:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleCreateIndexStatement9929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4540:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==110) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4541:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4541:1: (lv_unique_1_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4542:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,110,FOLLOW_110_in_ruleCreateIndexStatement9947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unique_1_0, grammarAccess.getCreateIndexStatementAccess().getUniqueUniqueKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
                      	        }
                             		setWithLastConsumed(current, "unique", true, "unique");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleCreateIndexStatement9973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4559:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4560:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4560:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4561:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement9990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateIndexStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,86,FOLLOW_86_in_ruleCreateIndexStatement10007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4581:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4582:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4582:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4583:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleCreateIndexStatement10039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4599:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4599:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4600:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10060);
            lv_columns_7_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateIndexStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_7_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4616:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==15) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4616:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleCreateIndexStatement10073); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4620:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4621:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4621:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4622:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10094);
            	    lv_columns_9_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateIndexStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_9_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleCreateIndexStatement10108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCreateIndexStatementAccess().getRightParenthesisKeyword_9());
                  
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
    // $ANTLR end "ruleCreateIndexStatement"


    // $ANTLR start "entryRuleDropIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4650:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4651:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4652:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10144);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10154); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropIndexStatement"


    // $ANTLR start "ruleDropIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4659:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4662:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4663:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4663:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4663:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropIndexStatement10191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4671:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==109) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4672:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4672:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4673:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropIndexStatement10221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropIndexStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4686:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4687:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4687:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4688:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropIndexStatementAccess().getIndexCreateIndexStatementCrossReference_3_0()); 
              	
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
    // $ANTLR end "ruleDropIndexStatement"


    // $ANTLR start "entryRuleColumnDef"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4707:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4708:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4709:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10291);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10301); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColumnDef"


    // $ANTLR start "ruleColumnDef"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4716:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4719:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4720:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4720:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4720:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4720:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4721:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4726:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4727:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4727:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4728:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef10352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getColumnDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4744:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4745:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4745:1: (lv_type_2_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4746:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef10378);
            lv_type_2_0=ruleColumnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ColumnType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4762:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==53||LA81_0==110||LA81_0==112||(LA81_0>=114 && LA81_0<=115)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4763:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4763:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4764:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef10399);
            	    lv_constraints_3_0=ruleColumnConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_3_0, 
            	              		"ColumnConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
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
    // $ANTLR end "ruleColumnDef"


    // $ANTLR start "entryRuleColumnConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4788:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4789:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4790:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10436);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint10446); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColumnConstraint"


    // $ANTLR start "ruleColumnConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4797:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asc_2_0=null;
        Token lv_desc_3_0=null;
        Token lv_autoincrement_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_conflictClause_7_0 = null;

        EObject lv_conflictClause_10_0 = null;

        EObject lv_defaultValue_13_0 = null;

        EObject lv_expression_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4800:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt86=1;
                }
                break;
            case 53:
                {
                alt86=2;
                }
                break;
            case 110:
                {
                alt86=3;
                }
                break;
            case 114:
                {
                alt86=4;
                }
                break;
            case 115:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4802:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleColumnConstraint10493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4811:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt82=3;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==78) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==79) ) {
                        alt82=2;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4811:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4811:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4812:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4812:1: (lv_asc_2_0= 'asc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4813:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,78,FOLLOW_78_in_ruleColumnConstraint10512); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_asc_2_0, grammarAccess.getColumnConstraintAccess().getAscAscKeyword_0_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "asc", true, "asc");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4827:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4827:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4828:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4828:1: (lv_desc_3_0= 'desc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4829:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,79,FOLLOW_79_in_ruleColumnConstraint10549); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_desc_3_0, grammarAccess.getColumnConstraintAccess().getDescDescKeyword_0_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "desc", true, "desc");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4842:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==113) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4843:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4843:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4844:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,113,FOLLOW_113_in_ruleColumnConstraint10582); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_autoincrement_4_0, grammarAccess.getColumnConstraintAccess().getAutoincrementAutoincrementKeyword_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "autoincrement", true, "autoincrement");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4859:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleColumnConstraint10625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4868:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==86) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4869:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4869:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4870:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10646);
                            lv_conflictClause_7_0=ruleConflictClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictClause",
                                      		lv_conflictClause_7_0, 
                                      		"ConflictClause");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4887:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4887:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4887:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4887:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4888:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,110,FOLLOW_110_in_ruleColumnConstraint10676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4897:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==86) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4898:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4898:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4899:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10697);
                            lv_conflictClause_10_0=ruleConflictClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictClause",
                                      		lv_conflictClause_10_0, 
                                      		"ConflictClause");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4916:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4916:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4916:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4916:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4917:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,114,FOLLOW_114_in_ruleColumnConstraint10727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4926:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4927:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4927:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4928:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10748);
                    lv_defaultValue_13_0=ruleDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_13_0, 
                              		"DefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4945:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4945:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4945:7: () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4945:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4946:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getCheckConstraintAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint10777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getColumnConstraintAccess().getCheckKeyword_4_1());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleColumnConstraint10789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getColumnConstraintAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4959:1: ( (lv_expression_17_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4960:1: (lv_expression_17_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4960:1: (lv_expression_17_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4961:3: lv_expression_17_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleColumnConstraint10810);
                    lv_expression_17_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_17_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleColumnConstraint10822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getColumnConstraintAccess().getRightParenthesisKeyword_4_4());
                          
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
    // $ANTLR end "ruleColumnConstraint"


    // $ANTLR start "entryRuleTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4989:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4990:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4991:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint10859);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint10869); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTableConstraint"


    // $ANTLR start "ruleTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4998:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5001:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5002:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5002:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 110:
                        {
                        alt87=1;
                        }
                        break;
                    case 112:
                        {
                        alt87=2;
                        }
                        break;
                    case 115:
                        {
                        alt87=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
                }
                break;
            case 110:
                {
                alt87=1;
                }
                break;
            case 112:
                {
                alt87=2;
                }
                break;
            case 115:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5003:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint10916);
                    this_UniqueTableConstraint_0=ruleUniqueTableConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UniqueTableConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5013:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint10943);
                    this_PrimaryConstraint_1=rulePrimaryConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5023:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint10970);
                    this_CheckTableConstraint_2=ruleCheckTableConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CheckTableConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleTableConstraint"


    // $ANTLR start "entryRuleUniqueTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5039:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5041:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11005);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11015); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUniqueTableConstraint"


    // $ANTLR start "ruleUniqueTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5048:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
    public final EObject ruleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_conflictClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5051:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5052:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5052:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5052:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5052:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==116) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5052:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleUniqueTableConstraint11053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5056:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5057:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5057:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5058:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getUniqueTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUniqueTableConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,110,FOLLOW_110_in_ruleUniqueTableConstraint11089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUniqueTableConstraint11101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5082:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5083:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5083:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5084:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11122);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_4_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5100:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==15) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5100:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUniqueTableConstraint11135); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5104:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5105:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5105:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5106:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11156);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleUniqueTableConstraint11170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5126:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5127:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5127:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5128:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11191);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"conflictClause",
                      		lv_conflictClause_8_0, 
                      		"ConflictClause");
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
    // $ANTLR end "ruleUniqueTableConstraint"


    // $ANTLR start "entryRulePrimaryConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5152:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5153:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5154:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11227);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11237); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryConstraint"


    // $ANTLR start "rulePrimaryConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5161:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
    public final EObject rulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_conflictClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5164:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==116) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_rulePrimaryConstraint11275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5169:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5170:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5170:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5171:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getPrimaryConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,112,FOLLOW_112_in_rulePrimaryConstraint11311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePrimaryConstraint11323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5195:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5196:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5196:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5197:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11344);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_4_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5213:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==15) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5213:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePrimaryConstraint11357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5217:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5218:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5218:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5219:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11378);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePrimaryConstraint11392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5239:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5240:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5240:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5241:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11413);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"conflictClause",
                      		lv_conflictClause_8_0, 
                      		"ConflictClause");
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
    // $ANTLR end "rulePrimaryConstraint"


    // $ANTLR start "entryRuleCheckTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5265:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5266:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5267:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11449);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint11459); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCheckTableConstraint"


    // $ANTLR start "ruleCheckTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5274:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5277:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==116) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleCheckTableConstraint11497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5282:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5283:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5283:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5284:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint11514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getCheckTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCheckTableConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_ruleCheckTableConstraint11533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCheckTableConstraint11545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5308:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5309:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5309:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5310:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11566);
            lv_expression_4_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCheckTableConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCheckTableConstraint11578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCheckTableConstraintAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleCheckTableConstraint"


    // $ANTLR start "entryRuleIndexedColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5338:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5339:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5340:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11614);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn11624); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndexedColumn"


    // $ANTLR start "ruleIndexedColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5347:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5350:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5351:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5351:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5351:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5351:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5352:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5352:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5353:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5364:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==117) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5364:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_117_in_ruleIndexedColumn11682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5368:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5369:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5369:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5370:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_collationName_2_0, grammarAccess.getIndexedColumnAccess().getCollationNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"collationName",
                              		lv_collationName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5386:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==78) ) {
                alt94=1;
            }
            else if ( (LA94_0==79) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5386:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5386:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:1: (lv_asc_3_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5388:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,78,FOLLOW_78_in_ruleIndexedColumn11725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_3_0, grammarAccess.getIndexedColumnAccess().getAscAscKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(current, "asc", true, "asc");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5402:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5402:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5403:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5403:1: (lv_desc_4_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5404:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,79,FOLLOW_79_in_ruleIndexedColumn11762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_4_0, grammarAccess.getIndexedColumnAccess().getDescDescKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(current, "desc", true, "desc");
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleIndexedColumn"


    // $ANTLR start "entryRuleDefaultValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5425:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5426:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5427:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue11813);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue11823); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultValue"


    // $ANTLR start "ruleDefaultValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5434:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5437:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5438:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5438:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=RULE_NUMBER && LA95_0<=RULE_STRING)||LA95_0==29||(LA95_0>=87 && LA95_0<=90)) ) {
                alt95=1;
            }
            else if ( (LA95_0==14) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5438:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5438:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5438:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5438:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5439:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5444:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5445:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5445:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5446:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue11879);
                    lv_literal_1_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_1_0, 
                              		"LiteralValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5464:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValue11908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5473:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5474:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5474:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5475:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue11929);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDefaultValue11941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefaultValueAccess().getRightParenthesisKeyword_1_3());
                          
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
    // $ANTLR end "ruleDefaultValue"


    // $ANTLR start "entryRuleConflictClause"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5503:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5504:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5505:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause11978);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause11988); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConflictClause"


    // $ANTLR start "ruleConflictClause"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5512:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5515:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5516:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5516:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5516:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_86_in_ruleConflictClause12025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,118,FOLLOW_118_in_ruleConflictClause12037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5524:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5525:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5525:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5526:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12058);
            lv_resolution_2_0=ruleConflictResolution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConflictClauseRule());
              	        }
                     		set(
                     			current, 
                     			"resolution",
                      		lv_resolution_2_0, 
                      		"ConflictResolution");
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
    // $ANTLR end "ruleConflictClause"


    // $ANTLR start "entryRuleDMLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5550:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5551:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5552:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12094);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDMLStatement"


    // $ANTLR start "ruleDMLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5559:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5562:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5563:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5563:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt96=1;
                }
                break;
            case 100:
            case 119:
                {
                alt96=2;
                }
                break;
            case 101:
                {
                alt96=3;
                }
                break;
            case 99:
                {
                alt96=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5564:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12151);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelectStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5574:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12178);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InsertStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5584:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12205);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UpdateStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5594:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12232);
                    this_DeleteStatement_3=ruleDeleteStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteStatement_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleDMLStatement"


    // $ANTLR start "entryRuleDeleteStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5610:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5611:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5612:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12267);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12277); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5619:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5622:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5623:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5623:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5623:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleDeleteStatement12314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleDeleteStatement12326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5631:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5632:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5632:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5633:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement12346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5644:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==75) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5644:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleDeleteStatement12359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5648:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5649:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5649:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5650:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12380);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleInsertStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5674:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5675:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5676:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12418);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement12428); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5683:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_expressions_13_0 = null;

        EObject lv_expressions_15_0 = null;

        EObject lv_selectStatement_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5686:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==100) ) {
                alt99=1;
            }
            else if ( (LA99_0==119) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleInsertStatement12467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5691:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==51) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5691:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleInsertStatement12480); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5695:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5696:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5696:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5697:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement12501);
                            lv_conflictResolution_2_0=ruleConflictResolution();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictResolution",
                                      		lv_conflictResolution_2_0, 
                                      		"ConflictResolution");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5714:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,119,FOLLOW_119_in_ruleInsertStatement12522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,120,FOLLOW_120_in_ruleInsertStatement12535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5722:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5723:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5723:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5724:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5735:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==14) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5735:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement12568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5739:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5740:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5740:1: (otherlv_7= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5741:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5752:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==15) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5752:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement12601); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5756:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5757:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5757:1: (otherlv_9= RULE_ID )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5758:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12621); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement12635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==71||LA104_0==121) ) {
                alt104=1;
            }
            else if ( (LA104_0==114) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==121) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==71) ) {
                        alt103=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement12652); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement12664); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5781:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5783:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12685);
                            lv_expressions_13_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"expressions",
                                      		lv_expressions_13_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5799:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop102:
                            do {
                                int alt102=2;
                                int LA102_0 = input.LA(1);

                                if ( (LA102_0==15) ) {
                                    alt102=1;
                                }


                                switch (alt102) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5799:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement12698); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5803:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5804:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5804:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5805:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12719);
                            	    lv_expressions_15_0=ruleSqlExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"expressions",
                            	              		lv_expressions_15_0, 
                            	              		"SqlExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop102;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement12733); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5826:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5826:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5827:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5827:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5828:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement12761);
                            lv_selectStatement_17_0=ruleSelectStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"selectStatement",
                                      		lv_selectStatement_17_0, 
                                      		"SelectStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5845:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5845:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5845:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement12781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement12793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_1_1());
                          
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5861:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5862:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5863:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement12831);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement12841); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5870:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_updateColumnExpressions_5_0 = null;

        EObject lv_updateColumnExpressions_7_0 = null;

        EObject lv_whereExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5873:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5874:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5874:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5874:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleUpdateStatement12878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5878:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==51) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5878:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleUpdateStatement12891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5882:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5883:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5883:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5884:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement12912);
                    lv_conflictResolution_2_0=ruleConflictResolution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"conflictResolution",
                              		lv_conflictResolution_2_0, 
                              		"ConflictResolution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5900:4: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5901:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5901:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5902:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement12934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,122,FOLLOW_122_in_ruleUpdateStatement12946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5917:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5918:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5918:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5919:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement12967);
            lv_updateColumnExpressions_5_0=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
              	        }
                     		add(
                     			current, 
                     			"updateColumnExpressions",
                      		lv_updateColumnExpressions_5_0, 
                      		"UpdateColumnExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5935:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==15) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5935:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleUpdateStatement12980); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5939:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5940:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5940:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5941:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13001);
            	    lv_updateColumnExpressions_7_0=ruleUpdateColumnExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"updateColumnExpressions",
            	              		lv_updateColumnExpressions_7_0, 
            	              		"UpdateColumnExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==75) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_75_in_ruleUpdateStatement13016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5961:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5962:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5962:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5963:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13037);
                    lv_whereExpression_9_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whereExpression",
                              		lv_whereExpression_9_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleUpdateColumnExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5987:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5988:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5989:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13075);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13085); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateColumnExpression"


    // $ANTLR start "ruleUpdateColumnExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5996:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5999:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6001:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6001:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6002:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleUpdateColumnExpression13142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6017:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6018:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6018:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6019:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13163);
            lv_expression_2_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"SqlExpression");
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
    // $ANTLR end "ruleUpdateColumnExpression"


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6043:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6044:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6045:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13200);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6052:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6055:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:2: (kw= '-' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==29) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6057:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleSignedNumber13250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NUMBER_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NUMBER_1, grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6077:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6078:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6079:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13313);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13324); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6089:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6090:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6090:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6090:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6097:1: (kw= '.' this_ID_2= RULE_ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==57) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6098:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,57,FOLLOW_57_in_ruleQualifiedName13383); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13398); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCompoundOperator"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6118:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6120:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6121:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6121:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt110=1;
                }
                break;
            case 124:
                {
                alt110=2;
                }
                break;
            case 125:
                {
                alt110=3;
                }
                break;
            case 126:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6121:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6121:2: (enumLiteral_0= 'union all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6121:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_123_in_ruleCompoundOperator13459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6127:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6127:6: (enumLiteral_1= 'union' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6127:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_124_in_ruleCompoundOperator13476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6133:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6133:6: (enumLiteral_2= 'intersect' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6133:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_125_in_ruleCompoundOperator13493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:6: (enumLiteral_3= 'except' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator13510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleCompoundOperator"


    // $ANTLR start "ruleSqliteDataType"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6149:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
    public final Enumerator ruleSqliteDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6151:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6152:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6152:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt111=6;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt111=1;
                }
                break;
            case 128:
                {
                alt111=2;
                }
                break;
            case 129:
                {
                alt111=3;
                }
                break;
            case 130:
                {
                alt111=4;
                }
                break;
            case 131:
                {
                alt111=5;
                }
                break;
            case 132:
                {
                alt111=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6152:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6152:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6152:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType13555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleSqliteDataType13572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6164:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6164:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6164:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleSqliteDataType13589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6170:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6170:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6170:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType13606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6176:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6176:6: (enumLiteral_4= 'none' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6176:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType13623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6182:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6182:6: (enumLiteral_5= 'numeric' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6182:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType13640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleSqliteDataType"


    // $ANTLR start "ruleColumnType"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6192:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6194:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6195:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6195:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt112=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt112=1;
                }
                break;
            case 128:
                {
                alt112=2;
                }
                break;
            case 129:
                {
                alt112=3;
                }
                break;
            case 130:
                {
                alt112=4;
                }
                break;
            case 133:
                {
                alt112=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6195:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6195:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6195:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleColumnType13685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6201:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6201:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6201:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleColumnType13702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6207:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6207:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6207:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleColumnType13719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleColumnType13736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6219:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6219:6: (enumLiteral_4= 'boolean' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6219:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,133,FOLLOW_133_in_ruleColumnType13753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "ruleConflictResolution"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6229:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6231:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt113=5;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt113=1;
                }
                break;
            case 135:
                {
                alt113=2;
                }
                break;
            case 136:
                {
                alt113=3;
                }
                break;
            case 137:
                {
                alt113=4;
                }
                break;
            case 119:
                {
                alt113=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:2: (enumLiteral_0= 'rollback' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_134_in_ruleConflictResolution13798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6238:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6238:6: (enumLiteral_1= 'abort' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6238:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_135_in_ruleConflictResolution13815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6244:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6244:6: (enumLiteral_2= 'fail' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6244:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_136_in_ruleConflictResolution13832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6250:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6250:6: (enumLiteral_3= 'ignore' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6250:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution13849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6256:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6256:6: (enumLiteral_4= 'replace' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6256:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_119_in_ruleConflictResolution13866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleConflictResolution"

    // $ANTLR start synpred1_InternalMickeyLang
    public final void synpred1_InternalMickeyLang_fragment() throws RecognitionException {   
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1684:5: ( ( RULE_ID ) )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1685:1: ( RULE_ID )
        {
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1685:1: ( RULE_ID )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1686:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang3787); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMickeyLang

    // Delegated rules

    public final boolean synpred1_InternalMickeyLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMickeyLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA35 dfa35 = new DFA35(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA35_eotS =
        "\15\uffff";
    static final String DFA35_eofS =
        "\3\uffff\1\12\11\uffff";
    static final String DFA35_minS =
        "\1\4\2\uffff\1\15\1\uffff\1\4\7\uffff";
    static final String DFA35_maxS =
        "\1\132\2\uffff\1\176\1\uffff\1\132\7\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\3\1\10\1\5";
    static final String DFA35_specialS =
        "\15\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\3\2\4\7\uffff\1\5\16\uffff\1\4\31\uffff\1\1\1\2\1\uffff\2\6\1\7\2\uffff\1\10\1\uffff\1\11\25\uffff\4\4",
            "",
            "",
            "\1\12\1\13\2\12\1\uffff\1\12\1\uffff\2\12\2\uffff\37\12\2\uffff\1\12\3\uffff\2\12\1\uffff\1\12\1\uffff\5\12\3\uffff\10\12\1\uffff\3\12\5\uffff\1\12\14\uffff\2\12\2\uffff\1\12\16\uffff\4\12",
            "",
            "\3\14\7\uffff\1\14\16\uffff\1\14\31\uffff\2\14\1\uffff\3\14\2\uffff\1\14\1\uffff\1\14\5\uffff\1\6\17\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1630:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA27_eotS =
        "\127\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\3\1\44\1\uffff\1\5\122\uffff";
    static final String DFA27_minS =
        "\1\4\1\15\1\4\1\uffff\1\4\104\uffff\1\4\14\uffff\1\0";
    static final String DFA27_maxS =
        "\1\4\2\176\1\uffff\1\176\104\uffff\1\132\14\uffff\1\0";
    static final String DFA27_acceptS =
        "\3\uffff\1\3\1\uffff\1\2\103\1\1\uffff\14\1\1\uffff";
    static final String DFA27_specialS =
        "\2\uffff\1\0\1\uffff\1\2\121\uffff\1\1}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\2\uffff\37\3\2\uffff\1\2\3\uffff\2\3\1\uffff\1\3\1\uffff\5\3\3\uffff\10\3\1\uffff\3\3\5\uffff\1\3\14\uffff\2\3\2\uffff\1\3\16\uffff\4\3",
            "\1\5\10\uffff\1\55\1\uffff\1\50\1\45\1\uffff\1\63\1\uffff\1\56\1\41\2\uffff\1\4\1\62\1\43\1\42\1\37\1\40\1\33\1\34\1\35\1\36\1\27\1\30\1\31\1\32\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\11\1\6\1\7\1\10\6\uffff\1\53\1\47\1\uffff\1\51\1\uffff\1\46\1\52\1\72\1\73\1\54\3\uffff\1\104\1\76\1\64\1\65\1\74\1\75\1\77\1\100\1\uffff\1\101\1\102\1\103\5\uffff\1\57\14\uffff\1\105\1\60\2\uffff\1\61\16\uffff\1\66\1\67\1\70\1\71",
            "",
            "\1\110\1\112\1\113\6\uffff\1\5\1\120\2\5\1\uffff\1\5\1\uffff\2\5\2\uffff\5\5\1\111\31\5\1\106\1\107\1\uffff\1\121\1\122\1\123\2\5\1\124\1\5\1\125\5\5\3\uffff\10\5\1\uffff\3\5\1\uffff\1\114\1\115\1\116\1\117\1\5\14\uffff\2\5\2\uffff\1\5\16\uffff\4\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\5\1\126\1\5\7\uffff\1\5\16\uffff\1\5\31\uffff\2\5\1\uffff\3\5\2\uffff\1\5\1\uffff\1\5\25\uffff\4\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1684:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_2==24) ) {s = 4;}

                        else if ( (LA27_2==RULE_ID) ) {s = 5;}

                        else if ( (LA27_2==52) && (synpred1_InternalMickeyLang())) {s = 6;}

                        else if ( (LA27_2==53) && (synpred1_InternalMickeyLang())) {s = 7;}

                        else if ( (LA27_2==54) && (synpred1_InternalMickeyLang())) {s = 8;}

                        else if ( (LA27_2==51) && (synpred1_InternalMickeyLang())) {s = 9;}

                        else if ( (LA27_2==50) && (synpred1_InternalMickeyLang())) {s = 10;}

                        else if ( (LA27_2==38) && (synpred1_InternalMickeyLang())) {s = 11;}

                        else if ( (LA27_2==39) && (synpred1_InternalMickeyLang())) {s = 12;}

                        else if ( (LA27_2==40) && (synpred1_InternalMickeyLang())) {s = 13;}

                        else if ( (LA27_2==41) && (synpred1_InternalMickeyLang())) {s = 14;}

                        else if ( (LA27_2==42) && (synpred1_InternalMickeyLang())) {s = 15;}

                        else if ( (LA27_2==43) && (synpred1_InternalMickeyLang())) {s = 16;}

                        else if ( (LA27_2==44) && (synpred1_InternalMickeyLang())) {s = 17;}

                        else if ( (LA27_2==45) && (synpred1_InternalMickeyLang())) {s = 18;}

                        else if ( (LA27_2==46) && (synpred1_InternalMickeyLang())) {s = 19;}

                        else if ( (LA27_2==47) && (synpred1_InternalMickeyLang())) {s = 20;}

                        else if ( (LA27_2==48) && (synpred1_InternalMickeyLang())) {s = 21;}

                        else if ( (LA27_2==49) && (synpred1_InternalMickeyLang())) {s = 22;}

                        else if ( (LA27_2==34) && (synpred1_InternalMickeyLang())) {s = 23;}

                        else if ( (LA27_2==35) && (synpred1_InternalMickeyLang())) {s = 24;}

                        else if ( (LA27_2==36) && (synpred1_InternalMickeyLang())) {s = 25;}

                        else if ( (LA27_2==37) && (synpred1_InternalMickeyLang())) {s = 26;}

                        else if ( (LA27_2==30) && (synpred1_InternalMickeyLang())) {s = 27;}

                        else if ( (LA27_2==31) && (synpred1_InternalMickeyLang())) {s = 28;}

                        else if ( (LA27_2==32) && (synpred1_InternalMickeyLang())) {s = 29;}

                        else if ( (LA27_2==33) && (synpred1_InternalMickeyLang())) {s = 30;}

                        else if ( (LA27_2==28) && (synpred1_InternalMickeyLang())) {s = 31;}

                        else if ( (LA27_2==29) && (synpred1_InternalMickeyLang())) {s = 32;}

                        else if ( (LA27_2==21) && (synpred1_InternalMickeyLang())) {s = 33;}

                        else if ( (LA27_2==27) && (synpred1_InternalMickeyLang())) {s = 34;}

                        else if ( (LA27_2==26) && (synpred1_InternalMickeyLang())) {s = 35;}

                        else if ( (LA27_2==EOF) && (synpred1_InternalMickeyLang())) {s = 36;}

                        else if ( (LA27_2==16) && (synpred1_InternalMickeyLang())) {s = 37;}

                        else if ( (LA27_2==66) && (synpred1_InternalMickeyLang())) {s = 38;}

                        else if ( (LA27_2==62) && (synpred1_InternalMickeyLang())) {s = 39;}

                        else if ( (LA27_2==15) && (synpred1_InternalMickeyLang())) {s = 40;}

                        else if ( (LA27_2==64) && (synpred1_InternalMickeyLang())) {s = 41;}

                        else if ( (LA27_2==67) && (synpred1_InternalMickeyLang())) {s = 42;}

                        else if ( (LA27_2==61) && (synpred1_InternalMickeyLang())) {s = 43;}

                        else if ( (LA27_2==70) && (synpred1_InternalMickeyLang())) {s = 44;}

                        else if ( (LA27_2==13) && (synpred1_InternalMickeyLang())) {s = 45;}

                        else if ( (LA27_2==20) && (synpred1_InternalMickeyLang())) {s = 46;}

                        else if ( (LA27_2==91) && (synpred1_InternalMickeyLang())) {s = 47;}

                        else if ( (LA27_2==105) && (synpred1_InternalMickeyLang())) {s = 48;}

                        else if ( (LA27_2==108) && (synpred1_InternalMickeyLang())) {s = 49;}

                        else if ( (LA27_2==25) && (synpred1_InternalMickeyLang())) {s = 50;}

                        else if ( (LA27_2==18) && (synpred1_InternalMickeyLang())) {s = 51;}

                        else if ( (LA27_2==76) && (synpred1_InternalMickeyLang())) {s = 52;}

                        else if ( (LA27_2==77) && (synpred1_InternalMickeyLang())) {s = 53;}

                        else if ( (LA27_2==123) && (synpred1_InternalMickeyLang())) {s = 54;}

                        else if ( (LA27_2==124) && (synpred1_InternalMickeyLang())) {s = 55;}

                        else if ( (LA27_2==125) && (synpred1_InternalMickeyLang())) {s = 56;}

                        else if ( (LA27_2==126) && (synpred1_InternalMickeyLang())) {s = 57;}

                        else if ( (LA27_2==68) && (synpred1_InternalMickeyLang())) {s = 58;}

                        else if ( (LA27_2==69) && (synpred1_InternalMickeyLang())) {s = 59;}

                        else if ( (LA27_2==78) && (synpred1_InternalMickeyLang())) {s = 60;}

                        else if ( (LA27_2==79) && (synpred1_InternalMickeyLang())) {s = 61;}

                        else if ( (LA27_2==75) && (synpred1_InternalMickeyLang())) {s = 62;}

                        else if ( (LA27_2==80) && (synpred1_InternalMickeyLang())) {s = 63;}

                        else if ( (LA27_2==81) && (synpred1_InternalMickeyLang())) {s = 64;}

                        else if ( (LA27_2==83) && (synpred1_InternalMickeyLang())) {s = 65;}

                        else if ( (LA27_2==84) && (synpred1_InternalMickeyLang())) {s = 66;}

                        else if ( (LA27_2==85) && (synpred1_InternalMickeyLang())) {s = 67;}

                        else if ( (LA27_2==74) && (synpred1_InternalMickeyLang())) {s = 68;}

                        else if ( (LA27_2==104) && (synpred1_InternalMickeyLang())) {s = 69;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_86 = input.LA(1);

                         
                        int index27_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMickeyLang()) ) {s = 85;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_86);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_4==55) && (synpred1_InternalMickeyLang())) {s = 70;}

                        else if ( (LA27_4==56) && (synpred1_InternalMickeyLang())) {s = 71;}

                        else if ( (LA27_4==RULE_ID) && (synpred1_InternalMickeyLang())) {s = 72;}

                        else if ( (LA27_4==29) ) {s = 73;}

                        else if ( (LA27_4==RULE_NUMBER) && (synpred1_InternalMickeyLang())) {s = 74;}

                        else if ( (LA27_4==RULE_STRING) && (synpred1_InternalMickeyLang())) {s = 75;}

                        else if ( (LA27_4==87) && (synpred1_InternalMickeyLang())) {s = 76;}

                        else if ( (LA27_4==88) && (synpred1_InternalMickeyLang())) {s = 77;}

                        else if ( (LA27_4==89) && (synpred1_InternalMickeyLang())) {s = 78;}

                        else if ( (LA27_4==90) && (synpred1_InternalMickeyLang())) {s = 79;}

                        else if ( (LA27_4==14) && (synpred1_InternalMickeyLang())) {s = 80;}

                        else if ( (LA27_4==58) && (synpred1_InternalMickeyLang())) {s = 81;}

                        else if ( (LA27_4==59) && (synpred1_InternalMickeyLang())) {s = 82;}

                        else if ( (LA27_4==60) && (synpred1_InternalMickeyLang())) {s = 83;}

                        else if ( (LA27_4==63) && (synpred1_InternalMickeyLang())) {s = 84;}

                        else if ( (LA27_4==65) && (synpred1_InternalMickeyLang())) {s = 85;}

                        else if ( (LA27_4==EOF||LA27_4==13||(LA27_4>=15 && LA27_4<=16)||LA27_4==18||(LA27_4>=20 && LA27_4<=21)||(LA27_4>=24 && LA27_4<=28)||(LA27_4>=30 && LA27_4<=54)||(LA27_4>=61 && LA27_4<=62)||LA27_4==64||(LA27_4>=66 && LA27_4<=70)||(LA27_4>=74 && LA27_4<=81)||(LA27_4>=83 && LA27_4<=85)||LA27_4==91||(LA27_4>=104 && LA27_4<=105)||LA27_4==108||(LA27_4>=123 && LA27_4<=126)) ) {s = 5;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\21\uffff";
    static final String DFA60_eofS =
        "\21\uffff";
    static final String DFA60_minS =
        "\1\133\1\134\3\135\4\uffff\1\4\4\uffff\1\152\2\uffff";
    static final String DFA60_maxS =
        "\1\154\1\157\1\135\1\157\1\137\4\uffff\1\4\4\uffff\1\153\2\uffff";
    static final String DFA60_acceptS =
        "\5\uffff\1\3\1\1\1\2\1\4\1\uffff\1\7\1\11\1\12\1\10\1\uffff\1\6\1\5";
    static final String DFA60_specialS =
        "\21\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\4\1\6\1\7\1\5\16\uffff\2\10",
            "\1\11",
            "\1\12\1\13\1\15\17\uffff\1\14",
            "\1\6\1\7\1\5",
            "",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "",
            "",
            "\1\20\1\17",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3582:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000002102002L,0x0000120008000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000002102002L,0x0000120008000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_entryRuleMickeyBlock201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyBlock211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMickeyFunction_in_ruleMickeyBlock258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_ruleMickeyBlock285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMickeyBlock312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleMickeyBlock339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMickeyFunction_in_entryRuleMickeyFunction374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyFunction384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMickeyFunction421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMickeyFunction438 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMickeyFunction455 = new BitSet(new long[]{0x0000000000010000L,0x8000000000000000L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleMickeyFunction477 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleMickeyFunction490 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleMickeyFunction511 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleMickeyFunction527 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMickeyFunction539 = new BitSet(new long[]{0x0000000000080000L,0x0080003800000080L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleMickeyFunction561 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMickeyFunction573 = new BitSet(new long[]{0x0000000000080000L,0x0080003800000080L});
    public static final BitSet FOLLOW_19_in_ruleMickeyFunction587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleActionStatement670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleActionStatement713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleContentUri910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUri927 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleContentUri945 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri966 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleContentUriSegment1089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1106 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContentUriSegment1123 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleContentUriSegment1142 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24_in_ruleContentUriSegment1179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContentUriSegment1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMigrationBlock1298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMigrationBlock1315 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationBlock1332 = new BitSet(new long[]{0x0000000000080000L,0x0000120008000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1354 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock1366 = new BitSet(new long[]{0x0000000000080000L,0x0000120008000000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1563 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleExprConcat1590 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1624 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1719 = new BitSet(new long[]{0x0000000009200002L});
    public static final BitSet FOLLOW_24_in_ruleExprMult1748 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_21_in_ruleExprMult1777 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_27_in_ruleExprMult1806 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1843 = new BitSet(new long[]{0x0000000009200002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1938 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleExprAdd1967 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_29_in_ruleExprAdd1996 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2033 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2128 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_30_in_ruleExprBit2157 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_31_in_ruleExprBit2186 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_32_in_ruleExprBit2215 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_33_in_ruleExprBit2244 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2281 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2376 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_34_in_ruleExprRelate2405 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_35_in_ruleExprRelate2434 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_36_in_ruleExprRelate2463 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_37_in_ruleExprRelate2492 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2529 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2624 = new BitSet(new long[]{0x0003FFC000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2653 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2682 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2711 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2740 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2769 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2798 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2827 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2856 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual2885 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual2914 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_48_in_ruleExprEqual2943 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_49_in_ruleExprEqual2972 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3009 = new BitSet(new long[]{0x0003FFC000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3104 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExprAnd3131 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3165 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3260 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExprOr3287 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3321 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3416 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNullExpression3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNullExpression3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNullExpression3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3804 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3844 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3856 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4010 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4031 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression4078 = new BitSet(new long[]{0x0800000000004000L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression4110 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4198 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800006L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4219 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800006L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4241 = new BitSet(new long[]{0xFD80000020004070L,0x0000000007800006L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4255 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4276 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4324 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4341 = new BitSet(new long[]{0x9D80000021004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression4360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4401 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression4414 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4435 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4480 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4492 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4525 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCase4691 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCase4724 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement4837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleSelectStatement4850 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSelectStatement4886 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement4907 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSelectStatement4921 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_15_in_ruleSelectStatement4939 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5057 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOrderingTermList5070 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5091 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5186 = new BitSet(new long[]{0x0000000000000002L,0x7800000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5237 = new BitSet(new long[]{0x0000000000000002L,0x7800000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSelectExpression5331 = new BitSet(new long[]{0x9D80000021004070L,0x0000000007800302L});
    public static final BitSet FOLLOW_72_in_ruleSelectExpression5350 = new BitSet(new long[]{0x9D80000021004070L,0x0000000007800302L});
    public static final BitSet FOLLOW_73_in_ruleSelectExpression5387 = new BitSet(new long[]{0x9D80000021004070L,0x0000000007800302L});
    public static final BitSet FOLLOW_24_in_ruleSelectExpression5421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5475 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5511 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression5547 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression5583 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5698 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSelectList5711 = new BitSet(new long[]{0x9D80000021004070L,0x0000000007800302L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5732 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5916 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGroupByExpressions5929 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5950 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6134 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleOrderingTerm6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOrderingTerm6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6297 = new BitSet(new long[]{0x0000000000000002L,0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6318 = new BitSet(new long[]{0x0000000000000002L,0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource6355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable6568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleSingleSourceTable6581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceSelectStatement6697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceSelectStatement6730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleSingleSourceSelectStatement6743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceJoin6850 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6871 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceJoin6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJoinStatement6981 = new BitSet(new long[]{0x0000000000000000L,0x00000000003A0000L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement7015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000240000L});
    public static final BitSet FOLLOW_82_in_ruleJoinStatement7046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement7085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7149 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7182 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleResultColumn7317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralValue7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLiteralValue7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralValue7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateTableStatement8102 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTableStatement8120 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTableStatement8146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateTableStatement8180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8201 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8235 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8250 = new BitSet(new long[]{0x0000000000000000L,0x0019400000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8271 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTableStatement8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateViewStatement8377 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateViewStatement8395 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateViewStatement8421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement8438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleCreateViewStatement8455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateTriggerStatement8559 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTriggerStatement8577 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8620 = new BitSet(new long[]{0x0000000000000000L,0x0000003F00000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement8645 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement8674 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8703 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8814 = new BitSet(new long[]{0x0000000000000000L,0x0000004000400000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement8840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8857 = new BitSet(new long[]{0x0000000000008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTriggerStatement8875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8892 = new BitSet(new long[]{0x0000000000008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCreateTriggerStatement8915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8935 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000004L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement8953 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000004L});
    public static final BitSet FOLLOW_66_in_ruleCreateTriggerStatement8980 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9001 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9015 = new BitSet(new long[]{0x4000000000000000L,0x0080003800000080L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9037 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreateTriggerStatement9049 = new BitSet(new long[]{0x4000000000000000L,0x0080003800000080L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9071 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreateTriggerStatement9083 = new BitSet(new long[]{0x4000000000000000L,0x0080003800000080L});
    public static final BitSet FOLLOW_62_in_ruleCreateTriggerStatement9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAlterTableRenameStatement9191 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleAlterTableRenameStatement9203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9223 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleAlterTableRenameStatement9235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAlterTableAddColumnStatement9340 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleAlterTableAddColumnStatement9352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9372 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleAlterTableAddColumnStatement9384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropTableStatement9488 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleDropTableStatement9500 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropTableStatement9518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropTriggerStatement9635 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleDropTriggerStatement9647 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropTriggerStatement9665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropViewStatement9782 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleDropViewStatement9794 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropViewStatement9812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement9846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement9882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement9892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateIndexStatement9929 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleCreateIndexStatement9947 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleCreateIndexStatement9973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement9990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCreateIndexStatement10007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10027 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateIndexStatement10039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10060 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateIndexStatement10073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10094 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateIndexStatement10108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropIndexStatement10191 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10203 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropIndexStatement10221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef10352 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef10378 = new BitSet(new long[]{0x0020000000000002L,0x000D400000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef10399 = new BitSet(new long[]{0x0020000000000002L,0x000D400000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleColumnConstraint10493 = new BitSet(new long[]{0x0000000000000002L,0x000200000000C000L});
    public static final BitSet FOLLOW_78_in_ruleColumnConstraint10512 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_79_in_ruleColumnConstraint10549 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleColumnConstraint10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleColumnConstraint10625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleColumnConstraint10676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleColumnConstraint10727 = new BitSet(new long[]{0x0000000020004060L,0x0000000007800000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint10777 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleColumnConstraint10789 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleColumnConstraint10810 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColumnConstraint10822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint10859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint10869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint10970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleUniqueTableConstraint11053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11070 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleUniqueTableConstraint11089 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUniqueTableConstraint11101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11122 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleUniqueTableConstraint11135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11156 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleUniqueTableConstraint11170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rulePrimaryConstraint11275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11292 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_rulePrimaryConstraint11311 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryConstraint11323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11344 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryConstraint11357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11378 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryConstraint11392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleCheckTableConstraint11497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint11514 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleCheckTableConstraint11533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCheckTableConstraint11545 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11566 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCheckTableConstraint11578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11669 = new BitSet(new long[]{0x0000000000000002L,0x002000000000C000L});
    public static final BitSet FOLLOW_117_in_ruleIndexedColumn11682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11699 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleIndexedColumn11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleIndexedColumn11762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue11813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValue11908 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue11929 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultValue11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause11978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleConflictClause12025 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleConflictClause12037 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleDeleteStatement12314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleDeleteStatement12326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement12346 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleDeleteStatement12359 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleInsertStatement12467 = new BitSet(new long[]{0x0008000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_51_in_ruleInsertStatement12480 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement12501 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_119_in_ruleInsertStatement12522 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleInsertStatement12535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12555 = new BitSet(new long[]{0x0000000000004000L,0x0204000000000080L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement12568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12588 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement12601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12621 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement12635 = new BitSet(new long[]{0x0000000000000000L,0x0204000000000080L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement12652 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement12664 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12685 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement12698 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12719 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement12761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement12781 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement12793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement12831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleUpdateStatement12878 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_51_in_ruleUpdateStatement12891 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement12912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement12934 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleUpdateStatement12946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement12967 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000800L});
    public static final BitSet FOLLOW_15_in_ruleUpdateStatement12980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13001 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleUpdateStatement13016 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13130 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUpdateColumnExpression13142 = new BitSet(new long[]{0x9D80000020004070L,0x0000000007800002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSignedNumber13250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13364 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleQualifiedName13383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13398 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_123_in_ruleCompoundOperator13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleCompoundOperator13476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleCompoundOperator13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSqliteDataType13572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSqliteDataType13589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType13606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType13623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleColumnType13685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleColumnType13702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleColumnType13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType13736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleColumnType13753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleConflictResolution13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleConflictResolution13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleConflictResolution13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleConflictResolution13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang3787 = new BitSet(new long[]{0x0000000000000002L});

}