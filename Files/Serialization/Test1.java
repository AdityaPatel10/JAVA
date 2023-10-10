import java.io.*;
class Student implements Serializable{
    String name;
    int ID;
    Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
}
public class Test1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream f1 = new FileOutputStream("Test1.txt");
        ObjectOutputStream o1 = new ObjectOutputStream(f1); //Serialization

        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("Test1.txt")); //Deserialization

        Student s1 = new Student("Aditya", 11543);
        o1.writeObject(s1);
        o1.flush();
        o1.close();
        Student s2 = (Student)o2.readObject();
        System.out.println("Name: "+s2.name+"\nID: "+s2.ID);

        System.out.print("Success");
    }
}
