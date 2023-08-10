import java.util.Scanner;
class Arith {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a= s.nextInt();        
        System.out.print("Enter the value of b: ");
        b= s.nextInt();
        int c= a+b, d=a*b, e=a-b, f=a/b;
        System.out.println("A+B=" + c);        
        System.out.println("A*B=" + d);
        System.out.println("A-B=" + e);
        System.out.println("A/B=" + f);
    }
}