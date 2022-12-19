package activity.Contact;

import AppiumControl.Button;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateContactForm {
    public TextBox firstNameText = new TextBox(By.xpath("//android.widget.EditText[@text='First name']"));
    public TextBox lastNameText = new TextBox(By.xpath("//android.widget.EditText[@text='Last name']"));
    public TextBox phoneText = new TextBox(By.xpath("//android.widget.EditText[@text='Phone']"));
    public Button saveContactButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));

}
