package prueba2;

import jdk.internal.instrumentation.TypeMapping;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class probando {


    static public void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        driver.navigate().to("https://pe.ebay.com/b/Under-10/bn_7001623770");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("shoes");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys(Keys.ENTER);;
        driver.findElement(By.cssSelector("#s0-13-11-0-1-2-6-0-2\\[1\\]-11\\[1\\] > div > input")).sendKeys("pum");
        driver.findElement(By.xpath("//input[@aria-label = 'PUMA']")).click();
        WebElement talla = driver.findElement(By.cssSelector("input[aria-label = '10']"));
        talla.click();
        driver.findElement(By.cssSelector("#s0-13-11-5-1\\[0\\]-42-0 > button")).click();
        driver.findElement(By.linkText("Precio + Envío: más bajo primero")).click();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.cssSelector("h1.srp-controls__count-heading"));
        result.getText();
        System.out.println(result.getText());
        List <String> productos = new ArrayList();
        productos.add(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).getText()+ "\n");
        productos.add(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/a/h3")).getText()+ "\n");
        productos.add(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/a/h3")).getText()+ "\n");
        productos.add(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[4]/div/div[2]/a/h3")).getText()+ "\n");
        productos.add(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[5]/div/div[2]/a/h3")).getText()+ "\n");
        Collections.sort(productos);
        System.out.println("ordenando por nombre de producto: ");
        System.out.println(productos);
        List <String>  precio = new ArrayList();
        precio.add((driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[3]/div[1]/span")).getText()) + "\n");
        precio.add((driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/div[3]/div[1]/span")).getText())+ "\n");
        precio.add((driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/div[3]/div[1]/span")).getText())+ "\n");
        precio.add((driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[4]/div/div[2]/div[3]/div[1]/span")).getText())+ "\n");
        precio.add((driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[5]/div/div[2]/div[3]/div[1]/span")).getText())+ "\n");

        Collections.sort(precio);
        System.out.println("ordenando por precio descendente: ");
        System.out.println(precio);



    }



}
