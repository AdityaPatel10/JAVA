import javax.swing.*;
import java.awt.*;
public class First{
    public static void main(String[] args){
        JFrame F = new JFrame("Frame Name");
        JPanel P = new JPanel();
        P.setLayout(new FlowLayout());
        JLabel L = new JLabel("Label");
        JButton B = new JButton();
        B.setText("Click");
        P.add(L);
        P.add(B);
        F.add(P);
        F.setSize(200, 300);
        F.setVisible(true);
    }
}