// Write a recursive method to calculate the sum of digits of a given number. 
package DAY_12;

import java.util.Scanner;
public class SumRecursion {
    public static int Sum(int n, int res) {
        if(n == 0){
            return res;
        }
        res += n%10;
        return Sum(n/10, res);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Sum(n, 0));
        in.close();
    }
}
