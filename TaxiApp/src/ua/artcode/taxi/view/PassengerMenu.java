package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;

public class PassengerMenu extends JFrame {

    private final UserService userService;

    private JLabel mainLabel;
    private JLabel nullLabel;
    private JLabel fromLabel;
    private JTextField fromText;
    private JLabel toLabel;
    private JTextField toText;
    private JLabel distanceLabel;
    private JTextField distanceText;
    private JLabel priceLabel;
    private JTextField priceText;
    private JPanel buttonPanel1;
    private JPanel buttonPanel2;
    private JPanel buttonPanel3;
    private JPanel buttonPanel4;

    private JButton usePreviousButton;
    private JButton findLocationButton;
    private JButton searchDriverButton;
    private JButton cancelButton;

    public PassengerMenu(UserService userService){

        this.userService = userService;

        setTitle("Main");
        setSize(400, 600);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(7, 1);
        setLayout(gridLayout);

        mainLabel = new JLabel("PASSENGER MENU");
        nullLabel = new JLabel("");

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        usePreviousButton = new JButton("USE PREVIOUS");
        buttonPanel1.add(usePreviousButton);

        buttonPanel2 = new JPanel(new GridLayout(1,1));
        findLocationButton = new JButton("FIND MY LOCATION");
        buttonPanel2.add(findLocationButton);

        fromLabel = new JLabel("FROM:");
        fromText = new JTextField();

        toLabel = new JLabel("TO:");
        toText = new JTextField();

        distanceLabel = new JLabel("DISTANCE:");
        distanceText = new JTextField();

        priceLabel = new JLabel("PRICE:");
        priceText = new JTextField();

        buttonPanel3 = new JPanel(new GridLayout(1,1));
        searchDriverButton = new JButton("SEARCH DRIVER");
        buttonPanel3.add(searchDriverButton);

        buttonPanel4 = new JPanel(new GridLayout(1,1));
        cancelButton = new JButton("CANCEL");
        buttonPanel4.add(cancelButton);

        getContentPane().add(mainLabel);
        getContentPane().add(nullLabel);
        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);
        getContentPane().add(fromLabel);
        getContentPane().add(fromText);
        getContentPane().add(toLabel);
        getContentPane().add(toText);
        getContentPane().add(distanceLabel);
        getContentPane().add(distanceText);
        getContentPane().add(priceLabel);
        getContentPane().add(priceText);
        getContentPane().add(buttonPanel3);
        getContentPane().add(buttonPanel4);
    }
}
