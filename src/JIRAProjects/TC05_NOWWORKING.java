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

public class TC05_NOWWORKING {
    //user  should be able to  watch all Video Meetings


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://campus.techno.study/");

        WebElement userName = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userName.sendKeys("X@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("XXX");

        WebElement login = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
        login.click();


        WebElement arrow= driver.findElement(By.xpath("(//button[@aria-haspopup='menu'])[2]"));
        arrow.click();

        Actions action= new Actions(driver);

        WebElement okullar= driver.findElement(By.xpath("(//button[@tabindex='0'])[1]"));
        action.moveToElement(okullar).perform();
        action.click(okullar).perform();

        WebElement USTurkeyBox= driver.findElement(By.cssSelector("div[id='mat-menu-panel-1']"));
        action.moveToElement(USTurkeyBox).perform();

        WebElement checkContent= driver.findElement(By.cssSelector("mat-radio-button[id='mat-radio-8']"));
        action.moveToElement(checkContent).perform();

        WebElement checkBoxUS= driver.findElement(By.xpath("(//span[@class='mat-radio-outer-circle'])[2]"));
        checkBoxUS.click();


        WebElement hamburgerIcon = driver.findElement(By.cssSelector("svg[data-icon='bars']"));
        hamburgerIcon.click();

        WebElement videoConferenceBigBox= driver.findElement(By.xpath("(//button[@role='menuitem'])[3]/.."));
        action.moveToElement(videoConferenceBigBox).perform();

        WebElement videoConference = driver.findElement(By.xpath("(//button[@role='menuitem'])[3]"));
        videoConference.click();


       WebElement videoMeetingBigBox= driver.findElement(By.cssSelector("div[id='mat-menu-panel-29']"));
       action.moveToElement(videoMeetingBigBox).perform();

        WebElement videoMeetings = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        videoMeetings.click();

        WebElement openCalenderButton= driver.findElement(By.cssSelector("button[aria-label='Open calendar']"));
        openCalenderButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(openCalenderButton));

        WebElement buYil= driver.findElement(By.xpath("//span[text()=' Bu yıl ']/.."));
        buYil.click();

        WebElement searchDateButton= driver.findElement(By.xpath("//span[text()='Ara']/../.."));
        searchDateButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(searchDateButton));









}
}