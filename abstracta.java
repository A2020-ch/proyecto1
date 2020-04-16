package prueba2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class abstracta {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://abstracta.us/blog/software-testing/best-demo-websites-for-practicing-different-types-of-software-tests/");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement solution = driver.findElement(By.linkText("Solutions"));
        action.moveToElement(solution).perform();


    }

}