// 1.	Factorial using recursion: Write a recursive method to calculate the factorial of a number. 
package DAY_7;

import java.util.Scanner;

public class FactorialRecursion {
    public static int factorial(int n) {
        if(n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Factorial of "+ n + " is: "+ factorial(n));
        in.close();
    }
}
