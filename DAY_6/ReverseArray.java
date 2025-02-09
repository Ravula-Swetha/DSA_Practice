// 3.	Write a program to reverse an array using loops. 

public class ReverseArray {
    public static void reverse(int[] arr, int n){
        for(int i = n-1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 16, 8, 5, 1};
        reverse(arr, arr.length);
    }
}
