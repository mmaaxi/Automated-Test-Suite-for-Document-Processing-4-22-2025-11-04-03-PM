package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page cargaDocumentosPage;

    public tc_001Steps(WebDriver driver) {
        this.driver = driver;
        cargaDocumentosPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("El usuario está en la página de carga de documentos")
    public void usuario_en_pagina_de_carga() {
        driver.get("http://example.com/cargarDocumentos");
    }

    @When("Selecciona la opción 'cargar documentos'")
    public void selecciona_opcion_cargar_documentos() {
        cargaDocumentosPage.seleccionarOpcionCargarDocumentos();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void muestra_opcion_carga_unica_y_multiple() {
        assertTrue(cargaDocumentosPage.opcionesDeCargaVisibles());
    }

    @When("Elige 'carga en un solo archivo'")
    public void elige_carga_un_solo_archivo() {
        cargaDocumentosPage.elegirCargaUnicoArchivo();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void habilita_recuadro_unico() {
        assertTrue(cargaDocumentosPage.recuadroUnicoHabilitado());
    }

    @When("Elige 'cargar documentos por separado'")
    public void elige_cargar_documentos_separado() {
        cargaDocumentosPage.elegirCargaSeparada();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void muestra_recuadros_multiples() {
        assertTrue(cargaDocumentosPage.recuadrosMultiplesVisibles());
    }
}