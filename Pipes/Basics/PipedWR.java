import java.io.*;

public class PipedWR {
    public static void main(String[] args) throws IOException{
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();
        //Use of connect method
        writer.connect(reader);
        //Use of write method
        writer.write('A');
        writer.write('D');
        writer.write('I');
        //Use of read method
        System.out.println("Use of read 1= "+(char)(reader.read()));
        System.out.println("Use of read 2= "+(char)(reader.read()));
        System.out.println("Use of read 2= "+(char)(reader.read()));
        //Use of ready method
        System.out.println("Use of ready= "+(reader.ready()));
    }
}
