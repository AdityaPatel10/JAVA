import java.util.*;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        OddThread OT = new OddThread();
        EvenThread ET = new EvenThread();
        ET.start();
        try{
            ET.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception found!!");
        }
        OT.start();
        try{
            OT.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception found!!");
        }
    }
}