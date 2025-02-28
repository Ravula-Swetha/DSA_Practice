/*You are given a list of N integers List[], list contains both +ve and -ve integers.
Your task is to findout, the Highest Product possible,
Where the product is the product of all the elements of contiguous sublist sList[],
and sub list should conatin atleast 1 integer.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer output, the highest product.

Sample Input-1:
---------------
4
2 3 -2 4

Sample Output-1:
----------------
6

Explanation:
------------
Product of contiguous sub list [2,3].


Sample Input-2:
---------------
3
-2 0 -3

Sample Output-2:
----------------
0

Explanation:
------------
Product of sub list [0], where [-2,-3] is not a contiguous sublist
 */
import java.util.*;

class HighestProductPossible{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i = 0 ; i < len; i++){
            arr[i] = in.nextInt();
        }
      
        int max = Integer.MIN_VALUE;
        for(int n = len; n > 0; n--){
            int prod = 1;
            for(int i = 0; i <= len-n; i++){
                prod = 1;
                for(int win = i; win < i+n; win++){
                    prod *= arr[win];
                }
                if(max < prod) max = prod;
            }
        }
        System.out.println(max);
        in.close();
    // public static int max = Integer.MIN_VALUE;
    // public static void product(int[] arr, int n){
    //     if(n <= 0){
    //         return;
    //     }
    //     int len = arr.length;
    //     int pro = 1;
    //     int k = n; 
    //     ArrayList<Integer> l = new ArrayList<>();
    //     for(int i = 0; i < k; i++){
    //         l.add(arr[i]);
    //         pro *= arr[i];
    //     }
    //     if(max < pro) max = pro;
        
    //     for(int i = k; i < len; i++){
    //         if(pro == 0){
    //            pro = 1;
    //            pro = pro * arr[i];
    //            l.remove(0);
               
    //         }
    //         else{
    //            pro = (pro/l.remove(0)) * arr[i];
    //         }
    //         l.add(arr[i]);
    //         if(max < pro) max = pro;
    //     }
    //     product(arr, n-1);
    // }

    }
}