package hackerank.d26;

import java.util.Scanner;

public class PrimaryNumberCase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0) {
            int number = sc.nextInt();
            System.out.println(isPrime(number) ? "Prime" : "Not prime");
            n--;
        }
        sc.close();
    }
    
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}