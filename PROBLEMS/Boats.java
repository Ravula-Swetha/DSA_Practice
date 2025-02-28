/*
You are given an array people where people[i] is the weight of the ith person, 
and an infinite number of boats where each boat can carry a maximum weight of limit. 
Each boat carries at most two people at the same time, 
provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

Example 1:

Input: 2
1 2
3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input:4
3 2 2 1
3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input:4
3 5 3 4
5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 
*/
import java.util.*;

class Boats{
    public static int solve(int[] arr, int target){
        int c = 0;
        int left = 0; 
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] + arr[right] <= target){
                c++;
                left++;
                right--;
            }
            if(arr[left] + arr[right] > target){
                c++;
                right--;
            }
        }
        if(left == right && arr[left] <= target){
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        Arrays.sort(arr);
        System.out.println(solve(arr, target));
        in.close();
    }
}