import java.io.*;
public class Basic {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        try{
            System.out.println("Division of "+a+" & "+b+" is= "+a/b);
        }
        catch(ArithmeticException e){
            // e.printStackTrace();
            System.out.println("Exception occurred");
        }
        finally{
            System.out.println("Finally Executed.");
        }
    }
}
