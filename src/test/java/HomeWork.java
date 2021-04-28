import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork {

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By LOCATOR_BY_XPATH = By.xpath("//*[contains(@text, list-article__headline)]");
    private final By LOGO_BY_XPATH3 = By.xpath(".//*[contains(@class, 'list-article__meta-info flex flex--justify-content-start flex--align-items-center')]");
   // private final By LOCATOR_BY_XPATHH = By.xpath(".//img[@src = '/v5/img/icons/comment-v2.svg')]");
   // private final By LOCATOR_BY_LOGO = By.xpath(".//button[@mode = 'flex header-logo']");

    @Test
    public void HomeWork() {
        // WebDriver = browser window;
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver browserWindow = new ChromeDriver();

        browserWindow.manage().window().maximize();
        browserWindow.get("http://tvnet.lv");

        //  Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        WebDriverWait mailWait = new WebDriverWait(browserWindow, 60, 2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));


        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
        browserWindow.findElement(LOCATOR_BY_XPATH).click();
       // browserWindow.findElement(LOCATOR_BY_XPATHH).click();
       // browserWindow.findElement(LOCATOR_BY_LOGO).click();
        browserWindow.findElement(LOGO_BY_XPATH3).click();
        //browserWindow.findElement(LOCATOR_BY_XPATHH).click();
    }
}

