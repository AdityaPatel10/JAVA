import java.io.*;

class Table {
    synchronized static void table(int X) {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(X + "*" + i + ": " + X * i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Thread1 extends Thread {
    Table t1 = new Table();

    Thread1(Table t1) {
        this.t1 = t1;
    }

    public void run() {
        t1.table(5);
    }
}

class Thread2 extends Thread {
    Table t2 = new Table();

    Thread2(Table t2) {
        this.t2 = t2;
    }

    public void run() {
        t2.table(2);
    }
}

class Thread3 extends Thread {
    Table t3 = new Table();

    Thread3(Table t3) {
        this.t3 = t3;
    }

    public void run() {
        t3.table(3);
    }
}

class Thread4 extends Thread {
    Table t4 = new Table();

    Thread4(Table t4) {
        t4.table(4);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Table obj1 = new Table();
        Thread1 obj2 = new Thread1(obj1);
        Thread2 obj3 = new Thread2(obj1);
        Table ob1 = new Table();
        Thread3 ob2 = new Thread3(ob1);
        Thread4 ob3 = new Thread4(ob1);
        obj2.start();
        obj3.start();
        ob2.start();
        ob3.start();
    }
}
