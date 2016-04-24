package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderInfo extends JFrame {

    private final UserService userService;

    private JLabel mainLabel;
    private JLabel nullLabel;
    private JLabel driverLabel;
    private JTextField driverText;
    private JLabel typeCarLabel;
    private JTextField typeCarText;
    private JLabel modelCarLabel;
    private JTextField modelCarText;
    private JLabel numberCarLabel;
    private JTextField numberCarText;
    private JLabel phoneDriverLabel;
    private JTextField phoneDriverText;
    private JPanel buttonPanel1;
    private JPanel buttonPanel2;

    private JLabel nullLabel1;
    private JLabel nullLabel2;
    private JLabel nullLabel3;
    private JLabel nullLabel4;
    private JLabel nullLabel5;

    private JButton okButton;
    private JButton phoneDriverButton;

    public OrderInfo(UserService userService){

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

        mainLabel = new JLabel("ORDER INFO");
        nullLabel1 = new JLabel("");

        driverLabel = new JLabel("DRIVER:");
        nullLabel2 = new JLabel("");

        typeCarLabel = new JLabel("TYPE CAR:");
        nullLabel3 = new JLabel("");

        modelCarLabel = new JLabel("MODEL CAR:");
        nullLabel4 = new JLabel("");

        numberCarLabel = new JLabel("NUMBER CAR:");
        nullLabel5 = new JLabel("");

        buttonPanel1 = new JPanel(new GridLayout(1,1));
        phoneDriverButton = new JButton("MAKE CALL");
        phoneDriverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getParent(), "Now you call driver");
                dispose();
            }
        });

        buttonPanel2 = new JPanel(new GridLayout(1,1));
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanel1.add(phoneDriverButton);
        buttonPanel2.add(okButton);

        getContentPane().add(mainLabel);
        getContentPane().add(nullLabel1);

        getContentPane().add(driverLabel);
        getContentPane().add(nullLabel2);

        getContentPane().add(typeCarLabel);
        getContentPane().add(nullLabel3);

        getContentPane().add(modelCarLabel);
        getContentPane().add(nullLabel4);

        getContentPane().add(numberCarLabel);
        getContentPane().add(nullLabel5);

        getContentPane().add(buttonPanel1);
        getContentPane().add(buttonPanel2);
    }
}


