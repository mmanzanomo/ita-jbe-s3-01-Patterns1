package n2AbstractFactory;

import n2AbstractFactory.factories.SpainAddressBookFactory;
import n2AbstractFactory.factories.USAAddressBookFactory;
import n2AbstractFactory.interfaces.IAddressBookFactory;
import n2AbstractFactory.interfaces.IAddress;
import n2AbstractFactory.interfaces.IPhone;

public class Main {
    public static void main(String[] args) {

        // Using the US factory to create an address and phone number with its format.
        IAddressBookFactory factoryUSA = new USAAddressBookFactory();
        IAddress addressUSA = factoryUSA.createAddress();
        IPhone phoneUSA = factoryUSA.createPhone();

        // Using the ES factory to create an address and phone number with its format.
        IAddressBookFactory factoryES = new SpainAddressBookFactory();
        IAddress addressES = factoryES.createAddress();
        IPhone phoneES = factoryES.createPhone();

        System.out.println(addressUSA.getAddress());
        System.out.println(phoneUSA.getPhone());
        System.out.println();
        System.out.println(addressES.getAddress());
        System.out.println(phoneES.getPhone());
    }
}
