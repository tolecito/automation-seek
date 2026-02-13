package qa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import qa.automation.ui.LoginUI;


public class AbrirLaWebEnLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(LoginUI.class)
        );
    }

    public static AbrirLaWebEnLogin en() {
        return new AbrirLaWebEnLogin();
    }
}
