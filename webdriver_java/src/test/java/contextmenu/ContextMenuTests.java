package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTest {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickAction();
        String alertText = contextMenuPage.getContextMenuAlertText();
        contextMenuPage.alert_acceptCMAlert();
        assertEquals(alertText, "You selected a context menu", "Alert is incorrect");
    }
}
