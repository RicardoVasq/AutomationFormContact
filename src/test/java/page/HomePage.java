package page;

import base.BaseTest;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {
    //Localizadores
    public By navBarContactUs = By.xpath("//a[text()='Contact Us']");


    //Metodos
        //Click en navbar
        public void clickNavBarContactUs(){
            driver.findElement(navBarContactUs).click();
        }
}
