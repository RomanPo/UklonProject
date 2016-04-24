package ua.artcode.taxi.view;

import ua.artcode.taxi.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private UserService userService;



    public MainFrame(UserService userService) throws HeadlessException {

        this.userService = userService;

        setTitle("MainFrame");
        setSize(600, 600);
        setVisible(true);
        init();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        JButton makeOrder = new JButton("Make Order");
        makeOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MakeOrderFrame(userService);
            }
        });
        getContentPane().add(makeOrder);


    }
}
