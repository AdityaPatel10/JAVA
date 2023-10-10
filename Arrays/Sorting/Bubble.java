import java.util.*;
class Bubble {
    void Bubble(int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
    void Display(int arr[], int n) {
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {
        Sort s1 = new Sort();
        int arr[] = { 5, 3, 1, 6, 0, 2 };
        System.out.println("Unsorted Array: ");
        s1.Display(arr, arr.length);
        s1.Bubble(arr, arr.length);
        System.out.println("\nSorted Array: ");
        s1.Display(arr, arr.length);
    }
}