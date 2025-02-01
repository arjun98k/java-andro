public class Array1 {
    public static void main(String[] args) {
        int arr [] = new int[10];
        arr [0] = 0;

        // inserting element in arrays
        for (int i = 0; i < 10; i++) {
           arr[i] += i;
        }
        // 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
