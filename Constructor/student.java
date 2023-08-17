import java.util.*;
public class student {
    int id;
    String name;

    student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter id: ");
        id = sc.nextInt();
    }

    student(student c) {
        name = c.name;
        id = c.id;
    }

    void display() {
        System.out.println("Name is= " + name);
        System.out.println("Id is= " + id);
    }

    public static void main(String[] args) {
        
        student s1 = new student();
        student s2 = new student(s1);
        s1.display();
        s2.display();
    }
}