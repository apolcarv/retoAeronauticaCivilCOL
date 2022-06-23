# language: es
  Característica: PDF Descargado



    @Descarga_Y_Validacion_Exitosa
    Escenario: 001- Validar que el archivo descargado se encuentre en la carpeta descargas de la maquina
      Dado el usuario ingresa a la pagina de la aeronautica civil de colombia
      Cuando realiza una serie de pasos hasta llegar a los estados financieros seleccionando los balances
      Entonces descarga el archivo Estado de situacion financiera del marzo del year en curso y valida que se haya descargado el archivo


    @Descarga_Y_Validacion_Fallida
    Escenario: 002- Validar que el archivo descargado se encuentre en la maquina pero no coiciden
      Dado el usuario ingresa a la pagina de la aeronautica civil de colombia
      Cuando realiza una serie de pasos hasta llegar a los estados financieros seleccionando los balances
      Entonces descarga el archivo Estado de situacion financiera del marzo del year en curso y valida pero los nombres de los archivos no coinciden
