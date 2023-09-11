class Jagged {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[] { 1, 2, 3, 4, 5 };
        arr[1] = new int[] { 6, 7, 8, 9 };
        arr[2] = new int[] { 10, 11 };
        int count = 0;
        System.out.println("2D Jagged Array:-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("Array have "+count+" elements.");
    }
}