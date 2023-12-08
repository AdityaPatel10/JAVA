public class AnonymousArray {
    public static void Print(int arr[]){
        for(int i:arr){
            System.out.println("arr["+i+"]: " + i);
        }
    }
    public static void main(String[] args){
        Print(new int[]{1, 2, 3});
    }
}
