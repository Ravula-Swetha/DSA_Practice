import java.util.*;
public class MaxWaterCapacity {
    public static void solve(int[] arr) {
        int n = arr.length;
        int right = n;
        int left = 0;
        int maxL = left, maxR = right;
        int count = 0;
        int i = 0;
        while(left < right){
            
            if(left >= maxL){
                i = 0;
                maxL = left;
            }
            else{
                count += left;
                i++;
            }
            if(right >= maxR){
                i=0;
                maxR = right;
            }
            else{
                count += right;
                i++;
            }
            left++; 
            right--;
        }
        int ans = 0;
        if(maxL < maxR){
            ans = (maxL*i) - count;
        }
        else{
            ans = (maxR*i) + count;
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] s = input.split(" ");
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        solve(arr);
        in.close();
    }

}

/*
 * A Kid built a structure using building blocks, by placing the building-blocks adjacent to each other.

A building-block is a vertical alignment of blocks.
	                                ___
here one block each represents  as |___|.

The following structure made up of using building blocks

                          ___
                      ___|___|    ___
                     |___|___|_w_|___|___              ___
                  ___|___|___|___|___|___| w   _w_  w |___| 
              ___|___|___|___|___|___|___|_w__|___|_w_|___|____________
    
               0  1   3   4   2   3    2   0   1   0   2

Once the structure is completed, kid pour water(w) on it.

You are given a list of integers, heights of each building-block in a row.
 Now your task How much amount of water can be stored by the structure.

 Input Format:
 -------------
 Space separated integers, heights of the blocks in the structure. 

Output Format:
 --------------
 Print an integer, 
  
Sample Input:
-------------
 0 1 3 4 2 3 2 0 1 0 2
    
Sample Output:
--------------
6
    
Explanation:
 -----------
In the above structure,  6 units of water (w represents the water in the structure)
can be stored.

 */