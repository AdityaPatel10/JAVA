import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even number.");
        } else {
            System.out.println(a + " is odd number.");
        }
    }

}