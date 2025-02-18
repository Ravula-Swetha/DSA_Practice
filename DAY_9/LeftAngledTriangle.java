package DAY_9;

public class LeftAngledTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int space = n-i-1; space >= 0; space--){
                System.out.print("  ");
            }
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
