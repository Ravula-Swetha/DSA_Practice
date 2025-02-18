// 2.	Fibonacci sequence: Implement a recursive function to return the nth Fibonacci number. 
package DAY_7;
import java.util.Scanner;

public class FibonnaciRecursion {
    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(fib(n));
        in.close();
    } 
}
