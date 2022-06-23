package stepDefinition;

import co.com.aeronauticaCivil.COL.helpers.Constant;
import co.com.aeronauticaCivil.COL.helpers.pdfDescargado.ConfiguracionInicial;
import co.com.aeronauticaCivil.COL.helpers.pdfDescargado.DeletePdf;
import co.com.aeronauticaCivil.COL.question.ValidarPDF.ValidarDescargaDelArchivo;
import co.com.aeronauticaCivil.COL.question.ValidarPDF.ValidarDescargaDelArchivoFallida;
import co.com.aeronauticaCivil.COL.question.estadosFinanciero.ValidacionTextoEstadoFinanciero;
import co.com.aeronauticaCivil.COL.question.home.ValidaHome;
import co.com.aeronauticaCivil.COL.question.menu.ValidTextPresupuesto;
import co.com.aeronauticaCivil.COL.task.DescargaPDF.DescargaPDF;
import co.com.aeronauticaCivil.COL.task.estadoFinanciero.BalancesTask;
import co.com.aeronauticaCivil.COL.task.estadoFinanciero.EstadoFinanciero;
import co.com.aeronauticaCivil.COL.task.navegador.Abrir;
import co.com.aeronauticaCivil.COL.task.menu.MenuTask;
import co.com.aeronauticaCivil.COL.task.presupuesto.PresupuestoTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepPdfDescargado {

    private DeletePdf deletePdf;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        deletePdf.statementDownloaded();
    }

    @Dado("el usuario ingresa a la pagina de la aeronautica civil de colombia")
    public void elUsuarioIngresaALaPaginaDeLaAeronauticaCivilDeColombia() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(ConfiguracionInicial.obtenerConfiguracionRutas());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(Abrir.navegadorWebURL());
        theActorInTheSpotlight().should(seeThat(ValidaHome.logoAeronauticaCivil()));
    }

    @Cuando("realiza una serie de pasos hasta llegar a los estados financieros seleccionando los balances")
    public void realizaUnaSerieDePasosHastaLlegarALosEstadosFinancierosSeleccionandoLosBalances() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(MenuTask.busqueda());
        theActorCalled(Constant.MR_ROBOT).attemptsTo(PresupuestoTask.seleccionaResultadoDeBusqueda());
        theActorInTheSpotlight().should(seeThat(ValidTextPresupuesto.validarTextoPresupuesto()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(EstadoFinanciero.seleccionaEstadoFinanciero());
        theActorInTheSpotlight().should(seeThat(ValidacionTextoEstadoFinanciero.informacionFinanciera()));
        theActorCalled(Constant.MR_ROBOT).attemptsTo(BalancesTask.seleccionaOpcionBalances());
    }

    @Entonces("descarga el archivo Estado de situacion financiera del marzo del year en curso y valida que se haya descargado el archivo")
    public void descargaElArchivoEstadoDeSituacionFinancieraDelMarzoDelYearEnCursoYValidaQueSeHayaDescargadoElArchivo() throws IOException {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(DescargaPDF.clickIconoDescargarPDF());
        theActorInTheSpotlight().should(seeThat(ValidarDescargaDelArchivo.validacionExitosa()));
    }

    @Entonces("descarga el archivo Estado de situacion financiera del marzo del year en curso y valida pero los nombres de los archivos no coinciden")
    public void descargaElArchivoEstadoDeSituacionFinancieraDelMarzoDelYearEnCursoYValidaPeroLosNombresDeLosArchivosNoCoinciden() {
        theActorCalled(Constant.MR_ROBOT).attemptsTo(DescargaPDF.clickIconoDescargarPDF());
        theActorInTheSpotlight().should(seeThat(ValidarDescargaDelArchivoFallida.validacionFallidaPeroExitosa()));
    }

    @After
    public void despues() {
        deletePdf.statementDownloaded();
    }


}
