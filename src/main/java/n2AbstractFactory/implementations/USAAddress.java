package n2AbstractFactory.implementations;

import n2AbstractFactory.interfaces.IAddress;


public class USAAddress implements IAddress {
    // USA format address
    private String contact;  // contact name
    private String number;
    private String street;
    private String city;
    private String country;
    private String zip;


    public USAAddress (String contact, String number, String street, String city, String country, String zip) {
        this.contact = contact;
        this.number = number;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }


    @Override
    public String getAddress() {
        final StringBuilder sb = new StringBuilder("USAAddress{");
        sb.append("'Contact': '").append(contact).append("',");
        sb.append("'Address': {");
        sb.append("'number': '").append(number).append("',");
        sb.append("'street': '").append(street).append("',");
        sb.append("'city': '").append(city).append("',");
        sb.append("'country': '").append(country).append("',");
        sb.append("'zip': '").append(zip).append("'");
        sb.append('}');
        sb.append('}');
        return sb.toString();
    }

}
