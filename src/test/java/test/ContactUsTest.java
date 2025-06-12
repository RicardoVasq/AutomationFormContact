package test;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.ContactUsPage;
import page.HomePage;
import utils.Logs;
import utils.data.FormContactUs.varRigthData;
import utils.data.FormContactUs.varWrongData;
import utils.data.dataReader;


@Epic("Formulario de Contacto")
@Feature("Envío exitoso del formulario")
public class ContactUsTest extends BaseTest {
    //Instancias
    HomePage HomePage = new HomePage();
    ContactUsPage ContactUsPage = new ContactUsPage();



    @Severity(SeverityLevel.CRITICAL)
    @Story("El usuario llena todos los campos correctamente")
    @Description("Este test automatiza el llenado del formulario y verifica que se muestre el mensaje de éxito.")
    @Test(description = "Llenar y enviar el formulario de contacto con datos válidos", groups = {"form"})
    public void testFillFormContactUs() throws InterruptedException {
        Logs.info("Preparamos datos de entrada para el formulaario");
        varRigthData formData = dataReader.dataVariable().getDataFormContactUs().getRightDataForm();

        Logs.debug("Navegamos hacia la pagina de Contact Us desde la pagina de Home");
        HomePage.clickNavBarContactUs();

        Logs.debug("Llenamos el formulario con los datos  de  JSON");
        ContactUsPage.fillContactForm(formData);

        Logs.debug("Enviamos formualrio");
        ContactUsPage.clickButtonSend();

        Logs.debug("Verfiicamos el mensaje de envio");
        softAssertl.assertTrue(ContactUsPage.isSuccessMessage());
        softAssertl.assertEquals(ContactUsPage.getSuccessMessage(),"Thank you for reaching out");
        softAssertl.assertAll();

    }
    @Severity(SeverityLevel.CRITICAL)
    @Story("El usuario llena todos los campos de forma incorrectamente")
    @Description("Este test automatiza el llenado del formulario y verifica que no se genere  el envio.")
    @Test(description = "Llenar y enviar el formulario de contacto con datos incorrectos", groups = {"form"})
    public void testFillWrongFormContactUs() throws InterruptedException {
        Logs.info("Preparamos datos de entrada para el formulaario");
        varWrongData formData = dataReader.dataVariable().getDataFormContactUs().getWrongDataForm();

        Logs.debug("Navegamos hacia la pagina de Contact Us desde la pagina de Home");
        HomePage.clickNavBarContactUs();

        Logs.debug("Llenamos el formulario con los datos  de  JSON");
        ContactUsPage.fillContactForm(formData);

        Logs.debug("Enviamos formualrio");
        ContactUsPage.clickButtonSend();

        Logs.debug("Verfiicamos el mensaje de envio");
        softAssertl.assertTrue(ContactUsPage.isErrorMessage());
        softAssertl.assertAll();

    }
}
