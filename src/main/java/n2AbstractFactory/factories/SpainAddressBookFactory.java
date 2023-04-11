package n2AbstractFactory.factories;

import n2AbstractFactory.implementations.SpainAddress;
import n2AbstractFactory.implementations.SpainPhone;
import n2AbstractFactory.interfaces.IAddress;
import n2AbstractFactory.interfaces.IAddressBookFactory;
import n2AbstractFactory.interfaces.IPhone;


public class SpainAddressBookFactory implements IAddressBookFactory {
    @Override
    public IAddress createAddress() {
        // The logic to create a new address
        String contact = "Contact A";
        String street = "Street A";
        String number = "23";
        String zip = "8000";
        String city = "City A";
        String province = "Province A";
        String country = "Country A";

        return new SpainAddress(contact, street, number, zip, city, province, country);
    }

    @Override
    public IPhone createPhone() {
        // The logic to create a new number
        String contact = "Contact B";
        String phone = "654321123";

        return new SpainPhone(contact, phone);
    }
}
