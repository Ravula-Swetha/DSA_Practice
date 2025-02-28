/*
Given a string s, reverse only all the vowels in the 
string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
appear in both lower and upper cases, more than once.

Sample Input-1:
---------------
hello

Sample Output-1:
----------------
holle

Sample Input-2:
----------------
Keshavmemorial

Sample Output-2:
----------------
Kashivmomerael
*/

import java.util.*;

class ReverseVowels{
    static String vowels = "aeiou";
    public static void solve(String s) {
        String[] arr = stringToArray(s);
        int left = 0;
        int right = arr.length - 1;
        int leftIndex = -1;
        int rightIndex = -1;
        while(left < right){
            // System.out.println("right: " + right);
            // System.out.println("left: " + left);
            // System.out.println("rightInex: " + rightIndex);
            // System.out.println("leftIndex: " + leftIndex);

            if(vowels.contains(arr[left])){
                leftIndex = left;
                // System.out.println("LeftIndex: " + leftIndex);
            }
            if(vowels.contains(arr[right])){
                rightIndex = right;
                System.out.println("rightIndex insideeee: " + rightIndex);
            }
            if(leftIndex >= 0 && rightIndex >= 0){
                System.out.println("LeftIndex: " + leftIndex);
                System.out.println("rightInex: " + rightIndex);
                String temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex = -1;
                rightIndex = -1;
            }
            left++; right--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static String[] stringToArray(String s) {
        String[] arr = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.substring(i, i+1);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        solve(s);
        in.close();
    }
}