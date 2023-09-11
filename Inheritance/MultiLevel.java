class MultiLevel {
    void DisplayB() {
        System.out.println("Base Class");
    }
}

class Derived1 extends MultiLevel {
    void DisplayD() {
        System.out.println("Parent Class 1");
    }
}

class Derived2 extends Derived1 {
    void DisplayP() {
        System.out.println("Parent Class 2");
    }

    public static void main(String[] args) {
        Derived2 o1 = new Derived2();
        o1.DisplayB();
        o1.DisplayD();
        o1.DisplayP();
    }
}
