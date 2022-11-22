package JIRAProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC09 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://campus.techno.study/");

        WebElement userName = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userName.sendKeys("X@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("XXX");


        WebElement login = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
        login.click();

        WebElement hamburgerIcon = driver.findElement(By.cssSelector("svg[data-icon='bars']"));
        hamburgerIcon.click();

        WebElement Finance= driver.findElement(By.xpath("(//button[@role='menuitem'])[2]"));
        Finance.click();





}
}