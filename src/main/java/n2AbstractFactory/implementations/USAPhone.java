package n2AbstractFactory.implementations;

import n2AbstractFactory.interfaces.IPhone;


public class USAPhone implements IPhone {
    private static final String PREFIX = "+1";
    private String phone;
    private String contact;


    public USAPhone(String contact, String phone) {
        this.contact = contact;
        this.phone = phone;
    }

    // This method returns the phone number in US format.
    @Override
    public String getPhone() {
        return "USAPhone{'" + "contact': '" + this.contact + "', "
                + "'phone': '" + USAPhone.PREFIX + " " + this.phone + "'}";
    }

}
