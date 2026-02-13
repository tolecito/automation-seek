package qa.automation.interactions.business;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import qa.automation.interactions.generic.HacerClick;
import qa.automation.interactions.generic.IngresarTexto;
import qa.automation.ui.RegistroUI;
import qa.automation.utils.FechaUtils;

public class Registrarse implements Interaction {
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String usuario;
    private final String contrasena;
    private final String dia;
    private final String mes;
    private final String anio;
    private final String sexo;
    private final String[] partesFecha;

    public Registrarse(String nombre, String apellido, String email, String usuario, String contrasena, String nacimiento, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.partesFecha = FechaUtils.separarFecha(nacimiento);
        this.dia = FechaUtils.normalizarFecha(partesFecha[0]);
        this.mes = FechaUtils.convertirMesANombre(partesFecha[1]);
        this.anio = partesFecha[2];
        this.sexo = sexo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                IngresarTexto.enElCampo(nombre, RegistroUI.CAMPO_NOMBRE),
                IngresarTexto.enElCampo(apellido, RegistroUI.CAMPO_APELLIDO),
                IngresarTexto.enElCampo(email, RegistroUI.CAMPO_EMAIL),
                IngresarTexto.enElCampo(email, RegistroUI.CAMPO_RE_EMAIL),
                IngresarTexto.enElCampo(usuario, RegistroUI.CAMPO_USUARIO),
                IngresarTexto.enElCampo(contrasena, RegistroUI.CAMPO_CONTRASENA),
                HacerClick.en(RegistroUI.CAMPO_NACIMIENTO),
                SelectFromOptions.byVisibleText(anio).from(RegistroUI.SELECTOR_ANIO),
                SelectFromOptions.byVisibleText(mes).from(RegistroUI.SELECTOR_MES),
                HacerClick.en(RegistroUI.SELECTOR_DIA.of(dia)),
                HacerClick.en(RegistroUI.RADIO_GENERO.of(sexo.toLowerCase())),
                HacerClick.en(RegistroUI.CHECKBOX_TERMINOS_CONDICIONES),
                HacerClick.en(RegistroUI.BOTON_CREAR_CUENTA)
        );
    }

    public static Registrarse con(String nombre, String apellido, String email, String usuario, String contrasena, String nacimiento, String sexo) {
        return new Registrarse(nombre, apellido, email, usuario, contrasena, nacimiento, sexo);
    }
}
