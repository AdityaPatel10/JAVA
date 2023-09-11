abstract class Child{
    abstract void Display();
} 
class Parent extends Child{
    void Display(){
        String name= "Aditya";
        int ID= 11543;
        float salary= 150000;
        System.out.println("Name= "+name);
        System.out.println("ID= "+ID);
        System.out.println("Salary= "+salary);
    }
}
class Test{
    public static void main(String[] args) {
        Parent obj= new Parent();
        obj.Display();
    }
}