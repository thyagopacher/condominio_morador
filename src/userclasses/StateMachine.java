/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }


    protected void onMain_ButtonAction(Component c, ActionEvent event) {
        String email = findTemail(c).getText();
        String senha = findTsenha(c).getText();
        if(email.length() == 0 || senha.length() == 0){
            Dialog.show("Erro", "E-mail e senha n�o podem ser vazios!", "Ok", null);
        }else if(email.length() < 5){
            Dialog.show("Erro", "E-mail n�o pode ser menor do que 5 letras", "Ok", null);
        }else if(email.indexOf("@") == -1){
            Dialog.show("Erro", "E-mail v�lido deve conter @!", "Ok", null);
        }else{
            /**aqui chama o primeiro form depois de verificar um login v�lido*/
            showForm("Principal", null);
        }
    }

    @Override
    protected void onPrincipal_ButtonAction(Component c, ActionEvent event) {
        showForm("F�rum Morador", null);
    }
}
