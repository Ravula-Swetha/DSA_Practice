// 1.	Write a program to find the second largest element in an array. 

//  Write a program to implement Binary Search to find a target element in a sorted array.

import java.util.Scanner;

public class SecondLargestElement {
        public static int[] sort(int[] arr){
            int n = arr.length;
            int j = 1;
            int temp = 0;
            while(j < n-2){
                for(int i = 0; i < n-j; i++){
                    if(arr[i] > arr[i+1]){
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                } 
                j++;
            }
           return arr;
        }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int[] res = sort(arr);
        System.out.println("Second Largest Element: " + res[n-2]);
        in.close();
    }
}
