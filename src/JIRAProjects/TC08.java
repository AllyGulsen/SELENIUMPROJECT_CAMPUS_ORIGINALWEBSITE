package JIRAProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TC08 {
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


        /*

        WebElement financeClick = driver.findElement(By.cssSelector("button[aria-controls='mat-menu-panel-85']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(financeClick).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement myFinance = driver.findElement(By.xpath("//span[text()='My Finance']"));
        wait.until(ExpectedConditions.visibilityOf(myFinance));

        myFinance.click();


        WebElement cancelledFee = driver.findElement(By.cssSelector("div[class='mat-sort-header-content ng-tns-c315-92']"));
        WebElement refundedFee = driver.findElement(By.cssSelector("div[class='mat-sort-header-content ng-tns-c315-93']"));
        if (cancelledFee.isDisplayed() & refundedFee.isDisplayed())
            System.out.println("your code passed");
        else
            System.out.println("your code failed");
*/

}
}