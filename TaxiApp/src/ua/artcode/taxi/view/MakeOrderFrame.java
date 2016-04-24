package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeOrderFrame extends JFrame {

    private UserService userService;

    private JLabel phoneLabel;
    private JTextField phoneText;
    private JLabel fromLabel;
    private JTextField fromText;
    private JLabel toLabel;
    private JTextField toText;
    private JLabel priceLabel;
    private JTextField priceText;
    private JLabel distanceLabel;
    private JLabel distanceText;
    private JPanel buttonPanel;
    private JButton calculateButton;
    private JButton approveButton;

    public MakeOrderFrame(UserService userService){

        this.userService = userService;

        setTitle("Make Order");
        setSize(600, 600);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void init() {
        GridLayout gridLayout = new GridLayout(6,2);
        setLayout(gridLayout);

        phoneLabel = new JLabel("PHONE");
        phoneText = new JTextField();

        fromLabel = new JLabel("FROM");
        fromText = new JTextField();

        toLabel = new JLabel("TO");
        toText = new JTextField();

        priceLabel = new JLabel("PRICE");
        priceText = new JTextField();
        priceText.setEditable(false);

        distanceLabel = new JLabel("DISTANCE");
        distanceText = new JLabel();


        buttonPanel = new JPanel(new GridLayout(1,2));
        calculateButton = new JButton("CALCULATE");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*JButton source = (JButton) e.getSource();
                source.getParent().getComponents();*/
                JOptionPane.showMessageDialog(getParent(), "Some popup message");
                distanceText.setText(String.valueOf(System.currentTimeMillis()));
            }
        });

        approveButton = new JButton("APPROVE");
        approveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanel.add(calculateButton);
        buttonPanel.add(approveButton);


        getContentPane().add(phoneLabel);
        getContentPane().add(phoneText);
        getContentPane().add(fromLabel);
        getContentPane().add(fromText);
        getContentPane().add(toLabel);
        getContentPane().add(toText);
        getContentPane().add(priceLabel);
        getContentPane().add(priceText);
        getContentPane().add(distanceLabel);
        getContentPane().add(distanceText);

        getContentPane().add(buttonPanel);
        getContentPane().add(new JButton("CANCEL"));
    }

}