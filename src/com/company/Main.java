package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        BMI window = new BMI();
        window.setVisible(true);
    }

    private JTextField heightField = new JTextField(8);
    private JTextField weightField = new JTextField(8);
    private JTextField resultField = new JTextField(8);


    BMI miBMI = new BMI();
}