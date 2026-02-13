package qa.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "qa.automation",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "summary",
                "html:target/serenity-report.html",
                "json:target/serenity-report.json"
        },
        monochrome = true
)
public class TestRunner {
    private static final Logger logger = LoggerFactory.getLogger(TestRunner.class);

    @BeforeClass
    public static void beforeExecution(){
        logger.info("INICIANDO LAS PRUEBAS EN SERENITY BDD >>>>>>>>>>");
    }

    @AfterClass
    public static void afterExecution(){
        logger.info("FINALIZANDO LAS PRUEBAS EN SERENITY BDD >>>>>>>>>>");
    }
}