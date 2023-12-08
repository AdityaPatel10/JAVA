import java.awt.*;

public class Awt1 extends Frame {
    Awt1() {
        Button b = new Button("Button");
        b.setBounds(100, 100, 100, 100);
        add(b);
        setTitle("Frame");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Awt1 a = new Awt1();
    }
}