package JIRAProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;




import java.util.concurrent.TimeUnit;

public class TC11_NOWRUNNING {
    //user  should be able to write a New Message  under Messaging menu of hamburger icon

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://campus.techno.study/");

        Thread.sleep(5000);
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


        //ÖNCE BÜYÜK KUTUYU LOCATE ETTİM, SONRA ORAYA MOVE TO DEDİM--> SONRA US'IN KÜÇÜK CONTENT KUTUSUNU LOCATE EDİP ORAYA MOVETO YAPTIM
        //SONRA SPAN TÜRÜNDE OLAN RADIO BUTTON'IN OUTER CIRCLE'INA CLICK YAPTIM

        WebElement USTurkeyBox= driver.findElement(By.cssSelector("div[id='mat-menu-panel-1']"));
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(USTurkeyBox));
        action.moveToElement(USTurkeyBox).perform();


        WebElement checkContent= driver.findElement(By.cssSelector("mat-radio-button[id='mat-radio-8']"));
        action.moveToElement(checkContent).perform();

        WebElement checkBoxUS= driver.findElement(By.xpath("(//span[@class='mat-radio-outer-circle'])[2]"));
        checkBoxUS.click();

        WebElement acceptCookies= driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
        acceptCookies.click();

        WebElement hamburgerIcon = driver.findElement(By.cssSelector("svg[data-icon='bars']"));
        hamburgerIcon.click();

        WebElement hamburgerDropdownMenu= driver.findElement(By.id("mat-menu-panel-4"));
        action.moveToElement(hamburgerDropdownMenu).perform();


        WebElement messages = driver.findElement(By.xpath("(//button[@role='menuitem'])[1]"));
        action.moveToElement(messages).perform();

        WebElement newMessageMenuPanel= driver.findElement(By.id("mat-menu-panel-8"));
        action.moveToElement(newMessageMenuPanel).perform();


        WebElement newMessage= driver.findElement(By.xpath("(//button[@tabindex='0'])[4]"));
        action.moveToElement(newMessage).perform();
        newMessage.click();

        WebElement usersButton= driver.findElement(By.cssSelector("ms-button[icon='users']"));
        usersButton.click();

        WebElement writeReceiverNameBox= driver.findElement(By.id("mat-input-3"));
        writeReceiverNameBox.sendKeys("nurullah parlak");

        WebElement container= driver.findElement(By.cssSelector("mat-drawer-container[hasbackdrop='true']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(4000);
        WebElement receiverCheckBox= driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"));

        receiverCheckBox.click();

        //WebElement scrollbar= driver.findElement(By.cssSelector("div[class='cdk-virtual-scroll-content-wrapper']"));

        WebElement addButton= driver.findElement(By.xpath("(//ms-button[@class='ng-star-inserted'])[3]//button"));
        //wait.until(ExpectedConditions.elementToBeClickable(addButton));
        addButton.click();

        WebElement closeBox= driver.findElement(By.cssSelector("button[aria-label='Close dialog']>span"));
        closeBox.click();

        WebElement subject= driver.findElement(By.xpath("(//input[@id='ms-text-field-0'])[1]"));
        subject.sendKeys("Test for testcase11 ");

        WebElement messageSendButton= driver.findElement(By.cssSelector("ms-button[caption='USER_MESSAGES.BUTTONS.SEND']>button"));
        js.executeScript("arguments[0].scrollIntoView();",messageSendButton);

        messageSendButton.click();

       // MESAJ BAŞARIYLA İLETİLDİ MESAJINI VALIDATE NASIL EDEBİLİRİM? MESAJ HEMEN KAYBOLUYOR?

        /*
        String actualTitle = driver.getTitle();

        String expectedTitle = "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
        Assert.assertEquals(expectedTitle, actualTitle);
 */
}
}