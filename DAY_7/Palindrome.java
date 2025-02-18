// 4.	Write a method to check if a given string is a palindrome. 
package DAY_7;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString().equals(s)? true : false;
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        System.out.println(isPalindrome(str)? "Palindrome" : "Not a Palindrome");
        in.close();
    }
}
