package qa.automation.tasks;

import net.serenitybdd.screenplay.Task;
import qa.automation.interactions.business.Autenticarse;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String contrasena;

    public IniciarSesion(String username, String password) {
        this.usuario = username;
        this.contrasena = password;
    }

    public static IniciarSesion conCredenciales(String usuario, String contrasena) {
        return instrumented(IniciarSesion.class, usuario, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Autenticarse.con(usuario,contrasena)
        );
    }
}
