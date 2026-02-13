package qa.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed(driver = "chrome")   // Serenity crea el ChromeDriver usando serenity.conf
    WebDriver driver;

    @Before
    public void setTheStage() {
        System.out.println("Inicializando el escenario de Screenplay...");
        OnStage.setTheStage(new OnlineCast());

        OnStage.theActorCalled("usuario").can(BrowseTheWeb.with(driver));

        //driver.manage().window().maximize();

        System.out.println("Driver configurado para el actor con Serenity.");
    }

    @After
    public void tearDown() {
        try {
            //Obtener el driver del actor en el escenario
            WebDriver driver = OnStage.theActorInTheSpotlight().abilityTo(BrowseTheWeb.class).getDriver();

            //Esperar 5 segundos antes de cerrar
            Thread.sleep(5000);

            //Limpiar caché de sesión web)
            driver.manage().deleteAllCookies();
            System.out.println("Cookies eliminadas.");

            //Cerrar navegador
            driver.quit();
            System.out.println("Navegador cerrado y recursos liberados.");
        } catch (Exception e) {
            System.err.println("Error al cerrar navegador: " + e.getMessage());
        }
    }

}
