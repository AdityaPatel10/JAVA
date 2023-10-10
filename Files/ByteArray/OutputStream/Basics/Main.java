package Files.ByteArray.Basics;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Hello My Name Is Aditya Patel";
        byte[] b = s.getBytes();
        f.write(b);
        System.out.println("Buffer as a String= " + f.toString());
        System.out.print("Into Array= ");
        for (byte by : f.toByteArray()) {
            System.out.print((char) by);
        }
        System.out.println("\nTo Output Stream:- ");
        FileOutputStream f1 = new FileOutputStream("file.txt");
        f.writeTo(f1);
        f1.close();
        System.out.println("Reset:- ");
        f.reset();
        for(int i=0; i<3; i++){
            f.write('A');
        }
        System.out.println(f.toString());
        OutputStream f2= new FileOutputStream("file.txt");
        f.writeTo(f2);
        f2.close();
    }
}