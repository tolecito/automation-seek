package qa.automation.questions.business;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import qa.automation.questions.generic.TextoMostrado;
import qa.automation.ui.RegistroUI;

public class MensajeErrorRegistro implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextoMostrado.es(RegistroUI.MENSAJE_ERROR_REGISTRO)
                .answeredBy(actor);
    }

    public static MensajeErrorRegistro mostrado() {
        return new MensajeErrorRegistro();
    }
}
