// 2.	Create a program to remove duplicate elements from an integer array. 
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDup(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for(int i : arr){
            h.add(i);
        }
        for(int ele: h){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        removeDup(arr);
        in.close();
    }
}
