package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UPPERCASE_WORD", "RULE_LOWERCASE_WORD", "RULE_UPERCASE_LETTER", "RULE_LOWERCASE_LETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "', m\\u00F6chte ich als'", "'.'"
    };
    public static final int RULE_LOWERCASE_WORD=5;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LOWERCASE_LETTER=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_UPERCASE_LETTER=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_UPPERCASE_WORD=4;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUser_Stories"
    // InternalMyDsl.g:53:1: entryRuleUser_Stories : ruleUser_Stories EOF ;
    public final void entryRuleUser_Stories() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleUser_Stories EOF )
            // InternalMyDsl.g:55:1: ruleUser_Stories EOF
            {
             before(grammarAccess.getUser_StoriesRule()); 
            pushFollow(FOLLOW_1);
            ruleUser_Stories();

            state._fsp--;

             after(grammarAccess.getUser_StoriesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser_Stories"


    // $ANTLR start "ruleUser_Stories"
    // InternalMyDsl.g:62:1: ruleUser_Stories : ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) ) ;
    public final void ruleUser_Stories() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) ) )
            // InternalMyDsl.g:67:2: ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) )
            {
            // InternalMyDsl.g:67:2: ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) )
            // InternalMyDsl.g:68:3: ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* )
            {
            // InternalMyDsl.g:68:3: ( ( rule__User_Stories__User_storyAssignment ) )
            // InternalMyDsl.g:69:4: ( rule__User_Stories__User_storyAssignment )
            {
             before(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 
            // InternalMyDsl.g:70:4: ( rule__User_Stories__User_storyAssignment )
            // InternalMyDsl.g:70:5: rule__User_Stories__User_storyAssignment
            {
            pushFollow(FOLLOW_3);
            rule__User_Stories__User_storyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 

            }

            // InternalMyDsl.g:73:3: ( ( rule__User_Stories__User_storyAssignment )* )
            // InternalMyDsl.g:74:4: ( rule__User_Stories__User_storyAssignment )*
            {
             before(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 
            // InternalMyDsl.g:75:4: ( rule__User_Stories__User_storyAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_UPPERCASE_WORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:75:5: rule__User_Stories__User_storyAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__User_Stories__User_storyAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser_Stories"


    // $ANTLR start "entryRuleUser_Story"
    // InternalMyDsl.g:85:1: entryRuleUser_Story : ruleUser_Story EOF ;
    public final void entryRuleUser_Story() throws RecognitionException {
        try {
            // InternalMyDsl.g:86:1: ( ruleUser_Story EOF )
            // InternalMyDsl.g:87:1: ruleUser_Story EOF
            {
             before(grammarAccess.getUser_StoryRule()); 
            pushFollow(FOLLOW_1);
            ruleUser_Story();

            state._fsp--;

             after(grammarAccess.getUser_StoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser_Story"


    // $ANTLR start "ruleUser_Story"
    // InternalMyDsl.g:94:1: ruleUser_Story : ( ( rule__User_Story__Group__0 ) ) ;
    public final void ruleUser_Story() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:98:2: ( ( ( rule__User_Story__Group__0 ) ) )
            // InternalMyDsl.g:99:2: ( ( rule__User_Story__Group__0 ) )
            {
            // InternalMyDsl.g:99:2: ( ( rule__User_Story__Group__0 ) )
            // InternalMyDsl.g:100:3: ( rule__User_Story__Group__0 )
            {
             before(grammarAccess.getUser_StoryAccess().getGroup()); 
            // InternalMyDsl.g:101:3: ( rule__User_Story__Group__0 )
            // InternalMyDsl.g:101:4: rule__User_Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser_Story"


    // $ANTLR start "entryRuleTitle"
    // InternalMyDsl.g:110:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalMyDsl.g:111:1: ( ruleTitle EOF )
            // InternalMyDsl.g:112:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalMyDsl.g:119:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:123:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalMyDsl.g:124:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalMyDsl.g:124:2: ( ( rule__Title__Group__0 ) )
            // InternalMyDsl.g:125:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalMyDsl.g:126:3: ( rule__Title__Group__0 )
            // InternalMyDsl.g:126:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:135:1: entryRuleNutzen : ruleNutzen EOF ;
    public final void entryRuleNutzen() throws RecognitionException {
        try {
            // InternalMyDsl.g:136:1: ( ruleNutzen EOF )
            // InternalMyDsl.g:137:1: ruleNutzen EOF
            {
             before(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getNutzenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:144:1: ruleNutzen : ( ( rule__Nutzen__Group__0 ) ) ;
    public final void ruleNutzen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:148:2: ( ( ( rule__Nutzen__Group__0 ) ) )
            // InternalMyDsl.g:149:2: ( ( rule__Nutzen__Group__0 ) )
            {
            // InternalMyDsl.g:149:2: ( ( rule__Nutzen__Group__0 ) )
            // InternalMyDsl.g:150:3: ( rule__Nutzen__Group__0 )
            {
             before(grammarAccess.getNutzenAccess().getGroup()); 
            // InternalMyDsl.g:151:3: ( rule__Nutzen__Group__0 )
            // InternalMyDsl.g:151:4: rule__Nutzen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:160:1: entryRuleRolle : ruleRolle EOF ;
    public final void entryRuleRolle() throws RecognitionException {
        try {
            // InternalMyDsl.g:161:1: ( ruleRolle EOF )
            // InternalMyDsl.g:162:1: ruleRolle EOF
            {
             before(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getRolleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:169:1: ruleRolle : ( ( rule__Rolle__SubstantivAssignment ) ) ;
    public final void ruleRolle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:2: ( ( ( rule__Rolle__SubstantivAssignment ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__Rolle__SubstantivAssignment ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__Rolle__SubstantivAssignment ) )
            // InternalMyDsl.g:175:3: ( rule__Rolle__SubstantivAssignment )
            {
             before(grammarAccess.getRolleAccess().getSubstantivAssignment()); 
            // InternalMyDsl.g:176:3: ( rule__Rolle__SubstantivAssignment )
            // InternalMyDsl.g:176:4: rule__Rolle__SubstantivAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__SubstantivAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getSubstantivAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel_Wunsch"
    // InternalMyDsl.g:185:1: entryRuleZiel_Wunsch : ruleZiel_Wunsch EOF ;
    public final void entryRuleZiel_Wunsch() throws RecognitionException {
        try {
            // InternalMyDsl.g:186:1: ( ruleZiel_Wunsch EOF )
            // InternalMyDsl.g:187:1: ruleZiel_Wunsch EOF
            {
             before(grammarAccess.getZiel_WunschRule()); 
            pushFollow(FOLLOW_1);
            ruleZiel_Wunsch();

            state._fsp--;

             after(grammarAccess.getZiel_WunschRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZiel_Wunsch"


    // $ANTLR start "ruleZiel_Wunsch"
    // InternalMyDsl.g:194:1: ruleZiel_Wunsch : ( ( rule__Ziel_Wunsch__Group__0 ) ) ;
    public final void ruleZiel_Wunsch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:2: ( ( ( rule__Ziel_Wunsch__Group__0 ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__Ziel_Wunsch__Group__0 ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__Ziel_Wunsch__Group__0 ) )
            // InternalMyDsl.g:200:3: ( rule__Ziel_Wunsch__Group__0 )
            {
             before(grammarAccess.getZiel_WunschAccess().getGroup()); 
            // InternalMyDsl.g:201:3: ( rule__Ziel_Wunsch__Group__0 )
            // InternalMyDsl.g:201:4: rule__Ziel_Wunsch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZiel_WunschAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZiel_Wunsch"


    // $ANTLR start "entryRuleInfinitiv"
    // InternalMyDsl.g:210:1: entryRuleInfinitiv : ruleInfinitiv EOF ;
    public final void entryRuleInfinitiv() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleInfinitiv EOF )
            // InternalMyDsl.g:212:1: ruleInfinitiv EOF
            {
             before(grammarAccess.getInfinitivRule()); 
            pushFollow(FOLLOW_1);
            ruleInfinitiv();

            state._fsp--;

             after(grammarAccess.getInfinitivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfinitiv"


    // $ANTLR start "ruleInfinitiv"
    // InternalMyDsl.g:219:1: ruleInfinitiv : ( ( rule__Infinitiv__WordAssignment ) ) ;
    public final void ruleInfinitiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( rule__Infinitiv__WordAssignment ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__Infinitiv__WordAssignment ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__Infinitiv__WordAssignment ) )
            // InternalMyDsl.g:225:3: ( rule__Infinitiv__WordAssignment )
            {
             before(grammarAccess.getInfinitivAccess().getWordAssignment()); 
            // InternalMyDsl.g:226:3: ( rule__Infinitiv__WordAssignment )
            // InternalMyDsl.g:226:4: rule__Infinitiv__WordAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Infinitiv__WordAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInfinitivAccess().getWordAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfinitiv"


    // $ANTLR start "rule__User_Story__Group__0"
    // InternalMyDsl.g:234:1: rule__User_Story__Group__0 : rule__User_Story__Group__0__Impl rule__User_Story__Group__1 ;
    public final void rule__User_Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:238:1: ( rule__User_Story__Group__0__Impl rule__User_Story__Group__1 )
            // InternalMyDsl.g:239:2: rule__User_Story__Group__0__Impl rule__User_Story__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__User_Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__0"


    // $ANTLR start "rule__User_Story__Group__0__Impl"
    // InternalMyDsl.g:246:1: rule__User_Story__Group__0__Impl : ( ( rule__User_Story__TitleAssignment_0 ) ) ;
    public final void rule__User_Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:250:1: ( ( ( rule__User_Story__TitleAssignment_0 ) ) )
            // InternalMyDsl.g:251:1: ( ( rule__User_Story__TitleAssignment_0 ) )
            {
            // InternalMyDsl.g:251:1: ( ( rule__User_Story__TitleAssignment_0 ) )
            // InternalMyDsl.g:252:2: ( rule__User_Story__TitleAssignment_0 )
            {
             before(grammarAccess.getUser_StoryAccess().getTitleAssignment_0()); 
            // InternalMyDsl.g:253:2: ( rule__User_Story__TitleAssignment_0 )
            // InternalMyDsl.g:253:3: rule__User_Story__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__0__Impl"


    // $ANTLR start "rule__User_Story__Group__1"
    // InternalMyDsl.g:261:1: rule__User_Story__Group__1 : rule__User_Story__Group__1__Impl rule__User_Story__Group__2 ;
    public final void rule__User_Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:265:1: ( rule__User_Story__Group__1__Impl rule__User_Story__Group__2 )
            // InternalMyDsl.g:266:2: rule__User_Story__Group__1__Impl rule__User_Story__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__User_Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__1"


    // $ANTLR start "rule__User_Story__Group__1__Impl"
    // InternalMyDsl.g:273:1: rule__User_Story__Group__1__Impl : ( ':' ) ;
    public final void rule__User_Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:277:1: ( ( ':' ) )
            // InternalMyDsl.g:278:1: ( ':' )
            {
            // InternalMyDsl.g:278:1: ( ':' )
            // InternalMyDsl.g:279:2: ':'
            {
             before(grammarAccess.getUser_StoryAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__1__Impl"


    // $ANTLR start "rule__User_Story__Group__2"
    // InternalMyDsl.g:288:1: rule__User_Story__Group__2 : rule__User_Story__Group__2__Impl rule__User_Story__Group__3 ;
    public final void rule__User_Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:292:1: ( rule__User_Story__Group__2__Impl rule__User_Story__Group__3 )
            // InternalMyDsl.g:293:2: rule__User_Story__Group__2__Impl rule__User_Story__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__User_Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__2"


    // $ANTLR start "rule__User_Story__Group__2__Impl"
    // InternalMyDsl.g:300:1: rule__User_Story__Group__2__Impl : ( 'Um' ) ;
    public final void rule__User_Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:304:1: ( ( 'Um' ) )
            // InternalMyDsl.g:305:1: ( 'Um' )
            {
            // InternalMyDsl.g:305:1: ( 'Um' )
            // InternalMyDsl.g:306:2: 'Um'
            {
             before(grammarAccess.getUser_StoryAccess().getUmKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getUmKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__2__Impl"


    // $ANTLR start "rule__User_Story__Group__3"
    // InternalMyDsl.g:315:1: rule__User_Story__Group__3 : rule__User_Story__Group__3__Impl rule__User_Story__Group__4 ;
    public final void rule__User_Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:319:1: ( rule__User_Story__Group__3__Impl rule__User_Story__Group__4 )
            // InternalMyDsl.g:320:2: rule__User_Story__Group__3__Impl rule__User_Story__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__User_Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__3"


    // $ANTLR start "rule__User_Story__Group__3__Impl"
    // InternalMyDsl.g:327:1: rule__User_Story__Group__3__Impl : ( ( rule__User_Story__NutzenAssignment_3 ) ) ;
    public final void rule__User_Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__User_Story__NutzenAssignment_3 ) ) )
            // InternalMyDsl.g:332:1: ( ( rule__User_Story__NutzenAssignment_3 ) )
            {
            // InternalMyDsl.g:332:1: ( ( rule__User_Story__NutzenAssignment_3 ) )
            // InternalMyDsl.g:333:2: ( rule__User_Story__NutzenAssignment_3 )
            {
             before(grammarAccess.getUser_StoryAccess().getNutzenAssignment_3()); 
            // InternalMyDsl.g:334:2: ( rule__User_Story__NutzenAssignment_3 )
            // InternalMyDsl.g:334:3: rule__User_Story__NutzenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__NutzenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getNutzenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__3__Impl"


    // $ANTLR start "rule__User_Story__Group__4"
    // InternalMyDsl.g:342:1: rule__User_Story__Group__4 : rule__User_Story__Group__4__Impl rule__User_Story__Group__5 ;
    public final void rule__User_Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:346:1: ( rule__User_Story__Group__4__Impl rule__User_Story__Group__5 )
            // InternalMyDsl.g:347:2: rule__User_Story__Group__4__Impl rule__User_Story__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__User_Story__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__4"


    // $ANTLR start "rule__User_Story__Group__4__Impl"
    // InternalMyDsl.g:354:1: rule__User_Story__Group__4__Impl : ( ', m\\u00F6chte ich als' ) ;
    public final void rule__User_Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( ', m\\u00F6chte ich als' ) )
            // InternalMyDsl.g:359:1: ( ', m\\u00F6chte ich als' )
            {
            // InternalMyDsl.g:359:1: ( ', m\\u00F6chte ich als' )
            // InternalMyDsl.g:360:2: ', m\\u00F6chte ich als'
            {
             before(grammarAccess.getUser_StoryAccess().getMöchteIchAlsKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getMöchteIchAlsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__4__Impl"


    // $ANTLR start "rule__User_Story__Group__5"
    // InternalMyDsl.g:369:1: rule__User_Story__Group__5 : rule__User_Story__Group__5__Impl rule__User_Story__Group__6 ;
    public final void rule__User_Story__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( rule__User_Story__Group__5__Impl rule__User_Story__Group__6 )
            // InternalMyDsl.g:374:2: rule__User_Story__Group__5__Impl rule__User_Story__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__User_Story__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__5"


    // $ANTLR start "rule__User_Story__Group__5__Impl"
    // InternalMyDsl.g:381:1: rule__User_Story__Group__5__Impl : ( ( rule__User_Story__RolleAssignment_5 ) ) ;
    public final void rule__User_Story__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( ( ( rule__User_Story__RolleAssignment_5 ) ) )
            // InternalMyDsl.g:386:1: ( ( rule__User_Story__RolleAssignment_5 ) )
            {
            // InternalMyDsl.g:386:1: ( ( rule__User_Story__RolleAssignment_5 ) )
            // InternalMyDsl.g:387:2: ( rule__User_Story__RolleAssignment_5 )
            {
             before(grammarAccess.getUser_StoryAccess().getRolleAssignment_5()); 
            // InternalMyDsl.g:388:2: ( rule__User_Story__RolleAssignment_5 )
            // InternalMyDsl.g:388:3: rule__User_Story__RolleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__RolleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getRolleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__5__Impl"


    // $ANTLR start "rule__User_Story__Group__6"
    // InternalMyDsl.g:396:1: rule__User_Story__Group__6 : rule__User_Story__Group__6__Impl rule__User_Story__Group__7 ;
    public final void rule__User_Story__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( rule__User_Story__Group__6__Impl rule__User_Story__Group__7 )
            // InternalMyDsl.g:401:2: rule__User_Story__Group__6__Impl rule__User_Story__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__User_Story__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__6"


    // $ANTLR start "rule__User_Story__Group__6__Impl"
    // InternalMyDsl.g:408:1: rule__User_Story__Group__6__Impl : ( ( rule__User_Story__Ziel_wunschAssignment_6 ) ) ;
    public final void rule__User_Story__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( ( rule__User_Story__Ziel_wunschAssignment_6 ) ) )
            // InternalMyDsl.g:413:1: ( ( rule__User_Story__Ziel_wunschAssignment_6 ) )
            {
            // InternalMyDsl.g:413:1: ( ( rule__User_Story__Ziel_wunschAssignment_6 ) )
            // InternalMyDsl.g:414:2: ( rule__User_Story__Ziel_wunschAssignment_6 )
            {
             before(grammarAccess.getUser_StoryAccess().getZiel_wunschAssignment_6()); 
            // InternalMyDsl.g:415:2: ( rule__User_Story__Ziel_wunschAssignment_6 )
            // InternalMyDsl.g:415:3: rule__User_Story__Ziel_wunschAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__Ziel_wunschAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getZiel_wunschAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__6__Impl"


    // $ANTLR start "rule__User_Story__Group__7"
    // InternalMyDsl.g:423:1: rule__User_Story__Group__7 : rule__User_Story__Group__7__Impl ;
    public final void rule__User_Story__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( rule__User_Story__Group__7__Impl )
            // InternalMyDsl.g:428:2: rule__User_Story__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__7"


    // $ANTLR start "rule__User_Story__Group__7__Impl"
    // InternalMyDsl.g:434:1: rule__User_Story__Group__7__Impl : ( '.' ) ;
    public final void rule__User_Story__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( '.' ) )
            // InternalMyDsl.g:439:1: ( '.' )
            {
            // InternalMyDsl.g:439:1: ( '.' )
            // InternalMyDsl.g:440:2: '.'
            {
             before(grammarAccess.getUser_StoryAccess().getFullStopKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__7__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalMyDsl.g:450:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalMyDsl.g:455:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalMyDsl.g:462:1: rule__Title__Group__0__Impl : ( ( rule__Title__SubstantivAssignment_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( ( ( rule__Title__SubstantivAssignment_0 ) ) )
            // InternalMyDsl.g:467:1: ( ( rule__Title__SubstantivAssignment_0 ) )
            {
            // InternalMyDsl.g:467:1: ( ( rule__Title__SubstantivAssignment_0 ) )
            // InternalMyDsl.g:468:2: ( rule__Title__SubstantivAssignment_0 )
            {
             before(grammarAccess.getTitleAccess().getSubstantivAssignment_0()); 
            // InternalMyDsl.g:469:2: ( rule__Title__SubstantivAssignment_0 )
            // InternalMyDsl.g:469:3: rule__Title__SubstantivAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Title__SubstantivAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getSubstantivAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalMyDsl.g:477:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( rule__Title__Group__1__Impl )
            // InternalMyDsl.g:482:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalMyDsl.g:488:1: rule__Title__Group__1__Impl : ( ( rule__Title__InfinitivAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( ( rule__Title__InfinitivAssignment_1 ) ) )
            // InternalMyDsl.g:493:1: ( ( rule__Title__InfinitivAssignment_1 ) )
            {
            // InternalMyDsl.g:493:1: ( ( rule__Title__InfinitivAssignment_1 ) )
            // InternalMyDsl.g:494:2: ( rule__Title__InfinitivAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getInfinitivAssignment_1()); 
            // InternalMyDsl.g:495:2: ( rule__Title__InfinitivAssignment_1 )
            // InternalMyDsl.g:495:3: rule__Title__InfinitivAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__InfinitivAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getInfinitivAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Nutzen__Group__0"
    // InternalMyDsl.g:504:1: rule__Nutzen__Group__0 : rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 ;
    public final void rule__Nutzen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 )
            // InternalMyDsl.g:509:2: rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Nutzen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0"


    // $ANTLR start "rule__Nutzen__Group__0__Impl"
    // InternalMyDsl.g:516:1: rule__Nutzen__Group__0__Impl : ( ( rule__Nutzen__SubjectAssignment_0 ) ) ;
    public final void rule__Nutzen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( ( ( rule__Nutzen__SubjectAssignment_0 ) ) )
            // InternalMyDsl.g:521:1: ( ( rule__Nutzen__SubjectAssignment_0 ) )
            {
            // InternalMyDsl.g:521:1: ( ( rule__Nutzen__SubjectAssignment_0 ) )
            // InternalMyDsl.g:522:2: ( rule__Nutzen__SubjectAssignment_0 )
            {
             before(grammarAccess.getNutzenAccess().getSubjectAssignment_0()); 
            // InternalMyDsl.g:523:2: ( rule__Nutzen__SubjectAssignment_0 )
            // InternalMyDsl.g:523:3: rule__Nutzen__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0__Impl"


    // $ANTLR start "rule__Nutzen__Group__1"
    // InternalMyDsl.g:531:1: rule__Nutzen__Group__1 : rule__Nutzen__Group__1__Impl ;
    public final void rule__Nutzen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( rule__Nutzen__Group__1__Impl )
            // InternalMyDsl.g:536:2: rule__Nutzen__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1"


    // $ANTLR start "rule__Nutzen__Group__1__Impl"
    // InternalMyDsl.g:542:1: rule__Nutzen__Group__1__Impl : ( ( rule__Nutzen__VerbAssignment_1 ) ) ;
    public final void rule__Nutzen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( ( rule__Nutzen__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:547:1: ( ( rule__Nutzen__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:547:1: ( ( rule__Nutzen__VerbAssignment_1 ) )
            // InternalMyDsl.g:548:2: ( rule__Nutzen__VerbAssignment_1 )
            {
             before(grammarAccess.getNutzenAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:549:2: ( rule__Nutzen__VerbAssignment_1 )
            // InternalMyDsl.g:549:3: rule__Nutzen__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1__Impl"


    // $ANTLR start "rule__Ziel_Wunsch__Group__0"
    // InternalMyDsl.g:558:1: rule__Ziel_Wunsch__Group__0 : rule__Ziel_Wunsch__Group__0__Impl rule__Ziel_Wunsch__Group__1 ;
    public final void rule__Ziel_Wunsch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( rule__Ziel_Wunsch__Group__0__Impl rule__Ziel_Wunsch__Group__1 )
            // InternalMyDsl.g:563:2: rule__Ziel_Wunsch__Group__0__Impl rule__Ziel_Wunsch__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Ziel_Wunsch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__0"


    // $ANTLR start "rule__Ziel_Wunsch__Group__0__Impl"
    // InternalMyDsl.g:570:1: rule__Ziel_Wunsch__Group__0__Impl : ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) ) ;
    public final void rule__Ziel_Wunsch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) ) )
            // InternalMyDsl.g:575:1: ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) )
            {
            // InternalMyDsl.g:575:1: ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) )
            // InternalMyDsl.g:576:2: ( rule__Ziel_Wunsch__SubjectAssignment_0 )
            {
             before(grammarAccess.getZiel_WunschAccess().getSubjectAssignment_0()); 
            // InternalMyDsl.g:577:2: ( rule__Ziel_Wunsch__SubjectAssignment_0 )
            // InternalMyDsl.g:577:3: rule__Ziel_Wunsch__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getZiel_WunschAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__0__Impl"


    // $ANTLR start "rule__Ziel_Wunsch__Group__1"
    // InternalMyDsl.g:585:1: rule__Ziel_Wunsch__Group__1 : rule__Ziel_Wunsch__Group__1__Impl ;
    public final void rule__Ziel_Wunsch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( rule__Ziel_Wunsch__Group__1__Impl )
            // InternalMyDsl.g:590:2: rule__Ziel_Wunsch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__1"


    // $ANTLR start "rule__Ziel_Wunsch__Group__1__Impl"
    // InternalMyDsl.g:596:1: rule__Ziel_Wunsch__Group__1__Impl : ( ( rule__Ziel_Wunsch__InfinitivAssignment_1 ) ) ;
    public final void rule__Ziel_Wunsch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( ( ( rule__Ziel_Wunsch__InfinitivAssignment_1 ) ) )
            // InternalMyDsl.g:601:1: ( ( rule__Ziel_Wunsch__InfinitivAssignment_1 ) )
            {
            // InternalMyDsl.g:601:1: ( ( rule__Ziel_Wunsch__InfinitivAssignment_1 ) )
            // InternalMyDsl.g:602:2: ( rule__Ziel_Wunsch__InfinitivAssignment_1 )
            {
             before(grammarAccess.getZiel_WunschAccess().getInfinitivAssignment_1()); 
            // InternalMyDsl.g:603:2: ( rule__Ziel_Wunsch__InfinitivAssignment_1 )
            // InternalMyDsl.g:603:3: rule__Ziel_Wunsch__InfinitivAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__InfinitivAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getZiel_WunschAccess().getInfinitivAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__1__Impl"


    // $ANTLR start "rule__User_Stories__User_storyAssignment"
    // InternalMyDsl.g:612:1: rule__User_Stories__User_storyAssignment : ( ruleUser_Story ) ;
    public final void rule__User_Stories__User_storyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ruleUser_Story ) )
            // InternalMyDsl.g:617:2: ( ruleUser_Story )
            {
            // InternalMyDsl.g:617:2: ( ruleUser_Story )
            // InternalMyDsl.g:618:3: ruleUser_Story
            {
             before(grammarAccess.getUser_StoriesAccess().getUser_storyUser_StoryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUser_Story();

            state._fsp--;

             after(grammarAccess.getUser_StoriesAccess().getUser_storyUser_StoryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Stories__User_storyAssignment"


    // $ANTLR start "rule__User_Story__TitleAssignment_0"
    // InternalMyDsl.g:627:1: rule__User_Story__TitleAssignment_0 : ( ruleTitle ) ;
    public final void rule__User_Story__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( ( ruleTitle ) )
            // InternalMyDsl.g:632:2: ( ruleTitle )
            {
            // InternalMyDsl.g:632:2: ( ruleTitle )
            // InternalMyDsl.g:633:3: ruleTitle
            {
             before(grammarAccess.getUser_StoryAccess().getTitleTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getTitleTitleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__TitleAssignment_0"


    // $ANTLR start "rule__User_Story__NutzenAssignment_3"
    // InternalMyDsl.g:642:1: rule__User_Story__NutzenAssignment_3 : ( ruleNutzen ) ;
    public final void rule__User_Story__NutzenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( ruleNutzen ) )
            // InternalMyDsl.g:647:2: ( ruleNutzen )
            {
            // InternalMyDsl.g:647:2: ( ruleNutzen )
            // InternalMyDsl.g:648:3: ruleNutzen
            {
             before(grammarAccess.getUser_StoryAccess().getNutzenNutzenParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getNutzenNutzenParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__NutzenAssignment_3"


    // $ANTLR start "rule__User_Story__RolleAssignment_5"
    // InternalMyDsl.g:657:1: rule__User_Story__RolleAssignment_5 : ( ruleRolle ) ;
    public final void rule__User_Story__RolleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( ruleRolle ) )
            // InternalMyDsl.g:662:2: ( ruleRolle )
            {
            // InternalMyDsl.g:662:2: ( ruleRolle )
            // InternalMyDsl.g:663:3: ruleRolle
            {
             before(grammarAccess.getUser_StoryAccess().getRolleRolleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getRolleRolleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__RolleAssignment_5"


    // $ANTLR start "rule__User_Story__Ziel_wunschAssignment_6"
    // InternalMyDsl.g:672:1: rule__User_Story__Ziel_wunschAssignment_6 : ( ruleZiel_Wunsch ) ;
    public final void rule__User_Story__Ziel_wunschAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( ruleZiel_Wunsch ) )
            // InternalMyDsl.g:677:2: ( ruleZiel_Wunsch )
            {
            // InternalMyDsl.g:677:2: ( ruleZiel_Wunsch )
            // InternalMyDsl.g:678:3: ruleZiel_Wunsch
            {
             before(grammarAccess.getUser_StoryAccess().getZiel_wunschZiel_WunschParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleZiel_Wunsch();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getZiel_wunschZiel_WunschParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Ziel_wunschAssignment_6"


    // $ANTLR start "rule__Title__SubstantivAssignment_0"
    // InternalMyDsl.g:687:1: rule__Title__SubstantivAssignment_0 : ( RULE_UPPERCASE_WORD ) ;
    public final void rule__Title__SubstantivAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( ( RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:692:2: ( RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:692:2: ( RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:693:3: RULE_UPPERCASE_WORD
            {
             before(grammarAccess.getTitleAccess().getSubstantivUPPERCASE_WORDTerminalRuleCall_0_0()); 
            match(input,RULE_UPPERCASE_WORD,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getSubstantivUPPERCASE_WORDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__SubstantivAssignment_0"


    // $ANTLR start "rule__Title__InfinitivAssignment_1"
    // InternalMyDsl.g:702:1: rule__Title__InfinitivAssignment_1 : ( ruleInfinitiv ) ;
    public final void rule__Title__InfinitivAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( ruleInfinitiv ) )
            // InternalMyDsl.g:707:2: ( ruleInfinitiv )
            {
            // InternalMyDsl.g:707:2: ( ruleInfinitiv )
            // InternalMyDsl.g:708:3: ruleInfinitiv
            {
             before(grammarAccess.getTitleAccess().getInfinitivInfinitivParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfinitiv();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getInfinitivInfinitivParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__InfinitivAssignment_1"


    // $ANTLR start "rule__Nutzen__SubjectAssignment_0"
    // InternalMyDsl.g:717:1: rule__Nutzen__SubjectAssignment_0 : ( RULE_UPPERCASE_WORD ) ;
    public final void rule__Nutzen__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( ( RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:722:2: ( RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:722:2: ( RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:723:3: RULE_UPPERCASE_WORD
            {
             before(grammarAccess.getNutzenAccess().getSubjectUPPERCASE_WORDTerminalRuleCall_0_0()); 
            match(input,RULE_UPPERCASE_WORD,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getSubjectUPPERCASE_WORDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__SubjectAssignment_0"


    // $ANTLR start "rule__Nutzen__VerbAssignment_1"
    // InternalMyDsl.g:732:1: rule__Nutzen__VerbAssignment_1 : ( RULE_LOWERCASE_WORD ) ;
    public final void rule__Nutzen__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( ( RULE_LOWERCASE_WORD ) )
            // InternalMyDsl.g:737:2: ( RULE_LOWERCASE_WORD )
            {
            // InternalMyDsl.g:737:2: ( RULE_LOWERCASE_WORD )
            // InternalMyDsl.g:738:3: RULE_LOWERCASE_WORD
            {
             before(grammarAccess.getNutzenAccess().getVerbLOWERCASE_WORDTerminalRuleCall_1_0()); 
            match(input,RULE_LOWERCASE_WORD,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getVerbLOWERCASE_WORDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__VerbAssignment_1"


    // $ANTLR start "rule__Rolle__SubstantivAssignment"
    // InternalMyDsl.g:747:1: rule__Rolle__SubstantivAssignment : ( RULE_UPPERCASE_WORD ) ;
    public final void rule__Rolle__SubstantivAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:752:2: ( RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:752:2: ( RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:753:3: RULE_UPPERCASE_WORD
            {
             before(grammarAccess.getRolleAccess().getSubstantivUPPERCASE_WORDTerminalRuleCall_0()); 
            match(input,RULE_UPPERCASE_WORD,FOLLOW_2); 
             after(grammarAccess.getRolleAccess().getSubstantivUPPERCASE_WORDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__SubstantivAssignment"


    // $ANTLR start "rule__Ziel_Wunsch__SubjectAssignment_0"
    // InternalMyDsl.g:762:1: rule__Ziel_Wunsch__SubjectAssignment_0 : ( RULE_UPPERCASE_WORD ) ;
    public final void rule__Ziel_Wunsch__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( ( RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:767:2: ( RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:767:2: ( RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:768:3: RULE_UPPERCASE_WORD
            {
             before(grammarAccess.getZiel_WunschAccess().getSubjectUPPERCASE_WORDTerminalRuleCall_0_0()); 
            match(input,RULE_UPPERCASE_WORD,FOLLOW_2); 
             after(grammarAccess.getZiel_WunschAccess().getSubjectUPPERCASE_WORDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__SubjectAssignment_0"


    // $ANTLR start "rule__Ziel_Wunsch__InfinitivAssignment_1"
    // InternalMyDsl.g:777:1: rule__Ziel_Wunsch__InfinitivAssignment_1 : ( ruleInfinitiv ) ;
    public final void rule__Ziel_Wunsch__InfinitivAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( ruleInfinitiv ) )
            // InternalMyDsl.g:782:2: ( ruleInfinitiv )
            {
            // InternalMyDsl.g:782:2: ( ruleInfinitiv )
            // InternalMyDsl.g:783:3: ruleInfinitiv
            {
             before(grammarAccess.getZiel_WunschAccess().getInfinitivInfinitivParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfinitiv();

            state._fsp--;

             after(grammarAccess.getZiel_WunschAccess().getInfinitivInfinitivParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__InfinitivAssignment_1"


    // $ANTLR start "rule__Infinitiv__WordAssignment"
    // InternalMyDsl.g:792:1: rule__Infinitiv__WordAssignment : ( RULE_LOWERCASE_WORD ) ;
    public final void rule__Infinitiv__WordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( RULE_LOWERCASE_WORD ) )
            // InternalMyDsl.g:797:2: ( RULE_LOWERCASE_WORD )
            {
            // InternalMyDsl.g:797:2: ( RULE_LOWERCASE_WORD )
            // InternalMyDsl.g:798:3: RULE_LOWERCASE_WORD
            {
             before(grammarAccess.getInfinitivAccess().getWordLOWERCASE_WORDTerminalRuleCall_0()); 
            match(input,RULE_LOWERCASE_WORD,FOLLOW_2); 
             after(grammarAccess.getInfinitivAccess().getWordLOWERCASE_WORDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infinitiv__WordAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}