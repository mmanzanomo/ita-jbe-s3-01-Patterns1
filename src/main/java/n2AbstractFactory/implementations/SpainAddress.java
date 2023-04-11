package n2AbstractFactory.implementations;

import n2AbstractFactory.interfaces.IAddress;

import java.util.Scanner;

public class SpainAddress implements IAddress {
    // Spain format address
    private String contact;  // contact name
    private String street;
    private String number;
    private String zip;
    private String city;
    private String province;
    private String country;


    public SpainAddress(String contact, String street, String number, String zip, String city,
                        String province, String country) {
        this.contact = contact;
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    @Override
    public String getAddress() {
        final StringBuilder sb = new StringBuilder("SpainAddress{");
        sb.append("'Contact': '").append(contact).append("',");
        sb.append("'Address': {");
        sb.append("'street': '").append(street).append("',");
        sb.append("'number': '").append(number).append("',");
        sb.append("'zip': '").append(zip).append("',");
        sb.append("'city': '").append(city).append("',");
        sb.append("'province': '").append(province).append("',");
        sb.append("'country': '").append(country).append("'");
        sb.append('}');
        return sb.toString();
    }

}
