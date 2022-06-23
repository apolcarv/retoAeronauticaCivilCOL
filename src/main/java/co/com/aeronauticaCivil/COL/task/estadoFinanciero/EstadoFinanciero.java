package co.com.aeronauticaCivil.COL.task.estadoFinanciero;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.aeronauticaCivil.COL.ui.estadosFinancieros.InformacionFinancieraUI.SELECT_ESTADOS_FINANCIEROS;

public class EstadoFinanciero implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_ESTADOS_FINANCIEROS));
    }
    public static Performable seleccionaEstadoFinanciero(){
        return Tasks.instrumented(EstadoFinanciero.class);
    }
}
