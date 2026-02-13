package qa.automation.questions.business;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import qa.automation.questions.generic.TextoMostrado;
import qa.automation.ui.LoginUI;

public class MensajeErrorCredenciales implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextoMostrado.es(LoginUI.MENSAJE_ERROR_CREDENCIALES)
                .answeredBy(actor);
    }

    public static MensajeErrorCredenciales es() {
        return new MensajeErrorCredenciales();
    }
}
