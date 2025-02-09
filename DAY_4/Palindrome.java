import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int n = x;
        int sum=0;
        while(n > 0){
            sum = (sum * 10) + (n%10);
            n = n/10;
        }
        if(sum == x) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPalindrome(n));
        in.close();
    } 
}
