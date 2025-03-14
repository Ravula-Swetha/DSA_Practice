/* Given a positive integer n, you can apply one of the following operations:

If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n-1 .
Return the minimum number of operations needed for n to become 1.

Example 1:
Input:8
Output: 3
Explanation: 8 -> 4 -> 2 -> 1

Example 2:
Input:7
Output: 4
Explanation: 7 -> 8 -> 4 -> 2 -> 1
or 7 -> 6 -> 3 -> 2 -> 1
 */
import java.util.*;
public class sumcount12 {
    // import java.util.*;

// class Solution{
    public static int recur(int n, int count){
        // System.out.println("n: " + n);
      
        if(n == 1){
            return count;
        }
        else if(n % 2 == 0){
            return recur(n/2, count);
        }
        else{
            count++;
            if((n+1/2)%2 == 0){
                n = n+1;
            }
            else{
                n = n-1;
            }
            return recur(n, count+1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recur(n, 0));
    }
}

// }


// import java.util.*;

// class Solution{
//     public static int recur(int n){
//         if(n == 1){
//             return 0;
//         }
        
//         else if(n % 2 == 0){
//             return 1 + recur(n/2);
//         }
//         else{
//             return 1 + Math.min(recur(n+1), recur(n-1));
//         }
//     }
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         System.out.println(recur(n));
//     }
// }
