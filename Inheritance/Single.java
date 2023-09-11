package JAVA.Inheritance;

public class Single {
    void DisplayB() {
        System.out.println("Base Class");
    }
}
class Parent extends Single {
    void DisplayP() {
        System.out.println("Parent Class");
    }
    public static void main(String[] args) {
        Parent o1= new Parent();
        o1.DisplayB();
        o1.DisplayP();
    }
}
