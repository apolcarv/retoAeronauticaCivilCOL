package co.com.aeronauticaCivil.COL.question.menu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.aeronauticaCivil.COL.ui.presupuesto.Presupuesto.VALIDAR_TEXTO_PRESUPUESTO;

public class ValidTextPresupuesto implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return VALIDAR_TEXTO_PRESUPUESTO.resolveFor(actor).isPresent();
    }
    public static ValidTextPresupuesto validarTextoPresupuesto(){
        return new ValidTextPresupuesto();
    }
}
