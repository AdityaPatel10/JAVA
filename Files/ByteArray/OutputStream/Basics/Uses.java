package Files.ByteArray.Basics;
import java.io.*;

class Uses {
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream obj = new ByteArrayOutputStream();
        byte[] buffer = {65, 68, 73, 84, 89, 65};
        for (byte b : buffer) {
            obj.write(b);
        }
        System.out.println("Size= " + obj.size());  //size 
        String st= obj.toString();   //converting to string
        System.out.println("toString= "+st);
        String s= obj.toString("UTF-8"); //UTF= Unicode Transformation Format
        System.out.println("toString(Name)= "+s);
        obj.close();
    }
}