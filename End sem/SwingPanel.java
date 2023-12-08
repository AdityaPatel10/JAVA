import javax.swing.*;
import java.awt.*;
public class SwingPanel{
    public static void main(String[] args){
    JFrame f = new JFrame("Frame");
    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());
    JLabel l = new JLabel("Label");
    JButton b = new JButton("Button");
    p.add(l);
    p.add(b);
    f.add(p);
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}