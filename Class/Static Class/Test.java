class Test {
    static int a = 10;

    static class Inner {
        static void msg() {
            System.out.println("Vlaue= " + a);
        }
    }

    public static void main(String[] args) {
        Test.Inner.msg();
    }
}