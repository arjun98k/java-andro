import java.util.Scanner;

class RelationalOperator2 {
	public static void main(String[] args){
		int expreq = 5;
		boolean tier1 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your experince");
        int exp = sc.nextInt();
        System.out.println("are you eligble");
		System.out.println(expreq <= exp|| tier1);

	}
}