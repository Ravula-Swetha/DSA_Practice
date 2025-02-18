// 3.	Implement a program to reverse a given string using StringBuilder
package DAY_7;

import java.util.Scanner;

public class ReverseString {
    public static StringBuilder reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        System.out.println(reverse(str));
        in.close();
    } 
}
