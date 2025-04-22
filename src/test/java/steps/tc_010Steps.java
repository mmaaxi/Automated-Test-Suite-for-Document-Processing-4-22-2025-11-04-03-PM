package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("El usuario carga y procesa los documentos")
    public void elUsuarioCargaYProcesaLosDocumentos() {
        page.uploadAndProcessDocuments();
    }

    @Then("El sistema debe generar el 'Slip de salida'")
    public void elSistemaDebeGenerarElSlipDeSalida() {
        Assert.assertTrue(page.isSlipGenerated());
    }

    @Then("El sistema debe guardar los documentos originales en el historial de la solicitud")
    public void elSistemaDebeGuardarLosDocumentosOriginalesEnElHistorialDeLaSolicitud() {
        Assert.assertTrue(page.areOriginalDocumentsStored());
    }

    @Then("El sistema debe almacenar los datos extraídos en el historial de la solicitud")
    public void elSistemaDebeAlmacenarLosDatosExtraidosEnElHistorialDeLaSolicitud() {
        Assert.assertTrue(page.isExtractedDataStored());
    }
}