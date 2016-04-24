package ua.artcode.taxi.model;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 23.04.16
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    String number;
    String model;
    String color;

    public Car() {

    }

    public Car(String number, String model, String color) {
        this.number = number;
        this.model = model;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
