package ua.artcode.taxi.model;

/**
 * Created by serhii on 23.04.16.
 */
public enum OrderStatus {

    // new OrderStatus("NEW")
    NEW(), IN_PROGRESS(), CANCELLED(), DONE();
    //0   1             2          3
    // "NEW" , "IN_PROGRESS", ...

    OrderStatus() {
    }

    // see Enum method
}
