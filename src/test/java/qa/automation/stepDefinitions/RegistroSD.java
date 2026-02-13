package qa.automation.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import qa.automation.questions.business.MensajeRegistroExitoso;
import qa.automation.tasks.AbrirLaWebEnRegistro;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static qa.automation.tasks.RegitrarUsuario.conDatos;

public class RegistroSD {

    @Given("que el usuario abre el sitio web en la pagina de registro")
    public void queElUsuarioAbreElSitioWebEnRegistro() {
        OnStage.theActorCalled("usuario");
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirLaWebEnRegistro.en());
    }

    @When("el usuario completa el formulario de registro con sus datos {string},{string},{string},{string},{string},{string},{string}")
    public void elUsuarioSeRegistra(String nombre, String apellido, String email, String usuario, String contrasena, String nacimiento, String sexo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                conDatos(nombre, apellido, email, usuario, contrasena, nacimiento, sexo)
        );
    }

    @Then("deberia ver el mensaje de registro {string}")
    public void deberiaVerMensajeDeRegistro(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeRegistroExitoso.mostrado(), equalTo(mensajeEsperado))
        );
    }

}
