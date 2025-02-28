
/*
You are given an array consisting of N integers, and an integer, K. 
Your task is to determine the minimum element in subarrays of size K.

Sample Input1:
--------------
5
10 12 14 11 15
3

Sample Output1:
---------------
10 11 11

Sample Input2:
--------------
5
5 2 1 1 1
4

Sample Output2:
---------------
1 1
*/

import java.util.*;


class MinSubarrElement{
    public static int findMin(int[] res){
        int min = res[0];
        for(int i = 0; i < res.length; i++){
            if(res[i] < min) min = res[i];
        }
        return min;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        
        
        int[] res = new int[k];
        int min = arr[0];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        System.out.print(min + " ");
        for(int i = k; i < n; i++){
            res[i-k] = arr[i];
            System.out.print(findMin(res) + " ");
        }
        in.close();
        
        
     /* Approach - 2 : Sliding Window
     ArrayList<Integer> l = new ArrayList<>();
      for(int i = 0; i < k; i++){
          l.add(arr[i]);
      }
      System.out.print(Collections.min(l) + " ");
      for(int i = k; i < n; i++){
          l.remove(0);
          l.add(arr[i]);
          System.out.print(Collections.min(l) + " ");
      }  */
    }
}