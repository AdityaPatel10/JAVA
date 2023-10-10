import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1 = new FileOutputStream("Test1.txt");
        f1.write(65); // For Number

        String s = "\nHello World!";
        byte[] b = s.getBytes();
        f1.write(b);
        f1.close();
        System.out.println("Success...");
    }
}
