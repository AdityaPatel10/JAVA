import java.io.*;
public class Implements implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Implements obj = new Implements();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
