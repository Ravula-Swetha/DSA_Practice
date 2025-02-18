// 3.	Sum of digits: Create a recursive function to find the sum of digits of a given number. 
package DAY_7;

import java.util.Scanner;

public class SumOfDigits {
    public static int digitsSum(int n) {
        if(n == 0){
            return 0;
        }
        return (n%10) + digitsSum(n/10);
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Sum of digits: " + digitsSum(n));
        in.close();
    }
}
