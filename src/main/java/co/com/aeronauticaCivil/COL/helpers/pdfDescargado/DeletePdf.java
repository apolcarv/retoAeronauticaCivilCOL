package co.com.aeronauticaCivil.COL.helpers.pdfDescargado;

import co.com.aeronauticaCivil.COL.helpers.Constant;
import co.com.aeronauticaCivil.COL.helpers.ManagerLog;

import java.io.File;


public class DeletePdf {
    private DeletePdf(){}


    public static void statementDownloaded(){
        File downloadsDirectory = new File(Constant.FOLDER_MAQUINA);
        for (File file : downloadsDirectory.listFiles()){
            if(isAStatement(file.getName())){
              file.deleteOnExit();
              ManagerLog.imprimirExito("Se elimina el archivo");
            }
        }
    }
    public static boolean isAStatement(String fileName){
        if(fileName.contains(Constant.FILE_NAME)){
            return true;
        }
        return false;
    }
}
