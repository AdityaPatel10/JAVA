
//Inheritance

import javax.swing.*;
public class Swing2 extends JFrame{
    Swing2(){
        JButton b = new JButton("Button");
        b.setBounds(250, 250, 100, 80);
        add(b);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Swing2();
    }
}
