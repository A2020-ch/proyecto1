package prueba2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

    static public void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pe.ebay.com/b/Under-10/bn_7001623770");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);

        driver.findElement(By.id("gh-shop-ei")).click();
        driver.findElement(By.cssSelector("#gh-sbc > tbody > tr > td:nth-child(1) > ul:nth-child(6) > li:nth-child(4) > a")).click();


    }
}
