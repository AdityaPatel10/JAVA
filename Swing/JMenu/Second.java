import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Second extends JFrame implements ActionListener{
    static JMenuBar MB;
    static JMenu M1, M2;
    static JFrame F;
    static JMenuItem m1, m2, m3, s1, s2;
    static JLabel L;
    public static void main(String[] args){
        Second s = new Second();
        F = new JFrame("Frame");
        L = new JLabel("No Task");
        MB = new JMenuBar();
        M1 = new JMenu("Menu");
        M2 = new JMenu("SubMenu");
        m1 = new JMenuItem("First");
        m2 = new JMenuItem("second");
        m3 = new JMenuItem("third");
        s1 = new JMenuItem("Sub Menu 1");
        s2 = new JMenuItem("Sub Menu 2");
        m1.addActionListener(s);
        m2.addActionListener(s);
        m3.addActionListener(s);
        s1.addActionListener(s);
        s2.addActionListener(s);
        M1.add(m1);
        M1.add(m2);
        M1.add(m1);
        M2.add(s1);
        M2.add(s2);
        M1.add(M2);
        MB.add(M1);
        F.setJMenuBar(MB);
        F.add(L);
        F.setSize(500, 500);
        F.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String S = e.getActionCommand();
        L.setText(S + "Selected");
    }   
}