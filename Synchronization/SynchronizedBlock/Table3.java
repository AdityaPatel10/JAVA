import java.io.*;

class WithoutSync {
    void Table(int ele, int n) {
        synchronized(this){
        System.out.println("Table of " + ele + " is= ");
        for (int i = 1; i <= n; i++) {
            System.out.println(ele + " * " + i + "= " + (ele * i));
        }
        
    }
}
}

class Table1 extends Thread {
    WithoutSync obj1 = new WithoutSync();

    Table1(WithoutSync obj1) {
        this.obj1 = obj1;
    }

    public void run() {
        obj1.Table(5, 10);
    }
}

class Table2 extends Thread {
    WithoutSync obj2 = new WithoutSync();

    Table2(WithoutSync obj2) {
        this.obj2 = obj2;
    }

    public void run() {
        obj2.Table(15, 10);
    }
}

public class Table3 {
    public static void main(String[] args) {
        WithoutSync obj3 = new WithoutSync();
        Table1 obj4 = new Table1(obj3);
        Table2 obj5 = new Table2(obj3);
        obj4.start();
        obj5.start();
    }
}
