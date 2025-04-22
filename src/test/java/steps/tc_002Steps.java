import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;
import static org.junit.Assert.*;

public class tc_002Steps {

    private WebDriver driver;
    private tc_002Page page;
  
    @Before
    public void setUp() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_002Page.class);
    }
    
    @Given("el usuario está en la página de subida de archivos")
    public void el_usuario_esta_en_la_pagina_de_subida_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un archivo válido en formato PDF/DOCX")
    public void el_usuario_selecciona_un_archivo_valido_en_formato_pdf_docx() {
        page.uploadValidFile("path/to/valid/file.pdf");
    }

    @Then("el archivo se carga correctamente")
    public void el_archivo_se_carga_correctamente() {
        assertTrue(page.isFileUploaded());
    }

    @Then("se muestra la vista previa con el nombre, tamaño y tipo del archivo")
    public void se_muestra_la_vista_previa_con_el_nombre_tamano_y_tipo_del_archivo() {
        assertTrue(page.isFilePreviewDisplayed());
    }
}