package co.com.aeronauticaCivil.COL.task.presupuesto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.aeronauticaCivil.COL.ui.menu.MenuUI.SELECT_OPTION_PRESUPUESTO;

public class PresupuestoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_OPTION_PRESUPUESTO));
    }
    public static Performable seleccionaResultadoDeBusqueda(){
        return Tasks.instrumented(PresupuestoTask.class);
    }
}
