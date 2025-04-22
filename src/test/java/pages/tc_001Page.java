package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "cargarDocumentosButton")
    WebElement cargarDocumentosButton;

    @FindBy(id = "opcionCargaUnica")
    WebElement opcionCargaUnica;

    @FindBy(id = "opcionCargaMultiple")
    WebElement opcionCargaMultiple;

    @FindBy(id = "recuadroUnico")
    WebElement recuadroUnico;

    @FindBy(className = "recuadrosMultiples")
    WebElement recuadrosMultiples;

    public void seleccionarOpcionCargarDocumentos() {
        cargarDocumentosButton.click();
    }

    public boolean opcionesDeCargaVisibles() {
        return opcionCargaUnica.isDisplayed() && opcionCargaMultiple.isDisplayed();
    }

    public void elegirCargaUnicoArchivo() {
        opcionCargaUnica.click();
    }

    public boolean recuadroUnicoHabilitado() {
        return recuadroUnico.isDisplayed();
    }

    public void elegirCargaSeparada() {
        opcionCargaMultiple.click();
    }

    public boolean recuadrosMultiplesVisibles() {
        return recuadrosMultiples.isDisplayed();
    }
}