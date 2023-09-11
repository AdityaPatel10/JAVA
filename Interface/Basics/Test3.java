interface In1 {
    void Shape();
}
class Test implements In1{
    public void Shape(){
        System.out.println("It is a circle.");
    }
}
class Test2 implements In1{
    public void Shape(){
        System.out.println("It is an square.");
    }
}
class Test3{
    public static void main(String[] args) {
        Test t1= new Test();
        Test2 t2= new Test2();
        t1.Shape();
        t2.Shape(); 
    }
}