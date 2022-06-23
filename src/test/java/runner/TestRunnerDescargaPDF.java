package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/pdfDescargado.feature"}
        , glue = {"stepDefinition"}
       // , tags = "@Descarga_Y_Validacion_Exitosa"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class TestRunnerDescargaPDF {
}
