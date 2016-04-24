package ua.artcode.taxi.model;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 23.04.16
 * Time: 17:02

 * To change this template use File | Settings | File Templates.
 */
public class Driver {

    String phone;
    String name;
    String pass;
    Car car;

    public Driver() {

    }

    public Driver(String phone, String name, String pass, Car car) {

        this.phone = phone;
        this.pass = pass;
        this.name = name;
        this.car = car;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
