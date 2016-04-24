package ua.artcode.taxi.model;

/**
 * Created by serhii on 23.04.16.
 */
public class User {

    private int id;
    private String phone;
    private String pass;
    // optinal
    private String name;

    public User() {
    }

    public User(int id, String phone, String pass) {
        this.id = id;
        this.phone = phone;
        this.pass = pass;
    }

    public User(int id, String phone, String pass, String name) {
        this.id = id;
        this.phone = phone;
        this.pass = pass;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
