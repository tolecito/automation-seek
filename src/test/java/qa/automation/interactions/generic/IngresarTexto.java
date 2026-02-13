package qa.automation.interactions.generic;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarTexto implements Interaction {

    private final String texto;
    private final Target target;

    public IngresarTexto(String texto, Target target) {
        this.texto = texto;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(texto).into(target)
        );
    }

    public static IngresarTexto enElCampo(String texto, Target target) {
        return new IngresarTexto(texto, target);
    }
}
