package wysiwyg;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class wysiwygTests extends BaseTest {

    @Test
    public void testEditorPage(){
        var editorPage = homePage.clickWYSIWYG();
        editorPage.clearText();

        String text1 = "hello";
        String text2= "world";

        editorPage.setTextArea(text1);
        editorPage.clickIndentButton();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getEditorText(), text1+text2, "Text from editor is incorrect");

    }
}
