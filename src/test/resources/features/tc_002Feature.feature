Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subida de archivo PDF/DOCX y mostrar vista previa
    Given el usuario está en la página de subida de archivos
    When el usuario selecciona un archivo válido en formato PDF/DOCX
    Then el archivo se carga correctamente
    And se muestra la vista previa con el nombre, tamaño y tipo del archivo