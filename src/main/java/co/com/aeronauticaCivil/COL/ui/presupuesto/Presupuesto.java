package co.com.aeronauticaCivil.COL.ui.presupuesto;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Presupuesto extends PageObject {
    public static final Target VALIDAR_TEXTO_PRESUPUESTO = Target.the("Valida que este dentro de la interfaz presupuestos")
            .located(By.xpath("//span[@id]//span[contains(text(),'Presupuesto')]"));

}
