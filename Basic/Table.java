import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you have to print table: ");
        a= s.nextInt();
        System.out.println("Table of " + a + " is:-");
        for(int i=1; i<11; i++) {
            System.out.println(a + "*" + i + " is=" + a*i);
        }
    }
}