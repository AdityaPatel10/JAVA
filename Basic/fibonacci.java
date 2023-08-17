import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you have to print fibonacci series: ");
        int n=sc.nextInt();
        int a=0, b=1, c;
        System.out.println("Fibonacci series is:-");
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}