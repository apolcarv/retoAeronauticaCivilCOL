package co.com.aeronauticaCivil.COL.question.ValidarPDF;

import co.com.aeronauticaCivil.COL.helpers.Constant;
import co.com.aeronauticaCivil.COL.helpers.ManagerLog;
import co.com.aeronauticaCivil.COL.helpers.pdfDescargado.ReadPdf;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;

import static co.com.aeronauticaCivil.COL.helpers.pdfDescargado.ConfiguracionInicial.downloadFolder;
import static co.com.aeronauticaCivil.COL.helpers.pdfDescargado.ConfiguracionInicial.fileName;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarDescargaDelArchivoFallida implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String statementFilePath = String.format("%s/%s", downloadFolder, fileName);
        try {
            theActorInTheSpotlight().whoCan(ReadPdf.downloadedInPath(statementFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String pdfText = ReadPdf.as(theActorInTheSpotlight()).getText();
        if (pdfText != null && pdfText.equals(Constant.VALID_FILE_NAME)) {
            ManagerLog.imprimirExito(Constant.MENSAJE_EXITOSO_PDF);
        } else {
            ManagerLog.imprimirFallo(Constant.MENSAJE_FALLIDO_PDF);
            ManagerLog.imprimirMensaje("NombreArchivoDescargado: " + pdfText +"\n "+ "NombreArchivoEsperado: " + Constant.VALID_FILE_NAME);
        }
        return true;
    }
    public static ValidarDescargaDelArchivoFallida validacionFallidaPeroExitosa(){
        return new ValidarDescargaDelArchivoFallida();
    }
}
