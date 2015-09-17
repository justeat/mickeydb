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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'function'", "'('", "','", "')'", "':'", "'{'", "';'", "'}'", "'action'", "'as'", "'unique'", "'/'", "'param'", "'like'", "'migrate'", "'from'", "'||'", "'*'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'check'", "'constraint'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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

                if ( (LA1_0==13||LA1_0==21||LA1_0==27||LA1_0==92||LA1_0==106||LA1_0==109) ) {
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
            case 92:
            case 106:
            case 109:
                {
                alt2=3;
                }
                break;
            case 27:
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

                if ( (LA6_0==73||(LA6_0>=100 && LA6_0<=102)||LA6_0==119) ) {
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:338:1: ruleActionStatement returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'as' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_unique_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_uri_2_0 = null;

        EObject lv_params_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:341:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'as' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}' )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'as' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}' )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'as' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}' )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'as' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}' )?
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleActionStatement763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getAsKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:386:1: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:387:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:387:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:388:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActionStatementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionStatementAccess().getTypeTableDefinitionCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActionStatement786);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:401:2: ( (lv_unique_5_0= 'unique' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:402:1: (lv_unique_5_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:402:1: (lv_unique_5_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:403:3: lv_unique_5_0= 'unique'
                    {
                    lv_unique_5_0=(Token)match(input,23,FOLLOW_23_in_ruleActionStatement804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unique_5_0, grammarAccess.getActionStatementAccess().getUniqueUniqueKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionStatementRule());
                      	        }
                             		setWithLastConsumed(current, "unique", true, "unique");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:416:3: (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:416:5: otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleActionStatement831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActionStatementAccess().getLeftCurlyBracketKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:420:1: ( (lv_params_7_0= ruleContentUriQueryParam ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:421:1: (lv_params_7_0= ruleContentUriQueryParam )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:421:1: (lv_params_7_0= ruleContentUriQueryParam )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:422:3: lv_params_7_0= ruleContentUriQueryParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getActionStatementAccess().getParamsContentUriQueryParamParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleContentUriQueryParam_in_ruleActionStatement852);
                    	    lv_params_7_0=ruleContentUriQueryParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_7_0, 
                    	              		"ContentUriQueryParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleActionStatement865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getActionStatementAccess().getRightCurlyBracketKeyword_6_2());
                          
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
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRuleFunctionArg"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:450:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:451:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:452:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg903);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg913); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:459:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:462:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:463:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:463:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:463:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:463:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:464:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:464:1: (lv_type_0_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:465:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg959);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:481:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:482:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:482:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:483:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg976); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:507:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:508:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:509:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri1017);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri1027); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:516:1: ruleContentUri returns [EObject current=null] : ( () (otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_segments_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:519:28: ( ( () (otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:520:1: ( () (otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:520:1: ( () (otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:520:2: () (otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:520:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:521:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContentUriAccess().getContentUriAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:526:2: (otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:526:4: otherlv_1= '/' ( (lv_segments_2_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleContentUri1074); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getContentUriAccess().getSolidusKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:530:1: ( (lv_segments_2_0= ruleContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:531:1: (lv_segments_2_0= ruleContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:531:1: (lv_segments_2_0= ruleContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:532:3: lv_segments_2_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1095);
            	    lv_segments_2_0=ruleContentUriSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContentUriRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_2_0, 
            	              		"ContentUriSegment");
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
    // $ANTLR end "ruleContentUri"


    // $ANTLR start "entryRuleContentUriQueryParam"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:556:1: entryRuleContentUriQueryParam returns [EObject current=null] : iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF ;
    public final EObject entryRuleContentUriQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriQueryParam = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:557:2: (iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:558:2: iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriQueryParamRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriQueryParam_in_entryRuleContentUriQueryParam1133);
            iv_ruleContentUriQueryParam=ruleContentUriQueryParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriQueryParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriQueryParam1143); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentUriQueryParam"


    // $ANTLR start "ruleContentUriQueryParam"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:565:1: ruleContentUriQueryParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleContentUriQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_like_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:568:28: ( (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:569:1: (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:569:1: (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:569:3: otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleContentUriQueryParam1180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriQueryParamAccess().getParamKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:573:1: ( (lv_like_1_0= 'like' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:574:1: (lv_like_1_0= 'like' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:574:1: (lv_like_1_0= 'like' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:575:3: lv_like_1_0= 'like'
                    {
                    lv_like_1_0=(Token)match(input,26,FOLLOW_26_in_ruleContentUriQueryParam1198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_like_1_0, grammarAccess.getContentUriQueryParamAccess().getLikeLikeKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriQueryParamRule());
                      	        }
                             		setWithLastConsumed(current, "like", true, "like");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:588:3: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:589:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:589:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:590:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContentUriQueryParamRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriQueryParam1232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getContentUriQueryParamAccess().getColumnColumnSourceCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleContentUriQueryParam"


    // $ANTLR start "entryRuleContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:609:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:610:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:611:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1268);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1278); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:618:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ) ;
    public final EObject ruleContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:621:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:622:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:622:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:622:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:622:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:623:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:623:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:624:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1320); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:641:6: ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:641:6: ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:641:7: () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:641:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:642:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleContentUriSegment1353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:651:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:652:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:652:1: (otherlv_3= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:653:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getContentUriSegmentAccess().getParamColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleContentUriSegment1385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getRightCurlyBracketKeyword_1_3());
                          
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:676:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:677:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:678:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1422);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1432); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:685:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:688:28: ( ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:2: () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:690:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMigrationBlock1478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:699:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:700:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:700:1: (lv_name_2_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:701:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationBlock1495); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:717:2: (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:717:4: otherlv_3= 'from' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleMigrationBlock1513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMigrationBlockAccess().getFromKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:721:1: ( ( ruleQualifiedName ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:722:1: ( ruleQualifiedName )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:722:1: ( ruleQualifiedName )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:723:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMigrationBlockRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getFromMigrationBlockCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMigrationBlock1536);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock1550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:740:1: ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==92||LA14_0==106||LA14_0==109) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:740:2: ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:740:2: ( (lv_statements_6_0= ruleDDLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:741:1: (lv_statements_6_0= ruleDDLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:741:1: (lv_statements_6_0= ruleDDLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:742:3: lv_statements_6_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1572);
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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock1584); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_5_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleMigrationBlock1598); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:774:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:775:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:776:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1634);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression1644); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:783:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:786:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:788:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression1690);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:804:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:805:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:806:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat1724);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat1734); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:813:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:816:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:817:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:817:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:818:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1781);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:826:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:826:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:826:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:832:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:833:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:833:1: (lv_op_2_0= '||' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:834:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,29,FOLLOW_29_in_ruleExprConcat1808); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:847:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:848:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:848:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:849:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1842);
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
            	    break loop15;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:873:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:874:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:875:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1880);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1890); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:882:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:885:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:886:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:886:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:887:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1937);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:895:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24||(LA17_0>=30 && LA17_0<=31)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:895:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:895:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:896:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:901:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:902:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:902:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:903:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:903:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:904:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_30_in_ruleExprMult1966); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:916:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleExprMult1995); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:928:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,31,FOLLOW_31_in_ruleExprMult2024); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:943:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:944:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:944:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:945:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2061);
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
            	    break loop17;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:969:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:970:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:971:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd2099);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd2109); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:978:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:981:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:982:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:982:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:983:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2156);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:991:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:991:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:991:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:992:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:997:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:998:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:998:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:999:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:999:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==32) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==33) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1000:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_32_in_ruleExprAdd2185); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1012:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_33_in_ruleExprAdd2214); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1027:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1028:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1028:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1029:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2251);
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
            	    break loop19;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1053:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1054:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1055:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2289);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2299); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1062:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1065:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1067:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2346);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1075:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=34 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1075:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1075:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1076:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1081:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1082:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1082:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1083:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1083:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1084:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleExprBit2375); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1096:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleExprBit2404); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1108:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_36_in_ruleExprBit2433); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1120:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_37_in_ruleExprBit2462); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1135:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1136:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1136:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1137:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2499);
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1161:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1162:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1163:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2537);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2547); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1170:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1173:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1174:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1174:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1175:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2594);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1183:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=38 && LA23_0<=41)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1183:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1183:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1184:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1189:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1190:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1190:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1191:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1191:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1192:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,38,FOLLOW_38_in_ruleExprRelate2623); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1204:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,39,FOLLOW_39_in_ruleExprRelate2652); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1216:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,40,FOLLOW_40_in_ruleExprRelate2681); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1228:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,41,FOLLOW_41_in_ruleExprRelate2710); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1243:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1244:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1244:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1245:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2747);
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
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1269:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1270:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1271:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2785);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2795); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1278:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1281:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1282:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1282:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1283:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2842);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1291:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==26||(LA25_0>=42 && LA25_0<=52)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1291:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1291:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1292:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1297:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1298:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1298:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1299:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1299:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt24=12;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt24=7;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt24=8;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt24=9;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt24=10;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt24=11;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt24=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1300:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2871); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1312:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2900); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1324:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2929); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1336:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual2958); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1348:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual2987); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1360:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual3016); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1372:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual3045); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1384:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual3074); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1396:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,26,FOLLOW_26_in_ruleExprEqual3103); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1408:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,50,FOLLOW_50_in_ruleExprEqual3132); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1420:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,51,FOLLOW_51_in_ruleExprEqual3161); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1432:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,52,FOLLOW_52_in_ruleExprEqual3190); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1447:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1448:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1448:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1449:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3227);
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
            	    break loop25;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1473:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1474:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1475:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3265);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3275); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1482:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1485:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1486:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1486:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1487:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3322);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1495:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1495:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1495:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1496:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1501:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1502:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1502:1: (lv_op_2_0= 'and' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1503:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_53_in_ruleExprAnd3349); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1516:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1517:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1517:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1518:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3383);
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
            	    break loop26;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1542:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1543:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1544:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3421);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3431); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1551:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1554:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1555:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1555:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1556:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3478);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1564:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==54) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1564:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1564:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1565:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1570:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1571:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1571:1: (lv_op_2_0= 'or' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1572:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_54_in_ruleExprOr3505); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1585:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1586:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1586:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1587:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3539);
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
            	    break loop27;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1611:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1612:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1613:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3577);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3587); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1620:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1623:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1624:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1624:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1625:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3634);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1633:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=55 && LA28_0<=57)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1633:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1633:2: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1634:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1639:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1640:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1640:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1641:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3664);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1665:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1666:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1667:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3702);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3712); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1674:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1677:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=56 && LA30_0<=57)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:2: ( () otherlv_1= 'is null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:3: () otherlv_1= 'is null'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1678:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1679:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleNullExpression3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1689:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1689:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1689:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1689:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1690:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1695:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==56) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==57) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1695:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleNullExpression3789); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1700:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleNullExpression3807); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1712:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1713:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1714:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3845);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3855); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1721:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1724:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt40=10;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1726:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1735:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1736:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1736:1: (otherlv_2= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1737:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1749:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1749:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1749:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1749:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1750:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1759:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1760:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1760:1: (otherlv_5= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1761:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1773:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1773:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1773:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1773:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1774:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt32=3;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1785:1: (otherlv_7= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1786:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4022); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4034); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1802:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1802:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1802:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1802:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1803:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1803:1: (otherlv_9= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4062); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4074); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1819:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==30) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==RULE_ID) ) {
                                alt31=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1819:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1819:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1820:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1820:1: (lv_all_11_0= '*' )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1821:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression4093); if (state.failed) return current;
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
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1835:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1835:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1836:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1836:1: (otherlv_12= RULE_ID )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1837:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4132); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1849:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1849:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1850:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1850:1: (otherlv_13= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1851:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4160); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1863:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1863:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1863:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1863:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1869:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1870:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1870:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1871:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4199);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1888:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1888:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1888:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1888:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1889:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1898:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1899:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1899:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1900:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4249);
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

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1921:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1921:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1921:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1921:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1922:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1927:2: ( (lv_not_21_0= 'not' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==61) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1928:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1928:1: (lv_not_21_0= 'not' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1929:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4296); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1942:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==62) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:1: (lv_exists_22_0= 'exists' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1944:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4328); if (state.failed) return current;
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

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1961:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1962:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1962:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1963:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4375);
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

                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1984:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1984:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1984:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1984:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1985:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1994:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_NUMBER)||LA35_0==14||LA35_0==33||(LA35_0>=58 && LA35_0<=59)||(LA35_0>=61 && LA35_0<=63)||(LA35_0>=66 && LA35_0<=67)||(LA35_0>=88 && LA35_0<=91)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1995:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1995:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1996:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4437);
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2012:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==68) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2013:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2013:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2014:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4459);
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
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2030:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==64) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2030:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4473); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2034:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2035:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2035:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2036:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4494);
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

                    otherlv_32=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2057:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2057:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2057:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2057:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2058:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2063:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2064:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2064:1: (lv_name_34_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2065:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4542); if (state.failed) return current;
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

                    otherlv_35=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2085:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==30) ) {
                        alt39=1;
                    }
                    else if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_NUMBER)||LA39_0==14||LA39_0==33||(LA39_0>=58 && LA39_0<=59)||(LA39_0>=61 && LA39_0<=63)||(LA39_0>=66 && LA39_0<=67)||(LA39_0>=88 && LA39_0<=91)) ) {
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2085:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2085:2: ( (lv_all_36_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2086:1: (lv_all_36_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2086:1: (lv_all_36_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2087:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression4578); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2101:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2101:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2101:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2101:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2102:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2102:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2103:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4619);
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2119:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==15) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2119:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression4632); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2123:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2124:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2124:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2125:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4653);
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
                            	    break loop38;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2146:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2146:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2146:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2146:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2147:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,66,FOLLOW_66_in_rulePrimaryExpression4698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2160:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2162:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4731);
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

                    otherlv_45=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression4743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2182:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2183:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2183:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2184:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4764);
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

                    otherlv_47=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2205:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2205:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2205:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2205:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2206:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,67,FOLLOW_67_in_rulePrimaryExpression4805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2215:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2216:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2216:1: (otherlv_50= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2217:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4825); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2236:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2237:2: (iv_ruleCase= ruleCase EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2238:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4862);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4872); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2245:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2248:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2249:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2249:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2249:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleCase4909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2253:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2254:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2254:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2255:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4930);
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

            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleCase4942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2276:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2276:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2277:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4963);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2301:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2302:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2303:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4999);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement5009); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2310:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2313:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2314:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2314:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2314:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2314:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2315:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2315:1: (lv_core_0_0= ruleSelectCore )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2316:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement5055);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2332:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==70) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2332:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleSelectStatement5068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2336:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2337:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2337:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2338:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5089);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2354:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==71) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2354:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleSelectStatement5104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2358:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2359:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2359:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2360:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5125);
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2376:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==15||LA43_0==72) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2376:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2376:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==72) ) {
                                alt42=1;
                            }
                            else if ( (LA42_0==15) ) {
                                alt42=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                throw nvae;
                            }
                            switch (alt42) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2376:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleSelectStatement5139); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2381:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSelectStatement5157); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2385:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2387:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5179);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2411:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2412:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2413:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5219);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5229); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2420:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2425:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2425:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2426:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5275);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2442:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==15) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2442:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleOrderingTermList5288); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2446:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2447:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2447:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2448:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5309);
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
            	    break loop45;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2472:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2473:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2474:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5347);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5357); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2481:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2484:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2485:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2485:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2486:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5404);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=123 && LA46_0<=126)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2495:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2500:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2501:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2501:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2502:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5434);
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2518:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2519:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2519:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2520:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5455);
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
            	    break loop46;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2544:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2545:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2546:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5493);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5503); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2553:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2556:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2557:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2557:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2557:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2557:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2558:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleSelectExpression5549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2567:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==74) ) {
                alt47=1;
            }
            else if ( (LA47_0==75) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2567:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2567:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2568:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2568:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2569:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5568); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2583:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2583:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2584:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2584:1: (lv_all_3_0= 'all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2585:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5605); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2598:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_NUMBER)||LA48_0==14||LA48_0==33||(LA48_0>=58 && LA48_0<=59)||(LA48_0>=61 && LA48_0<=63)||(LA48_0>=66 && LA48_0<=67)||(LA48_0>=88 && LA48_0<=91)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2598:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2598:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2599:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2599:1: (lv_allColumns_4_0= '*' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2600:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,30,FOLLOW_30_in_ruleSelectExpression5639); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2614:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2614:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2615:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2615:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2616:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5679);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2632:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2632:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleSelectExpression5693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2636:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2637:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2637:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2638:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5714);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2654:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==76) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2654:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression5729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2658:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2659:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2659:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2660:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5750);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2676:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==77) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2676:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression5765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2680:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2681:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2681:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2682:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5786);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2698:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2698:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,78,FOLLOW_78_in_ruleSelectExpression5801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2702:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2703:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2703:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2704:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5822);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2728:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2729:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2730:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5860);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5870); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2737:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2740:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2742:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2742:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2743:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5916);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2759:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==15) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2759:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSelectList5929); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2763:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2764:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2764:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2765:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5950);
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
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2789:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2790:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2791:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5988);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions5998); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2798:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2801:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2802:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2802:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2803:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2803:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2804:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6043);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2828:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2829:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2830:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6078);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions6088); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2837:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2840:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2841:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2841:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2841:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2841:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2842:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2842:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2843:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6134);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2859:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==15) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2859:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGroupByExpressions6147); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2863:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2864:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2864:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2865:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6168);
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
            	    break loop54;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2889:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2890:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2891:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6206);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions6216); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2898:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2901:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2902:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2902:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2903:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2903:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2904:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6261);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2928:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2929:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2930:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6296);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6306); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2937:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2940:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2941:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2941:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2941:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2941:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2942:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2942:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2943:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6352);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==79) ) {
                alt55=1;
            }
            else if ( (LA55_0==80) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2960:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2960:1: (lv_asc_1_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2961:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,79,FOLLOW_79_in_ruleOrderingTerm6371); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2975:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2975:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2976:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2976:1: (lv_desc_2_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2977:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,80,FOLLOW_80_in_ruleOrderingTerm6408); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2998:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2999:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3000:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6459);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6469); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3007:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3010:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3011:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3012:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3012:1: (lv_source_0_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3013:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6515);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3029:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=81 && LA56_0<=82)||(LA56_0>=84 && LA56_0<=86)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3030:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3030:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3031:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6536);
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
            	    break loop56;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3055:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3056:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3057:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource6573);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource6583); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3064:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3067:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3068:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3068:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            else if ( (LA57_0==14) ) {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==RULE_ID||LA57_2==14) ) {
                    alt57=3;
                }
                else if ( (LA57_2==73) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3069:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6630);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3079:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6657);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3089:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6684);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3105:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3106:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3107:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6719);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6729); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3114:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3117:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3118:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3118:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3118:2: () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3118:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3119:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3124:2: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3125:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3126:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable6786);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3139:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==22) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3139:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleSingleSourceTable6799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3143:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3144:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3144:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3145:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6816); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3169:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3170:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3171:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6859);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6869); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3178:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3181:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3182:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3182:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3182:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3182:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3183:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceSelectStatement6915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3192:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3193:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3193:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3194:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6936);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceSelectStatement6948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3214:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==22) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3214:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSingleSourceSelectStatement6961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3218:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3219:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3219:1: (lv_name_5_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3220:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6978); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3244:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3245:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3246:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7021);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin7031); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3253:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3256:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3257:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3257:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3257:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceJoin7068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3261:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3262:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3262:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3263:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7089);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceJoin7101); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3291:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3292:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3293:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7137);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement7147); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3300:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3303:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3304:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3304:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3304:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3304:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3305:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3310:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==81) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3311:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3311:1: (lv_natural_1_0= 'natural' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3312:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement7199); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3325:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt62=4;
            switch ( input.LA(1) ) {
                case 82:
                    {
                    alt62=1;
                    }
                    break;
                case 84:
                    {
                    alt62=2;
                    }
                    break;
                case 85:
                    {
                    alt62=3;
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3325:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3325:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3325:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3325:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3326:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3326:1: (lv_left_2_0= 'left' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3327:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,82,FOLLOW_82_in_ruleJoinStatement7233); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3340:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==83) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3341:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3341:1: (lv_outer_3_0= 'outer' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3342:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement7264); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3356:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3356:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:1: (lv_inner_4_0= 'inner' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7303); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3372:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3372:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3373:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3373:1: (lv_cross_5_0= 'cross' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3374:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7340); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3391:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3392:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3392:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3393:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7388);
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

            otherlv_8=(Token)match(input,87,FOLLOW_87_in_ruleJoinStatement7400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3413:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3414:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3414:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3415:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7421);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3439:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3440:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3441:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7457);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7467); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3448:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3451:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3452:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3452:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3452:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3452:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3453:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3458:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3459:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3459:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3460:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7522);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3476:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3476:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleResultColumn7535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3480:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3481:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3481:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3482:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7552); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3506:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3507:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3508:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7595);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7605); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3515:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 33:
                {
                alt64=1;
                }
                break;
            case RULE_STRING:
                {
                alt64=2;
                }
                break;
            case 88:
                {
                alt64=3;
                }
                break;
            case 89:
                {
                alt64=4;
                }
                break;
            case 90:
                {
                alt64=5;
                }
                break;
            case 91:
                {
                alt64=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3519:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3520:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3525:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3526:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3526:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3527:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7661);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3545:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3550:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3551:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3551:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3552:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7695); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3569:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3569:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3569:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3569:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3570:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3575:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3576:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3576:1: (lv_literal_5_0= 'null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3577:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,88,FOLLOW_88_in_ruleLiteralValue7735); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3591:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3591:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3591:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3591:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3592:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3597:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3598:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3598:1: (lv_literal_7_0= 'current_time' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3599:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,89,FOLLOW_89_in_ruleLiteralValue7783); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3614:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3619:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3620:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3620:1: (lv_literal_9_0= 'current_date' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3621:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue7831); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3635:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3635:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3635:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3635:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3636:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3641:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3642:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3642:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3643:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,91,FOLLOW_91_in_ruleLiteralValue7879); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3664:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3665:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3666:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7929);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7939); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3673:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3676:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3677:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3677:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt65=10;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3678:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7986);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3688:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8013);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3698:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8040);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3708:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8067);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3718:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8094);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3728:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8121);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3738:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8148);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3748:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8175);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3758:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8202);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3768:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8229);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3784:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3785:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3786:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8264);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8274); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3793:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3796:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3797:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3797:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3797:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3797:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3798:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleCreateTableStatement8320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3807:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==93) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3808:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3808:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,93,FOLLOW_93_in_ruleCreateTableStatement8338); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,94,FOLLOW_94_in_ruleCreateTableStatement8364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3826:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3827:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3827:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3828:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8381); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCreateTableStatement8398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3848:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3849:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3849:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3850:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8419);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3866:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==15) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==RULE_ID) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3866:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3870:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3871:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3871:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3872:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8453);
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
            	    break loop67;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3888:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==15) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3888:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8468); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3892:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3893:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3893:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3894:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8489);
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
            	    break loop68;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCreateTableStatement8503); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3922:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3923:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3924:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8539);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement8549); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3931:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3934:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3935:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3935:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3935:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3935:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleCreateViewStatement8595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3945:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==93) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3946:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3946:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3947:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,93,FOLLOW_93_in_ruleCreateViewStatement8613); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,95,FOLLOW_95_in_ruleCreateViewStatement8639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3964:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3965:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3965:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3966:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement8656); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCreateViewStatement8673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3986:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3987:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3987:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3988:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8694);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4012:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4013:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4014:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8730);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8740); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4021:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4024:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4025:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4025:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4025:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateTriggerStatement8777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4029:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==93) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4030:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4030:1: (lv_temporary_1_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4031:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,93,FOLLOW_93_in_ruleCreateTriggerStatement8795); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement8821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4048:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4049:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4049:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4050:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8838); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4066:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=97 && LA72_0<=99)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4068:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4068:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 97:
                        {
                        alt71=1;
                        }
                        break;
                    case 98:
                        {
                        alt71=2;
                        }
                        break;
                    case 99:
                        {
                        alt71=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }

                    switch (alt71) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4069:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement8863); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4081:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8892); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4093:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8921); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4108:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt75=1;
                }
                break;
            case 101:
                {
                alt75=2;
                }
                break;
            case 102:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4108:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4108:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4109:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4109:1: (lv_eventType_5_0= 'delete' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4110:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8957); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4124:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4124:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4125:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4125:1: (lv_eventType_6_0= 'insert' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4126:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8994); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4140:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4140:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4140:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4140:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4141:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4141:1: (lv_eventType_7_0= 'update' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4142:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement9032); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4155:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==103) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4155:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement9058); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4159:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4160:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4160:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4161:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9075); if (state.failed) return current;
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4177:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==15) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4177:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCreateTriggerStatement9093); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4181:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4182:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4182:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4183:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9110); if (state.failed) return current;
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
                            	    break loop73;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,87,FOLLOW_87_in_ruleCreateTriggerStatement9133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4203:1: ( (otherlv_13= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4204:1: (otherlv_13= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4204:1: (otherlv_13= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4205:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4216:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==104) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4217:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4217:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4218:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9171); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==68) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,68,FOLLOW_68_in_ruleCreateTriggerStatement9198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4235:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4236:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4236:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4237:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9219);
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

            otherlv_17=(Token)match(input,105,FOLLOW_105_in_ruleCreateTriggerStatement9233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4257:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==73||(LA79_0>=100 && LA79_0<=102)||LA79_0==119) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4257:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4257:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4258:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4258:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4259:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9255);
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

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement9267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4279:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==73||(LA78_0>=100 && LA78_0<=102)||LA78_0==119) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4279:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4279:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4280:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4280:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4281:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9289);
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

                    	    otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement9301); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,65,FOLLOW_65_in_ruleCreateTriggerStatement9317); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4313:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4314:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4315:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9353);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9363); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4322:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4325:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4327:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,106,FOLLOW_106_in_ruleAlterTableRenameStatement9409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,94,FOLLOW_94_in_ruleAlterTableRenameStatement9421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4340:1: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4341:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4341:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4342:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,107,FOLLOW_107_in_ruleAlterTableRenameStatement9453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4357:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4358:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4358:1: (lv_name_5_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4359:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9470); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4383:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4384:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4385:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9511);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9521); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4392:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4395:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4396:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4396:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4396:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleAlterTableAddColumnStatement9558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleAlterTableAddColumnStatement9570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4404:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4405:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4405:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4406:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableAddColumnStatement9602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4421:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4423:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9623);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4447:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4448:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4449:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9659);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement9669); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4456:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4459:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4460:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4460:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4460:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleDropTableStatement9706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleDropTableStatement9718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4468:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==110) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4469:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4469:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4470:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,110,FOLLOW_110_in_ruleDropTableStatement9736); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4483:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4484:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4484:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4485:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9770); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4504:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4505:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4506:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9806);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9816); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4513:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4516:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4517:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4517:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4517:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleDropTriggerStatement9853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleDropTriggerStatement9865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4525:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==110) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4526:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4526:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4527:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,110,FOLLOW_110_in_ruleDropTriggerStatement9883); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4540:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4541:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4541:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4542:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9917); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4561:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4562:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4563:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9953);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9963); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4570:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4573:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4574:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4574:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4574:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleDropViewStatement10000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleDropViewStatement10012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4582:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==110) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4583:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4583:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4584:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,110,FOLLOW_110_in_ruleDropViewStatement10030); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4597:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4599:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement10064); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4618:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4619:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4620:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10100);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement10110); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4627:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4630:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4631:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4631:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4631:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_ruleCreateIndexStatement10147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4635:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==23) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4636:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4636:1: (lv_unique_1_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4637:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,23,FOLLOW_23_in_ruleCreateIndexStatement10165); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleCreateIndexStatement10191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4654:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4655:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4655:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4656:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10208); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,87,FOLLOW_87_in_ruleCreateIndexStatement10225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4676:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4677:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4677:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4678:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleCreateIndexStatement10257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4693:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4694:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4694:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4695:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10278);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4711:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==15) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4711:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleCreateIndexStatement10291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4715:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4716:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4716:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4717:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10312);
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
            	    break loop84;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleCreateIndexStatement10326); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4745:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4746:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4747:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10362);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10372); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4754:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4757:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleDropIndexStatement10409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4766:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==110) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4767:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4767:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4768:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,110,FOLLOW_110_in_ruleDropIndexStatement10439); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4781:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4782:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4782:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4783:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10473); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4802:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4803:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4804:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10509);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10519); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4811:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4814:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4815:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4815:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4815:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4815:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4816:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4821:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4822:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4822:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4823:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef10570); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4840:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4840:1: (lv_type_2_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4841:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef10596);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4857:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==23||LA86_0==56||LA86_0==112||(LA86_0>=114 && LA86_0<=115)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4859:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef10617);
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
            	    break loop86;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4883:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4884:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4885:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10654);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint10664); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4892:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4895:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            int alt91=5;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt91=1;
                }
                break;
            case 56:
                {
                alt91=2;
                }
                break;
            case 23:
                {
                alt91=3;
                }
                break;
            case 114:
                {
                alt91=4;
                }
                break;
            case 115:
                {
                alt91=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4897:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleColumnConstraint10711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4906:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt87=3;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==79) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==80) ) {
                        alt87=2;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4906:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4906:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4907:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4907:1: (lv_asc_2_0= 'asc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4908:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,79,FOLLOW_79_in_ruleColumnConstraint10730); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4922:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4922:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4923:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4923:1: (lv_desc_3_0= 'desc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4924:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,80,FOLLOW_80_in_ruleColumnConstraint10767); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4937:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==113) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4938:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4938:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4939:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,113,FOLLOW_113_in_ruleColumnConstraint10800); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4953:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4953:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4953:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4953:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4954:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleColumnConstraint10843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4963:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==87) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4964:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4964:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4965:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10864);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4982:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4982:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4982:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4982:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4983:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleColumnConstraint10894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4992:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==87) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4993:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4993:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4994:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10915);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5011:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5011:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5011:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5011:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5012:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,114,FOLLOW_114_in_ruleColumnConstraint10945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5021:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5022:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5022:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5023:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10966);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:7: () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5041:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getCheckConstraintAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint10995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getColumnConstraintAccess().getCheckKeyword_4_1());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleColumnConstraint11007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getColumnConstraintAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5054:1: ( (lv_expression_17_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5055:1: (lv_expression_17_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5055:1: (lv_expression_17_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5056:3: lv_expression_17_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11028);
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

                    otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleColumnConstraint11040); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5084:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5085:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5086:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11077);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint11087); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5093:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5096:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5097:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5097:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 115:
                        {
                        alt92=3;
                        }
                        break;
                    case 23:
                        {
                        alt92=1;
                        }
                        break;
                    case 112:
                        {
                        alt92=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt92=1;
                }
                break;
            case 112:
                {
                alt92=2;
                }
                break;
            case 115:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5098:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11134);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5108:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11161);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5118:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11188);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5134:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5135:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11223);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11233); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5143:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5146:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==116) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleUniqueTableConstraint11271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5151:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5152:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5152:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5153:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11288); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUniqueTableConstraint11307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUniqueTableConstraint11319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5177:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5178:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5178:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5179:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11340);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5195:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==15) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5195:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUniqueTableConstraint11353); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5199:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5200:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5200:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5201:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11374);
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
            	    break loop94;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleUniqueTableConstraint11388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5221:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5222:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5222:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5223:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11409);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5247:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5248:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5249:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11445);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11455); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5256:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5259:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5260:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5260:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5260:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5260:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==116) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5260:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_rulePrimaryConstraint11493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5264:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5265:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5265:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5266:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11510); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,112,FOLLOW_112_in_rulePrimaryConstraint11529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePrimaryConstraint11541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5290:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5291:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5291:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5292:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11562);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5308:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==15) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5308:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePrimaryConstraint11575); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5312:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5313:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5313:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5314:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11596);
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
            	    break loop96;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePrimaryConstraint11610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5334:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5335:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5335:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5336:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11631);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5360:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5361:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5362:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11667);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint11677); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5369:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5372:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5373:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5373:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5373:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5373:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==116) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5373:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleCheckTableConstraint11715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5377:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5378:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5378:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5379:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint11732); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_ruleCheckTableConstraint11751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCheckTableConstraint11763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5403:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5404:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5404:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5405:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11784);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCheckTableConstraint11796); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5433:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5434:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5435:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11832);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn11842); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5442:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5445:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5446:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5446:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5446:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5446:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5447:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5447:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5448:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5459:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==117) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5459:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_117_in_ruleIndexedColumn11900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5464:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5464:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5465:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11917); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5481:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt99=3;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==79) ) {
                alt99=1;
            }
            else if ( (LA99_0==80) ) {
                alt99=2;
            }
            switch (alt99) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5481:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5481:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5482:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5482:1: (lv_asc_3_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5483:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,79,FOLLOW_79_in_ruleIndexedColumn11943); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5497:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5497:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5498:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5498:1: (lv_desc_4_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5499:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,80,FOLLOW_80_in_ruleIndexedColumn11980); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5520:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5521:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5522:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12031);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue12041); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5529:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5532:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5533:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5533:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_STRING && LA100_0<=RULE_NUMBER)||LA100_0==33||(LA100_0>=88 && LA100_0<=91)) ) {
                alt100=1;
            }
            else if ( (LA100_0==14) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5533:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5533:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5533:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5533:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5534:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5539:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5540:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5540:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5541:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue12097);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5558:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5558:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5558:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5558:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5559:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValue12126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5568:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5569:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5569:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5570:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue12147);
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

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDefaultValue12159); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5598:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5599:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5600:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause12196);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause12206); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5607:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5610:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5611:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5611:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5611:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleConflictClause12243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,118,FOLLOW_118_in_ruleConflictClause12255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5619:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5620:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5620:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5621:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12276);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5645:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5646:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5647:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12312);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12322); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5654:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5657:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5658:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5658:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt101=1;
                }
                break;
            case 101:
            case 119:
                {
                alt101=2;
                }
                break;
            case 102:
                {
                alt101=3;
                }
                break;
            case 100:
                {
                alt101=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5659:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12369);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5669:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12396);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5679:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12423);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5689:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12450);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5705:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5706:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5707:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12485);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12495); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5714:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5717:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5718:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5718:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5718:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleDeleteStatement12532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDeleteStatement12544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5726:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5727:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5727:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5728:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement12564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5739:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==76) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5739:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_76_in_ruleDeleteStatement12577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5743:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5744:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5744:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5745:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12598);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5769:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5770:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5771:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12636);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement12646); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5778:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5781:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==101) ) {
                alt104=1;
            }
            else if ( (LA104_0==119) ) {
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5782:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleInsertStatement12685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5786:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==54) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5786:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInsertStatement12698); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5790:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5791:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5791:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5792:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement12719);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5809:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,119,FOLLOW_119_in_ruleInsertStatement12740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,120,FOLLOW_120_in_ruleInsertStatement12753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5817:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5818:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5818:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5819:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5830:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==14) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5830:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement12786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5834:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5835:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5835:1: (otherlv_7= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5836:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5847:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==15) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5847:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement12819); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5851:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5852:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5852:1: (otherlv_9= RULE_ID )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5853:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12839); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement12853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5868:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==73||LA109_0==121) ) {
                alt109=1;
            }
            else if ( (LA109_0==114) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5868:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5868:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==121) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==73) ) {
                        alt108=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5868:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5868:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5868:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement12870); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement12882); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5876:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5877:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5877:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5878:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12903);
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5894:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop107:
                            do {
                                int alt107=2;
                                int LA107_0 = input.LA(1);

                                if ( (LA107_0==15) ) {
                                    alt107=1;
                                }


                                switch (alt107) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5894:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement12916); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5898:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5899:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5899:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5900:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12937);
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
                            	    break loop107;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement12951); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5921:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5921:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5922:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5922:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5923:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement12979);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5940:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5940:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5940:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement12999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement13011); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5956:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5958:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13049);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement13059); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5965:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5968:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5969:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5969:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5969:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleUpdateStatement13096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5973:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==54) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5973:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleUpdateStatement13109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5977:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5978:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5978:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5979:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13130);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5995:4: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5996:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5996:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5997:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement13152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,122,FOLLOW_122_in_ruleUpdateStatement13164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6012:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6013:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6013:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6014:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13185);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6030:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==15) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6030:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleUpdateStatement13198); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6034:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6035:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6035:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6036:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13219);
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
            	    break loop111;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6052:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==76) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6052:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,76,FOLLOW_76_in_ruleUpdateStatement13234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6056:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6057:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6057:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6058:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13255);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6082:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6083:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6084:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13293);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13303); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6091:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6094:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6096:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6096:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6097:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleUpdateColumnExpression13360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6112:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6113:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6113:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6114:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13381);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6138:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6140:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13418);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13429); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6147:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6150:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6151:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6151:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6151:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6151:2: (kw= '-' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==33) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6152:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleSignedNumber13468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13485); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6172:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6173:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6174:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13531);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13542); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6181:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6184:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6185:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6185:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6185:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6192:1: (kw= '.' this_ID_2= RULE_ID )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==60) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6193:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName13601); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13616); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop114;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6215:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6216:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6216:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt115=4;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt115=1;
                }
                break;
            case 124:
                {
                alt115=2;
                }
                break;
            case 125:
                {
                alt115=3;
                }
                break;
            case 126:
                {
                alt115=4;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6216:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6216:2: (enumLiteral_0= 'union all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6216:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_123_in_ruleCompoundOperator13677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6222:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6222:6: (enumLiteral_1= 'union' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6222:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_124_in_ruleCompoundOperator13694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6228:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6228:6: (enumLiteral_2= 'intersect' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6228:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,125,FOLLOW_125_in_ruleCompoundOperator13711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6234:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6234:6: (enumLiteral_3= 'except' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6234:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator13728); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6244:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6246:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6247:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6247:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt116=6;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt116=1;
                }
                break;
            case 128:
                {
                alt116=2;
                }
                break;
            case 129:
                {
                alt116=3;
                }
                break;
            case 130:
                {
                alt116=4;
                }
                break;
            case 131:
                {
                alt116=5;
                }
                break;
            case 132:
                {
                alt116=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6247:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6247:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6247:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType13773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleSqliteDataType13790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6259:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6259:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6259:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleSqliteDataType13807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6265:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6265:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6265:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType13824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6271:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6271:6: (enumLiteral_4= 'none' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6271:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType13841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6277:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6277:6: (enumLiteral_5= 'numeric' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6277:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType13858); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6287:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6289:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6290:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6290:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt117=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt117=1;
                }
                break;
            case 128:
                {
                alt117=2;
                }
                break;
            case 129:
                {
                alt117=3;
                }
                break;
            case 130:
                {
                alt117=4;
                }
                break;
            case 133:
                {
                alt117=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6290:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6290:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6290:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleColumnType13903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6296:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6296:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6296:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleColumnType13920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6302:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6302:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6302:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleColumnType13937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6308:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6308:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6308:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleColumnType13954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6314:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6314:6: (enumLiteral_4= 'boolean' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6314:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,133,FOLLOW_133_in_ruleColumnType13971); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6324:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6326:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6327:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6327:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt118=5;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt118=1;
                }
                break;
            case 135:
                {
                alt118=2;
                }
                break;
            case 136:
                {
                alt118=3;
                }
                break;
            case 137:
                {
                alt118=4;
                }
                break;
            case 119:
                {
                alt118=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6327:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6327:2: (enumLiteral_0= 'rollback' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6327:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_134_in_ruleConflictResolution14016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6333:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6333:6: (enumLiteral_1= 'abort' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6333:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_135_in_ruleConflictResolution14033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6339:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6339:6: (enumLiteral_2= 'fail' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6339:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_136_in_ruleConflictResolution14050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6345:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6345:6: (enumLiteral_3= 'ignore' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6345:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution14067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6351:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6351:6: (enumLiteral_4= 'replace' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6351:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_119_in_ruleConflictResolution14084); if (state.failed) return current;
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
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1779:5: ( ( RULE_ID ) )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1780:1: ( RULE_ID )
        {
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1780:1: ( RULE_ID )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1781:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang4005); if (state.failed) return ;

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


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA40_eotS =
        "\15\uffff";
    static final String DFA40_eofS =
        "\3\uffff\1\12\11\uffff";
    static final String DFA40_minS =
        "\1\4\2\uffff\1\15\1\uffff\1\4\7\uffff";
    static final String DFA40_maxS =
        "\1\133\2\uffff\1\176\1\uffff\1\133\7\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\3\1\10\1\5";
    static final String DFA40_specialS =
        "\15\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\3\2\4\7\uffff\1\5\22\uffff\1\4\30\uffff\1\1\1\2\1\uffff\2\6\1\7\2\uffff\1\10\1\11\24\uffff\4\4",
            "",
            "",
            "\1\12\1\13\2\12\2\uffff\1\12\1\uffff\2\12\1\uffff\1\12\1\uffff\40\12\2\uffff\1\12\3\uffff\2\12\2\uffff\5\12\3\uffff\7\12\1\uffff\3\12\5\uffff\1\12\14\uffff\2\12\2\uffff\1\12\15\uffff\4\12",
            "",
            "\3\14\7\uffff\1\14\22\uffff\1\14\30\uffff\2\14\1\uffff\3\14\2\uffff\2\14\5\uffff\1\6\16\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1725:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA32_eotS =
        "\127\uffff";
    static final String DFA32_eofS =
        "\1\uffff\1\3\1\44\1\uffff\1\5\122\uffff";
    static final String DFA32_minS =
        "\1\4\1\15\1\4\1\uffff\1\4\101\uffff\1\4\17\uffff\1\0";
    static final String DFA32_maxS =
        "\1\4\2\176\1\uffff\1\176\101\uffff\1\133\17\uffff\1\0";
    static final String DFA32_acceptS =
        "\3\uffff\1\3\1\uffff\1\2\100\1\1\uffff\17\1\1\uffff";
    static final String DFA32_specialS =
        "\2\uffff\1\0\1\uffff\1\2\121\uffff\1\1}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\3\1\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\40\3\2\uffff\1\2\3\uffff\2\3\2\uffff\5\3\3\uffff\7\3\1\uffff\3\3\5\uffff\1\3\14\uffff\2\3\2\uffff\1\3\15\uffff\4\3",
            "\1\5\10\uffff\1\55\1\uffff\1\50\1\45\2\uffff\1\63\1\uffff\1\56\1\51\1\uffff\1\41\1\uffff\1\23\1\62\1\104\1\43\1\4\1\42\1\37\1\40\1\33\1\34\1\35\1\36\1\27\1\30\1\31\1\32\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26\1\12\1\11\1\6\1\7\1\10\6\uffff\1\53\1\47\2\uffff\1\46\1\52\1\72\1\73\1\54\3\uffff\1\76\1\64\1\65\1\74\1\75\1\77\1\100\1\uffff\1\101\1\102\1\103\5\uffff\1\57\14\uffff\1\105\1\60\2\uffff\1\61\15\uffff\1\66\1\67\1\70\1\71",
            "",
            "\1\111\1\113\1\112\6\uffff\1\5\1\120\2\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\1\uffff\7\5\1\106\30\5\1\107\1\110\1\uffff\1\121\1\122\1\123\2\5\1\124\1\125\5\5\3\uffff\7\5\1\uffff\3\5\1\uffff\1\114\1\115\1\116\1\117\1\5\14\uffff\2\5\2\uffff\1\5\15\uffff\4\5",
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
            "\2\5\1\126\7\uffff\1\5\22\uffff\1\5\30\uffff\2\5\1\uffff\3\5\2\uffff\2\5\24\uffff\4\5",
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
            "\1\uffff"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1779:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_2==30) ) {s = 4;}

                        else if ( (LA32_2==RULE_ID) ) {s = 5;}

                        else if ( (LA32_2==55) && (synpred1_InternalMickeyLang())) {s = 6;}

                        else if ( (LA32_2==56) && (synpred1_InternalMickeyLang())) {s = 7;}

                        else if ( (LA32_2==57) && (synpred1_InternalMickeyLang())) {s = 8;}

                        else if ( (LA32_2==54) && (synpred1_InternalMickeyLang())) {s = 9;}

                        else if ( (LA32_2==53) && (synpred1_InternalMickeyLang())) {s = 10;}

                        else if ( (LA32_2==42) && (synpred1_InternalMickeyLang())) {s = 11;}

                        else if ( (LA32_2==43) && (synpred1_InternalMickeyLang())) {s = 12;}

                        else if ( (LA32_2==44) && (synpred1_InternalMickeyLang())) {s = 13;}

                        else if ( (LA32_2==45) && (synpred1_InternalMickeyLang())) {s = 14;}

                        else if ( (LA32_2==46) && (synpred1_InternalMickeyLang())) {s = 15;}

                        else if ( (LA32_2==47) && (synpred1_InternalMickeyLang())) {s = 16;}

                        else if ( (LA32_2==48) && (synpred1_InternalMickeyLang())) {s = 17;}

                        else if ( (LA32_2==49) && (synpred1_InternalMickeyLang())) {s = 18;}

                        else if ( (LA32_2==26) && (synpred1_InternalMickeyLang())) {s = 19;}

                        else if ( (LA32_2==50) && (synpred1_InternalMickeyLang())) {s = 20;}

                        else if ( (LA32_2==51) && (synpred1_InternalMickeyLang())) {s = 21;}

                        else if ( (LA32_2==52) && (synpred1_InternalMickeyLang())) {s = 22;}

                        else if ( (LA32_2==38) && (synpred1_InternalMickeyLang())) {s = 23;}

                        else if ( (LA32_2==39) && (synpred1_InternalMickeyLang())) {s = 24;}

                        else if ( (LA32_2==40) && (synpred1_InternalMickeyLang())) {s = 25;}

                        else if ( (LA32_2==41) && (synpred1_InternalMickeyLang())) {s = 26;}

                        else if ( (LA32_2==34) && (synpred1_InternalMickeyLang())) {s = 27;}

                        else if ( (LA32_2==35) && (synpred1_InternalMickeyLang())) {s = 28;}

                        else if ( (LA32_2==36) && (synpred1_InternalMickeyLang())) {s = 29;}

                        else if ( (LA32_2==37) && (synpred1_InternalMickeyLang())) {s = 30;}

                        else if ( (LA32_2==32) && (synpred1_InternalMickeyLang())) {s = 31;}

                        else if ( (LA32_2==33) && (synpred1_InternalMickeyLang())) {s = 32;}

                        else if ( (LA32_2==24) && (synpred1_InternalMickeyLang())) {s = 33;}

                        else if ( (LA32_2==31) && (synpred1_InternalMickeyLang())) {s = 34;}

                        else if ( (LA32_2==29) && (synpred1_InternalMickeyLang())) {s = 35;}

                        else if ( (LA32_2==EOF) && (synpred1_InternalMickeyLang())) {s = 36;}

                        else if ( (LA32_2==16) && (synpred1_InternalMickeyLang())) {s = 37;}

                        else if ( (LA32_2==68) && (synpred1_InternalMickeyLang())) {s = 38;}

                        else if ( (LA32_2==65) && (synpred1_InternalMickeyLang())) {s = 39;}

                        else if ( (LA32_2==15) && (synpred1_InternalMickeyLang())) {s = 40;}

                        else if ( (LA32_2==22) && (synpred1_InternalMickeyLang())) {s = 41;}

                        else if ( (LA32_2==69) && (synpred1_InternalMickeyLang())) {s = 42;}

                        else if ( (LA32_2==64) && (synpred1_InternalMickeyLang())) {s = 43;}

                        else if ( (LA32_2==72) && (synpred1_InternalMickeyLang())) {s = 44;}

                        else if ( (LA32_2==13) && (synpred1_InternalMickeyLang())) {s = 45;}

                        else if ( (LA32_2==21) && (synpred1_InternalMickeyLang())) {s = 46;}

                        else if ( (LA32_2==92) && (synpred1_InternalMickeyLang())) {s = 47;}

                        else if ( (LA32_2==106) && (synpred1_InternalMickeyLang())) {s = 48;}

                        else if ( (LA32_2==109) && (synpred1_InternalMickeyLang())) {s = 49;}

                        else if ( (LA32_2==27) && (synpred1_InternalMickeyLang())) {s = 50;}

                        else if ( (LA32_2==19) && (synpred1_InternalMickeyLang())) {s = 51;}

                        else if ( (LA32_2==77) && (synpred1_InternalMickeyLang())) {s = 52;}

                        else if ( (LA32_2==78) && (synpred1_InternalMickeyLang())) {s = 53;}

                        else if ( (LA32_2==123) && (synpred1_InternalMickeyLang())) {s = 54;}

                        else if ( (LA32_2==124) && (synpred1_InternalMickeyLang())) {s = 55;}

                        else if ( (LA32_2==125) && (synpred1_InternalMickeyLang())) {s = 56;}

                        else if ( (LA32_2==126) && (synpred1_InternalMickeyLang())) {s = 57;}

                        else if ( (LA32_2==70) && (synpred1_InternalMickeyLang())) {s = 58;}

                        else if ( (LA32_2==71) && (synpred1_InternalMickeyLang())) {s = 59;}

                        else if ( (LA32_2==79) && (synpred1_InternalMickeyLang())) {s = 60;}

                        else if ( (LA32_2==80) && (synpred1_InternalMickeyLang())) {s = 61;}

                        else if ( (LA32_2==76) && (synpred1_InternalMickeyLang())) {s = 62;}

                        else if ( (LA32_2==81) && (synpred1_InternalMickeyLang())) {s = 63;}

                        else if ( (LA32_2==82) && (synpred1_InternalMickeyLang())) {s = 64;}

                        else if ( (LA32_2==84) && (synpred1_InternalMickeyLang())) {s = 65;}

                        else if ( (LA32_2==85) && (synpred1_InternalMickeyLang())) {s = 66;}

                        else if ( (LA32_2==86) && (synpred1_InternalMickeyLang())) {s = 67;}

                        else if ( (LA32_2==28) && (synpred1_InternalMickeyLang())) {s = 68;}

                        else if ( (LA32_2==105) && (synpred1_InternalMickeyLang())) {s = 69;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_86 = input.LA(1);

                         
                        int index32_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMickeyLang()) ) {s = 85;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_86);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_4==EOF||LA32_4==13||(LA32_4>=15 && LA32_4<=16)||LA32_4==19||(LA32_4>=21 && LA32_4<=22)||LA32_4==24||(LA32_4>=26 && LA32_4<=32)||(LA32_4>=34 && LA32_4<=57)||(LA32_4>=64 && LA32_4<=65)||(LA32_4>=68 && LA32_4<=72)||(LA32_4>=76 && LA32_4<=82)||(LA32_4>=84 && LA32_4<=86)||LA32_4==92||(LA32_4>=105 && LA32_4<=106)||LA32_4==109||(LA32_4>=123 && LA32_4<=126)) ) {s = 5;}

                        else if ( (LA32_4==33) ) {s = 70;}

                        else if ( (LA32_4==58) && (synpred1_InternalMickeyLang())) {s = 71;}

                        else if ( (LA32_4==59) && (synpred1_InternalMickeyLang())) {s = 72;}

                        else if ( (LA32_4==RULE_ID) && (synpred1_InternalMickeyLang())) {s = 73;}

                        else if ( (LA32_4==RULE_NUMBER) && (synpred1_InternalMickeyLang())) {s = 74;}

                        else if ( (LA32_4==RULE_STRING) && (synpred1_InternalMickeyLang())) {s = 75;}

                        else if ( (LA32_4==88) && (synpred1_InternalMickeyLang())) {s = 76;}

                        else if ( (LA32_4==89) && (synpred1_InternalMickeyLang())) {s = 77;}

                        else if ( (LA32_4==90) && (synpred1_InternalMickeyLang())) {s = 78;}

                        else if ( (LA32_4==91) && (synpred1_InternalMickeyLang())) {s = 79;}

                        else if ( (LA32_4==14) && (synpred1_InternalMickeyLang())) {s = 80;}

                        else if ( (LA32_4==61) && (synpred1_InternalMickeyLang())) {s = 81;}

                        else if ( (LA32_4==62) && (synpred1_InternalMickeyLang())) {s = 82;}

                        else if ( (LA32_4==63) && (synpred1_InternalMickeyLang())) {s = 83;}

                        else if ( (LA32_4==66) && (synpred1_InternalMickeyLang())) {s = 84;}

                        else if ( (LA32_4==67) && (synpred1_InternalMickeyLang())) {s = 85;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\21\uffff";
    static final String DFA65_eofS =
        "\21\uffff";
    static final String DFA65_minS =
        "\1\134\1\27\3\136\4\uffff\1\4\4\uffff\1\153\2\uffff";
    static final String DFA65_maxS =
        "\1\155\1\157\1\136\1\157\1\140\4\uffff\1\4\4\uffff\1\154\2\uffff";
    static final String DFA65_acceptS =
        "\5\uffff\1\2\1\1\1\4\1\3\1\uffff\1\7\1\11\1\12\1\10\1\uffff\1\6\1\5";
    static final String DFA65_specialS =
        "\21\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\7\105\uffff\1\4\1\6\1\5\1\10\16\uffff\1\7",
            "\1\11",
            "\1\12\1\13\1\15\16\uffff\1\14",
            "\1\6\1\5\1\10",
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

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3677:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMickeyFile_in_entryRuleMickeyFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMickeyFile122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFile143 = new BitSet(new long[]{0x0000000008202002L,0x0000240010000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_ruleMickeyFile164 = new BitSet(new long[]{0x0000000008202002L,0x0000240010000000L});
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
    public static final BitSet FOLLOW_18_in_ruleMickeyFunction577 = new BitSet(new long[]{0x0000000000100000L,0x0080007000000200L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleMickeyFunction599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMickeyFunction611 = new BitSet(new long[]{0x0000000000100000L,0x0080007000000200L});
    public static final BitSet FOLLOW_20_in_ruleMickeyFunction625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleActionStatement708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement725 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleActionStatement751 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActionStatement763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActionStatement786 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_23_in_ruleActionStatement804 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleActionStatement831 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_ruleContentUriQueryParam_in_ruleActionStatement852 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleActionStatement865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri1017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleContentUri1074 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1095 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleContentUriQueryParam_in_entryRuleContentUriQueryParam1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriQueryParam1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleContentUriQueryParam1180 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleContentUriQueryParam1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriQueryParam1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleContentUriSegment1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1373 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContentUriSegment1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMigrationBlock1478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationBlock1495 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleMigrationBlock1513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMigrationBlock1536 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock1550 = new BitSet(new long[]{0x0000000000100000L,0x0000240010000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1572 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock1584 = new BitSet(new long[]{0x0000000000100000L,0x0000240010000000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationBlock1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1781 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleExprConcat1808 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1842 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1937 = new BitSet(new long[]{0x00000000C1000002L});
    public static final BitSet FOLLOW_30_in_ruleExprMult1966 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_24_in_ruleExprMult1995 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_31_in_ruleExprMult2024 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2061 = new BitSet(new long[]{0x00000000C1000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2156 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_ruleExprAdd2185 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_33_in_ruleExprAdd2214 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2251 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2346 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_34_in_ruleExprBit2375 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_35_in_ruleExprBit2404 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_36_in_ruleExprBit2433 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_37_in_ruleExprBit2462 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2499 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2594 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_38_in_ruleExprRelate2623 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_39_in_ruleExprRelate2652 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_40_in_ruleExprRelate2681 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_41_in_ruleExprRelate2710 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2747 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2842 = new BitSet(new long[]{0x001FFC0004000002L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2871 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2900 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2929 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2958 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_46_in_ruleExprEqual2987 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_47_in_ruleExprEqual3016 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_48_in_ruleExprEqual3045 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_49_in_ruleExprEqual3074 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_26_in_ruleExprEqual3103 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_50_in_ruleExprEqual3132 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_51_in_ruleExprEqual3161 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_52_in_ruleExprEqual3190 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3227 = new BitSet(new long[]{0x001FFC0004000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3322 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprAnd3349 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3383 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3478 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExprOr3505 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3539 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3634 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNullExpression3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullExpression3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNullExpression3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4022 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4062 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4074 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4228 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4249 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4296 = new BitSet(new long[]{0x4000000000004000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4328 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4375 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4416 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00001CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4437 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00001CL});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4459 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00001FL});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4473 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4559 = new BitSet(new long[]{0xEC00000240004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression4578 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4619 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression4632 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4653 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimaryExpression4698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4710 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4731 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression4743 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4764 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePrimaryExpression4805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCase4909 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleCase4942 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement5055 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_ruleSelectStatement5068 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleSelectStatement5104 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5125 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSelectStatement5139 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_15_in_ruleSelectStatement5157 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5275 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOrderingTermList5288 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5309 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5404 = new BitSet(new long[]{0x0000000000000002L,0x7800000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5455 = new BitSet(new long[]{0x0000000000000002L,0x7800000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSelectExpression5549 = new BitSet(new long[]{0xEC00000240004070L,0x000000000F000C0CL});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5568 = new BitSet(new long[]{0xEC00000240004070L,0x000000000F000C0CL});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5605 = new BitSet(new long[]{0xEC00000240004070L,0x000000000F000C0CL});
    public static final BitSet FOLLOW_30_in_ruleSelectExpression5639 = new BitSet(new long[]{0x0000000010000002L,0x0000000000007000L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5679 = new BitSet(new long[]{0x0000000010000002L,0x0000000000007000L});
    public static final BitSet FOLLOW_28_in_ruleSelectExpression5693 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007000L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression5729 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression5765 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleSelectExpression5801 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5916 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSelectList5929 = new BitSet(new long[]{0xEC00000240004070L,0x000000000F000C0CL});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5950 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6134 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGroupByExpressions6147 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6168 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleOrderingTerm6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOrderingTerm6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000760000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000760000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource6573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable6786 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSingleSourceTable6799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceSelectStatement6915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6936 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceSelectStatement6948 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSingleSourceSelectStatement6961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceJoin7068 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7089 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceJoin7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement7199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000740000L});
    public static final BitSet FOLLOW_82_in_ruleJoinStatement7233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement7264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7367 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleJoinStatement7400 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7522 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleResultColumn7535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLiteralValue7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralValue7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleLiteralValue7879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCreateTableStatement8320 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTableStatement8338 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTableStatement8364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8381 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateTableStatement8398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8419 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8453 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8468 = new BitSet(new long[]{0x0000000000800000L,0x0019000000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8489 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTableStatement8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCreateViewStatement8595 = new BitSet(new long[]{0x0000000000000000L,0x00000000A0000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateViewStatement8613 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateViewStatement8639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement8656 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCreateViewStatement8673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCreateTriggerStatement8777 = new BitSet(new long[]{0x0000000000000000L,0x0000000120000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTriggerStatement8795 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement8821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8838 = new BitSet(new long[]{0x0000000000000000L,0x0000007E00000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement8863 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8892 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8921 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement9032 = new BitSet(new long[]{0x0000000000000000L,0x0000008000800000L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement9058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9075 = new BitSet(new long[]{0x0000000000008000L,0x0000000000800000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTriggerStatement9093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9110 = new BitSet(new long[]{0x0000000000008000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleCreateTriggerStatement9133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9153 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000010L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9171 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000010L});
    public static final BitSet FOLLOW_68_in_ruleCreateTriggerStatement9198 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9219 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleCreateTriggerStatement9233 = new BitSet(new long[]{0x0000000000000000L,0x0080007000000202L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement9267 = new BitSet(new long[]{0x0000000000000000L,0x0080007000000202L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9289 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement9301 = new BitSet(new long[]{0x0000000000000000L,0x0080007000000202L});
    public static final BitSet FOLLOW_65_in_ruleCreateTriggerStatement9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAlterTableRenameStatement9409 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleAlterTableRenameStatement9421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9441 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleAlterTableRenameStatement9453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAlterTableAddColumnStatement9558 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleAlterTableAddColumnStatement9570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9590 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableAddColumnStatement9602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement9669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleDropTableStatement9706 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleDropTableStatement9718 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleDropTableStatement9736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleDropTriggerStatement9853 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleDropTriggerStatement9865 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleDropTriggerStatement9883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleDropViewStatement10000 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleDropViewStatement10012 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleDropViewStatement10030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement10110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCreateIndexStatement10147 = new BitSet(new long[]{0x0000000000800000L,0x0000800000000000L});
    public static final BitSet FOLLOW_23_in_ruleCreateIndexStatement10165 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleCreateIndexStatement10191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleCreateIndexStatement10225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10245 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateIndexStatement10257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10278 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateIndexStatement10291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10312 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateIndexStatement10326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleDropIndexStatement10409 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10421 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleDropIndexStatement10439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef10570 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef10596 = new BitSet(new long[]{0x0100000000800002L,0x000D000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef10617 = new BitSet(new long[]{0x0100000000800002L,0x000D000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint10664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleColumnConstraint10711 = new BitSet(new long[]{0x0000000000000002L,0x0002000000018000L});
    public static final BitSet FOLLOW_79_in_ruleColumnConstraint10730 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_80_in_ruleColumnConstraint10767 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleColumnConstraint10800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleColumnConstraint10843 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColumnConstraint10894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleColumnConstraint10945 = new BitSet(new long[]{0x0000000200004060L,0x000000000F000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint10995 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleColumnConstraint11007 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11028 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColumnConstraint11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleUniqueTableConstraint11271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11288 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUniqueTableConstraint11307 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUniqueTableConstraint11319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11340 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleUniqueTableConstraint11353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11374 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleUniqueTableConstraint11388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rulePrimaryConstraint11493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11510 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_rulePrimaryConstraint11529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryConstraint11541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11562 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryConstraint11575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11596 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryConstraint11610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleCheckTableConstraint11715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint11732 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleCheckTableConstraint11751 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCheckTableConstraint11763 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11784 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCheckTableConstraint11796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11887 = new BitSet(new long[]{0x0000000000000002L,0x0020000000018000L});
    public static final BitSet FOLLOW_117_in_ruleIndexedColumn11900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleIndexedColumn11943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleIndexedColumn11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValue12126 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue12147 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultValue12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause12196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleConflictClause12243 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleConflictClause12255 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleDeleteStatement12532 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDeleteStatement12544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement12564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleDeleteStatement12577 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleInsertStatement12685 = new BitSet(new long[]{0x0040000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_54_in_ruleInsertStatement12698 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement12719 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_119_in_ruleInsertStatement12740 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleInsertStatement12753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12773 = new BitSet(new long[]{0x0000000000004000L,0x0204000000000200L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement12786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12806 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement12819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12839 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement12853 = new BitSet(new long[]{0x0000000000000000L,0x0204000000000200L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement12870 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement12882 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12903 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement12916 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12937 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement12951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement12999 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleUpdateStatement13096 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_54_in_ruleUpdateStatement13109 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement13152 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleUpdateStatement13164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13185 = new BitSet(new long[]{0x0000000000008002L,0x0000000000001000L});
    public static final BitSet FOLLOW_15_in_ruleUpdateStatement13198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13219 = new BitSet(new long[]{0x0000000000008002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleUpdateStatement13234 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13348 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleUpdateColumnExpression13360 = new BitSet(new long[]{0xEC00000200004070L,0x000000000F00000CL});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignedNumber13468 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13582 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName13601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13616 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleCompoundOperator13677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleCompoundOperator13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleCompoundOperator13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType13773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSqliteDataType13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSqliteDataType13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType13824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleColumnType13903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleColumnType13920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleColumnType13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType13954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleColumnType13971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleConflictResolution14016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleConflictResolution14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleConflictResolution14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleConflictResolution14084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang4005 = new BitSet(new long[]{0x0000000000000002L});

}