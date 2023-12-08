import java.awt.event.*;
import javax.swing.*;
public class First1 {
    public static void main(String[] args) {
        JFrame F = new JFrame("Button Example");
        JTextField TF = new JTextField();
        TF.setBounds(50, 50, 150, 20);
        JButton B = new JButton("Click Here");
        B.setBounds(50, 100, 95, 30);
        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TF.setText("Welcome");
            }
        });
        F.add(B);
        F.add(TF);
        F.setLayout(null);
        F.setVisible(true);
    }
}
