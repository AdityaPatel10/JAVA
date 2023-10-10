import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1 = new FileOutputStream("Test1.txt");
        BufferedOutputStream b1 = new BufferedOutputStream(f1);
        String s = "Hello World";
        byte[] b = s.getBytes();
        b1.write(b);
        b1.flush();
        b1.close();
        f1.close();
    }
}
