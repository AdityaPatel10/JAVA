import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("Test1.txt");
        BufferedInputStream b1 = new BufferedInputStream(f1);
        int i;
        while ((i = b1.read()) != -1) {
            System.out.print((char) i);
        }
        b1.close();
        f1.close();
    }
}
