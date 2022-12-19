package cleanTest;

import activity.Contact.CreateContactForm;
import activity.Contact.DeleteContactForm;
import activity.Contact.EditContactForm;
import activity.Contact.MainScreen;
import io.qameta.allure.Description;
import model.Contact;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import static model.ContactBuilder.createContactD;

public class ContactTest {
    MainScreen mainScreen = new MainScreen();
    CreateContactForm createContactForm = new CreateContactForm();
    EditContactForm editContactForm = new EditContactForm();
    DeleteContactForm deleteContactForm = new DeleteContactForm();

    @Test
    @DisplayName("Verify Create Note")
    @Description("Create Note")
    public void createContact(){

        String nameCreate = "John";
        String lastNameCreate = "Smith";
        String phoneCreate = "7525363";
        mainScreen.addContactButton.click();
        //Create Contact
        Contact contact = createContactD()
                .name(nameCreate)
                .lastName(lastNameCreate)
                .phone(phoneCreate)
                .build();

        createContactForm.firstNameText.setText(contact.getName());
        createContactForm.lastNameText.setText(contact.getLastName());
        createContactForm.phoneText.setText(contact.getPhone());
        createContactForm.saveContactButton.click();
        //Update Contact
        String nameUpdate = "John James";
        String lastNameUpdate = "Smith Charles";
        String phoneUpdate = "7525363";

        Contact contactUpdate = createContactD()
                .name(nameUpdate)
                .lastName(lastNameUpdate)
                .phone(phoneUpdate)
                .build();

        editContactForm.editContactButton.click();
        editContactForm.firstNameText.setText(contactUpdate.getName());
        editContactForm.lastNameText.setText(contactUpdate.getLastName());
        editContactForm.editSaveContactButton.click();

       Assertions.assertTrue(mainScreen.isNoteDisplayed(nameUpdate),
                "ERROR, the note was not modify");

        //Delete Contact
        deleteContactForm.moreOptionButton.click();
        deleteContactForm.deleteOption.click();
        deleteContactForm.deleteButton.click();
    }


    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }
}
