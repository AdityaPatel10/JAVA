import java.awt.*;
public class Example2{
    Example2(){
        Frame f = new Frame("Employee");
        Button B = new Button("Submit");
        Label L = new Label("Employee ID: ");
        TextField T = new TextField();
        f.setSize(300, 300);
        L.setBounds(30, 70, 80, 30);
        T.setBounds(30, 100, 100, 30);
        B.setBounds(120, 100, 80, 30);
        f.add(B);
        f.add(L);
        f.add(T);
        f.setTitle("Employee INFO...");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        Example2 obj = new Example2();
    }
}