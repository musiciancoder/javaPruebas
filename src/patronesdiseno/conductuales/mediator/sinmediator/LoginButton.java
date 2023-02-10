package patronesdiseno.conductuales.mediator.sinmediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton {
    private final JTextField userTxt;
    private final JTextField passTxt;


    public LoginButton(JTextField userTxt, JTextField passTxt) {
        super("Log In");
        this.userTxt = userTxt;
        this.passTxt = passTxt;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        System.out.println("Login In...");
        String username= userTxt.getText(); //Notar que acá el LoginButton queda atado a la logica del cuadro de texto y no puede ser reusado sin esto, lo que no es bueno ya que el boton debiera ser genérico y debiera poder usarse.
        String password= passTxt.getText();
        // validate username and password
        // logs in the user or pops error message
    }
}
