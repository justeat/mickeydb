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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'function'", "'('", "','", "')'", "':'", "'{'", "';'", "'}'", "'action'", "'on'", "'unique'", "'notify'", "'/'", "'param'", "'like'", "'migrate'", "'from'", "'||'", "'*'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'as'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'check'", "'constraint'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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
    public static final int T__138=138;
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

                if ( (LA1_0==13||LA1_0==21||LA1_0==28||LA1_0==93||LA1_0==107||LA1_0==110) ) {
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
            case 93:
            case 107:
            case 110:
                {
                alt2=3;
                }
                break;
            case 28:
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

            if ( ((LA4_0>=128 && LA4_0<=131)||LA4_0==134) ) {
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

                if ( (LA6_0==75||(LA6_0>=101 && LA6_0<=103)||LA6_0==120) ) {
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:338:1: ruleActionStatement returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_unique_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_uri_2_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_notifications_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:341:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:342:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )?
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

                  	newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getOnKeyword_3());
                  
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:416:3: (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:416:5: otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}'
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

                        if ( (LA8_0==26) ) {
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:438:3: ( (lv_notifications_8_0= ruleContentNotificationUri ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:439:1: (lv_notifications_8_0= ruleContentNotificationUri )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:439:1: (lv_notifications_8_0= ruleContentNotificationUri )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:440:3: lv_notifications_8_0= ruleContentNotificationUri
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getActionStatementAccess().getNotificationsContentNotificationUriParserRuleCall_6_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleContentNotificationUri_in_ruleActionStatement874);
                    	    lv_notifications_8_0=ruleContentNotificationUri();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"notifications",
                    	              		lv_notifications_8_0, 
                    	              		"ContentNotificationUri");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleActionStatement887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getActionStatementAccess().getRightCurlyBracketKeyword_6_3());
                          
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


    // $ANTLR start "entryRuleContentNotificationUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:468:1: entryRuleContentNotificationUri returns [EObject current=null] : iv_ruleContentNotificationUri= ruleContentNotificationUri EOF ;
    public final EObject entryRuleContentNotificationUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentNotificationUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:469:2: (iv_ruleContentNotificationUri= ruleContentNotificationUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:470:2: iv_ruleContentNotificationUri= ruleContentNotificationUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentNotificationUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentNotificationUri_in_entryRuleContentNotificationUri925);
            iv_ruleContentNotificationUri=ruleContentNotificationUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentNotificationUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentNotificationUri935); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentNotificationUri"


    // $ANTLR start "ruleContentNotificationUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:477:1: ruleContentNotificationUri returns [EObject current=null] : (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) ) ;
    public final EObject ruleContentNotificationUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_uri_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:480:28: ( (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:481:1: (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:481:1: (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:481:3: otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleContentNotificationUri972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentNotificationUriAccess().getNotifyKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:485:1: ( (lv_uri_1_0= ruleNotifyContentUri ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:486:1: (lv_uri_1_0= ruleNotifyContentUri )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:486:1: (lv_uri_1_0= ruleNotifyContentUri )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:487:3: lv_uri_1_0= ruleNotifyContentUri
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContentNotificationUriAccess().getUriNotifyContentUriParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotifyContentUri_in_ruleContentNotificationUri993);
            lv_uri_1_0=ruleNotifyContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContentNotificationUriRule());
              	        }
                     		set(
                     			current, 
                     			"uri",
                      		lv_uri_1_0, 
                      		"NotifyContentUri");
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
    // $ANTLR end "ruleContentNotificationUri"


    // $ANTLR start "entryRuleFunctionArg"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:511:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:512:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:513:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1029);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg1039); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:520:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:523:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:524:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:524:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:524:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:524:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:525:1: (lv_type_0_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:526:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg1085);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:542:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:543:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:543:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:544:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg1102); if (state.failed) return current;
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


    // $ANTLR start "entryRuleNotifyContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:568:1: entryRuleNotifyContentUri returns [EObject current=null] : iv_ruleNotifyContentUri= ruleNotifyContentUri EOF ;
    public final EObject entryRuleNotifyContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotifyContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:569:2: (iv_ruleNotifyContentUri= ruleNotifyContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:570:2: iv_ruleNotifyContentUri= ruleNotifyContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotifyContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleNotifyContentUri_in_entryRuleNotifyContentUri1143);
            iv_ruleNotifyContentUri=ruleNotifyContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotifyContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotifyContentUri1153); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotifyContentUri"


    // $ANTLR start "ruleNotifyContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:577:1: ruleNotifyContentUri returns [EObject current=null] : ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* ) ;
    public final EObject ruleNotifyContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_segments_1_0 = null;

        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:580:28: ( ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:581:1: ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:581:1: ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:581:2: () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:581:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:582:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotifyContentUriAccess().getNotifyContentUriAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:587:2: ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:588:1: (lv_segments_1_0= ruleNotifyContentUriSegment )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:588:1: (lv_segments_1_0= ruleNotifyContentUriSegment )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:589:3: lv_segments_1_0= ruleNotifyContentUriSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotifyContentUriAccess().getSegmentsNotifyContentUriSegmentParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1208);
                    lv_segments_1_0=ruleNotifyContentUriSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotifyContentUriRule());
                      	        }
                             		add(
                             			current, 
                             			"segments",
                              		lv_segments_1_0, 
                              		"NotifyContentUriSegment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:605:3: (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:605:5: otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleNotifyContentUri1222); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNotifyContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:609:1: ( (lv_segments_3_0= ruleNotifyContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:610:1: (lv_segments_3_0= ruleNotifyContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:610:1: (lv_segments_3_0= ruleNotifyContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:611:3: lv_segments_3_0= ruleNotifyContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNotifyContentUriAccess().getSegmentsNotifyContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1243);
            	    lv_segments_3_0=ruleNotifyContentUriSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNotifyContentUriRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_3_0, 
            	              		"NotifyContentUriSegment");
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
    // $ANTLR end "ruleNotifyContentUri"


    // $ANTLR start "entryRuleNotifyContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:635:1: entryRuleNotifyContentUriSegment returns [EObject current=null] : iv_ruleNotifyContentUriSegment= ruleNotifyContentUriSegment EOF ;
    public final EObject entryRuleNotifyContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotifyContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:636:2: (iv_ruleNotifyContentUriSegment= ruleNotifyContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:637:2: iv_ruleNotifyContentUriSegment= ruleNotifyContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotifyContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleNotifyContentUriSegment_in_entryRuleNotifyContentUriSegment1281);
            iv_ruleNotifyContentUriSegment=ruleNotifyContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotifyContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotifyContentUriSegment1291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotifyContentUriSegment"


    // $ANTLR start "ruleNotifyContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:644:1: ruleNotifyContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) ) ;
    public final EObject ruleNotifyContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:647:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:648:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:648:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==18) ) {
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:648:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:648:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:649:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:649:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:650:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getNotifyContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNotifyContentUriSegmentRule());
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:667:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:667:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:667:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:667:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:668:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNotifyContentUriSegmentAccess().getNotifyContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleNotifyContentUriSegment1366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNotifyContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:677:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:678:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:678:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:679:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getNotifyContentUriSegmentAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNotifyContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleNotifyContentUriSegment1400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNotifyContentUriSegmentAccess().getRightCurlyBracketKeyword_1_3());
                          
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
    // $ANTLR end "ruleNotifyContentUriSegment"


    // $ANTLR start "entryRuleContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:707:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:708:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:709:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri1437);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri1447); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:716:1: ruleContentUri returns [EObject current=null] : ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_segments_1_0 = null;

        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:719:28: ( ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:720:1: ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:720:1: ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:720:2: () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:720:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:721:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContentUriAccess().getContentUriAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:726:2: ( (lv_segments_1_0= ruleContentUriSegment ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:727:1: (lv_segments_1_0= ruleContentUriSegment )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:727:1: (lv_segments_1_0= ruleContentUriSegment )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:728:3: lv_segments_1_0= ruleContentUriSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1502);
                    lv_segments_1_0=ruleContentUriSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContentUriRule());
                      	        }
                             		add(
                             			current, 
                             			"segments",
                              		lv_segments_1_0, 
                              		"ContentUriSegment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:744:3: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:744:5: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleContentUri1516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:748:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:749:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:749:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:750:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1537);
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
    // $ANTLR end "ruleContentUri"


    // $ANTLR start "entryRuleContentUriQueryParam"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:774:1: entryRuleContentUriQueryParam returns [EObject current=null] : iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF ;
    public final EObject entryRuleContentUriQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriQueryParam = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:775:2: (iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:776:2: iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriQueryParamRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriQueryParam_in_entryRuleContentUriQueryParam1575);
            iv_ruleContentUriQueryParam=ruleContentUriQueryParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriQueryParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriQueryParam1585); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:783:1: ruleContentUriQueryParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleContentUriQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_like_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:786:28: ( (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:787:1: (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:787:1: (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:787:3: otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleContentUriQueryParam1622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriQueryParamAccess().getParamKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:791:1: ( (lv_like_1_0= 'like' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:792:1: (lv_like_1_0= 'like' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:792:1: (lv_like_1_0= 'like' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:793:3: lv_like_1_0= 'like'
                    {
                    lv_like_1_0=(Token)match(input,27,FOLLOW_27_in_ruleContentUriQueryParam1640); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:806:3: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:807:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:807:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:808:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContentUriQueryParamRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriQueryParam1674); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:827:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:828:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:829:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1710);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1720); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:836:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ) ;
    public final EObject ruleContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:839:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:840:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:840:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:840:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:840:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:841:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:841:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:842:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1762); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:859:6: ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:859:6: ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:859:7: () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:859:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:860:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleContentUriSegment1795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:869:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:870:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:870:1: (otherlv_3= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:871:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getContentUriSegmentAccess().getParamColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleContentUriSegment1827); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:894:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:895:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:896:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1864);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1874); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:903:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:906:28: ( ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:907:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:907:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:907:2: () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:907:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:908:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMigrationBlock1920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:917:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:918:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:918:1: (lv_name_2_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:919:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationBlock1937); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:935:2: (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:935:4: otherlv_3= 'from' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMigrationBlock1955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMigrationBlockAccess().getFromKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:939:1: ( ( ruleQualifiedName ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:940:1: ( ruleQualifiedName )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:940:1: ( ruleQualifiedName )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:941:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMigrationBlockRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getFromMigrationBlockCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMigrationBlock1978);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock1992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:958:1: ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==93||LA19_0==107||LA19_0==110) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:958:2: ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:958:2: ( (lv_statements_6_0= ruleDDLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:959:1: (lv_statements_6_0= ruleDDLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:959:1: (lv_statements_6_0= ruleDDLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:960:3: lv_statements_6_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock2014);
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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock2026); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_5_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleMigrationBlock2040); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:992:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:993:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:994:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression2076);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression2086); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1001:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1004:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1006:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression2132);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1022:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1023:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1024:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat2166);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat2176); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1031:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1034:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1035:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1035:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1036:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat2223);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1044:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1044:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1044:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1045:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1050:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1051:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1051:1: (lv_op_2_0= '||' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1052:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,30,FOLLOW_30_in_ruleExprConcat2250); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1065:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1067:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat2284);
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
    // $ANTLR end "ruleExprConcat"


    // $ANTLR start "entryRuleExprMult"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1091:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1092:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1093:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult2322);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult2332); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1100:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1103:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1104:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1104:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1105:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2379);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1113:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25||(LA22_0>=31 && LA22_0<=32)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1113:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1113:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1114:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1119:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1120:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1120:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1121:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1121:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt21=3;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1122:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleExprMult2408); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1134:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_ruleExprMult2437); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1146:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_32_in_ruleExprMult2466); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1161:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1162:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1162:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1163:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2503);
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
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1187:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1188:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1189:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd2541);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd2551); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1196:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1199:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1200:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1200:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1201:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2598);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1209:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=33 && LA24_0<=34)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1209:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1209:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1215:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1216:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1216:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1217:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1217:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==33) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==34) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1218:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleExprAdd2627); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1230:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_34_in_ruleExprAdd2656); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1245:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1246:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1246:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1247:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2693);
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
    // $ANTLR end "ruleExprAdd"


    // $ANTLR start "entryRuleExprBit"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1271:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1272:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1273:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2731);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2741); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1280:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1283:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1284:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1284:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1285:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2788);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1293:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=35 && LA26_0<=38)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1293:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1293:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1294:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1299:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1300:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1300:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1301:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1301:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1302:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_35_in_ruleExprBit2817); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1314:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_36_in_ruleExprBit2846); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1326:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,37,FOLLOW_37_in_ruleExprBit2875); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1338:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,38,FOLLOW_38_in_ruleExprBit2904); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1353:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1354:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1354:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1355:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2941);
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1379:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1380:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1381:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2979);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2989); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1388:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1391:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1392:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1392:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1393:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate3036);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1401:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=39 && LA28_0<=42)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1401:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1401:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1402:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1407:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1408:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1408:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1409:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1409:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt27=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1410:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleExprRelate3065); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1422:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_40_in_ruleExprRelate3094); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1434:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,41,FOLLOW_41_in_ruleExprRelate3123); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1446:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,42,FOLLOW_42_in_ruleExprRelate3152); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1461:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1462:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1462:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1463:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate3189);
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
            	    break loop28;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1487:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1488:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1489:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual3227);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual3237); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1496:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1499:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1500:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1500:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1501:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3284);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1509:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27||(LA30_0>=43 && LA30_0<=53)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1509:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1509:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1510:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1515:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1516:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1516:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1517:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1517:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt29=12;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt29=5;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt29=6;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt29=7;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt29=8;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt29=9;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt29=10;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt29=11;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt29=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1518:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual3313); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1530:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual3342); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1542:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual3371); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1554:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual3400); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1566:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual3429); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1578:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual3458); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1590:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual3487); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1602:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,50,FOLLOW_50_in_ruleExprEqual3516); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1614:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,27,FOLLOW_27_in_ruleExprEqual3545); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1626:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,51,FOLLOW_51_in_ruleExprEqual3574); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1638:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,52,FOLLOW_52_in_ruleExprEqual3603); if (state.failed) return current;
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
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1650:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,53,FOLLOW_53_in_ruleExprEqual3632); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1665:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1666:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1666:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1667:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3669);
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
            	    break loop30;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1691:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1692:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1693:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3707);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3717); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1700:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1703:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1704:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1704:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1705:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3764);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1713:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==54) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1713:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1713:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1714:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1719:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1720:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1720:1: (lv_op_2_0= 'and' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1721:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_54_in_ruleExprAnd3791); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1734:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1735:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1735:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1736:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3825);
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
            	    break loop31;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1760:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1761:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1762:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3863);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3873); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1769:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1772:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1773:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1773:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1774:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3920);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1782:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==55) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1782:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1782:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1783:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1788:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1789:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1789:1: (lv_op_2_0= 'or' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1790:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,55,FOLLOW_55_in_ruleExprOr3947); if (state.failed) return current;
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1803:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1805:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3981);
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
            	    break loop32;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1829:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1830:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1831:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression4019);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression4029); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1838:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1841:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1842:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1842:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1843:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression4076);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1851:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=56 && LA33_0<=58)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1851:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1851:2: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1852:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1857:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1858:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1858:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1859:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression4106);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1883:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1884:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1885:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression4144);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression4154); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1892:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1895:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1896:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1896:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=57 && LA35_0<=58)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1896:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1896:2: ( () otherlv_1= 'is null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1896:3: () otherlv_1= 'is null'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1896:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1897:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNullExpression4201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1907:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1907:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1907:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1907:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1908:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1913:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==57) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==58) ) {
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1913:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleNullExpression4231); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleNullExpression4249); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1930:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1931:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1932:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4287);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4297); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1939:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1942:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt45=10;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1943:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1944:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression4344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1953:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1954:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1954:1: (otherlv_2= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1955:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1967:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1967:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1967:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1967:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1968:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1977:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1978:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1978:1: (otherlv_5= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1979:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1991:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1991:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1991:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1991:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1992:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt37=3;
                    alt37 = dfa37.predict(input);
                    switch (alt37) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2003:1: (otherlv_7= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2004:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4464); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4476); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2020:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2020:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2020:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2020:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2021:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2021:1: (otherlv_9= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2022:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4504); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4516); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2037:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==31) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==RULE_ID) ) {
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
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2037:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2037:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2038:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2038:1: (lv_all_11_0= '*' )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2039:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,31,FOLLOW_31_in_rulePrimaryExpression4535); if (state.failed) return current;
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
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2053:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2053:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2054:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2054:1: (otherlv_12= RULE_ID )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2055:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4574); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2067:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2067:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2068:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2068:1: (otherlv_13= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2069:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4602); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2081:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2081:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2081:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2081:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2082:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2087:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2088:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2088:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4641);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2106:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2106:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2106:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2106:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2107:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2116:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2117:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2117:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2118:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4691);
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

                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2139:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2139:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2139:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2139:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2140:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2145:2: ( (lv_not_21_0= 'not' ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==62) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2146:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2146:1: (lv_not_21_0= 'not' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2147:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4738); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2160:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==63) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:1: (lv_exists_22_0= 'exists' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2162:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4770); if (state.failed) return current;
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

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression4796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2179:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2180:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2180:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2181:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4817);
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

                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression4829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2202:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2202:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2202:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2202:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2203:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2212:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_NUMBER)||LA40_0==14||LA40_0==34||(LA40_0>=59 && LA40_0<=60)||(LA40_0>=62 && LA40_0<=64)||LA40_0==67||LA40_0==69||(LA40_0>=89 && LA40_0<=92)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2213:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2213:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2214:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4879);
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2230:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==70) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2231:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2231:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2232:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4901);
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
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2248:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==65) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2248:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4915); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2252:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2253:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2253:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2254:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4936);
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

                    otherlv_32=(Token)match(input,66,FOLLOW_66_in_rulePrimaryExpression4950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2276:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2281:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2282:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2282:1: (lv_name_34_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2283:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4984); if (state.failed) return current;
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

                    otherlv_35=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression5001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2303:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==31) ) {
                        alt44=1;
                    }
                    else if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_NUMBER)||LA44_0==14||LA44_0==34||(LA44_0>=59 && LA44_0<=60)||(LA44_0>=62 && LA44_0<=64)||LA44_0==67||LA44_0==69||(LA44_0>=89 && LA44_0<=92)) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2303:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2303:2: ( (lv_all_36_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2304:1: (lv_all_36_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2304:1: (lv_all_36_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2305:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,31,FOLLOW_31_in_rulePrimaryExpression5020); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2319:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2320:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2320:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2321:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5061);
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2337:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==15) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2337:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression5074); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2341:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2342:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2342:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2343:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5095);
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
                            	    break loop43;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression5111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2364:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2364:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2364:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2364:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2365:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,67,FOLLOW_67_in_rulePrimaryExpression5140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression5152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2378:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2379:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2379:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2380:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5173);
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

                    otherlv_45=(Token)match(input,68,FOLLOW_68_in_rulePrimaryExpression5185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2400:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2401:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2401:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2402:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression5206);
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

                    otherlv_47=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression5218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,69,FOLLOW_69_in_rulePrimaryExpression5247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2433:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2434:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2434:1: (otherlv_50= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2435:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression5267); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2454:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2455:2: (iv_ruleCase= ruleCase EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2456:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase5304);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase5314); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2463:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2466:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2467:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2467:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2467:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleCase5351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2471:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2472:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2472:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2473:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase5372);
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

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleCase5384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2493:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2495:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase5405);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2519:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2520:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2521:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5441);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement5451); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2528:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2531:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2532:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2532:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2532:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2532:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2533:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2533:1: (lv_core_0_0= ruleSelectCore )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2534:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement5497);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2550:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2550:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleSelectStatement5510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2554:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2555:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2555:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2556:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5531);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2572:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2572:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleSelectStatement5546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2576:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2577:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2577:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2578:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5567);
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2594:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==15||LA48_0==74) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2594:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2594:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==74) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==15) ) {
                                alt47=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2594:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleSelectStatement5581); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2599:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSelectStatement5599); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2603:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2604:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2604:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2605:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5621);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2629:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2630:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2631:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5661);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5671); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2638:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2641:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2642:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2642:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2642:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2642:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2643:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2643:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2644:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5717);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2660:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==15) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2660:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleOrderingTermList5730); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2665:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2665:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2666:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5751);
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
    // $ANTLR end "ruleOrderingTermList"


    // $ANTLR start "entryRuleSelectCore"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2690:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2691:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2692:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5789);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5799); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2699:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2702:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2703:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2703:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2704:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5846);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2712:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=124 && LA51_0<=127)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2712:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2712:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2713:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2718:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2719:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2719:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2720:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5876);
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

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2736:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2737:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2737:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2738:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5897);
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
    // $ANTLR end "ruleSelectCore"


    // $ANTLR start "entryRuleSelectExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2762:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2763:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2764:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5935);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5945); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2771:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2774:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2775:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2775:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2775:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2775:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2776:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2785:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            else if ( (LA52_0==77) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2785:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2785:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2786:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2786:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2787:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression6010); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2801:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2801:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2802:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2802:1: (lv_all_3_0= 'all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2803:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression6047); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2816:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_NUMBER)||LA53_0==14||LA53_0==34||(LA53_0>=59 && LA53_0<=60)||(LA53_0>=62 && LA53_0<=64)||LA53_0==67||LA53_0==69||(LA53_0>=89 && LA53_0<=92)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2816:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2816:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2817:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2817:1: (lv_allColumns_4_0= '*' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2818:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,31,FOLLOW_31_in_ruleSelectExpression6081); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2832:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2832:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2833:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2833:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2834:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression6121);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2850:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==29) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2850:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleSelectExpression6135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2854:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2855:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2855:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2856:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression6156);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2872:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==78) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2872:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleSelectExpression6171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2876:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2877:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2877:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2878:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression6192);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2894:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==79) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2894:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,79,FOLLOW_79_in_ruleSelectExpression6207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2898:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2899:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2899:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2900:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression6228);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==80) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,80,FOLLOW_80_in_ruleSelectExpression6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2920:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2921:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2921:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2922:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression6264);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2946:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2947:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2948:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList6302);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList6312); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2955:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2958:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2959:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2960:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2960:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2961:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList6358);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2977:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==15) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2977:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSelectList6371); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2981:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2982:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2982:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2983:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList6392);
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
            	    break loop58;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3007:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3008:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3009:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6430);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions6440); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3016:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3019:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3020:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3020:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3021:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3021:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3022:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6485);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3046:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3047:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3048:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6520);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions6530); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3055:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3058:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3059:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3059:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3059:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3059:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3060:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3060:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3061:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6576);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3077:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==15) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3077:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGroupByExpressions6589); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3081:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3082:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3082:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3083:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6610);
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
            	    break loop59;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3107:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3108:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3109:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6648);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions6658); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3116:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3119:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3120:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3120:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3121:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3121:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3122:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6703);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3146:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3147:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3148:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6738);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6748); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3155:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3158:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3159:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3159:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3159:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3159:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3160:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3160:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3161:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6794);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3177:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==81) ) {
                alt60=1;
            }
            else if ( (LA60_0==82) ) {
                alt60=2;
            }
            switch (alt60) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3177:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3177:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3178:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3178:1: (lv_asc_1_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3179:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,81,FOLLOW_81_in_ruleOrderingTerm6813); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3193:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3193:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3194:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3194:1: (lv_desc_2_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3195:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,82,FOLLOW_82_in_ruleOrderingTerm6850); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3216:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3217:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3218:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6901);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6911); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3225:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3228:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3229:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3229:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3229:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3229:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3230:1: (lv_source_0_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3231:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6957);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=83 && LA61_0<=84)||(LA61_0>=86 && LA61_0<=88)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3248:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3248:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3249:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6978);
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
            	    break loop61;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3273:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3274:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3275:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource7015);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource7025); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3282:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3285:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3286:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3286:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==14) ) {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==RULE_ID||LA62_2==14) ) {
                    alt62=3;
                }
                else if ( (LA62_2==75) ) {
                    alt62=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3287:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource7072);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3297:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource7099);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3307:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource7126);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3323:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3324:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3325:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable7161);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable7171); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3332:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3335:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3336:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3336:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3336:2: () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3336:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3337:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3342:2: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3343:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3343:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3344:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable7228);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==68) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleSingleSourceTable7241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3361:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3362:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3362:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3363:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable7258); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3387:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3388:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3389:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement7301);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement7311); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3396:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3399:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3400:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3400:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3400:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3400:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3401:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceSelectStatement7357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3410:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3411:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3411:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3412:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement7378);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceSelectStatement7390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3432:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==68) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3432:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleSingleSourceSelectStatement7403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3436:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3437:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3437:1: (lv_name_5_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3438:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement7420); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3462:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3463:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3464:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7463);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin7473); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3471:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3474:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3475:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3475:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3475:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSingleSourceJoin7510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3479:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3480:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3480:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3481:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7531);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSingleSourceJoin7543); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3509:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3510:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3511:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7579);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement7589); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3518:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3521:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3522:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3522:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3522:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3522:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3523:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3528:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==83) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3529:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3529:1: (lv_natural_1_0= 'natural' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3530:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement7641); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3543:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt67=4;
            switch ( input.LA(1) ) {
                case 84:
                    {
                    alt67=1;
                    }
                    break;
                case 86:
                    {
                    alt67=2;
                    }
                    break;
                case 87:
                    {
                    alt67=3;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3543:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3543:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3543:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3543:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:1: (lv_left_2_0= 'left' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3545:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7675); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3558:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==85) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3559:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3559:1: (lv_outer_3_0= 'outer' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3560:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7706); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3574:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3574:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3575:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3575:1: (lv_inner_4_0= 'inner' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3576:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7745); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3590:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3590:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3591:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3591:1: (lv_cross_5_0= 'cross' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3592:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,87,FOLLOW_87_in_ruleJoinStatement7782); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,88,FOLLOW_88_in_ruleJoinStatement7809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3609:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3610:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3610:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3611:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7830);
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

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleJoinStatement7842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3631:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3632:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3632:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3633:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7863);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3657:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3658:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3659:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7899);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7909); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3666:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3669:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3670:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3670:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3670:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3670:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3676:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3677:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3677:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3678:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7964);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3694:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==68) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3694:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleResultColumn7977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3698:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3699:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3699:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3700:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7994); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3724:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3725:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3726:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue8037);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue8047); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3733:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3736:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3737:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3737:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt69=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 34:
                {
                alt69=1;
                }
                break;
            case RULE_STRING:
                {
                alt69=2;
                }
                break;
            case 89:
                {
                alt69=3;
                }
                break;
            case 90:
                {
                alt69=4;
                }
                break;
            case 91:
                {
                alt69=5;
                }
                break;
            case 92:
                {
                alt69=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3737:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3737:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3737:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3737:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3738:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3743:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3744:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3744:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3745:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue8103);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3762:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3762:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3762:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3762:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3763:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3768:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3769:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3769:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3770:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue8137); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3787:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3787:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3787:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3787:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3788:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3793:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3794:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3794:1: (lv_literal_5_0= 'null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3795:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,89,FOLLOW_89_in_ruleLiteralValue8177); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3810:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3815:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3816:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3816:1: (lv_literal_7_0= 'current_time' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3817:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue8225); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3832:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3837:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3838:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3838:1: (lv_literal_9_0= 'current_date' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3839:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,91,FOLLOW_91_in_ruleLiteralValue8273); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3854:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3859:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3860:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3860:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3861:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,92,FOLLOW_92_in_ruleLiteralValue8321); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3882:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3883:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3884:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement8371);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement8381); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3891:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3894:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3895:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3895:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt70=10;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3896:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement8428);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3906:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8455);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3916:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8482);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3926:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8509);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3936:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8536);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3946:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8563);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3956:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8590);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3966:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8617);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3976:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8644);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3986:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8671);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4002:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4003:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4004:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8706);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8716); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4011:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4014:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4015:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4015:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4015:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4015:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4016:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleCreateTableStatement8762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4025:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==94) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4026:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4026:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4027:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateTableStatement8780); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,95,FOLLOW_95_in_ruleCreateTableStatement8806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4044:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4045:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4045:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4046:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8823); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCreateTableStatement8840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4066:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4068:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8861);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4084:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==15) ) {
                    int LA72_1 = input.LA(2);

                    if ( (LA72_1==RULE_ID) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4084:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8874); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4088:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4089:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4089:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4090:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8895);
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
            	    break loop72;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4106:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==15) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4106:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8910); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4110:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4111:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4111:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4112:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8931);
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
            	    break loop73;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleCreateTableStatement8945); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4140:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4141:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4142:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8981);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement8991); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4149:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4152:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4153:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4153:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4153:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4153:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4154:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleCreateViewStatement9037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4163:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==94) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4164:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4164:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4165:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateViewStatement9055); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleCreateViewStatement9081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4182:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4183:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4183:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4184:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement9098); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleCreateViewStatement9115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4204:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4205:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4205:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4206:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement9136);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4230:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4231:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4232:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement9172);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement9182); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4239:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4242:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4243:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4243:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4243:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleCreateTriggerStatement9219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4247:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==94) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4248:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4248:1: (lv_temporary_1_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4249:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement9237); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement9263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4266:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4267:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4267:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4268:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9280); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4284:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=98 && LA77_0<=100)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4285:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4285:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4286:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4286:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt76=3;
                    switch ( input.LA(1) ) {
                    case 98:
                        {
                        alt76=1;
                        }
                        break;
                    case 99:
                        {
                        alt76=2;
                        }
                        break;
                    case 100:
                        {
                        alt76=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4287:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement9305); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4299:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement9334); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4311:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement9363); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt80=1;
                }
                break;
            case 102:
                {
                alt80=2;
                }
                break;
            case 103:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4326:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4327:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4327:1: (lv_eventType_5_0= 'delete' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4328:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement9399); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4342:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4342:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4343:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4343:1: (lv_eventType_6_0= 'insert' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4344:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement9436); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4358:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4358:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4358:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4358:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4359:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4359:1: (lv_eventType_7_0= 'update' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4360:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement9474); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4373:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==104) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4373:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9500); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4377:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4378:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4378:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4379:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9517); if (state.failed) return current;
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4395:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( (LA78_0==15) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4395:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleCreateTriggerStatement9535); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4399:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4400:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4400:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4401:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9552); if (state.failed) return current;
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
                            	    break loop78;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleCreateTriggerStatement9575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4421:1: ( (otherlv_13= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (otherlv_13= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (otherlv_13= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4423:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4434:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==105) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4435:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4435:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4436:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,105,FOLLOW_105_in_ruleCreateTriggerStatement9613); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4449:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==70) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4449:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,70,FOLLOW_70_in_ruleCreateTriggerStatement9640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4453:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4454:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4454:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4455:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9661);
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

            otherlv_17=(Token)match(input,106,FOLLOW_106_in_ruleCreateTriggerStatement9675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4475:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==75||(LA84_0>=101 && LA84_0<=103)||LA84_0==120) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4475:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4475:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4476:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4476:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4477:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9697);
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

                    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement9709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4497:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==75||(LA83_0>=101 && LA83_0<=103)||LA83_0==120) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4497:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4497:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4498:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4498:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4499:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9731);
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

                    	    otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement9743); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,66,FOLLOW_66_in_ruleCreateTriggerStatement9759); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4531:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4532:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4533:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9795);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9805); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4540:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4543:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4544:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4544:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4544:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4544:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4545:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,107,FOLLOW_107_in_ruleAlterTableRenameStatement9851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,95,FOLLOW_95_in_ruleAlterTableRenameStatement9863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4558:1: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4559:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4559:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4560:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableRenameStatement9895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4575:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4576:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4576:1: (lv_name_5_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4577:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9912); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4601:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4602:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4603:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9953);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9963); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4610:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4613:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4614:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4614:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4614:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_ruleAlterTableAddColumnStatement10000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleAlterTableAddColumnStatement10012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4622:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4623:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4623:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4624:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement10032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,109,FOLLOW_109_in_ruleAlterTableAddColumnStatement10044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4639:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4640:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4640:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4641:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement10065);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4665:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4666:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4667:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement10101);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement10111); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4674:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4677:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4678:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4678:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4678:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleDropTableStatement10148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleDropTableStatement10160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4686:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==111) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4687:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4687:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4688:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTableStatement10178); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4701:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4702:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4702:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4703:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement10212); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4722:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4723:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4724:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement10248);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement10258); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4731:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4734:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4735:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4735:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4735:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleDropTriggerStatement10295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleDropTriggerStatement10307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4743:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==111) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4744:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4744:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4745:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTriggerStatement10325); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4758:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4759:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4759:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4760:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement10359); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4779:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4780:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4781:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement10395);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement10405); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4788:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4791:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4792:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4792:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4792:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleDropViewStatement10442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleDropViewStatement10454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4800:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==111) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4802:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,111,FOLLOW_111_in_ruleDropViewStatement10472); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4815:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4816:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4816:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4817:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement10506); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4836:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4837:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4838:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10542);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement10552); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4845:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4848:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4849:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4849:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4849:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleCreateIndexStatement10589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4853:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==23) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4854:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4854:1: (lv_unique_1_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4855:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,23,FOLLOW_23_in_ruleCreateIndexStatement10607); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleCreateIndexStatement10633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4872:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4873:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4873:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4874:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10650); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleCreateIndexStatement10667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4894:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4895:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4895:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleCreateIndexStatement10699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4911:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4912:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4912:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4913:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10720);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4929:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==15) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4929:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleCreateIndexStatement10733); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4933:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4934:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4934:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4935:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10754);
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
            	    break loop89;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleCreateIndexStatement10768); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4963:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4964:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4965:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10804);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10814); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4972:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4975:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4976:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4976:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4976:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleDropIndexStatement10851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleDropIndexStatement10863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4984:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==111) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4985:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4985:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4986:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10881); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4999:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5000:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5000:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5001:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10915); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5020:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5021:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5022:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10951);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10961); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5029:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5032:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5033:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5033:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5033:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5033:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5034:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5039:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5040:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5041:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef11012); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5057:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5058:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5058:1: (lv_type_2_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5059:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef11038);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5075:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==23||LA91_0==57||LA91_0==113||(LA91_0>=115 && LA91_0<=116)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5076:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5076:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5077:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef11059);
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
            	    break loop91;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5101:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5102:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5103:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint11096);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint11106); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5110:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5113:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5114:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5114:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            int alt96=5;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt96=1;
                }
                break;
            case 57:
                {
                alt96=2;
                }
                break;
            case 23:
                {
                alt96=3;
                }
                break;
            case 115:
                {
                alt96=4;
                }
                break;
            case 116:
                {
                alt96=5;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5114:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5114:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5114:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5114:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5115:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,113,FOLLOW_113_in_ruleColumnConstraint11153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5124:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt92=3;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==81) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==82) ) {
                        alt92=2;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5124:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5124:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5125:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5125:1: (lv_asc_2_0= 'asc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5126:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,81,FOLLOW_81_in_ruleColumnConstraint11172); if (state.failed) return current;
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
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5140:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5140:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5141:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5141:1: (lv_desc_3_0= 'desc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5142:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,82,FOLLOW_82_in_ruleColumnConstraint11209); if (state.failed) return current;
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

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5155:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==114) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5156:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5156:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5157:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,114,FOLLOW_114_in_ruleColumnConstraint11242); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5171:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5171:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5171:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5171:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5172:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleColumnConstraint11285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5181:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==22) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5182:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5182:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5183:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint11306);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5200:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5200:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5200:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5200:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5201:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleColumnConstraint11336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5210:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==22) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5211:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5211:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5212:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint11357);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5229:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5229:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5229:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5229:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5230:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint11387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5239:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5240:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5240:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5241:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint11408);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5258:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5258:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5258:7: () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5258:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5259:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getCheckConstraintAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,116,FOLLOW_116_in_ruleColumnConstraint11437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getColumnConstraintAccess().getCheckKeyword_4_1());
                          
                    }
                    otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleColumnConstraint11449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getColumnConstraintAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5272:1: ( (lv_expression_17_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5273:1: (lv_expression_17_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5273:1: (lv_expression_17_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5274:3: lv_expression_17_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11470);
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

                    otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleColumnConstraint11482); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5302:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5303:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5304:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11519);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint11529); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5311:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5314:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5315:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5315:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt97=3;
            switch ( input.LA(1) ) {
            case 117:
                {
                int LA97_1 = input.LA(2);

                if ( (LA97_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 113:
                        {
                        alt97=2;
                        }
                        break;
                    case 116:
                        {
                        alt97=3;
                        }
                        break;
                    case 23:
                        {
                        alt97=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt97=1;
                }
                break;
            case 113:
                {
                alt97=2;
                }
                break;
            case 116:
                {
                alt97=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5316:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11576);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5326:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11603);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5336:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11630);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5352:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5353:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5354:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11665);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11675); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5361:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5364:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5365:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5365:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5365:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5365:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==117) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5365:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,117,FOLLOW_117_in_ruleUniqueTableConstraint11713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5369:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5370:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5370:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5371:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11730); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUniqueTableConstraint11749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUniqueTableConstraint11761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5395:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5396:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5396:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5397:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11782);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5413:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==15) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5413:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleUniqueTableConstraint11795); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5417:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5418:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5418:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5419:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11816);
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
            	    break loop99;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleUniqueTableConstraint11830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5439:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5440:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5440:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5441:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11851);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5465:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5466:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5467:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11887);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11897); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5474:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5477:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5478:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5478:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5478:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5478:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==117) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5478:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,117,FOLLOW_117_in_rulePrimaryConstraint11935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5482:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5483:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5483:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5484:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11952); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,113,FOLLOW_113_in_rulePrimaryConstraint11971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePrimaryConstraint11983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5508:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5509:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5509:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5510:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12004);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5526:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==15) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5526:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePrimaryConstraint12017); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5530:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5531:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5531:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5532:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12038);
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
            	    break loop101;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePrimaryConstraint12052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5552:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5553:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5553:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5554:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint12073);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5578:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5579:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5580:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint12109);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint12119); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5587:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5590:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5591:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5591:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5591:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5591:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==117) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5591:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,117,FOLLOW_117_in_ruleCheckTableConstraint12157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5595:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5596:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5596:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5597:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint12174); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,116,FOLLOW_116_in_ruleCheckTableConstraint12193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCheckTableConstraint12205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5621:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5622:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5622:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5623:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint12226);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleCheckTableConstraint12238); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5651:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5652:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5653:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn12274);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn12284); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5660:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5663:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5664:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5664:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5664:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5664:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5665:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5665:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5666:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn12329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5677:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==118) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5677:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,118,FOLLOW_118_in_ruleIndexedColumn12342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5681:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5682:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5682:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5683:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn12359); if (state.failed) return current;
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5699:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt104=3;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==81) ) {
                alt104=1;
            }
            else if ( (LA104_0==82) ) {
                alt104=2;
            }
            switch (alt104) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5699:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5699:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5700:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5700:1: (lv_asc_3_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5701:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,81,FOLLOW_81_in_ruleIndexedColumn12385); if (state.failed) return current;
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5715:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5715:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5716:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5716:1: (lv_desc_4_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5717:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,82,FOLLOW_82_in_ruleIndexedColumn12422); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5738:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5739:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5740:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12473);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue12483); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5747:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5750:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5751:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5751:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=RULE_STRING && LA105_0<=RULE_NUMBER)||LA105_0==34||(LA105_0>=89 && LA105_0<=92)) ) {
                alt105=1;
            }
            else if ( (LA105_0==14) ) {
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5751:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5751:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5751:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5751:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5752:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5757:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5758:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5758:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5759:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue12539);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5776:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5776:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5776:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5776:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5777:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDefaultValue12568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5786:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5787:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5787:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5788:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue12589);
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

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDefaultValue12601); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5816:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5817:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5818:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause12638);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause12648); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5825:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5828:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5829:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5829:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5829:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleConflictClause12685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,119,FOLLOW_119_in_ruleConflictClause12697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5837:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5838:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5838:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5839:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12718);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5863:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5864:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5865:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12754);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12764); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5872:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5875:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5876:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5876:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt106=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt106=1;
                }
                break;
            case 102:
            case 120:
                {
                alt106=2;
                }
                break;
            case 103:
                {
                alt106=3;
                }
                break;
            case 101:
                {
                alt106=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5877:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12811);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5887:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12838);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5897:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12865);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5907:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12892);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5923:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5924:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5925:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12927);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12937); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5932:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5935:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5936:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5936:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5936:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleDeleteStatement12974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDeleteStatement12986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5944:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5945:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5945:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5946:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement13006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==78) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_78_in_ruleDeleteStatement13019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5961:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5962:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5962:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5963:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement13040);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5987:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5988:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5989:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement13078);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement13088); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5996:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5999:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==102) ) {
                alt109=1;
            }
            else if ( (LA109_0==120) ) {
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6000:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleInsertStatement13127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6004:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==55) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6004:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleInsertStatement13140); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6008:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6009:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6009:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6010:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement13161);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6027:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,120,FOLLOW_120_in_ruleInsertStatement13182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement13195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6035:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6036:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6036:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6037:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement13215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6048:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==14) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6048:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement13228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6052:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6053:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6053:1: (otherlv_7= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6054:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement13248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6065:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==15) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6065:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement13261); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6069:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6070:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6070:1: (otherlv_9= RULE_ID )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6071:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement13281); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement13295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==75||LA114_0==122) ) {
                alt114=1;
            }
            else if ( (LA114_0==115) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==122) ) {
                        alt113=1;
                    }
                    else if ( (LA113_0==75) ) {
                        alt113=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }
                    switch (alt113) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6086:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,122,FOLLOW_122_in_ruleInsertStatement13312); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleInsertStatement13324); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6094:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6095:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6096:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement13345);
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

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6112:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop112:
                            do {
                                int alt112=2;
                                int LA112_0 = input.LA(1);

                                if ( (LA112_0==15) ) {
                                    alt112=1;
                                }


                                switch (alt112) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6112:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement13358); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6116:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6117:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6117:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6118:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement13379);
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
                            	    break loop112;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement13393); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6140:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6140:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6141:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement13421);
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
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6158:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,115,FOLLOW_115_in_ruleInsertStatement13441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,122,FOLLOW_122_in_ruleInsertStatement13453); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6174:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6175:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6176:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13491);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement13501); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6183:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6186:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6187:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6187:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6187:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleUpdateStatement13538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6191:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==55) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6191:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleUpdateStatement13551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6195:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6196:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6196:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6197:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13572);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:4: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6214:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6214:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6215:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement13594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,123,FOLLOW_123_in_ruleUpdateStatement13606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6230:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6231:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6231:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6232:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13627);
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

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6248:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==15) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6248:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleUpdateStatement13640); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6252:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6254:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13661);
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
            	    break loop116;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==78) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleUpdateStatement13676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6274:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6275:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6275:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6276:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13697);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6300:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6301:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6302:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13735);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13745); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6309:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6312:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6313:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6313:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6313:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6313:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6314:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6314:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6315:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleUpdateColumnExpression13802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6330:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6331:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6331:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6332:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13823);
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6356:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6357:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6358:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13860);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13871); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6365:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6368:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6369:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6369:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6369:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6369:2: (kw= '-' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==34) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6370:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleSignedNumber13910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13927); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6390:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6391:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6392:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13973);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13984); if (state.failed) return current;

            }

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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6399:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6402:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6403:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6403:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6403:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6410:1: (kw= '.' this_ID_2= RULE_ID )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==61) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6411:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,61,FOLLOW_61_in_ruleQualifiedName14043); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14058); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop119;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6431:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6433:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6434:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6434:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt120=1;
                }
                break;
            case 125:
                {
                alt120=2;
                }
                break;
            case 126:
                {
                alt120=3;
                }
                break;
            case 127:
                {
                alt120=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6434:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6434:2: (enumLiteral_0= 'union all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6434:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_124_in_ruleCompoundOperator14119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6440:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6440:6: (enumLiteral_1= 'union' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6440:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_125_in_ruleCompoundOperator14136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6446:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6446:6: (enumLiteral_2= 'intersect' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6446:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator14153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6452:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6452:6: (enumLiteral_3= 'except' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6452:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,127,FOLLOW_127_in_ruleCompoundOperator14170); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6462:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6464:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6465:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6465:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt121=6;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt121=1;
                }
                break;
            case 129:
                {
                alt121=2;
                }
                break;
            case 130:
                {
                alt121=3;
                }
                break;
            case 131:
                {
                alt121=4;
                }
                break;
            case 132:
                {
                alt121=5;
                }
                break;
            case 133:
                {
                alt121=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6465:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6465:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6465:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_128_in_ruleSqliteDataType14215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6471:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6471:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6471:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_129_in_ruleSqliteDataType14232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6477:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6477:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6477:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType14249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6483:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6483:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6483:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType14266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6489:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6489:6: (enumLiteral_4= 'none' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6489:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType14283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6495:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6495:6: (enumLiteral_5= 'numeric' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6495:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,133,FOLLOW_133_in_ruleSqliteDataType14300); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6505:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6507:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6508:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6508:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt122=5;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt122=1;
                }
                break;
            case 129:
                {
                alt122=2;
                }
                break;
            case 130:
                {
                alt122=3;
                }
                break;
            case 131:
                {
                alt122=4;
                }
                break;
            case 134:
                {
                alt122=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6508:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6508:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6508:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_128_in_ruleColumnType14345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6514:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6514:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6514:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_129_in_ruleColumnType14362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6520:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6520:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6520:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_130_in_ruleColumnType14379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6526:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6526:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6526:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_131_in_ruleColumnType14396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6532:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6532:6: (enumLiteral_4= 'boolean' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6532:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,134,FOLLOW_134_in_ruleColumnType14413); if (state.failed) return current;
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
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6542:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6544:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6545:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6545:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt123=5;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt123=1;
                }
                break;
            case 136:
                {
                alt123=2;
                }
                break;
            case 137:
                {
                alt123=3;
                }
                break;
            case 138:
                {
                alt123=4;
                }
                break;
            case 120:
                {
                alt123=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6545:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6545:2: (enumLiteral_0= 'rollback' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6545:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,135,FOLLOW_135_in_ruleConflictResolution14458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6551:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6551:6: (enumLiteral_1= 'abort' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6551:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,136,FOLLOW_136_in_ruleConflictResolution14475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6557:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6557:6: (enumLiteral_2= 'fail' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6557:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution14492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6563:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6563:6: (enumLiteral_3= 'ignore' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6563:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,138,FOLLOW_138_in_ruleConflictResolution14509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6569:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6569:6: (enumLiteral_4= 'replace' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6569:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,120,FOLLOW_120_in_ruleConflictResolution14526); if (state.failed) return current;
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
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1997:5: ( ( RULE_ID ) )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1998:1: ( RULE_ID )
        {
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1998:1: ( RULE_ID )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1999:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang4447); if (state.failed) return ;

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


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA45_eotS =
        "\15\uffff";
    static final String DFA45_eofS =
        "\3\uffff\1\13\11\uffff";
    static final String DFA45_minS =
        "\1\4\2\uffff\1\15\1\uffff\1\4\7\uffff";
    static final String DFA45_maxS =
        "\1\134\2\uffff\1\177\1\uffff\1\134\7\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\10\1\3\1\5";
    static final String DFA45_specialS =
        "\15\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\3\2\4\7\uffff\1\5\23\uffff\1\4\30\uffff\1\1\1\2\1\uffff\2\6\1\7\2\uffff\1\10\1\uffff\1\11\23\uffff\4\4",
            "",
            "",
            "\1\13\1\12\2\13\2\uffff\1\13\1\uffff\1\13\3\uffff\1\13\1\uffff\40\13\2\uffff\1\13\3\uffff\2\13\1\uffff\1\13\1\uffff\5\13\3\uffff\7\13\1\uffff\3\13\4\uffff\1\13\14\uffff\2\13\2\uffff\1\13\15\uffff\4\13",
            "",
            "\3\14\7\uffff\1\14\23\uffff\1\14\30\uffff\2\14\1\uffff\3\14\2\uffff\1\14\1\uffff\1\14\5\uffff\1\6\15\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1943:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA37_eotS =
        "\127\uffff";
    static final String DFA37_eofS =
        "\1\uffff\1\2\1\uffff\1\43\33\uffff\1\105\67\uffff";
    static final String DFA37_minS =
        "\1\4\1\15\1\uffff\1\4\33\uffff\1\4\46\uffff\1\4\17\uffff\1\0";
    static final String DFA37_maxS =
        "\1\4\1\177\1\uffff\1\177\33\uffff\1\177\46\uffff\1\134\17\uffff\1\0";
    static final String DFA37_acceptS =
        "\2\uffff\1\3\1\uffff\33\1\1\uffff\45\1\1\2\1\uffff\17\1\1\uffff";
    static final String DFA37_specialS =
        "\3\uffff\1\0\33\uffff\1\1\66\uffff\1\2}>";
    static final String[] DFA37_transitionS = {
            "\1\1",
            "\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\40\2\2\uffff\1\3\3\uffff\2\2\1\uffff\1\2\1\uffff\5\2\3\uffff\7\2\1\uffff\3\2\4\uffff\1\2\14\uffff\2\2\2\uffff\1\2\15\uffff\4\2",
            "",
            "\1\105\10\uffff\1\54\1\uffff\1\47\1\44\2\uffff\1\62\1\uffff\1\55\3\uffff\1\40\1\uffff\1\21\1\61\1\103\1\42\1\37\1\41\1\35\1\36\1\31\1\32\1\33\1\34\1\25\1\26\1\27\1\30\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\22\1\23\1\24\1\10\1\7\1\4\1\5\1\6\6\uffff\1\52\1\46\1\uffff\1\50\1\uffff\1\45\1\51\1\71\1\72\1\53\3\uffff\1\75\1\63\1\64\1\73\1\74\1\76\1\77\1\uffff\1\100\1\101\1\102\4\uffff\1\56\14\uffff\1\104\1\57\2\uffff\1\60\15\uffff\1\65\1\66\1\67\1\70",
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
            "\1\111\1\113\1\112\6\uffff\1\105\1\120\2\105\2\uffff\1\105\1\uffff\1\105\3\uffff\1\105\1\uffff\7\105\1\106\30\105\1\107\1\110\1\uffff\1\121\1\122\1\123\2\105\1\124\1\105\1\125\5\105\3\uffff\7\105\1\uffff\3\105\1\114\1\115\1\116\1\117\1\105\14\uffff\2\105\2\uffff\1\105\15\uffff\4\105",
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
            "\2\105\1\126\7\uffff\1\105\23\uffff\1\105\30\uffff\2\105\1\uffff\3\105\2\uffff\1\105\1\uffff\1\105\23\uffff\4\105",
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
            return "1997:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_3==56) && (synpred1_InternalMickeyLang())) {s = 4;}

                        else if ( (LA37_3==57) && (synpred1_InternalMickeyLang())) {s = 5;}

                        else if ( (LA37_3==58) && (synpred1_InternalMickeyLang())) {s = 6;}

                        else if ( (LA37_3==55) && (synpred1_InternalMickeyLang())) {s = 7;}

                        else if ( (LA37_3==54) && (synpred1_InternalMickeyLang())) {s = 8;}

                        else if ( (LA37_3==43) && (synpred1_InternalMickeyLang())) {s = 9;}

                        else if ( (LA37_3==44) && (synpred1_InternalMickeyLang())) {s = 10;}

                        else if ( (LA37_3==45) && (synpred1_InternalMickeyLang())) {s = 11;}

                        else if ( (LA37_3==46) && (synpred1_InternalMickeyLang())) {s = 12;}

                        else if ( (LA37_3==47) && (synpred1_InternalMickeyLang())) {s = 13;}

                        else if ( (LA37_3==48) && (synpred1_InternalMickeyLang())) {s = 14;}

                        else if ( (LA37_3==49) && (synpred1_InternalMickeyLang())) {s = 15;}

                        else if ( (LA37_3==50) && (synpred1_InternalMickeyLang())) {s = 16;}

                        else if ( (LA37_3==27) && (synpred1_InternalMickeyLang())) {s = 17;}

                        else if ( (LA37_3==51) && (synpred1_InternalMickeyLang())) {s = 18;}

                        else if ( (LA37_3==52) && (synpred1_InternalMickeyLang())) {s = 19;}

                        else if ( (LA37_3==53) && (synpred1_InternalMickeyLang())) {s = 20;}

                        else if ( (LA37_3==39) && (synpred1_InternalMickeyLang())) {s = 21;}

                        else if ( (LA37_3==40) && (synpred1_InternalMickeyLang())) {s = 22;}

                        else if ( (LA37_3==41) && (synpred1_InternalMickeyLang())) {s = 23;}

                        else if ( (LA37_3==42) && (synpred1_InternalMickeyLang())) {s = 24;}

                        else if ( (LA37_3==35) && (synpred1_InternalMickeyLang())) {s = 25;}

                        else if ( (LA37_3==36) && (synpred1_InternalMickeyLang())) {s = 26;}

                        else if ( (LA37_3==37) && (synpred1_InternalMickeyLang())) {s = 27;}

                        else if ( (LA37_3==38) && (synpred1_InternalMickeyLang())) {s = 28;}

                        else if ( (LA37_3==33) && (synpred1_InternalMickeyLang())) {s = 29;}

                        else if ( (LA37_3==34) && (synpred1_InternalMickeyLang())) {s = 30;}

                        else if ( (LA37_3==31) ) {s = 31;}

                        else if ( (LA37_3==25) && (synpred1_InternalMickeyLang())) {s = 32;}

                        else if ( (LA37_3==32) && (synpred1_InternalMickeyLang())) {s = 33;}

                        else if ( (LA37_3==30) && (synpred1_InternalMickeyLang())) {s = 34;}

                        else if ( (LA37_3==EOF) && (synpred1_InternalMickeyLang())) {s = 35;}

                        else if ( (LA37_3==16) && (synpred1_InternalMickeyLang())) {s = 36;}

                        else if ( (LA37_3==70) && (synpred1_InternalMickeyLang())) {s = 37;}

                        else if ( (LA37_3==66) && (synpred1_InternalMickeyLang())) {s = 38;}

                        else if ( (LA37_3==15) && (synpred1_InternalMickeyLang())) {s = 39;}

                        else if ( (LA37_3==68) && (synpred1_InternalMickeyLang())) {s = 40;}

                        else if ( (LA37_3==71) && (synpred1_InternalMickeyLang())) {s = 41;}

                        else if ( (LA37_3==65) && (synpred1_InternalMickeyLang())) {s = 42;}

                        else if ( (LA37_3==74) && (synpred1_InternalMickeyLang())) {s = 43;}

                        else if ( (LA37_3==13) && (synpred1_InternalMickeyLang())) {s = 44;}

                        else if ( (LA37_3==21) && (synpred1_InternalMickeyLang())) {s = 45;}

                        else if ( (LA37_3==93) && (synpred1_InternalMickeyLang())) {s = 46;}

                        else if ( (LA37_3==107) && (synpred1_InternalMickeyLang())) {s = 47;}

                        else if ( (LA37_3==110) && (synpred1_InternalMickeyLang())) {s = 48;}

                        else if ( (LA37_3==28) && (synpred1_InternalMickeyLang())) {s = 49;}

                        else if ( (LA37_3==19) && (synpred1_InternalMickeyLang())) {s = 50;}

                        else if ( (LA37_3==79) && (synpred1_InternalMickeyLang())) {s = 51;}

                        else if ( (LA37_3==80) && (synpred1_InternalMickeyLang())) {s = 52;}

                        else if ( (LA37_3==124) && (synpred1_InternalMickeyLang())) {s = 53;}

                        else if ( (LA37_3==125) && (synpred1_InternalMickeyLang())) {s = 54;}

                        else if ( (LA37_3==126) && (synpred1_InternalMickeyLang())) {s = 55;}

                        else if ( (LA37_3==127) && (synpred1_InternalMickeyLang())) {s = 56;}

                        else if ( (LA37_3==72) && (synpred1_InternalMickeyLang())) {s = 57;}

                        else if ( (LA37_3==73) && (synpred1_InternalMickeyLang())) {s = 58;}

                        else if ( (LA37_3==81) && (synpred1_InternalMickeyLang())) {s = 59;}

                        else if ( (LA37_3==82) && (synpred1_InternalMickeyLang())) {s = 60;}

                        else if ( (LA37_3==78) && (synpred1_InternalMickeyLang())) {s = 61;}

                        else if ( (LA37_3==83) && (synpred1_InternalMickeyLang())) {s = 62;}

                        else if ( (LA37_3==84) && (synpred1_InternalMickeyLang())) {s = 63;}

                        else if ( (LA37_3==86) && (synpred1_InternalMickeyLang())) {s = 64;}

                        else if ( (LA37_3==87) && (synpred1_InternalMickeyLang())) {s = 65;}

                        else if ( (LA37_3==88) && (synpred1_InternalMickeyLang())) {s = 66;}

                        else if ( (LA37_3==29) && (synpred1_InternalMickeyLang())) {s = 67;}

                        else if ( (LA37_3==106) && (synpred1_InternalMickeyLang())) {s = 68;}

                        else if ( (LA37_3==RULE_ID) ) {s = 69;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_31 = input.LA(1);

                         
                        int index37_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_31==EOF||LA37_31==13||(LA37_31>=15 && LA37_31<=16)||LA37_31==19||LA37_31==21||LA37_31==25||(LA37_31>=27 && LA37_31<=33)||(LA37_31>=35 && LA37_31<=58)||(LA37_31>=65 && LA37_31<=66)||LA37_31==68||(LA37_31>=70 && LA37_31<=74)||(LA37_31>=78 && LA37_31<=84)||(LA37_31>=86 && LA37_31<=88)||LA37_31==93||(LA37_31>=106 && LA37_31<=107)||LA37_31==110||(LA37_31>=124 && LA37_31<=127)) ) {s = 69;}

                        else if ( (LA37_31==34) ) {s = 70;}

                        else if ( (LA37_31==59) && (synpred1_InternalMickeyLang())) {s = 71;}

                        else if ( (LA37_31==60) && (synpred1_InternalMickeyLang())) {s = 72;}

                        else if ( (LA37_31==RULE_ID) && (synpred1_InternalMickeyLang())) {s = 73;}

                        else if ( (LA37_31==RULE_NUMBER) && (synpred1_InternalMickeyLang())) {s = 74;}

                        else if ( (LA37_31==RULE_STRING) && (synpred1_InternalMickeyLang())) {s = 75;}

                        else if ( (LA37_31==89) && (synpred1_InternalMickeyLang())) {s = 76;}

                        else if ( (LA37_31==90) && (synpred1_InternalMickeyLang())) {s = 77;}

                        else if ( (LA37_31==91) && (synpred1_InternalMickeyLang())) {s = 78;}

                        else if ( (LA37_31==92) && (synpred1_InternalMickeyLang())) {s = 79;}

                        else if ( (LA37_31==14) && (synpred1_InternalMickeyLang())) {s = 80;}

                        else if ( (LA37_31==62) && (synpred1_InternalMickeyLang())) {s = 81;}

                        else if ( (LA37_31==63) && (synpred1_InternalMickeyLang())) {s = 82;}

                        else if ( (LA37_31==64) && (synpred1_InternalMickeyLang())) {s = 83;}

                        else if ( (LA37_31==67) && (synpred1_InternalMickeyLang())) {s = 84;}

                        else if ( (LA37_31==69) && (synpred1_InternalMickeyLang())) {s = 85;}

                         
                        input.seek(index37_31);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_86 = input.LA(1);

                         
                        int index37_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMickeyLang()) ) {s = 85;}

                        else if ( (true) ) {s = 69;}

                         
                        input.seek(index37_86);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\21\uffff";
    static final String DFA70_eofS =
        "\21\uffff";
    static final String DFA70_minS =
        "\1\135\1\27\3\137\4\uffff\1\4\4\uffff\1\154\2\uffff";
    static final String DFA70_maxS =
        "\1\156\1\160\1\137\1\160\1\141\4\uffff\1\4\4\uffff\1\155\2\uffff";
    static final String DFA70_acceptS =
        "\5\uffff\1\3\1\1\1\4\1\2\1\uffff\1\10\1\11\1\12\1\7\1\uffff\1\6\1\5";
    static final String DFA70_specialS =
        "\21\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\7\106\uffff\1\4\1\6\1\10\1\5\16\uffff\1\7",
            "\1\11",
            "\1\15\1\13\1\12\16\uffff\1\14",
            "\1\6\1\10\1\5",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3895:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMickeyFile_in_entryRuleMickeyFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMickeyFile122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFile143 = new BitSet(new long[]{0x0000000010202002L,0x0000480020000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_ruleMickeyFile164 = new BitSet(new long[]{0x0000000010202002L,0x0000480020000000L});
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
    public static final BitSet FOLLOW_14_in_ruleMickeyFunction455 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleMickeyFunction477 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleMickeyFunction490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleMickeyFunction511 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleMickeyFunction527 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleMickeyFunction540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFunction563 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMickeyFunction577 = new BitSet(new long[]{0x0000000000100000L,0x010000E000000800L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleMickeyFunction599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMickeyFunction611 = new BitSet(new long[]{0x0000000000100000L,0x010000E000000800L});
    public static final BitSet FOLLOW_20_in_ruleMickeyFunction625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleActionStatement708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement725 = new BitSet(new long[]{0x0000000002440010L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleActionStatement751 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActionStatement763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActionStatement786 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_23_in_ruleActionStatement804 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleActionStatement831 = new BitSet(new long[]{0x0000000005100000L});
    public static final BitSet FOLLOW_ruleContentUriQueryParam_in_ruleActionStatement852 = new BitSet(new long[]{0x0000000005100000L});
    public static final BitSet FOLLOW_ruleContentNotificationUri_in_ruleActionStatement874 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleActionStatement887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentNotificationUri_in_entryRuleContentNotificationUri925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentNotificationUri935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleContentNotificationUri972 = new BitSet(new long[]{0x0000000002040010L});
    public static final BitSet FOLLOW_ruleNotifyContentUri_in_ruleContentNotificationUri993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg1085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotifyContentUri_in_entryRuleNotifyContentUri1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotifyContentUri1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1208 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleNotifyContentUri1222 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1243 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleNotifyContentUriSegment_in_entryRuleNotifyContentUriSegment1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotifyContentUriSegment1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNotifyContentUriSegment1366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1383 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNotifyContentUriSegment1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1502 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleContentUri1516 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1537 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleContentUriQueryParam_in_entryRuleContentUriQueryParam1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriQueryParam1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContentUriQueryParam1622 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleContentUriQueryParam1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriQueryParam1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleContentUriSegment1795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1815 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContentUriSegment1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMigrationBlock1920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationBlock1937 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleMigrationBlock1955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMigrationBlock1978 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock1992 = new BitSet(new long[]{0x0000000000100000L,0x0000480020000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock2014 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock2026 = new BitSet(new long[]{0x0000000000100000L,0x0000480020000000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationBlock2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat2223 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleExprConcat2250 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat2284 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2379 = new BitSet(new long[]{0x0000000182000002L});
    public static final BitSet FOLLOW_31_in_ruleExprMult2408 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_25_in_ruleExprMult2437 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_32_in_ruleExprMult2466 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2503 = new BitSet(new long[]{0x0000000182000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd2541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2598 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleExprAdd2627 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_34_in_ruleExprAdd2656 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2693 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2788 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_35_in_ruleExprBit2817 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_36_in_ruleExprBit2846 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_37_in_ruleExprBit2875 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_38_in_ruleExprBit2904 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2941 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate3036 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprRelate3065 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_40_in_ruleExprRelate3094 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_41_in_ruleExprRelate3123 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_42_in_ruleExprRelate3152 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate3189 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3284 = new BitSet(new long[]{0x003FF80008000002L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual3313 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual3342 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual3371 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual3400 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual3429 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_48_in_ruleExprEqual3458 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_49_in_ruleExprEqual3487 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_50_in_ruleExprEqual3516 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_27_in_ruleExprEqual3545 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_51_in_ruleExprEqual3574 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_52_in_ruleExprEqual3603 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_53_in_ruleExprEqual3632 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3669 = new BitSet(new long[]{0x003FF80008000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3764 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExprAnd3791 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3825 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3920 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleExprOr3947 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3981 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression4019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression4076 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression4144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullExpression4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNullExpression4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNullExpression4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression4344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4464 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4504 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4516 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_rulePrimaryExpression4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4670 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4691 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4738 = new BitSet(new long[]{0x8000000000004000L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4770 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression4796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4858 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000069L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4879 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000069L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4901 = new BitSet(new long[]{0xD800000400004070L,0x000000001E00006FL});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4915 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_rulePrimaryExpression4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4984 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression5001 = new BitSet(new long[]{0xD800000480004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_31_in_rulePrimaryExpression5020 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5061 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression5074 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5095 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePrimaryExpression5140 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression5152 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_rulePrimaryExpression5185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression5206 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePrimaryExpression5247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase5304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCase5351 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase5372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleCase5384 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement5497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleSelectStatement5510 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleSelectStatement5546 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5567 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleSelectStatement5581 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_15_in_ruleSelectStatement5599 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5717 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOrderingTermList5730 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5751 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5846 = new BitSet(new long[]{0x0000000000000002L,0xF000000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5897 = new BitSet(new long[]{0x0000000000000002L,0xF000000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5991 = new BitSet(new long[]{0xD800000480004070L,0x000000001E003029L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression6010 = new BitSet(new long[]{0xD800000480004070L,0x000000001E003029L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression6047 = new BitSet(new long[]{0xD800000480004070L,0x000000001E003029L});
    public static final BitSet FOLLOW_31_in_ruleSelectExpression6081 = new BitSet(new long[]{0x0000000020000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression6121 = new BitSet(new long[]{0x0000000020000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_29_in_ruleSelectExpression6135 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression6156 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_78_in_ruleSelectExpression6171 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression6192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleSelectExpression6207 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression6228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelectExpression6243 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList6302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList6358 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSelectList6371 = new BitSet(new long[]{0xD800000480004070L,0x000000001E003029L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList6392 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6576 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGroupByExpressions6589 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6610 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleOrderingTerm6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOrderingTerm6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6957 = new BitSet(new long[]{0x0000000000000002L,0x0000000001D80000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6978 = new BitSet(new long[]{0x0000000000000002L,0x0000000001D80000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource7015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable7161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable7228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSingleSourceTable7241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement7301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceSelectStatement7357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement7378 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceSelectStatement7390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSingleSourceSelectStatement7403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSingleSourceJoin7510 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7531 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleSourceJoin7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement7641 = new BitSet(new long[]{0x0000000000000000L,0x0000000001D00000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7675 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7706 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7745 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_87_in_ruleJoinStatement7782 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleJoinStatement7809 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7830 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleJoinStatement7842 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleResultColumn7977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue8037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralValue8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleLiteralValue8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleLiteralValue8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement8371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCreateTableStatement8762 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTableStatement8780 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTableStatement8806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8823 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateTableStatement8840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8861 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8895 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8910 = new BitSet(new long[]{0x0000000000800000L,0x0032000000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8931 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTableStatement8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement8991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCreateViewStatement9037 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateViewStatement9055 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateViewStatement9081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement9098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleCreateViewStatement9115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement9172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCreateTriggerStatement9219 = new BitSet(new long[]{0x0000000000000000L,0x0000000240000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement9237 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement9263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9280 = new BitSet(new long[]{0x0000000000000000L,0x000000FC00000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement9305 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement9334 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement9363 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement9399 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement9436 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement9474 = new BitSet(new long[]{0x0000000000400000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9517 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTriggerStatement9535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9552 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTriggerStatement9575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9595 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000040L});
    public static final BitSet FOLLOW_105_in_ruleCreateTriggerStatement9613 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000040L});
    public static final BitSet FOLLOW_70_in_ruleCreateTriggerStatement9640 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9661 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleCreateTriggerStatement9675 = new BitSet(new long[]{0x0000000000000000L,0x010000E000000804L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9697 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement9709 = new BitSet(new long[]{0x0000000000000000L,0x010000E000000804L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9731 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement9743 = new BitSet(new long[]{0x0000000000000000L,0x010000E000000804L});
    public static final BitSet FOLLOW_66_in_ruleCreateTriggerStatement9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAlterTableRenameStatement9851 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleAlterTableRenameStatement9863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9883 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableRenameStatement9895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAlterTableAddColumnStatement10000 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleAlterTableAddColumnStatement10012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement10032 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleAlterTableAddColumnStatement10044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement10101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleDropTableStatement10148 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleDropTableStatement10160 = new BitSet(new long[]{0x0000000000000010L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropTableStatement10178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement10212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement10248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleDropTriggerStatement10295 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDropTriggerStatement10307 = new BitSet(new long[]{0x0000000000000010L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropTriggerStatement10325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement10395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleDropViewStatement10442 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleDropViewStatement10454 = new BitSet(new long[]{0x0000000000000010L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropViewStatement10472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCreateIndexStatement10589 = new BitSet(new long[]{0x0000000000800000L,0x0001000000000000L});
    public static final BitSet FOLLOW_23_in_ruleCreateIndexStatement10607 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleCreateIndexStatement10633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10650 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCreateIndexStatement10667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCreateIndexStatement10699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10720 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleCreateIndexStatement10733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10754 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleCreateIndexStatement10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleDropIndexStatement10851 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropIndexStatement10863 = new BitSet(new long[]{0x0000000000000010L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef11012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef11038 = new BitSet(new long[]{0x0200000000800002L,0x001A000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef11059 = new BitSet(new long[]{0x0200000000800002L,0x001A000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint11096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleColumnConstraint11153 = new BitSet(new long[]{0x0000000000000002L,0x0004000000060000L});
    public static final BitSet FOLLOW_81_in_ruleColumnConstraint11172 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_82_in_ruleColumnConstraint11209 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleColumnConstraint11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleColumnConstraint11285 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColumnConstraint11336 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint11387 = new BitSet(new long[]{0x0000000400004060L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleColumnConstraint11437 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleColumnConstraint11449 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11470 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColumnConstraint11482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleUniqueTableConstraint11713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUniqueTableConstraint11749 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUniqueTableConstraint11761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11782 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleUniqueTableConstraint11795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11816 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleUniqueTableConstraint11830 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_rulePrimaryConstraint11935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11952 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_rulePrimaryConstraint11971 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrimaryConstraint11983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12004 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryConstraint12017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12038 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryConstraint12052 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint12109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint12119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleCheckTableConstraint12157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint12174 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleCheckTableConstraint12193 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCheckTableConstraint12205 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint12226 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCheckTableConstraint12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn12274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn12329 = new BitSet(new long[]{0x0000000000000002L,0x0040000000060000L});
    public static final BitSet FOLLOW_118_in_ruleIndexedColumn12342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn12359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleIndexedColumn12385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleIndexedColumn12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue12483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue12539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefaultValue12568 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue12589 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultValue12601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause12638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause12648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConflictClause12685 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleConflictClause12697 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleDeleteStatement12974 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDeleteStatement12986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement13006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleDeleteStatement13019 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement13040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement13078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleInsertStatement13127 = new BitSet(new long[]{0x0080000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInsertStatement13140 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement13161 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_120_in_ruleInsertStatement13182 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement13195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement13215 = new BitSet(new long[]{0x0000000000004000L,0x0408000000000800L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement13228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement13248 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement13261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement13281 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement13295 = new BitSet(new long[]{0x0000000000000000L,0x0408000000000800L});
    public static final BitSet FOLLOW_122_in_ruleInsertStatement13312 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInsertStatement13324 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement13345 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement13358 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement13379 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement13393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleInsertStatement13441 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleInsertStatement13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleUpdateStatement13538 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleUpdateStatement13551 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement13594 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleUpdateStatement13606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13627 = new BitSet(new long[]{0x0000000000008002L,0x0000000000004000L});
    public static final BitSet FOLLOW_15_in_ruleUpdateStatement13640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13661 = new BitSet(new long[]{0x0000000000008002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleUpdateStatement13676 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13790 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleUpdateColumnExpression13802 = new BitSet(new long[]{0xD800000400004070L,0x000000001E000029L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSignedNumber13910 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14024 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleQualifiedName14043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14058 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleCompoundOperator14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleCompoundOperator14136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator14153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleCompoundOperator14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSqliteDataType14215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSqliteDataType14232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType14249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType14266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType14283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSqliteDataType14300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleColumnType14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleColumnType14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleColumnType14396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleColumnType14413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleConflictResolution14458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleConflictResolution14475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution14492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleConflictResolution14509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleConflictResolution14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang4447 = new BitSet(new long[]{0x0000000000000002L});

}