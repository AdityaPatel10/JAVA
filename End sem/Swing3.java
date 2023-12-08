
//ActionListener
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Swing3 extends JFrame implements ActionListener {
    JTextField tf;
    Swing3() {
        tf = new JTextField();
        tf.setBounds(60, 50, 170, 20);
        JButton b = new JButton("Button");
        b.setBounds(250, 250, 100, 80);
        JCheckBox c = new JCheckBox("Divyanshi", false);
        JLabel l = new JLabel("Label");
        JPanel p = new JPanel();
        JList l = new JList();
        l.add("First"); l.add("Second"); l.add("Third"); l.add("Fourth");
        p.setLayout(new FlowLayout());
        l.setSize(200, 200);
        c.setBounds(150, 150, 50, 50);
        p.add(b);p.add(tf);p.add(c);p.add(l);add(p);add(l);
        b.addActionListener(this);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new Swing3();
    }
}
