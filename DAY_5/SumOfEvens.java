//  4.	Implement a method with parameters that returns the sum of all even numbers from an integer array. 
import java.util.Scanner;

public class SumOfEvens {
    public static int evenSum(int[] arr){
        int sum = 0;
        for(int i : arr){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Sum of all even numbers: " + evenSum(arr));
        in.close();
    }
}
