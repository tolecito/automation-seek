package qa.automation.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demo.opensource-socialnetwork.org/login")
public class LoginUI extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("Campo Usuario")
            .located(By.name("username"));

    public static final Target CAMPO_CONTRASENA = Target.the("Campo Contrasena")
            .located(By.name("password"));

    public static final Target BOTON_LOGIN = Target.the("Campo Usuario")
            .located(By.xpath("//*[@id=\"ossn-login\"]/fieldset/div[4]/input"));

    public static final Target MENSAJE_ERROR_CREDENCIALES = Target.the("Mensaje Error Credenciales")
            .located(By.xpath("//*[text()=\"We couldn't log you in. Please check your username or password and try again.\"]"));
}
