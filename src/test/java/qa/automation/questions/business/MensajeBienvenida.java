package qa.automation.questions.business;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import qa.automation.questions.generic.TextoMostrado;
import qa.automation.ui.HomeUI;

public class MensajeBienvenida implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextoMostrado.es(HomeUI.TEXTO_BIENVENIDA)
                .answeredBy(actor);
    }

    public static MensajeBienvenida mostrado() {
        return new MensajeBienvenida();
    }
}
