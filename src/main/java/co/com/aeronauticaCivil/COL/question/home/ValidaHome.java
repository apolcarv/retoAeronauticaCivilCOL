package co.com.aeronauticaCivil.COL.question.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.aeronauticaCivil.COL.ui.home.HomeUI.VALIDAR_IMAGEN;

public class ValidaHome implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return VALIDAR_IMAGEN.resolveFor(actor).isPresent();
    }
    public static ValidaHome logoAeronauticaCivil(){
        return new ValidaHome();

    }
}
