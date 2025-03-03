import java.util.Scanner;

public class PalindromeString {

    public static Boolean isPalindrome(String str){
    
        String rev = new StringBuilder(str).reverse().toString();
        rev.toLowerCase();
        return str.equals(rev);
    }
    public static void main(String[] args) {
        System.out.println("Enter String you have check palindrome ");
        Scanner ac = new Scanner(System.in);
        String input = ac.nextLine();
        System.out.println(isPalindrome(input));
    }
}
