import java.io.*;
class Table{
    synchronized void table(int X){
        for(int i=1; i<=5; i++){
            try{
                System.out.println(X+"*"+i+": "+X*i);
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}
class Thread1 extends Thread{
    Table t1 = new Table();
    Thread1(Table t1){
        this.t1=t1;
    }
    public void run(){
        t1.table(5);
    }
}
class Thread2 extends Thread{
    Table t2 = new Table();
    Thread2(Table t2){
        this.t2=t2;
    }
    public void run(){
        t2.table(10);
    }
    
}
public class Test1 {
    public static void main(String[] args) {
        Table obj1 = new Table();
        Thread1 obj2 = new Thread1(obj1);
        Thread2 obj3 = new Thread2(obj1);
        obj2.start();
        obj3.start();
    }
}
