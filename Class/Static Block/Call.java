class Test {
    static int i;
    static{
        i=10;
        System.out.println("Static block called");
    }
}

class Call {
    public static void main(String[] args) {
        System.out.println(Test.i);
    }
}