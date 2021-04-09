package assets;

import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Fixtures extends BasePage {

    //------ CREDENTIALS -------

    public String registeredUsername = "KatTest123";
    public String registeredPassword = "GETTest123";
    public String unregisteredPassword = "kkkkkkkk";

    //------- URLs -------

    public static String homepageUrl = "https://forum.benchmark.rs/";
    public String loginPageUrl = "https://forum.benchmark.rs/login/login";
    public String subForumUrl = "https://forum.benchmark.rs/forums/informacije-o-forumu.95/";

    //------ SITE MESSAGES -------

    public String loginErrorMsg = "//div[@class=\"blockMessage blockMessage--error blockMessage--iconic\"]";
    public WebElement getLoginErrorMsg() {return findElement(loginErrorMsg);}
    public String loginErrorMsgText = "Pogrešna lozinka. Molimo pokušajte ponovo.";



}
