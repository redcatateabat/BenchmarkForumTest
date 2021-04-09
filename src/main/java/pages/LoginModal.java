package pages;

import org.openqa.selenium.WebElement;

public class LoginModal extends BasePage {

    private String loginButton = "(//span[@class='p-navgroup-linkText'])[1]";
    private String loginModalTitle = "//div[@class=\"overlay-title\"]";
    private String usernameField = "//input[@name=\"login\"]";
    private String passwordField = "//input[@name=\"password\"]";
    private String submitButton = "//button[@type='submit']";
    private String facebookButton = "//span[text()[normalize-space()='Facebook']]";
    private String googleButton = "//span[text()[normalize-space()='Google']]";
    private String githubButton = "//span[text()[normalize-space()='GitHub']]";
    private String userProfileName = "(//span[@class='p-navgroup-linkText'])[1]";


    public WebElement getLoginButton() {return  findElement(loginButton);}
    public WebElement getLoginModalTitle() {return  findElement(loginModalTitle);}
    public WebElement getUsernameField() {return findElement(usernameField);}
    public WebElement getPasswordField() {return findElement(passwordField);}
    public WebElement getSubmitButton() {return findElement(submitButton);}
    public WebElement getFacebookButton() {return  findElement(facebookButton);}
    public WebElement getGoogleButton() {return  findElement(googleButton);}
    public WebElement getGithubButton() {return  findElement(githubButton);}
    public WebElement getUserProfileName() {return  findElement(userProfileName);}


}
