package n2AbstractFactory.factories;

import n2AbstractFactory.implementations.SpainPhone;
import n2AbstractFactory.implementations.USAAddress;
import n2AbstractFactory.implementations.USAPhone;
import n2AbstractFactory.interfaces.IAddress;
import n2AbstractFactory.interfaces.IAddressBookFactory;
import n2AbstractFactory.interfaces.IPhone;

public class USAAddressBookFactory implements IAddressBookFactory {

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

        return new USAAddress(contact, number, street, city, country, zip);
    }

    @Override
    public IPhone createPhone() {
        // The logic to create a new number
        String contact = "Contact D";
        String phone = "555-444-321";

        return new USAPhone(contact, phone);
    }
}
