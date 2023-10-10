class metho {
    void Dis() {
        System.out.println(9+14);
    }

    void Dis(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        metho m1 = new metho();
        m1.Dis();
        m1.Dis(10);
    }
}