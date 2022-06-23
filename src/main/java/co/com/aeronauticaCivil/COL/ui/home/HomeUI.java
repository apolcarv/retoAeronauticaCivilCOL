package co.com.aeronauticaCivil.COL.ui.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target VALIDAR_IMAGEN = Target.the("Valida el logo de la areonautica civil")
            .located(By.xpath("//ul[@class='logosHeader']//img[@alt='default.aspx']"));
}
