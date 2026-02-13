package qa.automation.interactions.generic;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerClick implements Interaction {

    private final Target locator;

    public HacerClick(Target locator) {
        this.locator = locator;
    }

    public static HacerClick en(Target locator) {
        return instrumented(HacerClick.class, locator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(this.locator)
        );
    }

}
