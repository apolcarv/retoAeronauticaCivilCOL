package co.com.aeronauticaCivil.COL.ui.menu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuUI extends PageObject {

/**
    public static final Target SELECT_TRANSPARENCIA = Target.the("Selecciona del menu la opcion transparencia")
            .located(By.xpath("//li[@class='static dynamic-children'][4]"));
    */

    public static final Target INPUT_BUSQUEDA = Target.the("Realiza busqueda de la opcion que nesecite")
            .located(By.xpath("//div[@id='SearchBox']//div[@class='ms-srch-sb ms-srch-sb-border']//input[@type='text']"));

    public static final Target ICONO_BUSQUEDA = Target.the("Pulsa el icono de busqueda")
            .located(By.xpath("//div[@id='SearchBox']//a[@title='Realiza búsquedas']"));

    public static final Target SELECT_OPTION_PRESUPUESTO = Target.the("Selecciona la opcion presupuesto")
           /** .located(By.xpath("//span[contains(text(),'Presupuesto')]"));*/
           /** .located(By.xpath("//h3//strong[@class='ms-srch-item-highlightedText']"));  */
            .located(By.xpath("//a[@clicktype='Result' and @title='Presupuesto']"));



}
