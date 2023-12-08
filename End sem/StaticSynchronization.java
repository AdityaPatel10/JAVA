class Table {
    synchronized static void PrintTable(int x) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(x + "*" + i + "= " + x * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;

    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.PrintTable(3);
    }
}

class Thread2 extends Thread {
    Table t;

    Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.PrintTable(5);
    }
}

class Thread3 extends Thread {
    Table t;

    Thread3(Table t) {
        this.t = t;
    }

    public void run() {
        t.PrintTable(2);
    }
}

class Thread4 extends Thread {
    Table t;

    Thread4(Table t){
        this.t=t;
    }

    public void run() {
        t.PrintTable(10);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        Table t = new Table();
        Table tt = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        Thread3 t3 = new Thread3(tt);
        Thread4 t4 = new Thread4(tt);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
