public class TwoDarray2 {
    public static void main(String[] args) {
        char arr [][] = {
            {'a','b'},
            {'c','d'},
            {'e','f'},
    };

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
}
}
