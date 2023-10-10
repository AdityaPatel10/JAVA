import java.util.*;
import java.io.*;
public class Piped2 {
    public static void main(String[] args) throws IOException {
        PipedReader reader = new PipedReader();
        PipedWriter writer = new PipedWriter();
        reader.connect(writer);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers of Characters= ");
        int n = sc.nextInt();
        char carr[] = new char[n];
        char c='A';
        for(int i=0; i<n; i++){
            carr[i] = c;
            c++;
        }
        //Use read(char carr[], int offset, int maxlength)
        writer.write(carr, 0, n);
        reader.read(carr, 0, n);
        for(int i=0; i<n; i++){
            System.out.print(carr[i]);
        }
    }
}
