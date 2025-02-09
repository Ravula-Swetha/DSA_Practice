//  Write a program to implement Binary Search to find a target element in a sorted array.

import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr, int target, int n){
        int left = 0;
        int right = n-1; 
        int mid = -1;
        boolean flag = false;
        while(left <= right){
            mid = left - (left - right)/2;
            if(arr[mid] == target){
                flag = true;
                return mid;
            }
            else if(arr[mid] < target) left = mid + 1;
            else right = mid -1;
        }
        if (flag) return mid;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = in.nextInt();
        System.out.println("Element found at index " + search(arr, target, n));
        in.close();
    }
}
