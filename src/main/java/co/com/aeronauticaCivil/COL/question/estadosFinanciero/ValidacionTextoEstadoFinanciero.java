package co.com.aeronauticaCivil.COL.question.estadosFinanciero;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.aeronauticaCivil.COL.ui.estadosFinancieros.InformacionFinancieraUI.VALIDAR_TEXTO_INFORMACION_FINANCIERA;

public class ValidacionTextoEstadoFinanciero implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return VALIDAR_TEXTO_INFORMACION_FINANCIERA.resolveFor(actor).isPresent();
    }
    public static ValidacionTextoEstadoFinanciero informacionFinanciera(){
        return new ValidacionTextoEstadoFinanciero();
    }
}
