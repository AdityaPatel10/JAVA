import java.io.*;
public class Extends extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Extends obj = new Extends();
        obj.start();
    }
}
