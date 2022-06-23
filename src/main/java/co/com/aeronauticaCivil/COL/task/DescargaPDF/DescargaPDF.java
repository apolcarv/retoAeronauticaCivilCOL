package co.com.aeronauticaCivil.COL.task.DescargaPDF;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.aeronauticaCivil.COL.ui.estadosFinancieros.InformacionFinancieraUI.ICONO_DESCARGAR_PDF_CORRESPONDIENTE;

public class DescargaPDF implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ICONO_DESCARGAR_PDF_CORRESPONDIENTE));
    }
    public static Performable clickIconoDescargarPDF(){
        return Tasks.instrumented(DescargaPDF.class);
    }
}
