package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getAlertText(), "You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        assertEquals(text, "I am a JS Confirm" , "Alert text incorrect");
        alertsPage.alert_clickToDismiss();
    }

    @Test
    public void testSetAlertInput(){
        var alertsPage = homePage.clickAlerts();
        alertsPage.triggerPrompt();
        String text = "CU Rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getAlertText(), "You entered: " + text, "Alert text incorrect");
    }
}
