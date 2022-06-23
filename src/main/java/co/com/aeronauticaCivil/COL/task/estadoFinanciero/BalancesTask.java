package co.com.aeronauticaCivil.COL.task.estadoFinanciero;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.aeronauticaCivil.COL.ui.estadosFinancieros.InformacionFinancieraUI.SELECT_OPCION_BALANCE;

public class BalancesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_OPCION_BALANCE));
    }
    public static Performable seleccionaOpcionBalances(){
        return Tasks.instrumented(BalancesTask.class);
    }
}
