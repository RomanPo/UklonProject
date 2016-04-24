package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DriverRegistration extends JFrame {

    private final UserService userService;

    private JLabel mainLabel;
    private JLabel nullLabel;
    private JLabel phoneLabel;
    private JTextField phoneText;
    private JLabel nameLabel;
    private JTextField nameText;
    private JLabel passLabel;
    private JTextField passText;
    private JLabel carTypeLabel;
    private JTextField carTypeText;
    private JLabel carModelLabel;
    private JTextField carModelText;
    private JLabel carNumberLabel;
    private JTextField carNumberText;
    private JPanel buttonPanel1;
    private JPanel buttonPanel2;

    private JButton okButton;
    private JButton returnButton;

    public DriverRegistration(UserService userService){

        this.userService = userService;

        setTitle("Main");
        setSize(400, 600);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(8, 1);
        setLayout(gridLayout);

        mainLabel = new JLabel("DRIVER REGISTRATION");
        nullLabel = new JLabel("");

        phoneLabel = new JLabel("PHONE:");
        phoneText = new JTextField();

        nameLabel = new JLabel("NAME:");
        nameText = new JTextField();

        passLabel = new JLabel("PASSWORD:");
        passText = new JTextField();

        carTypeLabel = new JLabel("CAR TYPE:");
        carTypeText = new JTextField();

        carModelLabel = new JLabel("CAR MODEL:");
        carModelText = new JTextField();

        carNumberLabel = new JLabel("CAR NUMBER:");
        carNumberText = new JTextField();

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        okButton = new JButton("OK");

        buttonPanel2 = new JPanel(new GridLayout(1,1));
        returnButton = new JButton("RETURN");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainTaxi(userService);
            }
        });

        buttonPanel1.add(okButton);
        buttonPanel2.add(returnButton);

        getContentPane().add(mainLabel);
        getContentPane().add(nullLabel);
        getContentPane().add(phoneLabel);
        getContentPane().add(phoneText);
        getContentPane().add(nameLabel);
        getContentPane().add(nameText);
        getContentPane().add(passLabel);
        getContentPane().add(passText);
        getContentPane().add(carTypeLabel);
        getContentPane().add(carTypeText);
        getContentPane().add(carModelLabel);
        getContentPane().add(carModelText);
        getContentPane().add(carNumberLabel);
        getContentPane().add(carNumberText);
        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);

    }




}
