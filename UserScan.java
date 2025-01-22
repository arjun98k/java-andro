import java.util.Scanner;
class UserScan {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your favourite number");
        int a = sc.nextInt();
        System.out.println("Your Luck number is " + " "+ a);
	}
}