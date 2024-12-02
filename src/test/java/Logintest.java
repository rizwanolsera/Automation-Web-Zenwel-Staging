import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class belajarselenium {


    @Test
    public void helloJayjay() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        driver.get("https://myzenwel.indociti.com/login?redirect=%2F");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/div/div[2]/div/div[1]/input")).sendKeys("rizwanto.olsera@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/div/div[3]/div/div[1]/input")).sendKeys("admin123");

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/div/div[4]/div/button")).click();

        // Pause for 10 seconds (10000 milliseconds)
        Thread.sleep(10000);

        // Optionally close the browser manually
        driver.quit();

    }
}
