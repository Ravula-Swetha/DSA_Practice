//  1. Write a program to implement Linear Search to find an integer in an array.  

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            } 
        }
        return index;
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
        System.out.println("Element found at index " + search(arr, target));
        in.close();
    }
}
