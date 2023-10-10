import java.io.*;

class FIS {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("file1.txt");
        int i;
        while ((i = f1.read()) != -1) {
            System.out.print((char)i);
        }
    }
}ybgmt