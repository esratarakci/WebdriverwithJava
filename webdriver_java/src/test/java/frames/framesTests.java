package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class framesTests extends BaseTest {

    @Test
    public void testFrames() throws InterruptedException {
        var framePage = homePage.clickFrames();
        framePage.clickNestedFrames();
        assertEquals(framePage.getTextfromLeftFrame(), "MIDDLE" , "Content is incorrect");
    }
}
