Feature: Validar generación de slip de salida y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given El usuario está en la página de carga de documentos
    When El usuario carga y procesa los documentos
    Then El sistema debe generar el 'Slip de salida'
    And El sistema debe guardar los documentos originales en el historial de la solicitud
    And El sistema debe almacenar los datos extraídos en el historial de la solicitud