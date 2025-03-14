/* The Smallest Number Challenge

Shyam a third class boyt has been given a large number, he can remove a few digits to make it as small as possible. 

The goal is to carefully choose which digits to remove so that the remaining number is the smallest possible.

You must remove exactly k digits.
The final number cannot have unnecessary leading zeros (unless it becomes "0").
If removing k digits removes all the digits, the result should simply be "0".
Can you figure out the best way to help shyam to  remove the digits and get the smallest possible number?
If the result is an empty string, return 0 instead.


input = 1432219  
3  
output =1219

Explanation:
By removing the digits 4, 3, and 2, the smallest possible number is 1219


Input=10200 
1  
Output=200

Explanation:
Removing "1" results in "0200", which simplifies to "200" after removing the leading zero.


Input="10"  
2  
Output=0

Explanation:
All digits are removed, so the result is "0"
 */
import java.util.*;
public class j {
    // Prints stack as output::
    // public static void solve(String num, int k){
    //     Stack<Character> stack = new Stack<>();
    //     for(char ch: num.toCharArray()){
    //         while(k > 0 && !stack.isEmpty() && stack.peek() > ch){
    //             stack.pop();
    //             k--;
    //         }
    //         stack.push(ch);
    //     }
    //     System.out.println(stack);
    // }

    // Prints number as output
    public static void solve(String num, int k){
        Stack<Integer> stack = new Stack<>();
        for(char ch: num.toCharArray()){
            while(k > 0 && !stack.isEmpty() && stack.peek() > ch-'0'){
                stack.pop();
                k--;
            }
            stack.push(ch-'0');
        }
        int sum = stack.pop();
        int i = 1;
        while(!stack.isEmpty()){
            int x = stack.pop();
            sum = sum + (x * (int)Math.pow(10,i));
            i++;
            
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int k = in.nextInt();
        solve(num, k);
    }
}

