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
    Car car;
    String name;

    public Driver() {

    }

    public Driver(String phone, Car car, String name) {

        this.phone = phone;
        this.car = car;
        this.name = name;
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
}
