/* Malika taught a new fun time program practice for Engineering Students.
As a part of this she has given set of N numbers, and asked the students 
to perform the operations listed below:
1. sumRange(start, end) - return the sum of numbers between the indices start and end, both are inclusive.
2. update(ind, val) - update the value at the index 'ind' to 'val'.

Your task is to solve this problem using Segment Tree concept.

Input Format:
-------------
Line-1: Two integers N and Q, size of the array(set of numbers) and query count.
Line-2: N space separated integers.
next Q lines: Three integers option, start/ind and end/val.

Output Format:
--------------
An integer result, for every sumRange query.


Sample Input:
-------------
8 5
4 2 13 4 25 16 17 8
1 2 6		//sumRange
1 0 7		//sumRange
2 2 18	//update
2 4 17	//update
1 2 7		//sumRange

8 5
4 2 13 4 25 16 17 8
1 2 6		
1 0 7		
2 2 18	
2 4 17	
1 2 7	

Sample Output:
--------------
75
89
80 */
import java.util.*;

public class SegmentTrees{
    public static class SegmentTreeNode{
        int start, end;
        SegmentTreeNode left, right;
        int sum;
        SegmentTreeNode(int start, int end){
            this.start = start;
            this.end = end;
            left = null;
            right = null;
            sum = 0;
        }
    }
    
    static SegmentTreeNode root;
    SegmentTrees(int[] arr){
        root = BuildTree(arr, 0, arr.length - 1);
        // printTree(root);
    }
    
    public static void printTree(SegmentTreeNode root){
        if(root == null){
            return;
        }
        printTree(root.left);
        System.out.println("Sum "+ root.sum);
        printTree(root.right);
    }
    
    public static SegmentTreeNode BuildTree(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        SegmentTreeNode ret = new SegmentTreeNode(start, end);
        if(start == end){
            ret.sum = arr[start];
        }
        else{
            int mid = start + (end - start)/2;
            ret.left = BuildTree(arr, start, mid);
            ret.right = BuildTree(arr, mid+1, end);
            ret.sum = ret.left.sum + ret.right.sum;
        }
        return ret;
        
    }
    public static int sumRange(int start, int end){
        return findSum(root, start, end);
    }
    
    public static int findSum(SegmentTreeNode root, int start, int end){
        if((root.start == start) && (root.end == end)){
            return root.sum;
        }
        else{
            int mid = root.start + (root.end - root.start)/2;
            if(end <= mid){
                return findSum(root.left, start, end);
            }
            else if(start >= mid+1){
                return findSum(root.right, start, end);
            }
            else{
                return findSum(root.left, start, mid) + findSum(root.right, mid+1, end);
            }
        }
        
    }
    public static void update(int i, int val){
        UpdateTree(i, val, root);
    }
    
    public static void UpdateTree(int index, int value, SegmentTreeNode root){
        if(root.start == root.end){
            root.sum = value;
        }
        else{
            int mid = root.start + (root.end - root.start)/2;
            if(index <= mid){
                UpdateTree(index, value, root.left);
            }
            else if(index > mid){
                UpdateTree(index, value, root.right);
            }
            root.sum = root.left.sum + root.right.sum;
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        List<Integer> l = new ArrayList<>();
        SegmentTrees tree = new SegmentTrees(arr);
        for(int i = 0; i < q; i++){
            int option = in.nextInt();
            if(option == 1){
                int start = in.nextInt();
                int end = in.nextInt();
                l.add(sumRange(start, end));
            }
            else{
                int index = in.nextInt();
                int val = in.nextInt();
                update(index, val);
            }
        }
        for(int i : l){
            System.out.println(i);
        }
        in.close();
    }
}