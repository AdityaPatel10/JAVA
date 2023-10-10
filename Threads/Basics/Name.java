import java.io.*;
public class Name {
    public static void main(String[] args) {
        Thread t1= new Thread("Name of the thread");
        t1.start();
        System.out.println(t1.getName());
    }
}
