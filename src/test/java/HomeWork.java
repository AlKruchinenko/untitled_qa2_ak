import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.font.TrueTypeFont;

import javax.print.DocFlavor;
import javax.swing.text.Element;
import javax.xml.xpath.XPathConstants;
import java.io.IOException;
import java.net.URL;

public class HomeWork {

    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By LOCATOR_BY_HEADNAME = By.xpath("//span[@itemprop = 'headline name']");
    //private final By LOCATOR_BY_XPATH = By.xpath("//*[contains(@text, list-article__headline)]");
    // private final By LOGO_BY_XPATH3 = By.xpath(".//*[contains(@class, 'list-article__meta-info flex flex--justify-content-start flex--align-items-center')]");
    private final By LOCATOR_BY_XPATHH = By.xpath(".//img[@src = '/v5/img/icons/comment-v2.svg']");
    private final By LOCATOR_BY_LOGO = By.xpath("//*[contains(@class, 'flex header-logo flex')]");
    private final By LOCATOR_BY_LENG = By.xpath(".//*[contains(@href,  'https://rus.tvnet.lv/')]");

    @Test
    public void HomeWork() throws IOException {

        // WebDriver = browser window;
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

        WebDriver browserWindow = new ChromeDriver();
        //public static Document getPage();

        browserWindow.manage().window().maximize();
        browserWindow.get("http://tvnet.lv");
        // Document page = Jsoup.parse(new URL(browserWindow));


        //  Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        WebDriverWait mailWait = new WebDriverWait(browserWindow, 60, 2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));


        browserWindow.findElement(ACCEPT_COOKIES_BTN).click();
        browserWindow.findElement(LOCATOR_BY_HEADNAME).click();
        browserWindow.findElement(LOCATOR_BY_XPATHH).click();
        browserWindow.findElement(LOCATOR_BY_LOGO).click();
        browserWindow.findElement(LOCATOR_BY_LENG).click();
        //browserWindow.findElement(LOCATOR_BY_XPATHH).click();

        // String meta =browserWindow.getTitle();


        // meta = meta.replaceAll(String.valueOf((char) 1600), " ");
        //System.out.println("Page title is:" + meta );


        //System.out.println("");
    }


}