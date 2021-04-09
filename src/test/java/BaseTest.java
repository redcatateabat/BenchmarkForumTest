import assets.Fixtures;
import browser.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Bmf;

public class BaseTest extends Fixtures {

    Bmf bmf = new Bmf();
    WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 15);

    @BeforeClass
    public static void openBrowser() {
        Browser.getBrowser().get(homepageUrl);
        Browser.getBrowser().manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser(){
        Browser.getBrowser().quit();
    }


    public void openLoginModal() {
        bmf.getLoginModal().getLoginButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[@class=\"is-modalOpen is-modalOverlayOpen\"]")));
        Browser.getBrowser().switchTo().activeElement();
        wait.until(ExpectedConditions.textToBePresentInElement(bmf.getLoginModal().getLoginModalTitle(), "Prijava"));
    }
}
