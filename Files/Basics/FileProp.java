import java.io.*;
import java.util.*;
class FileProp {
    public static void main(String[] args) throws IOException {
        File f = new File("file1.txt");   //Creating A file
        if (f.createNewFile()) {
            System.out.println("File created");  
        } else {       
            System.out.println("Already Exists");
        }
        // System.out.println("File Name= " + f.getName());
        // System.out.println("File Name= " + f.exists());
        // System.out.println("File Name= " + f.canWrite());
        // // System.out.println("File Name= " + f.canRead());
        // Scanner sc= new Scanner(System.in);
        // String s= sc.nextLine();
        FileWriter write = new FileWriter("f.txt");
        write.write("My Name Is Aditya Patel Uid Is 11543");   //Writting something in the file
        write.close();
        FileReader r = new FileReader("f.txt");    //Reading from the file
        int i;
        while ((i = r.read()) != -1) {
            System.out.print((char)i);   //Displaying 
        }
        r.close();
    }
}