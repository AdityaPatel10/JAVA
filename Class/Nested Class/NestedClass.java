class NestedClass {
    static int i = 10;

    static class Inner {
        static void msg() {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Outer.Inner.msg();
    }
}