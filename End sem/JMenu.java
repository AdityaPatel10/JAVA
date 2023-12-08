import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenu extends JFrame {
    static JFrame f;
    static JMenuBar mb;
    static JMenu m;
    static JMenuItem m1, m2, s1, s2;

    public static void main(String[] args) {
        f = new JFrame("Frame");
        mb = new JMenuBar();
        m = new JMenu("Menu");
        // n = new JMenu("SubMenu");
        m1 = new JMenuItem("1");
        m2 = new JMenuItem("2");
        // s1 = new JMenuItem("11");
        // s2 = new JMenuItem("12");
        m.add(m1);
        m.add(m2);
        // n.add(s1);
        // n.add(s2);
        mb.add(m);
        // mb.add(n);
        f.setJMenuBar(mb);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
