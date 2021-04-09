import browser.Browser;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Bmf;

import java.time.LocalDate;

public class numberComparisonTest extends BaseTest {

    Bmf bmf = new Bmf();
    WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 15);

    @Test
    public void compareFirstMsgCountWithDayOfYear() {

        Browser.getBrowser().get(subForumUrl);

        String msgCountNumberAsText = bmf.getForumTopicsPage().getReplyCountNumber().getText();
        int msgCountNumber = Integer.parseInt(msgCountNumberAsText);

        int currentDayOfYear = LocalDate.now().getDayOfYear();

        System.out.println("The number of messages in the first topic is " + msgCountNumber);
        System.out.println("Today is the " + currentDayOfYear +". day of the year.");

        Assert.assertTrue("The number of messages is not bigger than the expected number.", msgCountNumber > currentDayOfYear);

    }


}
