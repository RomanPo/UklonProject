package ua.artcode.taxi.view;

import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.UserNotFoundException;
import ua.artcode.taxi.model.Address;
import ua.artcode.taxi.service.ClientAccesToken;
import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton makeOrderButton;
    private JButton calculateButton;
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
        makeOrderButton = new JButton("Make Order");
        makeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Address addressFrom1 = new Address();
                Address addressTo1 = new Address();
                String[] addressFrom = fromText.getText().split(",");
                addressFrom1.setHouseNum(addressFrom[0]);
                addressFrom1.setStreet(addressFrom[1]);
                addressFrom1.setCity(addressFrom[2]);
                addressFrom1.setCountry(addressFrom[3]);

                String[] addressTo = toText.getText().split(",");
                addressTo1.setHouseNum(addressTo[0]);
                addressTo1.setStreet(addressTo[1]);
                addressTo1.setCity(addressTo[2]);
                addressTo1.setCountry(addressTo[3]);
                try {
                    userService.makeOrder(ClientAccesToken.accesTokken, addressFrom1, addressTo1);
                    new OrderInfo(userService);
                    dispose();
                    //To change body of implemented methods use File | Settings | File Templates.
                } catch (OrderMakeException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (UserNotFoundException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });

        buttonPanel3.add(makeOrderButton);

        buttonPanel4 = new JPanel(new GridLayout(1,1));
        calculateButton = new JButton("Calculate Price");
        buttonPanel4.add(calculateButton);

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
