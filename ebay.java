package prueba2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.print.DocFlavor;

public class probando {


    static public void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://pe.ebay.com/b/Under-10/bn_7001623770");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        driver.findElement(By.id("gh-shop-ei")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#gh-sbc > tbody > tr > td:nth-child(1) > ul:nth-child(6) > li:nth-child(4) > a")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Calzado para hombres")).click();
        Thread.sleep(4000);
        WebElement talla = driver.findElement(By.cssSelector("input[aria-label = '10']"));
        talla.click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button[aria-label = 'Recuadro de especificaciones de búsqueda de Marca']")).click();
        Thread.sleep(3000);
        WebElement puma = driver.findElement(By.cssSelector("#c3-subPanel-Brand_PUMA_cbx"));
        puma.click();
        driver.findElement(By.cssSelector("button[aria-label = 'Aplicar']")).click();
        Thread.sleep(2000);
        WebElement select = driver.findElement(By.cssSelector("#s0-25-9-0-1\\[0\\]-0-1-6-5-35 > button > div > svg > use"));
        actions.moveToElement(select).perform();
        driver.findElement(By.linkText("Precio + Envío: más bajo primero")).click();
        Thread.sleep(3000);

        String[] page = {"Puma Adultos Unisex Epic Flip v2 De Verano Playa Sandalias diapositivas Ojotas Negro..", "Puma Adultos Unisex Epic Flip v2 De Verano Playa Sandalias diapositivas Ojotas Blancas..", "Puma Adultos Unisex POPCAT Verano Playa Deportes Correa Diapositiva Sandalias Zapatos Blanco..", "Puma Adultos Unisex leadcat Verano Playa Deportes Correa Diapositiva Sandalias Zapatos Negro.", "Puma Shoestring Rihanna Jelly Slip On Deslizadores Para Hombres Sandalias Ojotas 362465 05 D44"};


        System.out.println("Los zapatos seleccionados son:");
        for (String d : page) {

            driver.findElement(By.linkText(d)).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("Agregar al carro de compras")).click();
            System.out.println(d);
            Thread.sleep(5000);
            driver.get("https://pe.ebay.com/b/PUMA-Shoes-US-Size-10-for-Men/93427/bn_111288631?listingOnly=1&rt=nc&_dmd=1&_sop=15");
        }

    }
}
