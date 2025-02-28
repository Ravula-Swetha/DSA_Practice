
/* 
Mr. Param is working with Strings.
He is given a String S. He has to find the palindromes in S, 
A palindrome can be a substring of S (Strictly substrings only, not subsequences).

Your task is to find the count the number of palindromes can be formed from S.

NOTE: Count each occurence of palindromes if duplicate substrings found. 

Input Format:
-------------
A string S

Output Format:
--------------
Print an integer, number of palindromes.

Sample Input-1:
---------------
divider

Sample Output-1:
----------------
9

Explanation:
-------------
Palindromes are d, i, v, i, d, e, r, ivi, divid

Sample Input-2:
---------------
abcdef

Sample Output-2:
----------------
6

Explanation:
-------------
Palindromes are a, b, c, d, e, f.
 */
import java.util.*;

class SubStringPalindrome{
    public static boolean isPalindrome(String s){
        StringBuilder rev = new StringBuilder(s);
        return (s.equals(rev.reverse().toString()))? true : false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        int n = s.length();
        int c = n;
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                if(s.charAt(i) == (s.charAt(j))){
                    if(isPalindrome(s.substring(i, j+1))){
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
        in.close();
    }
}
