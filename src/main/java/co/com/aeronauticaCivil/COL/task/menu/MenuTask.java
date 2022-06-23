package co.com.aeronauticaCivil.COL.task.menu;

import co.com.aeronauticaCivil.COL.helpers.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.aeronauticaCivil.COL.ui.menu.MenuUI.*;

public class MenuTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       /**actor.attemptsTo(MoveMouse.to(SELECT_TRANSPARENCIA));*/
        actor.attemptsTo(Enter.theValue(Constant.BUSQUEDA).into(INPUT_BUSQUEDA));
        actor.attemptsTo(Click.on(ICONO_BUSQUEDA));

    }
    public static Performable busqueda(){
        return Tasks.instrumented(MenuTask.class);
    }
}
