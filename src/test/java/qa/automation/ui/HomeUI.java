package qa.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomeUI extends PageObject {
    public static final Target TEXTO_BIENVENIDA = Target.the("Texto Bienvenida")
            .located(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/span/a"));
}
