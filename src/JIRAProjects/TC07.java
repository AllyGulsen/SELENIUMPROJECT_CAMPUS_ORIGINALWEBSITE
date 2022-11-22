package JIRAProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TC07 {
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

        WebElement videoConference = driver.findElement(By.xpath("(//button[@role='menuitem'])[3]"));
        Actions action= new Actions(driver);
        action.moveToElement(videoConference).perform();




        //WebElement videoMeetings = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        //videoMeetings.click();


        /*
        WebElement videospan= driver.findElement(By.xpath("(//span[@class='ng-tns-c186-9 ng-star-inserted'])[9]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(videospan).perform();
        actions.click().perform();

*/

        //JavascriptExecutor js= (JavascriptExecutor) driver;
        //js.executeScript()
/*

        WebElement meetings= driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-menu-item ng-star-inserted']"));
        actions.moveToElement(meetings).click().perform();
*/

        /*

        WebElement meetings = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        meetings.click();

        WebElement name = driver.findElement(By.cssSelector("div[class='mat-sort-header-content ng-tns-c315-143']"));

        System.out.println(name.isDisplayed());

         */


    }
}