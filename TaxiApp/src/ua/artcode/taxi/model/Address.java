package ua.artcode.taxi.model;

/**
 * Created by serhii on 23.04.16.
 */
public class Address {

    private String city;
    private String street;
    private String houseNum;

    // google api
    private double lat;
    private double lon;

    public Address(String city, String street, String houseNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public Address(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNum='" + houseNum + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
