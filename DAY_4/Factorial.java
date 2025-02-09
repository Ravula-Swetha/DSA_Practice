// 1.	Create and call a user-defined method to calculate the factorial of a number. 
// 5! = 5*4*3*2*1 = 120;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int factorial = 1;
        for(int i = n; i >=1; i--){
            factorial *= i;
        }
        System.out.println("Factorial of "+ n + " is: "+ factorial);
        in.close();
    }
}