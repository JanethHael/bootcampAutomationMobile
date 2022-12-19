package activity.Contact;

import AppiumControl.Button;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addContactButton = new Button(By.id("com.android.contacts:id/floating_action_button"));

    public boolean isNoteDisplayed(String title){
        TextBox name = new TextBox(By.xpath("//android.widget.EditText[@text='"+title+"']"));
        return name.isControlDisplayed();
    }
}
