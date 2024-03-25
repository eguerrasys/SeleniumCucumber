package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test {


    private WebDriver driver = hooks.getDriver();

    @Given("^El usuario esta en home page$")
    public void el_usuario_esta_en_home_page() throws Throwable {
        String titlehomepage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(titlehomepage, driver.getTitle());
    }

    @When("^Hace click sobre el boton de comics$")
    public void hace_click_sobre_el_boton_de_comics() throws Throwable {
        WebElement titlecomic= driver.findElement(By.id("menu-item-2008"));
        titlecomic.click();
    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        WebElement pagetitle = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redicciona correctamente", pagetitle.isDisplayed());
        Assert.assertEquals("Category: comics",pagetitle.getText());
    }

