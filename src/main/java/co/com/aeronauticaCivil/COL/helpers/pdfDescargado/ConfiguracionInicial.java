package co.com.aeronauticaCivil.COL.helpers.pdfDescargado;

import co.com.aeronauticaCivil.COL.helpers.Constant;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.util.EnvironmentVariables;

public class ConfiguracionInicial implements Task {
    private EnvironmentVariables environmentVariables;
    public static String downloadFolder;
    public static String fileName;

    @Override
    public <T extends Actor> void performAs(T actor) {
        downloadFolder = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constant.PATH_FOLDER_MAQUINA);
        fileName = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constant.PATH_FILE_NAME);

    }
    public static Performable obtenerConfiguracionRutas(){
        return Tasks.instrumented(ConfiguracionInicial.class);
    }
}
