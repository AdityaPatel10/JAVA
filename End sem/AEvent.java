
//using inner class

import java.awt.*;
import java.awt.event.*;

public class AEvent extends Frame implements ActionListener {
    TextField tf;

    AEvent() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Button");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        add(tf);
        add(b);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        AEvent obj = new AEvent();
    }
}