import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("Test1.txt");
        // FileInputStream f2 = new FileInputStream("Test1.txt");

        int i = f1.read();
        System.out.print((char) i); // Print One Character

        while ((i = f1.read()) != -1) {
            System.out.print((char) i);  //Print all the string
        }
    }
}
