package ru.mirea.lab3.format_string.mini_Market;
import java.text.NumberFormat;
import java.util.Locale;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class currency_converter extends JFrame {
    private JButton Button1 = new JButton("Converter");
    private JTextField Input = new JTextField(5);
    private JTextField Input1 = new JTextField(5);
    private JTextField Input2 = new JTextField(5);
    private JTextField Input3 = new JTextField(5);
    private JTextField Input4 = new JTextField(5);
    private JLabel Label = new JLabel("Number:");
    private JLabel Label1 = new JLabel("From:");
    private JLabel Label2 = new JLabel("In language code:");
    private JLabel Label3 = new JLabel("In land code:");
    private JLabel Label4 = new JLabel("Course:");
    currency_converter(){
        super("Converter");
        this.setBounds(100, 100, 300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(Label);
        container.add(Input);
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(Label1);
        container.add(Input1);
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(Label2);
        container.add(Input2);
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(Label3);
        container.add(Input3);
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(Label4);
        container.add(Input4);
        ButtonGroup group = new ButtonGroup();
        Button1.addActionListener(new ButtonEventListener());
        container.setLayout(new GridLayout(10, 5));
        container.add(Button1);
    }

    public String Formated(){
        double n = Double.parseDouble(Input.getText());
        Locale locFR = new Locale(Input1.getText());
        Locale.setDefault(new Locale(Input2.getText(), Input3.getText()));
        double n1 = Double.parseDouble(Input4.getText());
        n = n * n1;
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        return numberFormat1.format(n);
    }
    public class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String Message = "";
            Message+="Translation " + Input.getText() + "\nfrom " + Input1.getText() + " in " + Input2.getText() +"\nOutput " + Formated();;
            JOptionPane.showMessageDialog(null, Message, "Output",  JOptionPane.PLAIN_MESSAGE);
        }
    }

}
