
//Using Anonymous Class

import java.awt.*;
import java.awt.event.*;
public class CEvent extends Frame{
    TextField tf;
    CEvent(){
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Button");
        b.setBounds(50, 120, 80, 30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome");
            }
        });
        add(b);
        add(tf);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new CEvent();
    }
}