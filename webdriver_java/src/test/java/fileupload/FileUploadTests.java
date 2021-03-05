package fileupload;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var fileUploadpage = homePage.clickFileUpload();
        fileUploadpage.uploadFile("C:/Users/esra.tarakci/IdeaProjects/webdriver_java/resources/chromedriver.exe");
        assertEquals(fileUploadpage.getUploadedFiles(), "chromedriver.exe" , "Upload is not succesful");
    }
}
