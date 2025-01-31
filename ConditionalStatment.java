import java.util.Scanner;

class ConditionalStatment {
	public static void main(String[] args){
		int age_driver ;
		
		Scanner sc = new Scanner(System.in);
		age_driver = sc.nextInt();
		if (age_driver < 18) {
			System.out.println("he cannot drive");
			
		}
		else{
			System.out.println("he can drive");
		}
	}
}