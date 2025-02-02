public class ForEach {
    public static void main(String[] args) {
    int [] arr1 = {11,13,66,34,222,43};
        //    for(int a: arr1){
        //    if (a == 34){
        //    System.out.println("elements is find" +" " +a);
        //          }
        //    }
        
        int ans = 0;
        for (int a : arr1) {
            if (a > ans) {
                ans = a;
            }
            
        }
        System.out.println(ans);
    }
}
