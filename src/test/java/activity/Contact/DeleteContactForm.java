package activity.Contact;

import AppiumControl.Button;
import org.openqa.selenium.By;

public class DeleteContactForm {

    public Button moreOptionButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc='More options']"));
    public Button deleteOption = new Button(By.xpath("//android.widget.TextView[@text='Delete']"));
    public Button deleteButton = new Button(By.id("android:id/button1"));
    public Button cancelButton = new Button(By.id("android:id/button1"));
    //more options
    public Button linkOption = new Button(By.xpath("//android.widget.TextView[@text='Link']"));
    public Button shareOption = new Button(By.xpath("//android.widget.TextView[@text='Share']"));
    public Button createShortcutOption = new Button(By.xpath("//android.widget.TextView[@text='Create shortcut']"));
    public Button setRingToneOption = new Button(By.xpath("//android.widget.TextView[@text='Set ringtone']"));
    




}
