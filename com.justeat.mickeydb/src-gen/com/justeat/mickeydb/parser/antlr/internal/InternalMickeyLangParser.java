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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'function'", "'('", "','", "')'", "':'", "'{'", "';'", "'}'", "'action'", "'/'", "'#'", "'*'", "'migrate'", "'from'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'as'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'unique'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'check'", "'constraint'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMBER=6;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=7;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

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
        	return "MickeyFile";	
       	}
       	
       	@Override
       	protected MickeyLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMickeyFile"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:68:1: entryRuleMickeyFile returns [EObject current=null] : iv_ruleMickeyFile= ruleMickeyFile EOF ;
    public final EObject entryRuleMickeyFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMickeyFile = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:69:2: (iv_ruleMickeyFile= ruleMickeyFile EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:70:2: iv_ruleMickeyFile= ruleMickeyFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMickeyFileRule()); 
            }
            pushFollow(FOLLOW_ruleMickeyFile_in_entryRuleMickeyFile75);
            iv_ruleMickeyFile=ruleMickeyFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMickeyFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMickeyFile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMickeyFile"


    // $ANTLR start "ruleMickeyFile"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:77:1: ruleMickeyFile returns [EObject current=null] : (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) ( (lv_blocks_2_0= ruleMickeyBlock ) )* ) ;
    public final EObject ruleMickeyFile() throws RecognitionException {
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleMickeyFile122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMickeyFileAccess().getDatabaseKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:85:1: ( (lv_databaseName_1_0= ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:86:1: (lv_databaseName_1_0= ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:86:1: (lv_databaseName_1_0= ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:87:3: lv_databaseName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMickeyFileAccess().getDatabaseNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMickeyFile143);
            lv_databaseName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMickeyFileRule());
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

                if ( (LA1_0==13||LA1_0==21||LA1_0==25||LA1_0==91||LA1_0==105||LA1_0==108) ) {
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
            	       
            	      	        newCompositeNode(grammarAccess.getMickeyFileAccess().getBlocksMickeyBlockParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMickeyBlock_in_ruleMickeyFile164);
            	    lv_blocks_2_0=ruleMickeyBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMickeyFileRule());
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
    // $ANTLR end "ruleMickeyFile"


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
            case 21:
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:198:1: ruleMickeyFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' ) ;
    public final EObject ruleMickeyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_statements_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:201:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:202:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:202:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:202:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}'
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:272:1: (otherlv_7= ':' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:272:3: otherlv_7= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMickeyFunction540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMickeyFunctionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:276:1: ( ( ruleQualifiedName ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:277:1: ( ruleQualifiedName )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:277:1: ( ruleQualifiedName )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:278:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMickeyFunctionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getTypeTableDefinitionCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMickeyFunction563);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMickeyFunction577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMickeyFunctionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:295:1: ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==72||(LA6_0>=99 && LA6_0<=101)||LA6_0==119) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:295:2: ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:295:2: ( (lv_statements_10_0= ruleDMLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:296:1: (lv_statements_10_0= ruleDMLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:296:1: (lv_statements_10_0= ruleDMLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:297:3: lv_statements_10_0= ruleDMLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getStatementsDMLStatementParserRuleCall_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleMickeyFunction599);
            	    lv_statements_10_0=ruleDMLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_10_0, 
            	              		"DMLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleMickeyFunction611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMickeyFunctionAccess().getSemicolonKeyword_7_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleMickeyFunction625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMickeyFunctionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:329:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:330:2: (iv_ruleActionStatement= ruleActionStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:331:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleActionStatement_in_entryRuleActionStatement661);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStatement671); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:338:1: ruleActionStatement returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_uri_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:341:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleActionStatement708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:346:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:347:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:347:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:348:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStatement725); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:364:2: ( (lv_uri_2_0= ruleContentUri ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:365:1: (lv_uri_2_0= ruleContentUri )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:365:1: (lv_uri_2_0= ruleContentUri )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:366:3: lv_uri_2_0= ruleContentUri
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionStatementAccess().getUriContentUriParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContentUri_in_ruleActionStatement751);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:390:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:391:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:392:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg787);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg797); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:399:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:402:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:404:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:404:1: (lv_type_0_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:405:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg843);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:421:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:422:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:422:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:423:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg860); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:447:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:448:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:449:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri901);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri911); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:456:1: ruleContentUri returns [EObject current=null] : (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:459:28: ( (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:460:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:460:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:460:3: otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleContentUri948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriAccess().getSolidusKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:464:1: ( (lv_type_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:465:1: (lv_type_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:465:1: (lv_type_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:466:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUri965); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:482:2: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:482:4: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleContentUri983); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:486:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:487:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:487:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:488:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1004);
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
            	    break loop7;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:512:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:513:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:514:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1042);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1052); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:521:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:524:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:526:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:526:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:527:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1094); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:544:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:544:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:544:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:544:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:545:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleContentUriSegment1127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:554:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:555:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:555:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:556:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1144); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContentUriSegment1161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:576:1: ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==24) ) {
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:576:2: ( (lv_num_5_0= '#' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:576:2: ( (lv_num_5_0= '#' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:577:1: (lv_num_5_0= '#' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:577:1: (lv_num_5_0= '#' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:578:3: lv_num_5_0= '#'
                            {
                            lv_num_5_0=(Token)match(input,23,FOLLOW_23_in_ruleContentUriSegment1180); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:592:6: ( (lv_text_6_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:592:6: ( (lv_text_6_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:593:1: (lv_text_6_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:593:1: (lv_text_6_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:594:3: lv_text_6_0= '*'
                            {
                            lv_text_6_0=(Token)match(input,24,FOLLOW_24_in_ruleContentUriSegment1217); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleContentUriSegment1243); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:619:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:620:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:621:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1280);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1290); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:628:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:631:28: ( ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:632:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:632:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:632:2: () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:632:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:633:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMigrationBlock1336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:642:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:643:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:643:1: (lv_name_2_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:644:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationBlock1353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMigrationBlockAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:660:2: (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:660:4: otherlv_3= 'from' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMigrationBlock1371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMigrationBlockAccess().getFromKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:664:1: ( ( ruleQualifiedName ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:665:1: ( ruleQualifiedName )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:665:1: ( ruleQualifiedName )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:666:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMigrationBlockRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getFromMigrationBlockCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMigrationBlock1394);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock1408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:683:1: ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==91||LA11_0==105||LA11_0==108) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:683:2: ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:683:2: ( (lv_statements_6_0= ruleDDLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:684:1: (lv_statements_6_0= ruleDDLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:684:1: (lv_statements_6_0= ruleDDLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:685:3: lv_statements_6_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1430);
            	    lv_statements_6_0=ruleDDLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"DDLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock1442); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_5_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleMigrationBlock1456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMigrationBlockAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:717:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:718:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:719:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1492);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression1502); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:726:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:729:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:731:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression1548);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:747:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:748:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:749:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat1582);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat1592); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:756:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:759:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:760:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:760:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:761:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1639);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:769:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:769:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:769:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:770:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:775:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:776:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:776:1: (lv_op_2_0= '||' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:777:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,27,FOLLOW_27_in_ruleExprConcat1666); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:790:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:791:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:791:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:792:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1700);
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
    // $ANTLR end "ruleExprConcat"


    // $ANTLR start "entryRuleExprMult"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:816:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:817:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:818:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1738);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1748); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:825:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:828:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:829:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:829:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:830:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1795);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:838:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22||LA14_0==24||LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:838:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:838:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:839:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:844:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:845:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:845:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:846:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:846:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:847:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,24,FOLLOW_24_in_ruleExprMult1824); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:859:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_22_in_ruleExprMult1853); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:871:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,28,FOLLOW_28_in_ruleExprMult1882); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:886:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:887:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:887:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:888:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1919);
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
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:912:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:913:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:914:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd1957);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd1967); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:921:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:924:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:925:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:925:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:926:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2014);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:934:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=30)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:934:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:934:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:935:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:940:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:941:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:941:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:942:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:942:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==29) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==30) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:943:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_29_in_ruleExprAdd2043); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:955:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,30,FOLLOW_30_in_ruleExprAdd2072); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:970:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:971:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:971:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:972:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2109);
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
    // $ANTLR end "ruleExprAdd"


    // $ANTLR start "entryRuleExprBit"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:996:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:997:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:998:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2147);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2157); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1005:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1008:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1009:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1009:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1010:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2204);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1018:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=34)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1018:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1018:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1019:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1024:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1025:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1025:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1026:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1026:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt17=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 34:
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1027:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleExprBit2233); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1039:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleExprBit2262); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1051:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleExprBit2291); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1063:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleExprBit2320); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1078:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1079:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1079:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1080:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2357);
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1104:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1105:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1106:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2395);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2405); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1113:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1116:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1117:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1117:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1118:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2452);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1126:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=35 && LA20_0<=38)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1126:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1126:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1127:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1132:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1133:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1133:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1134:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1134:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt19=4;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1135:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_35_in_ruleExprRelate2481); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1147:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_36_in_ruleExprRelate2510); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1159:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,37,FOLLOW_37_in_ruleExprRelate2539); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1171:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,38,FOLLOW_38_in_ruleExprRelate2568); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1186:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1187:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1187:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1188:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2605);
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
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1212:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1213:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1214:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2643);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2653); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1221:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1224:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1225:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1225:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1226:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2700);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1234:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=39 && LA22_0<=50)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1234:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1234:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1235:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1240:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1241:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1241:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1242:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1242:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt21=12;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt21=6;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt21=7;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt21=8;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt21=9;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt21=10;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt21=11;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt21=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1243:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleExprEqual2729); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1255:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_40_in_ruleExprEqual2758); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1267:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2787); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1279:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2816); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1291:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2845); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1303:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2874); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1315:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual2903); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1327:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual2932); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1339:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual2961); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1351:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual2990); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1363:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual3019); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1375:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,50,FOLLOW_50_in_ruleExprEqual3048); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1390:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1391:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1391:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1392:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3085);
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
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1416:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1417:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1418:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3123);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3133); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1425:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1428:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1429:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1429:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1430:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3180);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1438:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==51) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1438:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1438:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1439:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1444:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1445:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1445:1: (lv_op_2_0= 'and' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1446:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,51,FOLLOW_51_in_ruleExprAnd3207); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1459:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1460:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1460:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1461:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3241);
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
            	    break loop23;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1485:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1486:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1487:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3279);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3289); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1494:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1497:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1498:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1498:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1499:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3336);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1507:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1507:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1507:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1508:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1513:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1514:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1514:1: (lv_op_2_0= 'or' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1515:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,52,FOLLOW_52_in_ruleExprOr3363); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1528:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1529:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1529:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1530:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3397);
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
            	    break loop24;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1554:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1555:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1556:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3435);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3445); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1563:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1566:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1567:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1567:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1568:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3492);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1576:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=53 && LA25_0<=55)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1576:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1576:2: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1577:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1582:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1583:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1584:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3522);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1608:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1609:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1610:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3560);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3570); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1617:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1620:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1621:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1621:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=54 && LA27_0<=55)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1621:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1621:2: ( () otherlv_1= 'is null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1621:3: () otherlv_1= 'is null'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1621:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1622:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleNullExpression3617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1632:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1632:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1632:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1632:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1633:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1638:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==54) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==55) ) {
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1638:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleNullExpression3647); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1643:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleNullExpression3665); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1655:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1656:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1657:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3703);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3713); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1664:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1667:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1668:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1668:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt37=10;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1668:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1668:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1668:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1668:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1669:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1679:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1679:1: (otherlv_2= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1680:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1692:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1692:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1692:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1692:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1693:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1702:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1703:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1703:1: (otherlv_5= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1704:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1716:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1716:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1716:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1716:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1717:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt29=3;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1728:1: (otherlv_7= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1729:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3880); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3892); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1745:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1745:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1745:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1745:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1746:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1746:1: (otherlv_9= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1747:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3920); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3932); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1762:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==24) ) {
                                alt28=1;
                            }
                            else if ( (LA28_0==RULE_ID) ) {
                                alt28=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 28, 0, input);

                                throw nvae;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1762:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1762:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1763:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1763:1: (lv_all_11_0= '*' )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1764:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression3951); if (state.failed) return current;
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
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1778:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1778:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:1: (otherlv_12= RULE_ID )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1780:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3990); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1792:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1792:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1793:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1793:1: (otherlv_13= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1794:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4018); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1806:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1806:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1806:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1806:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1807:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1812:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1813:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1813:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1814:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4057);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1831:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1831:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1831:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1831:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1832:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1841:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1842:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1842:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1843:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4107);
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

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1865:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1870:2: ( (lv_not_21_0= 'not' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==59) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1871:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1871:1: (lv_not_21_0= 'not' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1872:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression4154); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1885:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==60) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1886:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1886:1: (lv_exists_22_0= 'exists' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1887:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4186); if (state.failed) return current;
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

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1904:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1905:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1905:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1906:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4233);
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

                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1927:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1927:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1927:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1927:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1928:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1937:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_NUMBER)||LA32_0==14||LA32_0==30||(LA32_0>=56 && LA32_0<=57)||(LA32_0>=59 && LA32_0<=61)||LA32_0==64||LA32_0==66||(LA32_0>=87 && LA32_0<=90)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1938:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1938:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1939:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4295);
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1955:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==67) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1956:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1956:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1957:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4317);
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
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1973:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==62) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1973:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4331); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1977:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1978:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1978:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1979:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4352);
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

                    otherlv_32=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2000:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2000:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2000:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2000:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2001:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2006:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2007:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2007:1: (lv_name_34_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2008:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4400); if (state.failed) return current;
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

                    otherlv_35=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2028:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==24) ) {
                        alt36=1;
                    }
                    else if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_NUMBER)||LA36_0==14||LA36_0==30||(LA36_0>=56 && LA36_0<=57)||(LA36_0>=59 && LA36_0<=61)||LA36_0==64||LA36_0==66||(LA36_0>=87 && LA36_0<=90)) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2028:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2028:2: ( (lv_all_36_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2029:1: (lv_all_36_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2029:1: (lv_all_36_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2030:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression4436); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2044:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2044:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2044:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2044:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2045:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2045:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2046:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4477);
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2062:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==15) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2062:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression4490); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2066:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2067:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2067:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2068:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4511);
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
                            	    break loop35;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2090:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2103:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2104:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2104:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2105:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4589);
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

                    otherlv_45=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2125:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2126:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2126:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2127:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4622);
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

                    otherlv_47=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2148:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2148:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2148:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2148:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2149:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,66,FOLLOW_66_in_rulePrimaryExpression4663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2158:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2159:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2159:1: (otherlv_50= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2160:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4683); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2179:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2180:2: (iv_ruleCase= ruleCase EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2181:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4720);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4730); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2188:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2191:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2192:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2192:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2192:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleCase4767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2196:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2197:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2197:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2198:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4788);
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

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleCase4800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2218:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2219:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2219:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2220:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4821);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2244:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2245:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2246:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4857);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement4867); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2253:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2256:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2257:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2257:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2257:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2257:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2258:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2258:1: (lv_core_0_0= ruleSelectCore )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2259:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement4913);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleSelectStatement4926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2279:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2280:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2280:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2281:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4947);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2297:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==70) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2297:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleSelectStatement4962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2301:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2302:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2302:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2303:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement4983);
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==15||LA40_0==71) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==71) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==15) ) {
                                alt39=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleSelectStatement4997); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2324:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSelectStatement5015); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2328:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2329:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2329:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2330:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5037);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2354:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2355:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2356:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5077);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5087); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2363:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2366:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2367:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2367:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2367:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2367:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2368:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2368:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2369:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5133);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2385:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==15) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2385:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleOrderingTermList5146); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2389:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2390:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2390:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2391:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5167);
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
            	    break loop42;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2415:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2416:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2417:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5205);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5215); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2427:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2428:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2428:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2429:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5262);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2437:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=123 && LA43_0<=126)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2437:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2437:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2438:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2443:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2444:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2444:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2445:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5292);
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2461:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2462:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2462:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2463:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5313);
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
            	    break loop43;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2487:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2488:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2489:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5351);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5361); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2496:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2499:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2500:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2500:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2500:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2500:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2501:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleSelectExpression5407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2510:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==73) ) {
                alt44=1;
            }
            else if ( (LA44_0==74) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2510:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2510:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2511:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2511:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2512:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,73,FOLLOW_73_in_ruleSelectExpression5426); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2526:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2526:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2527:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2527:1: (lv_all_3_0= 'all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2528:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5463); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2541:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_NUMBER)||LA45_0==14||LA45_0==30||(LA45_0>=56 && LA45_0<=57)||(LA45_0>=59 && LA45_0<=61)||LA45_0==64||LA45_0==66||(LA45_0>=87 && LA45_0<=90)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2541:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2541:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2542:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2542:1: (lv_allColumns_4_0= '*' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2543:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,24,FOLLOW_24_in_ruleSelectExpression5497); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2557:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2557:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2558:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2558:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2559:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5537);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2575:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2575:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleSelectExpression5551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2579:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2580:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2580:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2581:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5572);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2597:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==75) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2597:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2601:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2602:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2602:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2603:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5608);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2619:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==76) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2619:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression5623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2623:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2624:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2624:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2625:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5644);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2641:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==77) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2641:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression5659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2645:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2646:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2646:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2647:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5680);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2671:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2672:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2673:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5718);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5728); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2680:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2683:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2684:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2684:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2684:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2684:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2685:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2685:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2686:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5774);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2702:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==15) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2702:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSelectList5787); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2706:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2707:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2707:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2708:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5808);
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
            	    break loop50;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2732:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2733:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2734:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5846);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions5856); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2744:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2745:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2745:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2746:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2746:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2747:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5901);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2771:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2772:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2773:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5936);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions5946); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2780:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2783:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2784:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2784:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2784:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2784:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2785:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2785:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2786:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5992);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2802:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==15) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2802:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGroupByExpressions6005); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2806:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2808:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6026);
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
    // $ANTLR end "ruleGroupByExpressions"


    // $ANTLR start "entryRuleHavingExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2832:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2833:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2834:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6064);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions6074); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2841:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2844:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2845:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2845:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2846:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2846:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2847:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6119);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2871:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2872:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2873:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6154);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6164); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2880:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2883:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2884:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2884:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2884:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2884:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2885:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2885:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2886:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6210);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2902:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            else if ( (LA52_0==79) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2902:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2902:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2903:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2903:1: (lv_asc_1_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2904:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,78,FOLLOW_78_in_ruleOrderingTerm6229); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2918:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2918:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2919:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2919:1: (lv_desc_2_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2920:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,79,FOLLOW_79_in_ruleOrderingTerm6266); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2941:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2942:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2943:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6317);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6327); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2950:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2953:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2954:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2954:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2954:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2954:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2955:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2955:1: (lv_source_0_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2956:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6373);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2972:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=80 && LA53_0<=81)||(LA53_0>=83 && LA53_0<=85)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2973:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2973:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2974:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6394);
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
            	    break loop53;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2998:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2999:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3000:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource6431);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource6441); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3007:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3010:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==14) ) {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==RULE_ID||LA54_2==14) ) {
                    alt54=3;
                }
                else if ( (LA54_2==72) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3012:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6488);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3022:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6515);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3032:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6542);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3048:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3049:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3050:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6577);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6587); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3057:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3060:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3061:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3061:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3061:2: () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3061:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3067:2: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3068:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3068:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3069:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable6644);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3082:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3082:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleSingleSourceTable6657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3086:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3087:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3087:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3088:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6674); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3112:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3113:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3114:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6717);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6727); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3121:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3124:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3126:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceSelectStatement6773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3135:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3136:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3136:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3137:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6794);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceSelectStatement6806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3157:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==65) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3157:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleSingleSourceSelectStatement6819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3161:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3162:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3162:1: (lv_name_5_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3163:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6836); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3187:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3188:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3189:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6879);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin6889); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3196:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3199:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3200:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3200:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3200:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceJoin6926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3204:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3205:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3205:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3206:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6947);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceJoin6959); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3234:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3235:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3236:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6995);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement7005); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3243:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3246:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3253:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==80) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3254:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3254:1: (lv_natural_1_0= 'natural' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3255:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,80,FOLLOW_80_in_ruleJoinStatement7057); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3268:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt59=4;
            switch ( input.LA(1) ) {
                case 81:
                    {
                    alt59=1;
                    }
                    break;
                case 83:
                    {
                    alt59=2;
                    }
                    break;
                case 84:
                    {
                    alt59=3;
                    }
                    break;
            }

            switch (alt59) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3268:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3268:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3268:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3268:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3269:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3269:1: (lv_left_2_0= 'left' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3270:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement7091); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3283:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==82) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3284:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3284:1: (lv_outer_3_0= 'outer' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3285:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,82,FOLLOW_82_in_ruleJoinStatement7122); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3299:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3299:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3300:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3300:1: (lv_inner_4_0= 'inner' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3301:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement7161); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3315:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3315:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3316:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3316:1: (lv_cross_5_0= 'cross' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3317:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7198); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3334:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3335:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3335:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3336:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7246);
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

            otherlv_8=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3356:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7279);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3382:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3383:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3384:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7315);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7325); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3391:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3394:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3395:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3395:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3395:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3395:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3396:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3401:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3402:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3402:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3403:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7380);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3419:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==65) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3419:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResultColumn7393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3423:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3424:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3425:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7410); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3449:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3450:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3451:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7453);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7463); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3458:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3461:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt61=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 30:
                {
                alt61=1;
                }
                break;
            case RULE_STRING:
                {
                alt61=2;
                }
                break;
            case 87:
                {
                alt61=3;
                }
                break;
            case 88:
                {
                alt61=4;
                }
                break;
            case 89:
                {
                alt61=5;
                }
                break;
            case 90:
                {
                alt61=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3463:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3468:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3469:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3469:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3470:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7519);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3487:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3487:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3487:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3487:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3488:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3493:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3494:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3494:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3495:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7553); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3512:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3512:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3512:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3512:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3513:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:1: (lv_literal_5_0= 'null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3520:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralValue7593); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3534:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3534:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3534:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3534:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3535:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3540:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3541:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3541:1: (lv_literal_7_0= 'current_time' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3542:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,88,FOLLOW_88_in_ruleLiteralValue7641); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3556:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3556:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3556:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3556:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3557:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3562:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3563:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3563:1: (lv_literal_9_0= 'current_date' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3564:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,89,FOLLOW_89_in_ruleLiteralValue7689); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3578:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3578:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3578:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3578:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3579:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3584:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3585:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3585:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3586:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue7737); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3607:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3608:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3609:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7787);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7797); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3616:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3619:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3620:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3620:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt62=10;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3621:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7844);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3631:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7871);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3641:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7898);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3651:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement7925);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3661:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7952);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3671:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7979);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3681:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8006);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3691:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8033);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3701:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8060);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3711:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8087);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3727:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3728:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3729:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8122);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8132); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3736:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3739:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3740:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3740:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3740:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3740:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateTableStatement8178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3750:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==92) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3751:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3751:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3752:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateTableStatement8196); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,93,FOLLOW_93_in_ruleCreateTableStatement8222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3769:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3770:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3770:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3771:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8239); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCreateTableStatement8256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3791:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3792:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3792:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3793:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8277);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==15) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==RULE_ID) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8290); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3813:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3814:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3814:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3815:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8311);
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
            	    break loop64;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==15) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8326); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3835:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3836:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3836:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3837:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8347);
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
            	    break loop65;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCreateTableStatement8361); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3865:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3866:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3867:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8397);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement8407); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3874:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3877:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3878:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3878:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3878:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3878:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3879:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateViewStatement8453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3888:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==92) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3889:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3889:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3890:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateViewStatement8471); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,94,FOLLOW_94_in_ruleCreateViewStatement8497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3907:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3908:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3908:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3909:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement8514); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleCreateViewStatement8531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3929:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3930:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3930:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3931:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8552);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3955:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3956:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3957:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8588);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8598); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3964:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3967:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3968:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3968:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3968:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleCreateTriggerStatement8635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3972:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==92) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3973:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3973:1: (lv_temporary_1_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3974:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateTriggerStatement8653); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3991:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3992:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3992:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3993:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8696); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4009:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=96 && LA69_0<=98)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4010:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4010:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4011:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4011:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt68=3;
                    switch ( input.LA(1) ) {
                    case 96:
                        {
                        alt68=1;
                        }
                        break;
                    case 97:
                        {
                        alt68=2;
                        }
                        break;
                    case 98:
                        {
                        alt68=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4012:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement8721); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4024:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement8750); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4036:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8779); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4051:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt72=1;
                }
                break;
            case 100:
                {
                alt72=2;
                }
                break;
            case 101:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4051:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4051:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4052:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4052:1: (lv_eventType_5_0= 'delete' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4053:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8815); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4068:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4068:1: (lv_eventType_6_0= 'insert' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4069:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8852); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4083:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4083:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4083:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4083:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4084:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4084:1: (lv_eventType_7_0= 'update' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4085:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8890); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4098:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==102) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4098:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement8916); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4102:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4103:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4103:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4104:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8933); if (state.failed) return current;
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4120:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==15) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4120:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCreateTriggerStatement8951); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4124:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4125:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4125:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4126:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8968); if (state.failed) return current;
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
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,86,FOLLOW_86_in_ruleCreateTriggerStatement8991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4146:1: ( (otherlv_13= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4147:1: (otherlv_13= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4147:1: (otherlv_13= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4148:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4159:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==103) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4160:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4160:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4161:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement9029); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4174:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==67) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4174:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_67_in_ruleCreateTriggerStatement9056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4178:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4179:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4179:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4180:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9077);
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

            otherlv_17=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9091); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4200:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==72||(LA76_0>=99 && LA76_0<=101)||LA76_0==119) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4200:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4200:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4201:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4201:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4202:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9113);
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

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement9125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4222:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==72||(LA75_0>=99 && LA75_0<=101)||LA75_0==119) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4222:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4222:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4223:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4223:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4224:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9147);
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

                    	    otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement9159); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,63,FOLLOW_63_in_ruleCreateTriggerStatement9175); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4256:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4257:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4258:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9211);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9221); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4265:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4268:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4269:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4269:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4269:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4269:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4270:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,105,FOLLOW_105_in_ruleAlterTableRenameStatement9267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,93,FOLLOW_93_in_ruleAlterTableRenameStatement9279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4283:1: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4284:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4284:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4285:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,106,FOLLOW_106_in_ruleAlterTableRenameStatement9311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4300:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4301:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4301:1: (lv_name_5_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4302:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9328); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4327:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4328:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9369);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9379); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4335:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4338:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4339:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4339:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4339:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleAlterTableAddColumnStatement9416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleAlterTableAddColumnStatement9428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4347:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4348:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4348:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4349:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,107,FOLLOW_107_in_ruleAlterTableAddColumnStatement9460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4364:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4366:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9481);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4390:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4391:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4392:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9517);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement9527); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4399:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4402:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4403:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4403:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4403:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropTableStatement9564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleDropTableStatement9576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4411:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==109) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4412:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4412:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4413:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropTableStatement9594); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4426:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4427:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4427:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4428:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9628); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4447:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4448:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4449:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9664);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9674); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4456:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4459:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4460:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4460:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4460:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropTriggerStatement9711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleDropTriggerStatement9723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4468:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==109) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4469:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4469:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4470:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropTriggerStatement9741); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4483:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4484:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4484:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4485:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9775); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4504:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4505:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4506:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9811);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9821); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4513:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4516:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4517:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4517:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4517:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropViewStatement9858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleDropViewStatement9870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4525:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==109) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4526:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4526:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4527:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropViewStatement9888); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4540:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4541:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4541:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4542:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement9922); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4561:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4562:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4563:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement9958);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement9968); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4570:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4573:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4574:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4574:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4574:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleCreateIndexStatement10005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4578:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==110) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4579:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4579:1: (lv_unique_1_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4580:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,110,FOLLOW_110_in_ruleCreateIndexStatement10023); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleCreateIndexStatement10049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4597:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4599:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10066); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,86,FOLLOW_86_in_ruleCreateIndexStatement10083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4619:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4620:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4620:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4621:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleCreateIndexStatement10115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4636:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4637:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4637:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4638:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10136);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4654:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==15) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4654:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleCreateIndexStatement10149); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4658:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4659:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4659:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4660:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10170);
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
            	    break loop81;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleCreateIndexStatement10184); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4688:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4689:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4690:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10220);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10230); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4697:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4700:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4701:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4701:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4701:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleDropIndexStatement10267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4709:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==109) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4710:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4710:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4711:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,109,FOLLOW_109_in_ruleDropIndexStatement10297); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4724:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4725:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4725:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4726:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10331); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4745:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4746:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4747:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10367);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10377); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4754:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4757:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4759:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4764:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4765:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4765:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4766:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef10428); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4782:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4783:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4783:1: (lv_type_2_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4784:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef10454);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4800:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==54||LA83_0==110||LA83_0==112||(LA83_0>=114 && LA83_0<=115)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4802:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef10475);
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
            	    break loop83;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4826:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4827:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4828:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10512);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint10522); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4835:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4838:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            int alt88=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt88=1;
                }
                break;
            case 54:
                {
                alt88=2;
                }
                break;
            case 110:
                {
                alt88=3;
                }
                break;
            case 114:
                {
                alt88=4;
                }
                break;
            case 115:
                {
                alt88=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4840:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleColumnConstraint10569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4849:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt84=3;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==78) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==79) ) {
                        alt84=2;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4849:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4849:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4850:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4850:1: (lv_asc_2_0= 'asc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4851:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,78,FOLLOW_78_in_ruleColumnConstraint10588); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4865:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4865:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4866:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4866:1: (lv_desc_3_0= 'desc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4867:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,79,FOLLOW_79_in_ruleColumnConstraint10625); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4880:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==113) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4881:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4881:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4882:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,113,FOLLOW_113_in_ruleColumnConstraint10658); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4897:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleColumnConstraint10701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4906:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==86) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4907:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4907:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4908:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10722);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4925:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4925:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4925:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4925:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4926:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,110,FOLLOW_110_in_ruleColumnConstraint10752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4935:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==86) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4936:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4936:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4937:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10773);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4954:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4954:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4954:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4954:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4955:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,114,FOLLOW_114_in_ruleColumnConstraint10803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4964:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4965:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4965:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4966:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10824);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4983:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4983:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4983:7: () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4983:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4984:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getCheckConstraintAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint10853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getColumnConstraintAccess().getCheckKeyword_4_1());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleColumnConstraint10865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getColumnConstraintAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4997:1: ( (lv_expression_17_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4998:1: (lv_expression_17_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4998:1: (lv_expression_17_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4999:3: lv_expression_17_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleColumnConstraint10886);
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

                    otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleColumnConstraint10898); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5027:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5028:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5029:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint10935);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint10945); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5036:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5039:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 110:
                        {
                        alt89=1;
                        }
                        break;
                    case 112:
                        {
                        alt89=2;
                        }
                        break;
                    case 115:
                        {
                        alt89=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
                }
                break;
            case 110:
                {
                alt89=1;
                }
                break;
            case 112:
                {
                alt89=2;
                }
                break;
            case 115:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5041:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint10992);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5051:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11019);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5061:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11046);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5077:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5078:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5079:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11081);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11091); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5086:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5089:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5090:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5090:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5090:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5090:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==116) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5090:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleUniqueTableConstraint11129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5094:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5095:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5095:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5096:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11146); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,110,FOLLOW_110_in_ruleUniqueTableConstraint11165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUniqueTableConstraint11177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5120:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5121:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5121:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5122:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11198);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5138:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==15) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5138:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUniqueTableConstraint11211); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5142:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5143:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5143:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5144:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11232);
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
            	    break loop91;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleUniqueTableConstraint11246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5164:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5165:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5166:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11267);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5190:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5191:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5192:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11303);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11313); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5199:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5202:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5203:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5203:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5203:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5203:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==116) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5203:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_rulePrimaryConstraint11351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5207:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5208:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5208:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5209:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11368); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,112,FOLLOW_112_in_rulePrimaryConstraint11387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePrimaryConstraint11399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5233:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5234:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5234:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5235:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11420);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5251:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==15) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5251:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePrimaryConstraint11433); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5255:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5256:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5256:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5257:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11454);
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
            	    break loop93;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePrimaryConstraint11468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5277:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5278:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5279:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11489);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5303:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5304:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5305:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11525);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint11535); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5312:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5315:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5316:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5316:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5316:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5316:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==116) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5316:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleCheckTableConstraint11573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5320:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5321:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5321:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5322:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint11590); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_ruleCheckTableConstraint11609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCheckTableConstraint11621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5346:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5347:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5347:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5348:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11642);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCheckTableConstraint11654); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5376:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5377:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5378:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11690);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn11700); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5385:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5388:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5389:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5389:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5389:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5389:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5390:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5390:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5391:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5402:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==117) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5402:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_117_in_ruleIndexedColumn11758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5406:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5407:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5407:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5408:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11775); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5424:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt96=3;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            else if ( (LA96_0==79) ) {
                alt96=2;
            }
            switch (alt96) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5424:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5424:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5425:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5425:1: (lv_asc_3_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5426:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,78,FOLLOW_78_in_ruleIndexedColumn11801); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5440:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5440:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5441:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5441:1: (lv_desc_4_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5442:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,79,FOLLOW_79_in_ruleIndexedColumn11838); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5464:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5465:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue11889);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue11899); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5472:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5475:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5476:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5476:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=RULE_STRING && LA97_0<=RULE_NUMBER)||LA97_0==30||(LA97_0>=87 && LA97_0<=90)) ) {
                alt97=1;
            }
            else if ( (LA97_0==14) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5476:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5476:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5476:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5476:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5477:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5482:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5483:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5483:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5484:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue11955);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5501:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5501:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5501:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5501:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5502:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValue11984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5511:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5512:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5512:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5513:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue12005);
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

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDefaultValue12017); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5541:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5542:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5543:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause12054);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause12064); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5550:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5553:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5554:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5554:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5554:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_86_in_ruleConflictClause12101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,118,FOLLOW_118_in_ruleConflictClause12113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5562:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5563:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5563:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5564:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12134);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5588:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5589:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5590:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12170);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12180); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5597:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5600:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5601:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5601:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt98=1;
                }
                break;
            case 100:
            case 119:
                {
                alt98=2;
                }
                break;
            case 101:
                {
                alt98=3;
                }
                break;
            case 99:
                {
                alt98=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5602:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12227);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5612:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12254);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5622:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12281);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5632:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12308);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5648:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5649:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5650:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12343);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12353); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5657:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5660:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5661:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5661:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5661:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleDeleteStatement12390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleDeleteStatement12402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5669:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5670:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5670:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5671:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement12422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5682:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==75) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5682:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleDeleteStatement12435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5686:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5688:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12456);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5712:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5713:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5714:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12494);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement12504); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5721:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5724:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==100) ) {
                alt101=1;
            }
            else if ( (LA101_0==119) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5725:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleInsertStatement12543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5729:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==52) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5729:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleInsertStatement12556); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5733:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5734:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5734:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5735:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement12577);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5752:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,119,FOLLOW_119_in_ruleInsertStatement12598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,120,FOLLOW_120_in_ruleInsertStatement12611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5760:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5761:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5761:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5762:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==14) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement12644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5777:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5778:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5778:1: (otherlv_7= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5779:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5790:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==15) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5790:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement12677); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5794:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5795:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5795:1: (otherlv_9= RULE_ID )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5796:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12697); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement12711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5811:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==72||LA106_0==121) ) {
                alt106=1;
            }
            else if ( (LA106_0==114) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5811:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5811:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==121) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==72) ) {
                        alt105=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5811:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5811:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5811:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement12728); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement12740); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5819:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5820:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5820:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5821:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12761);
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5837:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop104:
                            do {
                                int alt104=2;
                                int LA104_0 = input.LA(1);

                                if ( (LA104_0==15) ) {
                                    alt104=1;
                                }


                                switch (alt104) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5837:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement12774); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5841:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5842:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5842:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5843:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12795);
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
                            	    break loop104;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement12809); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5864:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5864:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5865:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5865:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5866:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement12837);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5883:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5883:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5883:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement12857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement12869); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5899:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5900:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5901:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement12907);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement12917); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5908:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5911:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5912:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5912:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5912:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleUpdateStatement12954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5916:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==52) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5916:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleUpdateStatement12967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5920:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5921:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5921:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5922:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement12988);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5938:4: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5939:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5939:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5940:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement13010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,122,FOLLOW_122_in_ruleUpdateStatement13022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5955:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5956:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5956:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13043);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5973:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==15) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5973:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleUpdateStatement13056); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5977:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5978:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5978:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5979:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13077);
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
            	    break loop108;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5995:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==75) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5995:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_75_in_ruleUpdateStatement13092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5999:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6001:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13113);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6025:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6026:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6027:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13151);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13161); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6034:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6037:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6038:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6038:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6038:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6038:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6039:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6039:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6040:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleUpdateColumnExpression13218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6055:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6057:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13239);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6081:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6082:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6083:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13276);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13287); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6090:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6093:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6094:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6094:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6094:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6094:2: (kw= '-' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==30) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleSignedNumber13326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13343); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6115:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6116:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6117:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13389);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13400); if (state.failed) return current;

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6124:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6127:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6128:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6128:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6128:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6135:1: (kw= '.' this_ID_2= RULE_ID )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==58) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6136:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleQualifiedName13459); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13474); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop111;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6156:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6159:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6159:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt112=4;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt112=1;
                }
                break;
            case 124:
                {
                alt112=2;
                }
                break;
            case 125:
                {
                alt112=3;
                }
                break;
            case 126:
                {
                alt112=4;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6159:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6159:2: (enumLiteral_0= 'union all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6159:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_123_in_ruleCompoundOperator13535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6165:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6165:6: (enumLiteral_1= 'union' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6165:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_124_in_ruleCompoundOperator13552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6171:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6171:6: (enumLiteral_2= 'intersect' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6171:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_125_in_ruleCompoundOperator13569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6177:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6177:6: (enumLiteral_3= 'except' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6177:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator13586); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6187:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6189:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6190:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6190:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt113=6;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt113=1;
                }
                break;
            case 128:
                {
                alt113=2;
                }
                break;
            case 129:
                {
                alt113=3;
                }
                break;
            case 130:
                {
                alt113=4;
                }
                break;
            case 131:
                {
                alt113=5;
                }
                break;
            case 132:
                {
                alt113=6;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6190:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6190:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6190:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType13631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6196:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6196:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6196:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleSqliteDataType13648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6202:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6202:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6202:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleSqliteDataType13665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6208:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6208:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6208:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType13682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6214:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6214:6: (enumLiteral_4= 'none' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6214:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType13699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6220:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6220:6: (enumLiteral_5= 'numeric' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6220:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType13716); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6230:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6233:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6233:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt114=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt114=1;
                }
                break;
            case 128:
                {
                alt114=2;
                }
                break;
            case 129:
                {
                alt114=3;
                }
                break;
            case 130:
                {
                alt114=4;
                }
                break;
            case 133:
                {
                alt114=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6233:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6233:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6233:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleColumnType13761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6239:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6239:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6239:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleColumnType13778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6245:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6245:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6245:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleColumnType13795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6251:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6251:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6251:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleColumnType13812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6257:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6257:6: (enumLiteral_4= 'boolean' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6257:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,133,FOLLOW_133_in_ruleColumnType13829); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6267:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6269:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt115=1;
                }
                break;
            case 135:
                {
                alt115=2;
                }
                break;
            case 136:
                {
                alt115=3;
                }
                break;
            case 137:
                {
                alt115=4;
                }
                break;
            case 119:
                {
                alt115=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:2: (enumLiteral_0= 'rollback' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_134_in_ruleConflictResolution13874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6276:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6276:6: (enumLiteral_1= 'abort' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6276:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_135_in_ruleConflictResolution13891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6282:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6282:6: (enumLiteral_2= 'fail' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6282:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_136_in_ruleConflictResolution13908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6288:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6288:6: (enumLiteral_3= 'ignore' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6288:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution13925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6294:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6294:6: (enumLiteral_4= 'replace' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6294:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_119_in_ruleConflictResolution13942); if (state.failed) return current;
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
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:5: ( ( RULE_ID ) )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1723:1: ( RULE_ID )
        {
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1723:1: ( RULE_ID )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1724:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang3863); if (state.failed) return ;

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


    protected DFA37 dfa37 = new DFA37(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA37_eotS =
        "\15\uffff";
    static final String DFA37_eofS =
        "\3\uffff\1\12\11\uffff";
    static final String DFA37_minS =
        "\1\4\2\uffff\1\15\1\uffff\1\4\7\uffff";
    static final String DFA37_maxS =
        "\1\132\2\uffff\1\176\1\uffff\1\132\7\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\3\1\10\1\5";
    static final String DFA37_specialS =
        "\15\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\2\4\7\uffff\1\5\17\uffff\1\4\31\uffff\1\1\1\2\1\uffff\2\6\1\7\2\uffff\1\10\1\uffff\1\11\24\uffff\4\4",
            "",
            "",
            "\1\12\1\13\2\12\2\uffff\1\12\1\uffff\2\12\1\uffff\40\12\2\uffff\1\12\3\uffff\2\12\1\uffff\1\12\1\uffff\5\12\3\uffff\7\12\1\uffff\3\12\5\uffff\1\12\14\uffff\2\12\2\uffff\1\12\16\uffff\4\12",
            "",
            "\3\14\7\uffff\1\14\17\uffff\1\14\31\uffff\2\14\1\uffff\3\14\2\uffff\1\14\1\uffff\1\14\5\uffff\1\6\16\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1668:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA29_eotS =
        "\127\uffff";
    static final String DFA29_eofS =
        "\1\uffff\1\2\1\uffff\1\44\1\5\122\uffff";
    static final String DFA29_minS =
        "\1\4\1\15\1\uffff\2\4\104\uffff\1\4\14\uffff\1\0";
    static final String DFA29_maxS =
        "\1\4\1\176\1\uffff\2\176\104\uffff\1\132\14\uffff\1\0";
    static final String DFA29_acceptS =
        "\2\uffff\1\3\2\uffff\1\2\103\1\1\uffff\14\1\1\uffff";
    static final String DFA29_specialS =
        "\3\uffff\1\0\1\1\121\uffff\1\2}>";
    static final String[] DFA29_transitionS = {
            "\1\1",
            "\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff\2\2\1\uffff\40\2\2\uffff\1\3\3\uffff\2\2\1\uffff\1\2\1\uffff\5\2\3\uffff\7\2\1\uffff\3\2\5\uffff\1\2\14\uffff\2\2\2\uffff\1\2\16\uffff\4\2",
            "",
            "\1\5\10\uffff\1\55\1\uffff\1\50\1\45\2\uffff\1\63\1\uffff\1\56\1\41\1\uffff\1\4\1\62\1\104\1\43\1\42\1\37\1\40\1\33\1\34\1\35\1\36\1\27\1\30\1\31\1\32\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\11\1\6\1\7\1\10\6\uffff\1\53\1\47\1\uffff\1\51\1\uffff\1\46\1\52\1\72\1\73\1\54\3\uffff\1\76\1\64\1\65\1\74\1\75\1\77\1\100\1\uffff\1\101\1\102\1\103\5\uffff\1\57\14\uffff\1\105\1\60\2\uffff\1\61\16\uffff\1\66\1\67\1\70\1\71",
            "\1\110\1\113\1\112\6\uffff\1\5\1\120\2\5\2\uffff\1\5\1\uffff\2\5\1\uffff\6\5\1\111\31\5\1\106\1\107\1\uffff\1\121\1\122\1\123\2\5\1\124\1\5\1\125\5\5\3\uffff\7\5\1\uffff\3\5\1\uffff\1\114\1\115\1\116\1\117\1\5\14\uffff\2\5\2\uffff\1\5\16\uffff\4\5",
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
            "\2\5\1\126\7\uffff\1\5\17\uffff\1\5\31\uffff\2\5\1\uffff\3\5\2\uffff\1\5\1\uffff\1\5\24\uffff\4\5",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1722:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_3==24) ) {s = 4;}

                        else if ( (LA29_3==RULE_ID) ) {s = 5;}

                        else if ( (LA29_3==53) && (synpred1_InternalMickeyLang())) {s = 6;}

                        else if ( (LA29_3==54) && (synpred1_InternalMickeyLang())) {s = 7;}

                        else if ( (LA29_3==55) && (synpred1_InternalMickeyLang())) {s = 8;}

                        else if ( (LA29_3==52) && (synpred1_InternalMickeyLang())) {s = 9;}

                        else if ( (LA29_3==51) && (synpred1_InternalMickeyLang())) {s = 10;}

                        else if ( (LA29_3==39) && (synpred1_InternalMickeyLang())) {s = 11;}

                        else if ( (LA29_3==40) && (synpred1_InternalMickeyLang())) {s = 12;}

                        else if ( (LA29_3==41) && (synpred1_InternalMickeyLang())) {s = 13;}

                        else if ( (LA29_3==42) && (synpred1_InternalMickeyLang())) {s = 14;}

                        else if ( (LA29_3==43) && (synpred1_InternalMickeyLang())) {s = 15;}

                        else if ( (LA29_3==44) && (synpred1_InternalMickeyLang())) {s = 16;}

                        else if ( (LA29_3==45) && (synpred1_InternalMickeyLang())) {s = 17;}

                        else if ( (LA29_3==46) && (synpred1_InternalMickeyLang())) {s = 18;}

                        else if ( (LA29_3==47) && (synpred1_InternalMickeyLang())) {s = 19;}

                        else if ( (LA29_3==48) && (synpred1_InternalMickeyLang())) {s = 20;}

                        else if ( (LA29_3==49) && (synpred1_InternalMickeyLang())) {s = 21;}

                        else if ( (LA29_3==50) && (synpred1_InternalMickeyLang())) {s = 22;}

                        else if ( (LA29_3==35) && (synpred1_InternalMickeyLang())) {s = 23;}

                        else if ( (LA29_3==36) && (synpred1_InternalMickeyLang())) {s = 24;}

                        else if ( (LA29_3==37) && (synpred1_InternalMickeyLang())) {s = 25;}

                        else if ( (LA29_3==38) && (synpred1_InternalMickeyLang())) {s = 26;}

                        else if ( (LA29_3==31) && (synpred1_InternalMickeyLang())) {s = 27;}

                        else if ( (LA29_3==32) && (synpred1_InternalMickeyLang())) {s = 28;}

                        else if ( (LA29_3==33) && (synpred1_InternalMickeyLang())) {s = 29;}

                        else if ( (LA29_3==34) && (synpred1_InternalMickeyLang())) {s = 30;}

                        else if ( (LA29_3==29) && (synpred1_InternalMickeyLang())) {s = 31;}

                        else if ( (LA29_3==30) && (synpred1_InternalMickeyLang())) {s = 32;}

                        else if ( (LA29_3==22) && (synpred1_InternalMickeyLang())) {s = 33;}

                        else if ( (LA29_3==28) && (synpred1_InternalMickeyLang())) {s = 34;}

                        else if ( (LA29_3==27) && (synpred1_InternalMickeyLang())) {s = 35;}

                        else if ( (LA29_3==EOF) && (synpred1_InternalMickeyLang())) {s = 36;}

                        else if ( (LA29_3==16) && (synpred1_InternalMickeyLang())) {s = 37;}

                        else if ( (LA29_3==67) && (synpred1_InternalMickeyLang())) {s = 38;}

                        else if ( (LA29_3==63) && (synpred1_InternalMickeyLang())) {s = 39;}

                        else if ( (LA29_3==15) && (synpred1_InternalMickeyLang())) {s = 40;}

                        else if ( (LA29_3==65) && (synpred1_InternalMickeyLang())) {s = 41;}

                        else if ( (LA29_3==68) && (synpred1_InternalMickeyLang())) {s = 42;}

                        else if ( (LA29_3==62) && (synpred1_InternalMickeyLang())) {s = 43;}

                        else if ( (LA29_3==71) && (synpred1_InternalMickeyLang())) {s = 44;}

                        else if ( (LA29_3==13) && (synpred1_InternalMickeyLang())) {s = 45;}

                        else if ( (LA29_3==21) && (synpred1_InternalMickeyLang())) {s = 46;}

                        else if ( (LA29_3==91) && (synpred1_InternalMickeyLang())) {s = 47;}

                        else if ( (LA29_3==105) && (synpred1_InternalMickeyLang())) {s = 48;}

                        else if ( (LA29_3==108) && (synpred1_InternalMickeyLang())) {s = 49;}

                        else if ( (LA29_3==25) && (synpred1_InternalMickeyLang())) {s = 50;}

                        else if ( (LA29_3==19) && (synpred1_InternalMickeyLang())) {s = 51;}

                        else if ( (LA29_3==76) && (synpred1_InternalMickeyLang())) {s = 52;}

                        else if ( (LA29_3==77) && (synpred1_InternalMickeyLang())) {s = 53;}

                        else if ( (LA29_3==123) && (synpred1_InternalMickeyLang())) {s = 54;}

                        else if ( (LA29_3==124) && (synpred1_InternalMickeyLang())) {s = 55;}

                        else if ( (LA29_3==125) && (synpred1_InternalMickeyLang())) {s = 56;}

                        else if ( (LA29_3==126) && (synpred1_InternalMickeyLang())) {s = 57;}

                        else if ( (LA29_3==69) && (synpred1_InternalMickeyLang())) {s = 58;}

                        else if ( (LA29_3==70) && (synpred1_InternalMickeyLang())) {s = 59;}

                        else if ( (LA29_3==78) && (synpred1_InternalMickeyLang())) {s = 60;}

                        else if ( (LA29_3==79) && (synpred1_InternalMickeyLang())) {s = 61;}

                        else if ( (LA29_3==75) && (synpred1_InternalMickeyLang())) {s = 62;}

                        else if ( (LA29_3==80) && (synpred1_InternalMickeyLang())) {s = 63;}

                        else if ( (LA29_3==81) && (synpred1_InternalMickeyLang())) {s = 64;}

                        else if ( (LA29_3==83) && (synpred1_InternalMickeyLang())) {s = 65;}

                        else if ( (LA29_3==84) && (synpred1_InternalMickeyLang())) {s = 66;}

                        else if ( (LA29_3==85) && (synpred1_InternalMickeyLang())) {s = 67;}

                        else if ( (LA29_3==26) && (synpred1_InternalMickeyLang())) {s = 68;}

                        else if ( (LA29_3==104) && (synpred1_InternalMickeyLang())) {s = 69;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_4==56) && (synpred1_InternalMickeyLang())) {s = 70;}

                        else if ( (LA29_4==57) && (synpred1_InternalMickeyLang())) {s = 71;}

                        else if ( (LA29_4==RULE_ID) && (synpred1_InternalMickeyLang())) {s = 72;}

                        else if ( (LA29_4==30) ) {s = 73;}

                        else if ( (LA29_4==RULE_NUMBER) && (synpred1_InternalMickeyLang())) {s = 74;}

                        else if ( (LA29_4==RULE_STRING) && (synpred1_InternalMickeyLang())) {s = 75;}

                        else if ( (LA29_4==87) && (synpred1_InternalMickeyLang())) {s = 76;}

                        else if ( (LA29_4==88) && (synpred1_InternalMickeyLang())) {s = 77;}

                        else if ( (LA29_4==89) && (synpred1_InternalMickeyLang())) {s = 78;}

                        else if ( (LA29_4==90) && (synpred1_InternalMickeyLang())) {s = 79;}

                        else if ( (LA29_4==14) && (synpred1_InternalMickeyLang())) {s = 80;}

                        else if ( (LA29_4==59) && (synpred1_InternalMickeyLang())) {s = 81;}

                        else if ( (LA29_4==60) && (synpred1_InternalMickeyLang())) {s = 82;}

                        else if ( (LA29_4==61) && (synpred1_InternalMickeyLang())) {s = 83;}

                        else if ( (LA29_4==64) && (synpred1_InternalMickeyLang())) {s = 84;}

                        else if ( (LA29_4==66) && (synpred1_InternalMickeyLang())) {s = 85;}

                        else if ( (LA29_4==EOF||LA29_4==13||(LA29_4>=15 && LA29_4<=16)||LA29_4==19||(LA29_4>=21 && LA29_4<=22)||(LA29_4>=24 && LA29_4<=29)||(LA29_4>=31 && LA29_4<=55)||(LA29_4>=62 && LA29_4<=63)||LA29_4==65||(LA29_4>=67 && LA29_4<=71)||(LA29_4>=75 && LA29_4<=81)||(LA29_4>=83 && LA29_4<=85)||LA29_4==91||(LA29_4>=104 && LA29_4<=105)||LA29_4==108||(LA29_4>=123 && LA29_4<=126)) ) {s = 5;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_86 = input.LA(1);

                         
                        int index29_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMickeyLang()) ) {s = 85;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_86);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\21\uffff";
    static final String DFA62_eofS =
        "\21\uffff";
    static final String DFA62_minS =
        "\1\133\1\134\3\135\4\uffff\1\4\4\uffff\1\152\2\uffff";
    static final String DFA62_maxS =
        "\1\154\1\157\1\135\1\157\1\137\4\uffff\1\4\4\uffff\1\153\2\uffff";
    static final String DFA62_acceptS =
        "\5\uffff\1\3\1\4\1\1\1\2\1\uffff\1\11\1\10\1\7\1\12\1\uffff\1\6\1\5";
    static final String DFA62_specialS =
        "\21\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\4\1\7\1\10\1\5\16\uffff\2\6",
            "\1\11",
            "\1\14\1\12\1\13\17\uffff\1\15",
            "\1\7\1\10\1\5",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3620:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMickeyFile_in_entryRuleMickeyFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMickeyFile122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFile143 = new BitSet(new long[]{0x0000000002202002L,0x0000120008000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_ruleMickeyFile164 = new BitSet(new long[]{0x0000000002202002L,0x0000120008000000L});
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
    public static final BitSet FOLLOW_16_in_ruleMickeyFunction527 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleMickeyFunction540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFunction563 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMickeyFunction577 = new BitSet(new long[]{0x0000000000100000L,0x0080003800000100L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleMickeyFunction599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMickeyFunction611 = new BitSet(new long[]{0x0000000000100000L,0x0080003800000100L});
    public static final BitSet FOLLOW_20_in_ruleMickeyFunction625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleActionStatement708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement725 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleActionStatement751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleContentUri948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUri965 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleContentUri983 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1004 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleContentUriSegment1127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1144 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContentUriSegment1161 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleContentUriSegment1180 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24_in_ruleContentUriSegment1217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContentUriSegment1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMigrationBlock1336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationBlock1353 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_26_in_ruleMigrationBlock1371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMigrationBlock1394 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock1408 = new BitSet(new long[]{0x0000000000100000L,0x0000120008000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1430 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock1442 = new BitSet(new long[]{0x0000000000100000L,0x0000120008000000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationBlock1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1639 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleExprConcat1666 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1700 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1795 = new BitSet(new long[]{0x0000000011400002L});
    public static final BitSet FOLLOW_24_in_ruleExprMult1824 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_22_in_ruleExprMult1853 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_28_in_ruleExprMult1882 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1919 = new BitSet(new long[]{0x0000000011400002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2014 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_ruleExprAdd2043 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_30_in_ruleExprAdd2072 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2109 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2204 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_31_in_ruleExprBit2233 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_32_in_ruleExprBit2262 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_33_in_ruleExprBit2291 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_34_in_ruleExprBit2320 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2357 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2452 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_35_in_ruleExprRelate2481 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_36_in_ruleExprRelate2510 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_37_in_ruleExprRelate2539 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_38_in_ruleExprRelate2568 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2605 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2700 = new BitSet(new long[]{0x0007FF8000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2729 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2758 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2787 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2816 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2845 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2874 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2903 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual2932 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual2961 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_48_in_ruleExprEqual2990 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_49_in_ruleExprEqual3019 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_50_in_ruleExprEqual3048 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3085 = new BitSet(new long[]{0x0007FF8000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3180 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExprAnd3207 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3241 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3336 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExprOr3363 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3397 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3492 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNullExpression3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNullExpression3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNullExpression3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3880 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3920 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3932 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4086 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4107 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression4154 = new BitSet(new long[]{0x1000000000004000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4186 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4233 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4274 = new BitSet(new long[]{0x3B00000040004070L,0x000000000780000DL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4295 = new BitSet(new long[]{0x3B00000040004070L,0x000000000780000DL});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4317 = new BitSet(new long[]{0xFB00000040004070L,0x000000000780000DL});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4331 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4352 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4400 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4417 = new BitSet(new long[]{0x3B00000041004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression4436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4477 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression4490 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4511 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4556 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4568 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4601 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4622 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimaryExpression4663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCase4767 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCase4800 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement4913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleSelectStatement4926 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4947 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSelectStatement4962 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement4983 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleSelectStatement4997 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_15_in_ruleSelectStatement5015 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5133 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOrderingTermList5146 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5167 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5262 = new BitSet(new long[]{0x0000000000000002L,0x7800000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5313 = new BitSet(new long[]{0x0000000000000002L,0x7800000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSelectExpression5407 = new BitSet(new long[]{0x3B00000041004070L,0x0000000007800605L});
    public static final BitSet FOLLOW_73_in_ruleSelectExpression5426 = new BitSet(new long[]{0x3B00000041004070L,0x0000000007800605L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5463 = new BitSet(new long[]{0x3B00000041004070L,0x0000000007800605L});
    public static final BitSet FOLLOW_24_in_ruleSelectExpression5497 = new BitSet(new long[]{0x0000000004000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5537 = new BitSet(new long[]{0x0000000004000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_26_in_ruleSelectExpression5551 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5572 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5587 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression5623 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression5659 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5774 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSelectList5787 = new BitSet(new long[]{0x3B00000041004070L,0x0000000007800605L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5808 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5992 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGroupByExpressions6005 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6026 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6210 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleOrderingTerm6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOrderingTerm6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6373 = new BitSet(new long[]{0x0000000000000002L,0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6394 = new BitSet(new long[]{0x0000000000000002L,0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource6431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable6644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSingleSourceTable6657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceSelectStatement6773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6794 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceSelectStatement6806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSingleSourceSelectStatement6819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceJoin6926 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6947 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceJoin6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJoinStatement7057 = new BitSet(new long[]{0x0000000000000000L,0x00000000003A0000L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement7091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000240000L});
    public static final BitSet FOLLOW_82_in_ruleJoinStatement7122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement7161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7225 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7258 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResultColumn7393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralValue7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLiteralValue7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralValue7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateTableStatement8178 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTableStatement8196 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTableStatement8222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateTableStatement8256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8277 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8311 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8326 = new BitSet(new long[]{0x0000000000000000L,0x0019400000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8347 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTableStatement8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateViewStatement8453 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateViewStatement8471 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateViewStatement8497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement8514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCreateViewStatement8531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateTriggerStatement8635 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTriggerStatement8653 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8696 = new BitSet(new long[]{0x0000000000000000L,0x0000003F00000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement8721 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement8750 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8779 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8890 = new BitSet(new long[]{0x0000000000000000L,0x0000004000400000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement8916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8933 = new BitSet(new long[]{0x0000000000008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTriggerStatement8951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8968 = new BitSet(new long[]{0x0000000000008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCreateTriggerStatement8991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9011 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000008L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement9029 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000008L});
    public static final BitSet FOLLOW_67_in_ruleCreateTriggerStatement9056 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9077 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9091 = new BitSet(new long[]{0x8000000000000000L,0x0080003800000100L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement9125 = new BitSet(new long[]{0x8000000000000000L,0x0080003800000100L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9147 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement9159 = new BitSet(new long[]{0x8000000000000000L,0x0080003800000100L});
    public static final BitSet FOLLOW_63_in_ruleCreateTriggerStatement9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAlterTableRenameStatement9267 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleAlterTableRenameStatement9279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9299 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleAlterTableRenameStatement9311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAlterTableAddColumnStatement9416 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleAlterTableAddColumnStatement9428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9448 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleAlterTableAddColumnStatement9460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement9527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropTableStatement9564 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleDropTableStatement9576 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropTableStatement9594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropTriggerStatement9711 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleDropTriggerStatement9723 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropTriggerStatement9741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropViewStatement9858 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleDropViewStatement9870 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropViewStatement9888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement9958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateIndexStatement10005 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleCreateIndexStatement10023 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleCreateIndexStatement10049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCreateIndexStatement10083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10103 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateIndexStatement10115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10136 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateIndexStatement10149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10170 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateIndexStatement10184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleDropIndexStatement10267 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10279 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleDropIndexStatement10297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef10428 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef10454 = new BitSet(new long[]{0x0040000000000002L,0x000D400000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef10475 = new BitSet(new long[]{0x0040000000000002L,0x000D400000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint10522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleColumnConstraint10569 = new BitSet(new long[]{0x0000000000000002L,0x000200000000C000L});
    public static final BitSet FOLLOW_78_in_ruleColumnConstraint10588 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_79_in_ruleColumnConstraint10625 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleColumnConstraint10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleColumnConstraint10701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleColumnConstraint10752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleColumnConstraint10803 = new BitSet(new long[]{0x0000000040004060L,0x0000000007800000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint10853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleColumnConstraint10865 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleColumnConstraint10886 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColumnConstraint10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint10935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint10945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint10992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleUniqueTableConstraint11129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11146 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleUniqueTableConstraint11165 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUniqueTableConstraint11177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11198 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleUniqueTableConstraint11211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11232 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleUniqueTableConstraint11246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rulePrimaryConstraint11351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11368 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_rulePrimaryConstraint11387 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryConstraint11399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11420 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryConstraint11433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11454 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryConstraint11468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleCheckTableConstraint11573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint11590 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleCheckTableConstraint11609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCheckTableConstraint11621 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11642 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCheckTableConstraint11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn11700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11745 = new BitSet(new long[]{0x0000000000000002L,0x002000000000C000L});
    public static final BitSet FOLLOW_117_in_ruleIndexedColumn11758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11775 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleIndexedColumn11801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleIndexedColumn11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue11889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValue11984 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue12005 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultValue12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause12054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause12064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleConflictClause12101 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleConflictClause12113 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleDeleteStatement12390 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDeleteStatement12402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement12422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleDeleteStatement12435 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement12504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleInsertStatement12543 = new BitSet(new long[]{0x0010000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_52_in_ruleInsertStatement12556 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement12577 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_119_in_ruleInsertStatement12598 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleInsertStatement12611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12631 = new BitSet(new long[]{0x0000000000004000L,0x0204000000000100L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement12644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12664 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement12677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12697 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement12711 = new BitSet(new long[]{0x0000000000000000L,0x0204000000000100L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement12728 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement12740 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12761 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement12774 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12795 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement12809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement12837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement12857 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement12907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement12917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleUpdateStatement12954 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_52_in_ruleUpdateStatement12967 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement12988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement13010 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleUpdateStatement13022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13043 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000800L});
    public static final BitSet FOLLOW_15_in_ruleUpdateStatement13056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13077 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleUpdateStatement13092 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13206 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUpdateColumnExpression13218 = new BitSet(new long[]{0x3B00000040004070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSignedNumber13326 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13440 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleQualifiedName13459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13474 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_123_in_ruleCompoundOperator13535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleCompoundOperator13552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleCompoundOperator13569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType13631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSqliteDataType13648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSqliteDataType13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType13699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleColumnType13761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleColumnType13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleColumnType13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType13812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleColumnType13829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleConflictResolution13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleConflictResolution13891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleConflictResolution13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution13925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleConflictResolution13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang3863 = new BitSet(new long[]{0x0000000000000002L});

}