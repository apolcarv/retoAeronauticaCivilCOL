package co.com.aeronauticaCivil.COL.ui.estadosFinancieros;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionFinancieraUI extends PageObject{

    public static final Target SELECT_ESTADOS_FINANCIEROS = Target.the("Selecciona del menu el estado financiero")
            .located(By.xpath("//a[@title='Estados financieros' and @class='level2 static']"));

    public static final Target VALIDAR_TEXTO_INFORMACION_FINANCIERA = Target.the("Valida que este dentro de la interfaz informacion financiera")
            .located(By.xpath("//h1[contains(text(),'Estados financieros')]"));

    public static final Target SELECT_OPCION_BALANCE = Target.the("Selecciona del menu el estado financiero")
            .located(By.xpath(" //*[@id='WebPartWPQ10']//div[@class='ms-rtestate-field']"));

    public static final Target ICONO_DESCARGAR_PDF_CORRESPONDIENTE = Target.the("clic en el icono de descargar el pdf")
            .located(By.xpath("//a[@title='Estado de Situación Financiera a 31 de marzo de 2022'][2]"));
}


