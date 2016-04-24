package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTaxi extends JFrame {

    private final UserService userService;

    private JLabel helloLabel;
    private JLabel nullLabel;
    private JLabel loginLabel;
    private JTextField loginText;
    private JLabel passLabel;
    private JTextField passText;
    private JPanel buttonPanel1;
    private JPanel buttonPanel2;

    private JButton loginButton;
    private JButton registerButton;
    private JButton gonowButton;

    public MainTaxi(UserService userService){

        this.userService = userService;

        setTitle("Main");
        setSize(600, 400);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(4, 1);
        setLayout(gridLayout);

        helloLabel = new JLabel("WELCOME TO UKLON TAXI!");
        nullLabel = new JLabel("");

        loginLabel = new JLabel("LOGIN:");
        loginText = new JTextField();

        passLabel = new JLabel("PASSWORD:");
        passText = new JTextField();

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        loginButton = new JButton("LOGIN");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PassengerMenu(userService);
            }
        });

        buttonPanel2 = new JPanel(new GridLayout(1,1));
        registerButton = new JButton("REGISTER");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Registration(userService);
            }
        });

        gonowButton = new JButton("GO NOW!");
        gonowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PassengerMenu(userService);
            }
        });

        buttonPanel1.add(loginButton);
        buttonPanel2.add(registerButton);
        buttonPanel2.add(gonowButton);

        getContentPane().add(helloLabel);
        getContentPane().add(nullLabel);
        getContentPane().add(loginLabel);
        getContentPane().add(loginText);
        getContentPane().add(passLabel);
        getContentPane().add(passText);
        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);

    }




}
