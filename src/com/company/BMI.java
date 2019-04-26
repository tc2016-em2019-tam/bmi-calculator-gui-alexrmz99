package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame{

    private JTextField heightField = new JTextField(4);
    private JTextField weightField = new JTextField(4);
    private JLabel BMI = new JLabel();

    public BMI() {
        JButton bmiButton = new JButton("Compute BMI");
        bmiButton.addActionListener(new BMIListener());
        this.setLayout(new BorderLayout());
        this.setSize(600, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Body Mass Calculator");
        pack();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("- - - - - Calculate your BMI - - - - - \n"));
        panel.add(new JLabel("Weight in kilograms:"));
        panel.add(weightField);
        panel.add(new JLabel("Height in meters:"));
        panel.add(heightField);
        panel.add(bmiButton);
        panel.add(new JLabel("Your BMI is:"));
        panel.add(BMI);

        setContentPane(panel);
        setSize(500,200);
    }

    private class BMIListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double kilograms= Double.parseDouble(weightField.getText());
            double meters = Double.parseDouble(heightField.getText());
            double bmi= (double)computeBMI(kilograms,meters);

            if(bmi<18.5){
                BMI.setText(bmi+""+"\nYour body type is: Underweight");
            }else if(bmi>=18.5&&bmi<25){
                BMI.setText(bmi+""+"\nYour body type is: Normal");
            }else if(bmi>=25&&bmi<30){
                BMI.setText(bmi+""+"\nYour body type is: Overweight");
            }else if(bmi>=30){
                BMI.setText(bmi+""+"\nYour body type is: Obese");
            }
        }
    }

    public static double computeBMI(double weight, double height) {
        return weight / (height * height);
    }

}