package n2AbstractFactory.implementations;

import n2AbstractFactory.interfaces.IPhone;

import java.util.Scanner;

public class SpainPhone implements IPhone {
    private String contact;
    private static final String PREFIX = "+34";
    private String phone;


    public SpainPhone(String contact, String phone) {
        this.contact = contact;
        this.phone = phone;
    }

    // This method returns the phone number with spanish format.
    @Override
    public String getPhone() {
        return "SpainPhone{'" + "contact': '" + this.contact + "', "
                + "'phone': '" + SpainPhone.PREFIX + " " + this.phone + "'}";
    }

}
