import java.io.*;
import java.lang.*;

class Filestream {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("File.txt");
            int fin;
            while ((fin = f1.read()) != -1) {
                System.out.print((char) fin);
            }
            f1.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
