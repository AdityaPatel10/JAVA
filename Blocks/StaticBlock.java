class StaticBlock {
    static int i;
    static {
        i = 100;
        System.out.println("Static Block called");
    }
}

class Parent extends Base {
    public static void main(String[] args) {
        System.out.println(i);
    }
}