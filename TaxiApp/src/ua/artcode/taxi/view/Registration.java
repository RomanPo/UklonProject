package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {

    private final UserService userService;

    private JPanel buttonPanel1;
    private JPanel buttonPanel2;
    private JButton passengerButton;
    private JButton driverButton;

    public Registration(UserService userService){

        this.userService = userService;

        setTitle("Main");
        setSize(400, 200);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(2, 1);
        setLayout(gridLayout);

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        passengerButton = new JButton("I am passenger");
        passengerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PassengerRegistration(userService);
                dispose();
            }
        });

        buttonPanel2 = new JPanel(new GridLayout(1,1));
        driverButton = new JButton("I am driver");
        driverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DriverRegistration(userService);
                dispose();
            }
        });

        buttonPanel1.add(passengerButton);
        buttonPanel2.add(driverButton);

        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);

    }




}
