package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;

public class PassengerRegistration extends JFrame {

    private final UserService userService;

    private JLabel mainLabel;
    private JLabel nullLabel;
    private JLabel phoneLabel;
    private JTextField phoneText;
    private JLabel nameLabel;
    private JTextField nameText;
    private JLabel birthdayLabel;
    private JTextField birthdayText;
    private JLabel homeAddressLabel;
    private JTextField homeAddressText;
    private JPanel buttonPanel1;
    private JPanel buttonPanel2;

    private JButton okButton;
    private JButton returnButton;

    public PassengerRegistration(UserService userService){

        this.userService = userService;

        setTitle("Main");
        setSize(400, 600);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(6, 1);
        setLayout(gridLayout);

        mainLabel = new JLabel("PASSENGER REGISTRATION");
        nullLabel = new JLabel("");

        phoneLabel = new JLabel("PHONE:");
        phoneText = new JTextField();

        nameLabel = new JLabel("NAME:");
        nameText = new JTextField();

        birthdayLabel = new JLabel("BIRTHDAY:");
        birthdayText = new JTextField();

        homeAddressLabel = new JLabel("HOME ADDRESS:");
        homeAddressText = new JTextField();

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        okButton = new JButton("OK");

        buttonPanel2 = new JPanel(new GridLayout(1,1));
        returnButton = new JButton("RETURN");

        buttonPanel1.add(okButton);
        buttonPanel2.add(returnButton);

        getContentPane().add(mainLabel);
        getContentPane().add(nullLabel);
        getContentPane().add(phoneLabel);
        getContentPane().add(phoneText);
        getContentPane().add(nameLabel);
        getContentPane().add(nameText);
        getContentPane().add(birthdayLabel);
        getContentPane().add(birthdayText);
        getContentPane().add(homeAddressLabel);
        getContentPane().add(homeAddressText);
        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);

    }




}
