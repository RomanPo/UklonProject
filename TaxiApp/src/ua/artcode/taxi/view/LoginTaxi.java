package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;

public class LoginTaxi extends JFrame {

    private final UserService userService;

    private JLabel mainLabel;
    private JLabel nullLabel;
    private JLabel loginLabel;
    private JTextField loginText;
    private JLabel passLabel;
    private JTextField passText;
    private JPanel buttonPanel;
    private JLabel nullLabel2;

    private JButton loginButton;

    public LoginTaxi(UserService userService){

        this.userService = userService;

        setTitle("Login");
        setSize(400, 400);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(4, 2);
        setLayout(gridLayout);

        mainLabel = new JLabel("LOGIN MAIN");
        nullLabel = new JLabel(" ");

        loginLabel = new JLabel("LOGIN:");
        loginText = new JTextField();

        passLabel = new JLabel("PASSWORD:");
        passText = new JTextField();

        buttonPanel = new JPanel(new GridLayout(1, 1));
        loginButton = new JButton("LOGIN");
        nullLabel2 = new JLabel(" ");

        buttonPanel.add(loginButton);

        getContentPane().add(mainLabel);
        getContentPane().add(nullLabel);

        getContentPane().add(loginLabel);
        getContentPane().add(loginText);

        getContentPane().add(passLabel);
        getContentPane().add(passText);

        getContentPane().add(buttonPanel);
        getContentPane().add(nullLabel2);
    }
}
