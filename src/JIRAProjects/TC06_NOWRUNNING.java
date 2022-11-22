package JIRAProjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class TC06_NOWRUNNING {
    //user  should be able to search and filter based on date and topic
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

        WebElement hamburgerIcon = driver.findElement(By.cssSelector("svg[data-icon='bars']"));
        hamburgerIcon.click();

        WebElement videoConference = driver.findElement(By.xpath("(//button[@role='menuitem'])[3]"));
       videoConference.click();

        WebElement videoMeetings = driver.findElement(By.xpath("(//button[@role='menuitem'])[4]"));
        videoMeetings.click();

        WebElement openCalenderButton= driver.findElement(By.cssSelector("button[aria-label='Open calendar']"));
        openCalenderButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(openCalenderButton));

        WebElement buAyButton= driver.findElement(By.xpath("//span[text()=' Son ay ']/.."));
        buAyButton.click();

        WebElement topicInput= driver.findElement(By.cssSelector("ms-text-field[PLACEHOLDER='GENERAL.FIELD.TOPIC']>input"));
        topicInput.sendKeys("GoRest");

        WebElement searchButton= driver.findElement(By.tagName("ms-search-button"));
        searchButton.click();




}
}