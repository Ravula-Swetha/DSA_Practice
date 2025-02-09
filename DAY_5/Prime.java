// 2.	Create a static method to check if a number is prime. 

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if(n%2 == 0){
            return false;
        }
        boolean flag = true;
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
        in.close();
    }
}
