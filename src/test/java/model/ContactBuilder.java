package model;

public class ContactBuilder {
    private Contact contact;
    private static ContactBuilder contactBuilder=null;

    public ContactBuilder() {
        contact = new Contact();
    }
    public ContactBuilder(Contact contact) {
        this.contact = contact;
    }

    public static ContactBuilder createContactD(){
        if (contactBuilder==null)
            contactBuilder=new ContactBuilder();

        return contactBuilder;
    }

    public ContactBuilder name(String name){
        this.contact.setName(name);
        return this;
    }

    public ContactBuilder lastName(String lastName){
        this.contact.setLastName(lastName);
        return this;
    }

    public ContactBuilder phone(String phone){
        this.contact.setPhone(phone);
        return this;
    }

    public ContactBuilder setTypeMobile(String typeMobile){
        this.contact.setTypeMobile(typeMobile);
        return this;
    }

    public Contact build(){
        return contact;
    }
}
