abstract class AbstractClass {
    abstract void area();

    void msg() {
        System.out.println("Hello World!!");
    }
}

class Rectangle extends AbstractClass {
    void area() {
        System.out.println("Area of Rectangle: " + (2 * 4));
    }
}

class Square extends AbstractClass {
    void area() {
        System.out.println("Area of Square: " + (2 * 2));
    }
}

public class Abstract {
    public static void main(String[] args) {
        AbstractClass ab;
        ab = new Rectangle();
        ab.area();
        ab = new Square();
        ab.area();
        ab.msg();
    }
}