package Lambda;

import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {
        // Window : Object JFrame
        JFrame frame=new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        //Create button and add frame
        JButton button=new JButton("Click me!!");
        button.addActionListener(e -> {
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null,"fir se click kro");
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
