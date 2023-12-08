interface First {
    void Drawable();
}
class Rectangle implements First {
    public void Drawable() {
        System.out.println("Drawing Rectangle");
    }
}

class Square implements First {
    public void Drawable() {
        System.out.println("Drawing Square");
    }
}

public class Interface{
    public static void main(String[] args){
        First f1;
        f1 = new Rectangle();
        f1.Drawable();
        f1 = new Square();
        f1.Drawable();
    }
}