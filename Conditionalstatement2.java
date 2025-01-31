import java.util.Scanner;

class Conditionalstatement2 {
	public static void main(String[] args){
		int marks ;
		System.out.println("enter student marks");
		Scanner ac = new Scanner(System.in);
		marks = ac.nextInt();

		if (marks >= 90) {
			System.out.println("A grade Student");
		}else if (marks >= 70) {
			System.out.println("B grade Studuent");
		}else if (marks >= 60) {
			System.out.println("below average student");
		}else if (marks <= 59){
			System.out.println("student failed");
		}
		
	}
}