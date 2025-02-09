import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        boolean flag = true;
        if(n <= 0) return false;
        while(n > 1){
            if(n % 2 == 0) n = n/2;
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPowerOfTwo(n));
        in.close();
    }  
}
