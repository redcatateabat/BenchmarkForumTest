package pages;

import org.openqa.selenium.WebElement;

public class ForumTopicsPage extends BasePage{

    private String replyCountNumber1 = "(//dl[@class='pairs pairs--justified']//dd)[1]";
    private String replyCountNumberList = "";



    public WebElement getReplyCountNumber() {return findElement(replyCountNumber1);}
    public WebElement getReplyCountNumberList() {return findElement(replyCountNumberList);}


}
