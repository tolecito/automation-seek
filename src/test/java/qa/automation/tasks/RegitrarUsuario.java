package qa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import qa.automation.interactions.business.Registrarse;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegitrarUsuario implements Task {

    private final String nombre;
    private final String apellido;
    private final String email;
    private final String usuario;
    private final String contrasena;
    private final String nacimiento;
    private final String sexo;

    public RegitrarUsuario(String nombre, String apellido, String email, String usuario, String contrasena, String nacimiento, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
    }

    public static RegitrarUsuario conDatos (String nombre, String apellido, String email, String usuario, String contrasena, String nacimiento, String sexo) {
        return instrumented(RegitrarUsuario.class, nombre, apellido, email, usuario, contrasena, nacimiento, sexo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Registrarse.con(nombre,apellido,email,usuario,contrasena,nacimiento,sexo)
        );
    }
}
