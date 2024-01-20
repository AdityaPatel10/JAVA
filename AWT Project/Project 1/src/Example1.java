import java.awt.*;

public class Example1 extends Frame {
    Example1() {
        Button b = new Button("Click Me!!");
        b.setBounds(50, 50, 80, 20);
        add(b);
        setSize(300, 300);
        setTitle("Hello This is Aditya Patel");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String agrs[]) {
        Example1 obj = new Example1();
    }
}