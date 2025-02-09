// 3.	Write a non-static method to reverse a given string. 

import java.util.Scanner;

public class ReverseString {
    public static String stringReverse(String str){
      String newstr = "";
      for(int i = str.length()-1; i >= 0; i--){
         newstr += str.substring(i, i+1);
      }
      return newstr;
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        System.out.println("Reversed string: " + stringReverse(str));
      //   System.out.println("Reversed string: " + new StringBuilder(str).reverse());
        in.close();
     }
}
