package Files.ByteArray.Basics;
import java.io.ByteArrayOutputStream;

class tobyte {
    public static void main(String[] args) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = { 'A', 'D', 'I', 'T', 'Y', 'A' };
        output.write(buffer, 0, 6);  //
        System.out.print("Output= ");
        for(byte b : output.toByteArray()){  //we can also write buffer here
            System.out.print("  "+b);
        }
    }
}