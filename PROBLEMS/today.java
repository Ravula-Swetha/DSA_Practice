/*
Shankuntala  a maths student a given a set of N numbers, and was asked to to perform the operations listed below:

1. sumRange(start, end) - return the sum of numbers between the indices start and end, both are inclusive.
2. update(ind, val) - update the value at the index 'ind' to 'val'.

Your task is to solve this problem using Fenwick Tree concept.

Input Format:
-------------
Line-1: Two integers N and Q, size of the array(set of numbers) and query count.
Line-2: N space separated integers.
next Q lines: Three integers option, start/ind and end/val.

Output Format:
--------------
An integer result, for every sumRange query.


Sample Input-1:
---------------
8 5
1 2 13 4 25 16 17 8
1 2 6		//sumRange
1 0 7		//sumRange
2 2 18	//update
2 4 17	//update
1 2 7		//sumRange

Sample Output-1:
----------------
75
86
80



Sample Input-2:
---------------
8 5
1 2 13 4 25 16 17 8
1 2 6		
1 0 7		
2 2 18	
2 4 17	
1 0 7

Sample Output-2:
----------------
75
86
83

*/


import java.util.*;

class FenWick{
    static int[] nums;
    static int[] bits;
    static int n;
    FenWick(int[] nums){
        this.nums = nums;
        n = nums.length;
        bits = new int[n+1];
        for(int i = 0; i < n; i++){
            init(i, nums[i]);
        }
    }
    
    public static void init(int i, int val){
        i++;
        while(i <= n){
            bits[i] += val;
            i += (i & -i);
        }
    }
    
    public static int getSum(int i){
        i++;
        int sum = 0;
        while(i > 0){
            sum += bits[i];
            i -= (i & -i);
        }
        return sum;
    }
    
    public static int sumRange(int i, int j){
        return getSum(j) - getSum(i-1);
    }
    
    public static void update(int i, int val){
        int diff = val - nums[i];
        nums[i] = val;
        init(i, diff);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int queue[][] = new int[q][3];
        for(int i = 0; i < q; i++){
            for(int j = 0; j < 3; j++){
                queue[i][j] = in.nextInt();
            }
        }
        
        FenWick f = new FenWick(arr);
        for(int i = 0; i < q; i++){
            if(queue[i][0] == 1){
                System.out.println(FenWick.sumRange(queue[i][1], queue[i][2]));
            }
            else{
                FenWick.update(queue[i][1], queue[i][2]);
            }
        }
        in.close();
    }
}