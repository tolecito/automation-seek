package qa.automation.tasks;

import qa.automation.ui.RegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaWebEnRegistro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(RegistroUI.class)
        );
    }

    public static AbrirLaWebEnRegistro en() {
        return new AbrirLaWebEnRegistro();
    }
}
