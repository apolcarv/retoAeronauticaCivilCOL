package co.com.aeronauticaCivil.COL.helpers;

public class Constant {
    private Constant(){}

    /** SCREENPLAY */
    public static final String MR_ROBOT = "apolcarv";
    public static final String PAGINA_WEB_URL = "environments.default.webdriver.base.url";

    /** TIEMPOS DE ESPERAS */
    public static final int LONG = 60;
    public static final int MIDDLE = 20;
    public static final int INTERMEDIATE = 10;
    public static final int SHORT = 5;

    /**BUSQUEDA*/
    public static final String BUSQUEDA = "Presupuesto";

    /** PDF */
    public static final String PATH_FOLDER_MAQUINA = "download.filesFolder";
    public static final String PATH_FILE_NAME = "statement.fileName";
    public static final String FOLDER_MAQUINA = "/Users/apolo/Downloads";
    public static final String FILE_NAME = "https___www.aerocivil.gov.co_atencion_presupuesto_Estados Financieros_Estado de Situación Financiera a 31 de marzo de 2022.pdf";
    public static final String VALID_FILE_NAME = "https___www.aerocivil.gov.co_atencion_presupuesto_Estados Financieros_Estado de Situación Financiera a 31 de marzo de 2021.pdf";
    public static final String MENSAJE_EXITOSO_PDF= "El archivo descargado es igual al esperado";
    public static final String MENSAJE_FALLIDO_PDF = "Los nombre de los archivos son distintos";
}
