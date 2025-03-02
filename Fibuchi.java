public class Fibuchi {
    public static void main(String[] args) {
        int firstnum = 0; int secnum=1 , count=10;
        System.out.print(firstnum + "  " + secnum);

        for (int i = 2; i < count; i++) {
            int num3 = firstnum + secnum;
            System.out.print(" " + num3 + " ");
            firstnum = secnum;
            secnum = num3;
        }
    }
}
