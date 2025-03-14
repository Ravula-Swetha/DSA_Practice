/* Imagine you are analyzing the popularity of different songs on a music streaming platform. 
Each song has been played a certain number of times, and you have a list of song IDs representing 
these plays.

Your task is to identify the top k most played songs based on their frequency. 
If two songs have been played the same number of times, the song with the higher ID should be prioritized.

Challenge:

Given a list of song IDs representing plays and an integer k, determine the k most popular songs, 
sorted in descending order of play count. If multiple songs have the same number of plays, 
the song with the higher ID should appear first.

Are you ready to rank the top hits?

Input Format:
-------------
Line-1: An integer N, representing the number of elements in the array.
Line-2: A line with N space-separated integers representing the elements of the array.
Line-3: An integer k, representing the number of most frequent elements to return.

Output Format:
--------------
Line-1: An array, comma-separated integers in descending order of frequency. 
If two elements have the same frequency, the higher number should appear first.


Sample Input-1:
--------------
6
1 1 1 2 2 3
2

Sample Output-1:
----------------
[1, 2]


Sample Input-2:
--------------
1
1
1

Sample Output-2:
----------------
[1]
*/

import java.util.*;

class HighFrequencyElements{
    public static List<Integer> freq(int[] arr, int n, int k){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }
        // System.out.println("hashmap: " + h);
        List<Integer> count = new ArrayList<>(h.values());
        Collections.sort(count);
        // System.out.println("List of values: " + count);
        List<Integer> res = new ArrayList<>();

        while(res.size() < k){
            int val = count.remove(count.size()-1);
            for(Map.Entry<Integer, Integer> entry : h.entrySet()){ 
                // System.out.println("Original Value: "+ entry.getValue() + " poll value " + val + " Key " + entry.getKey());
                if(entry.getValue() == val){
                    res.add(entry.getKey());
                    // System.out.println("res values: " + res);
                    break;    
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(freq(arr, n, k));
        in.close();
    }
}


/*import java.util.*;

public class example{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(popular(arr , n , k));
    }
    
    public static ArrayList<Integer> popular(int [] arr , int n , int k){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num , hm.getOrDefault(num , 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(b).equals(hm.get(a)) ? b - a : hm.get(b) - hm.get(a));
        pq.addAll(hm.keySet());
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i< k ;i++){
          res.add(pq.poll());
        }

        return res; 
        
    }
}*/