import java.util.*;
abstract class Employee{
    String emp_name;
    int emp_id;
    abstract void Input();
    abstract void Display();
}
public class Main extends Employee{
    Scanner sc= new Scanner(System.in);
    void Input(){
        System.out.print("Enter the name of the employee: ");
        emp_name= sc.nextLine();
        System.out.print("Enter the ID of the employee: ");
        emp_id= sc.nextInt();
    }
    void Display(){
        System.out.println("Name of the employee= "+ emp_name);
        System.out.println("ID of the employee= "+ emp_id);
    }
    public static void main(String[] args) {
        Main obj= new Main();
        obj.Input();
        obj.Display();
    }
}