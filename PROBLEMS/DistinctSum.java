/* Given an integer array nums and an integer k, you are asked to construct the array ans of
size n-k+1 where ans[i] is the number of distinct numbers in the subarray nums[i:i+k-1] =
[nums[i], nums[i+1], ..., nums[i+k-1]].
Return the array ans.

Example 1:
Input: nums = [1,2,3,2,2,1,3], k = 3
Output: [3,2,2,2,3]
Explanation: The number of distinct elements in each subarray goes as follows:
- nums[0:2] = [1,2,3] so ans[0] = 3
- nums[1:3] = [2,3,2] so ans[1] = 2
- nums[2:4] = [3,2,2] so ans[2] = 2
- nums[3:5] = [2,2,1] so ans[3] = 2
- nums[4:6] = [2,1,3] so ans[4] = 3 give me the output */

import java.util.*;

public class DistinctSum{

    public static int getUnique(HashMap<Integer, Integer> h, int c){
        for(Map.Entry<Integer, Integer> entry : h.entrySet()){
            if(entry.getValue() > 0){
                c++;
            }
            // System.out.println("Values in HashMap: " + entry.getKey() +" Value: " + entry.getValue());
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();

        
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < k; i++){
            h.put(arr[i], h.getOrDefault(arr[i],0 ) + 1);
        }
        
        
        res.add(getUnique(h, 0));
        for(int i = k; i < n; i++){
            h.replace(arr[i-k], h.get(arr[i-k]) - 1);
            h.put(arr[i], h.getOrDefault(arr[i], 0 ) + 1);
            res.add(getUnique(h, 0));
        }
        System.out.println(res);
        in.close();
    }    
}
