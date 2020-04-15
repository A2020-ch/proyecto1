package prueba2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class adidas {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adidas.pe/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Actions hombres = new Actions(driver);
        WebElement HOM = driver.findElement(By.linkText("HOMBRE"));
        hombres.moveToElement(HOM).perform();
        driver.findElement(By.linkText("Novedades")).click();



    }
}
