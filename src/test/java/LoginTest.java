import browser.Browser;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Bmf;

public class LoginTest extends BaseTest {

    Bmf bmf = new Bmf();
    WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 15);

    @Test
    public void userLogsInWithValidCredentials() {

    openLoginModal();

    bmf.getLoginModal().getUsernameField().sendKeys(registeredUsername);
    bmf.getLoginModal().getPasswordField().sendKeys(registeredPassword);
    bmf.getLoginModal().getSubmitButton().click();

    wait.until((ExpectedConditions.textToBePresentInElement(bmf.getLoginModal().getUserProfileName(), registeredUsername)));
        Assert.assertEquals(registeredUsername, bmf.getLoginModal().getUserProfileName().getText());

    }

    @Test
    public void userLogsInWithWrongPassword() {

     openLoginModal();

        bmf.getLoginModal().getUsernameField().sendKeys(registeredUsername);
        bmf.getLoginModal().getPasswordField().sendKeys(unregisteredPassword);
        bmf.getLoginModal().getSubmitButton().click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loginErrorMsg)));
            Assert.assertEquals(loginPageUrl, Browser.getBrowser().getCurrentUrl());
            Assert.assertEquals(loginErrorMsgText, getLoginErrorMsg().getText());

    }


}
