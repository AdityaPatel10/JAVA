
//Association Method

import javax.swing.*;

public class Swing1 {
    Swing1(){
        JFrame f = new JFrame("Frame");
        JButton b = new JButton("Button");
        b.setBounds(130, 100, 100, 40);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] Args){
        new Swing1();
    }
}
