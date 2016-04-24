package ua.artcode.taxi.view;

import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.User;
import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassengerRegistration extends JFrame {

    private final UserService userService;

    private JLabel mainLabel;
    private JLabel nullLabel;
    private JLabel phoneLabel;
    private JTextField phoneText;
    private JLabel nameLabel;
    private JTextField nameText;
    private JLabel passLabel;
    private JTextField passText;
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

        passLabel = new JLabel("PASSWORD:");
        passText = new JTextField();

        homeAddressLabel = new JLabel("HOME ADDRESS:");
        homeAddressText = new JTextField();

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    User user = new User(phoneText.getText(), nameText.getText(),
                                        passText.getText(), homeAddressText.getText());
                    userService.register(user);
                    System.out.println("User done");
                } catch (RegisterException e1) {
                    JOptionPane.showMessageDialog(getParent(), "Login or password is wrong!");
                    e1.printStackTrace();
                }
                new PassengerMenu(userService);
                dispose();
            }
        });


        buttonPanel2 = new JPanel(new GridLayout(1,1));
        returnButton = new JButton("RETURN");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainTaxi(userService);
                dispose();
            }
        });

        getContentPane().add(phoneLabel);

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

        getContentPane().add(homeAddressLabel);
        getContentPane().add(homeAddressText);

        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);

    }
}
