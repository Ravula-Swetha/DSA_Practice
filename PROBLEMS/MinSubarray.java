/* 
  You are given a sequence of numbers representing data points recorded in a system.
A specific number (or numbers) appears the most times in this sequence,
and we call its frequency the "peak frequency."

Your goal is to determine the length of the smallest continuous segment of this 
sequence that maintains the same peak frequency as the entire sequence.

Input Format:
-------------
Line 1: An integer N, representing the number of data points in the sequence.

Line 2: N space-separated integers, representing the recorded data.

Output Format:
--------------
Print a single integer, which is the length of the smallest continuous segment 
that retains the peak frequency found in the full sequence.

Constraints:
------------
1≤N≤50000
0≤s[i]≤49999

Sample Input-1:
---------------
5
3 2 3 4 5

 
Sample Output-1:
----------------
3

Explanation:
------------
Maximum repeated number is 3  and the count=2.
The continuous segment with the same count are [3 2 3 4 5],[3 2 3 4], [3 2 3].
the least size is 3 with subset[3 2 3].
 
Sample Input-2:
---------------
5
5 6 6 7 5

Sample Output-2:
----------------
2

Explanation:
------------
Maximum repeated numbers are 5 and 6  and the count=2.
The continuous segment with the same count are [5 6 6 7 5],
[5 6 6 7], [6 6 7 5],[5 6 6] [6 6 7] [6 6].
The least size is 2 with subset[6 6].

 */
import java.util.*;

class MinSubarray{
    public static int getMaxElement(int[] arr, int n){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);
        }

        int max = Collections.max(h.values());
        int val = -1;
         for(Map.Entry<Integer, Integer> entry : h.entrySet()){
            if(max == entry.getValue()){
                val = entry.getKey();
            }
        }
        return val;
       
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int value = getMaxElement(arr, n);
        // System.out.println("value: " + value);

        int start = -1, end = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == value){
                start = i;
                break;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(arr[i] == value){
                end = i;
                break;
            }
        }
        // System.out.println("end: " + end + "Start: " + start);
        System.out.println(end-start+1);
        in.close();
    }
}