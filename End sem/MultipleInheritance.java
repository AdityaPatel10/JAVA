interface First{
    void first();
}
interface Second{
    void second();
}
public class MultipleInheritance implements First, Second{
    public void first(){
        System.out.println("First");
    }
    public void second(){
        System.out.println("Second");
    }
    public static void main(String[] args){
        MultipleInheritance obj = new MultipleInheritance();
        obj.first();
        obj.second();
    }
}
