package qa.automation.interactions.business;

import net.serenitybdd.screenplay.Interaction;
import qa.automation.interactions.generic.HacerClick;
import qa.automation.interactions.generic.IngresarTexto;
import qa.automation.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;

public class Autenticarse implements Interaction {

    private final String usuario;
    private final String password;

    public Autenticarse(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                IngresarTexto.enElCampo(usuario, LoginUI.CAMPO_USUARIO),
                IngresarTexto.enElCampo(password, LoginUI.CAMPO_CONTRASENA),
                HacerClick.en(LoginUI.BOTON_LOGIN)
        );
    }

    public static Autenticarse con(String usuario, String password) {
        return new Autenticarse(usuario, password);
    }
}
