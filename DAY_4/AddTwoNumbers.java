import java.util.Scanner;

public class AddTwoNumbers {
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a, b));
        in.close();
    } 
}
