/* Given an integer n, return an array ans of length n such that for each i 
(1 ≤ i ≤ n), ans[i-1] is the number of 0's in the 32-bit binary representation of i.

Assume input n>=1 


input = 5
output = 31 30 29 30 29

Explanation (32-bit binary representation):
1 → 00000000000000000000000000000001 → 31 zeros  
2 → 00000000000000000000000000000010 → 30 zeros  
3 → 00000000000000000000000000000011 → 29 zeros  
4 → 00000000000000000000000000000100 → 30 zeros  
5 → 00000000000000000000000000000101 → 29 zeros

 */
import java.util.*;

public class NoOfZeros {
    public static int count(int n){
        int c = 0;
        while(n > 0){
            n = n & (n-1);
            c++;
        }
        return 32-c;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(count(i) + " ");
        }
        in.close();
    }
}

