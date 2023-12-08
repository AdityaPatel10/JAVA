import java.awt.*;

public class Awt2 {
    Awt2() {
        Frame f = new Frame("Frame");
        Button b = new Button("Button");
        b.setBounds(250, 250, 100, 50);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Awt2 a = new Awt2();
    }
}
