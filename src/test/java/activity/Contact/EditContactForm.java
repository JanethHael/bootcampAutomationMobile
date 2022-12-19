package activity.Contact;

import AppiumControl.Button;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class EditContactForm {
    public Button editContactButton = new Button(By.id("com.android.contacts:id/menu_edit"));
    public TextBox firstNameText = new TextBox(By.xpath("//android.widget.EditText[@text='John']"));
    public TextBox lastNameText = new TextBox(By.xpath("//android.widget.EditText[@text='Smith']"));
    public TextBox phoneText = new TextBox(By.xpath("//android.widget.EditText[@text='7525363']"));
    public Button editSaveContactButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));




}
