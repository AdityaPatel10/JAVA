
//using Outer Class

import java.awt.*;
import java.awt.event.*;

public class BEvent extends Frame {
    TextField tf;

    BEvent() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Button");
        b.setBounds(100, 120, 80, 30);
        Outer o = new Outer(this);
        b.addActionListener(o);
        add(b);
        add(tf);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BEvent();
    }
}

class Outer implements ActionListener {
    BEvent obj;

    Outer(BEvent obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        obj.tf.setText("Welcome");
    }
}