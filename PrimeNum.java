import java.util.Scanner;

public class PrimeNum {
    public static boolean isPrime(int n) {
        // Base case: numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        
        // If the number is even and greater than 2, it's not prime
        if (n % 2 == 0) {
            return false;
        }
        
        // Check for factors from 3 to sqrt(n), only odd numbers
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int bc = ac.nextInt();
        
        if (isPrime(bc)) {
            System.out.println("it is prime number");
        }
        else{
            System.out.println("it is not prime");
            System.out.println(bc +);
        }
      

    }
}

