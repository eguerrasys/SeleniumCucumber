package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.broser_manager.DriverManager;
import runner.broser_manager.DriverManagerFactory;
import runner.broser_manager.DriverType;


public class hooks {
    private static WebDriver driver;
    private static int numberOfCase =0;
    private DriverManager driverManager;

    @Before

    public void setUp(){
        numberOfCase ++;
        System.out.println("Se esta ejecutando el escenario numero: "+ numberOfCase);
        driverManager = DriverManagerFactory.getManager();
        driver = driverManager.getDriver(DriverType.CHROME);
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("Escenario: "+ numberOfCase+ "se ejecuto bien.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){

       return driver;
    }
}
