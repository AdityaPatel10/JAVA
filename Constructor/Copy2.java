import java.util.*;

class Copy2 {
    int id;
    String name;
    Copy2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter id: ");
        id = sc.nextInt();
    }
    void display() {
        System.out.println("Name is= " + name);
        System.out.println("Id is= " + id);
    }
    public static void main(String[] args) {
        Copy2 c1 = new Copy2();
        c1.display();
        Copy2 c2 = c1;
        c2.display();
    }
}