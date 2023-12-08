public class StaticClass {
    static int a = 90;

    static class inner {
        static void prnt() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        StaticClass.inner.prnt();
    }
}
