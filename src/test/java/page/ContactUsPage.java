package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Logs;
import utils.WebDriverProvider;
import utils.data.FormContactUs.FormDataInterface;
import utils.data.FormContactUs.varRigthData;

public class ContactUsPage extends BaseTest {
    //Localizadores
    public By inputName = By.id("name");
    public By inputEmail = By.id("email");
    public By inputPhoneNumber = By.id("phone");
    public By selectCountryCode = By.id("countryCode");
    public By inputSubject = By.id("subject");
    public By textareaMessage = By.id("message");
    public By buttonSendMessage = By.cssSelector("button[aria-label='submit']");
    public By successMessage = By.xpath("//h1[contains(text(), 'Thank you for reaching out')]");
    public By errorMessage = By.xpath("//span[text()='Please enter a valid name']");


    //Metodos
        public boolean isSuccessMessage(){
        return driver.findElement(successMessage).isDisplayed();
    }
        public boolean isErrorMessage(){
        return driver.findElement(errorMessage).isDisplayed();
    }

        //Get
        public String getSuccessMessage(){
            return driver.findElement(successMessage).getText();
        }
        public void fillContactForm(FormDataInterface data) throws InterruptedException {
            setDataForm(inputName,data.getName());
            setDataForm(inputEmail,data.getEmail());
            setDataForm(inputPhoneNumber,String.valueOf(data.getNumberPhone()));
            selectCountryContainingText(selectCountryCode, data.getCountryCode());
            setDataForm(inputSubject,data.getSubject());
            setDataForm(textareaMessage,data.getMessage());
        }

        //Set
        public void setDataForm(By input, String name ) throws InterruptedException {
            WebElement  element = driver.findElement(input);
            element.clear();
            element.sendKeys(name);
            scrollToElement(input);
            Thread.sleep(1000);
        }
        public void selectCountryContainingText(By selectLocator, String countryName) {
        WebElement selectElement = driver.findElement(selectLocator);
            Select select = new Select(selectElement);
            boolean found = false;
            for (WebElement option : select.getOptions()) {
                if (option.getText().toLowerCase().contains(countryName.toLowerCase())) {
                    option.click();
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new NoSuchElementException("No se encontró el país: " + countryName);
            }
        }

        //Click
        public void clickButtonSend() throws InterruptedException {
            driver.findElement(buttonSendMessage).click();
            Thread.sleep(1000);
        }
    }


