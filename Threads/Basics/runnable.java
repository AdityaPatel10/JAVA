import java.io.*;
public class runnable implements Runnable {
    public static void main(String[] args) {
        Runnable r1 = new runnable();
        Thread t1 = new Thread(r1, "Name of the thread");
        t1.start();
        System.out.println(t1.getName());
    }
}
