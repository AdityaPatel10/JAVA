import java.io.*;

class InputStream {
    public static void main(String[] args) {
        String s = "Hello I Am Aditya";
        byte[] b = s.getBytes();
        ByteArrayInputStream f = new ByteArrayInputStream(b);
        ByteArrayInputStream f2 = new ByteArrayInputStream(b, 6, 11);
        int a;
        while ((a = f.read()) != -1) {
            System.out.print((char) a);
        }
        System.out.println();
        while ((a = f2.read()) != -1) {
            System.out.print((char) a);
        }
    }
}