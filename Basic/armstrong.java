import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int b, r, sum=0;
        b=a;
        while (b != 0) {
            r = b % 10;
            sum += r * r * r;
            b /= 10;
        }
        if (sum == a) {
            System.out.println(a + " is armstrong number.");
        } else {
            System.out.println(a + " is not armstrong number.");
        }
    }
}