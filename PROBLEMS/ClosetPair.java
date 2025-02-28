/* A researcher is working on data analysis and needs to find the best matching values 
from two sorted datasets based on a target sum.  

The researcher is given:  
->Two sorted lists of integers representing numerical data.  
->A target sum to compare against.  

The goal is to identify a pair of numbers (one from each list) whose sum is closest 
to the given target.  

Rules:
------
-> Each selected pair must consist of one element from each list.  
->If multiple pairs have the same closest sum, any one of them can be returned.  
->The input lists are already sorted in ascending order.  
->The output should be printed as a comma-separated pair.

Input Format:
-------------
Line 1: An integer N1, representing the size of the first list.
Line 2: N1 space-separated integers, representing elements of the first sorted list.
Line 3: An integer N2, representing the size of the second list.
Line 4: N2 space-separated integers, representing elements of the second sorted list.
Line 5: An integer X, representing the target sum.

Output Format:
--------------
Line-1: Print a comma-separated pair (a, b), where a is from list_1 and b is from list_2, such that their sum is closest to the target sum.

Sample Input-1:
---------------
4
1 4 5 7
4
10 20 30 40
32

Sample Output-1:
----------------
1,30

Explanation:
------------
The closest pair to 32 is (1,30) → 1 + 30 = 31, which is the closest sum to 32.

Sample Input-2:
---------------
3
2 4 6
4
5 7 11 13
15

Sample Output-2:
----------------
2,13

Explanation:
------------
The closest pair to 15 is (2,13) → 2 + 13 = 15, which is an exact match.
 */

 import java.util.*;
class ClosestPair{
    public static void solve(int[] arr1, int[] arr2, int target){
        int diff = Integer.MAX_VALUE;
        int left = 0;
        int right = arr1.length - 1;
        List<Integer> l = new ArrayList<>();
        if(arr1[0] > arr2[0]) solve(arr2, arr1, target);
        while((left < arr2.length) && (right >= 0)){
            int val = arr2[left] + arr1[right];
             if(target - val < diff){
                l.clear();
                l.add(arr1[right]);
                l.add(arr2[left]);  
                diff = val;
            } 
            if(val == target){
                // ans: arr2[left], arr1[right]
                l.clear();
                l.add(arr1[right]);
                l.add(arr2[left]);
                // return l;
                break;
            }
            if(val < target){
                left++;
                right--;
                // if(target - val < diff) diff = val;
            }
            if(val > target){
                right--;
            }
        }
        int val = Integer.MAX_VALUE;
        // System.out.println("val: " + val + "left: " + left + "right; "+ right);
        while(left <= arr2.length-1){
            right = 0;
            val = arr2[left] + arr1[right];  
            if(target - val < diff){
               l.clear();
               l.add(arr1[right]);
               l.add(arr2[left]);  
               diff = val;
            }
            left++;
        }
        while(right >= 0){
            left = arr2.length-1;
            val = arr2[left] + arr1[right];  
            if(target - val <= diff){
               l.clear();
               l.add(arr1[right]);
               l.add(arr2[left]);  
               diff = val;
            }
            right--;
        }
        // return l;
        System.out.println(l.get(0) + ", " + l.get(1));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0; i < n1; i++){
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0; i < n2; i++){
            arr2[i] = in.nextInt();
        }
        int target = in.nextInt();
        solve(arr1, arr2, target);
        in.close();
        // List<Integer> l = new ArrayList<>();
        // for(int i = 0; i < l.size(); i++){
        //     l.add(solve(arr1, arr2, target);
        // System.out.println();
    }
}