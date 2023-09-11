class Anonymous {
    public static void main(String[] args) {
        sum(new int[] { 1, 2, 10, 4 });
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum is= " + sum);
    }
}