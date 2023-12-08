import java.io.*;

public class PipedRandW {
    public static void main(String[] args) {
        try {
            PipedReader read = new PipedReader();
            PipedWriter write = new PipedWriter(read);
            Thread Reader = new Thread(new Runnable() {
                public void run() {
                    try {
                        int data = read.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = read.read();
                        }
                    } catch (Exception e) {
                    }
                }
            });
            Thread Writer = new Thread(new Runnable() {
                public void run() {
                    try {
                        write.write("I love you".toCharArray());
                    } catch (Exception e) {
                    }
                } 
            });
            Reader.start();
            Writer.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
