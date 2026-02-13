package qa.automation.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demo.opensource-socialnetwork.org")
public class RegistroUI extends PageObject {

    public static final Target BOTON_CREAR_CUENTA = Target.the("Boton Crear Cuenta")
            .located(By.id("ossn-submit-button"));

    public static final Target MENSAJE_LARGO_REGISTRO = Target.the("Mensaje Largo Registro")
            .located(By.id("ossn-home-signup"));

    //CAMPOS DE REGISTRO
    public static final Target CAMPO_NOMBRE = Target.the("Campo Nombre")
            .located(By.name("firstname"));

    public static final Target CAMPO_APELLIDO = Target.the("Campo Apellido")
            .located(By.name("lastname"));

    public static final Target CAMPO_EMAIL = Target.the("Campo Email")
            .located(By.name("email"));

    public static final Target CAMPO_RE_EMAIL = Target.the("Campo Reemail")
            .located(By.name("email_re"));

    public static final Target CAMPO_USUARIO = Target.the("Campo Usuario")
            .located(By.name("username"));

    public static final Target CAMPO_CONTRASENA = Target.the("Campo Contrasena")
            .located(By.name("password"));

    public static final Target CAMPO_NACIMIENTO = Target.the("Campo Nacimiento")
            //.located(By.id("dp1770926014795"));
            .located(By.name("birthdate"));

    public static final Target SELECTOR_ANIO = Target.the("Selector Anio")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));

    public static final Target SELECTOR_MES = Target.the("Selector Mes")
            .located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));

    public static final Target SELECTOR_DIA = Target.the("Selector Dia {0}")
            .locatedBy("//div[@id='ui-datepicker-div']//a[text()='{0}']");

    public static final Target RADIO_GENERO = Target.the("Genero {0}")
            .locatedBy("//input[@name='gender' and @value='{0}']");

    public static final Target CHECKBOX_TERMINOS_CONDICIONES = Target.the("Checkbox Terminos y Condiciones")
            .located(By.name("gdpr_agree"));

    public static final Target MENSAJE_CREDENCIALES_INCOMPLETAS = Target.the("Mensaje Credenciales Incompletas")
            .located(By.xpath("//*[text()=\"Invalid username or password!\"]"));
}
