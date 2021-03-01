/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("LikeButton", com.codename1.facebook.ui.LikeButton.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("LikeButton", com.codename1.facebook.ui.LikeButton.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.facebook.ui.LikeButton findLikeButton(Component root) {
        return (com.codename1.facebook.ui.LikeButton)findByName("LikeButton", root);
    }

    public com.codename1.facebook.ui.LikeButton findLikeButton() {
        com.codename1.facebook.ui.LikeButton cmp = (com.codename1.facebook.ui.LikeButton)findByName("LikeButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.facebook.ui.LikeButton)findByName("LikeButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTsenha(Component root) {
        return (com.codename1.ui.TextField)findByName("tsenha", root);
    }

    public com.codename1.ui.TextField findTsenha() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("tsenha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("tsenha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton5(Component root) {
        return (com.codename1.ui.Button)findByName("Button5", root);
    }

    public com.codename1.ui.Button findButton5() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton4(Component root) {
        return (com.codename1.ui.Button)findByName("Button4", root);
    }

    public com.codename1.ui.Button findButton4() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton3(Component root) {
        return (com.codename1.ui.Button)findByName("Button3", root);
    }

    public com.codename1.ui.Button findButton3() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton13(Component root) {
        return (com.codename1.ui.Button)findByName("Button13", root);
    }

    public com.codename1.ui.Button findButton13() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTemail(Component root) {
        return (com.codename1.ui.TextField)findByName("temail", root);
    }

    public com.codename1.ui.TextField findTemail() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("temail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("temail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton9(Component root) {
        return (com.codename1.ui.Button)findByName("Button9", root);
    }

    public com.codename1.ui.Button findButton9() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton12(Component root) {
        return (com.codename1.ui.Button)findByName("Button12", root);
    }

    public com.codename1.ui.Button findButton12() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton8(Component root) {
        return (com.codename1.ui.Button)findByName("Button8", root);
    }

    public com.codename1.ui.Button findButton8() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton11(Component root) {
        return (com.codename1.ui.Button)findByName("Button11", root);
    }

    public com.codename1.ui.Button findButton11() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton7(Component root) {
        return (com.codename1.ui.Button)findByName("Button7", root);
    }

    public com.codename1.ui.Button findButton7() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton10(Component root) {
        return (com.codename1.ui.Button)findByName("Button10", root);
    }

    public com.codename1.ui.Button findButton10() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton6(Component root) {
        return (com.codename1.ui.Button)findByName("Button6", root);
    }

    public com.codename1.ui.Button findButton6() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button6", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Fórum Morador".equals(f.getName())) {
            exitFRumMorador(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(f.getName())) {
            exitPrincipal(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitFRumMorador(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitPrincipal(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Fórum Morador".equals(f.getName())) {
            beforeFRumMorador(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(f.getName())) {
            beforePrincipal(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeFRumMorador(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforePrincipal(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Fórum Morador".equals(c.getName())) {
            beforeContainerFRumMorador(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(c.getName())) {
            beforeContainerPrincipal(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerFRumMorador(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerPrincipal(Container c) {
    }

    protected void postShow(Form f) {
        if("Fórum Morador".equals(f.getName())) {
            postFRumMorador(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(f.getName())) {
            postPrincipal(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postFRumMorador(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postPrincipal(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Fórum Morador".equals(c.getName())) {
            postContainerFRumMorador(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(c.getName())) {
            postContainerPrincipal(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerFRumMorador(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerPrincipal(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Fórum Morador".equals(rootName)) {
            onCreateFRumMorador();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(rootName)) {
            onCreatePrincipal();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateFRumMorador() {
    }


    protected void onCreateMain() {
    }


    protected void onCreatePrincipal() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Fórum Morador".equals(f.getName())) {
            getStateFRumMorador(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Principal".equals(f.getName())) {
            getStatePrincipal(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateFRumMorador(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStatePrincipal(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Fórum Morador".equals(f.getName())) {
            setStateFRumMorador(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Principal".equals(f.getName())) {
            setStatePrincipal(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateFRumMorador(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStatePrincipal(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("temail".equals(c.getName())) {
                onMain_TemailAction(c, event);
                return;
            }
            if("tsenha".equals(c.getName())) {
                onMain_TsenhaAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
            if("LikeButton".equals(c.getName())) {
                onMain_LikeButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Principal")) {
            if("Button".equals(c.getName())) {
                onPrincipal_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onPrincipal_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onPrincipal_Button2Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onPrincipal_Button3Action(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onPrincipal_Button4Action(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onPrincipal_Button5Action(c, event);
                return;
            }
            if("Button6".equals(c.getName())) {
                onPrincipal_Button6Action(c, event);
                return;
            }
            if("Button7".equals(c.getName())) {
                onPrincipal_Button7Action(c, event);
                return;
            }
            if("Button8".equals(c.getName())) {
                onPrincipal_Button8Action(c, event);
                return;
            }
            if("Button9".equals(c.getName())) {
                onPrincipal_Button9Action(c, event);
                return;
            }
            if("Button10".equals(c.getName())) {
                onPrincipal_Button10Action(c, event);
                return;
            }
            if("Button11".equals(c.getName())) {
                onPrincipal_Button11Action(c, event);
                return;
            }
            if("Button12".equals(c.getName())) {
                onPrincipal_Button12Action(c, event);
                return;
            }
            if("Button13".equals(c.getName())) {
                onPrincipal_Button13Action(c, event);
                return;
            }
        }
    }

      protected void onMain_TemailAction(Component c, ActionEvent event) {
      }

      protected void onMain_TsenhaAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_LikeButtonAction(Component c, ActionEvent event) {
      }

      protected void onPrincipal_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button1Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button2Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button3Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button4Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button5Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button6Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button7Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button8Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button9Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button10Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button11Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button12Action(Component c, ActionEvent event) {
      }

      protected void onPrincipal_Button13Action(Component c, ActionEvent event) {
      }

}
