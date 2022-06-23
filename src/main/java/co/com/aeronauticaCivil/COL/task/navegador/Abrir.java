package co.com.aeronauticaCivil.COL.task.navegador;

import co.com.aeronauticaCivil.COL.helpers.Constant;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

public class Abrir implements Task {
    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String paginawebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constant.PAGINA_WEB_URL);
        actor.attemptsTo(Open.url(paginawebUrl));
    }
    public static Performable navegadorWebURL(){
        return Tasks.instrumented(Abrir.class);
    }
}
