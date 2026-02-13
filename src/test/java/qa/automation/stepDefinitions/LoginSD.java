package qa.automation.stepDefinitions;

import qa.automation.questions.business.MensajeBienvenida;
import qa.automation.questions.business.MensajeErrorCredenciales;
import qa.automation.tasks.AbrirLaWebEnLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.Matchers.equalTo;
import static qa.automation.tasks.IniciarSesion.conCredenciales;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginSD {

    @Given("que el usuario abre el sitio web en la pagina de login")
    public void queElUsuarioAbreElSitioWebEnLogin() {
        OnStage.theActorCalled("usuario");
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirLaWebEnLogin.en());
    }

    @When("el usuario inicia sesion con las credenciales {string} y {string}")
    public void elUsuarioSeLoguea(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                conCredenciales(usuario, contrasena)
        );
    }

    @Then("deberia ver el mensaje {string}")
    public void deberiaVerMensaje(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeBienvenida.mostrado(), equalTo(mensajeEsperado))
        );
    }

    @Then("deberia ver el mensaje de error de credenciales {string}")
    public void deberiaVerMensajeErrorCredenciales(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeErrorCredenciales.es(), equalTo(mensajeEsperado))
        );
    }

}
