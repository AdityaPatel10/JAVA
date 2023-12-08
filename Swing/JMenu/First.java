import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class First extends JFrame {
    static JFrame F;
    static JMenuBar MB;
    static JMenu M;
    static JMenuItem m1, m2, m3;

    public static void main(String[] args) {
        F = new JFrame("Frame");
        MB = new JMenuBar();
        M = new JMenu("Menu");
        m1 = new JMenuItem("First");
        m2 = new JMenuItem("Second");
        m3 = new JMenuItem("Third");
        M.add(m1);
        M.add(m2);
        M.add(m3);
        MB.add(M);
        F.setJMenuBar(MB);
        F.setSize(500, 500);
        F.setVisible(true);
    }
}