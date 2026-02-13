package qa.automation.questions.business;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import qa.automation.questions.generic.TextoMostrado;
import qa.automation.ui.RegistroUI;

public class MensajeRegistroExitoso implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextoMostrado.es(RegistroUI.MENSAJE_LARGO_REGISTRO)
                .answeredBy(actor);
    }

    public static MensajeRegistroExitoso mostrado() {
        return new MensajeRegistroExitoso();
    }
}
