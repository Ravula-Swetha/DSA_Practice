/* 3. Diamond pattern
    *   
   ***   
  *****   
   ***   
    *   
*/

package DAY_9;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int space = n-i-1; space >= 0; space--){
                System.out.print("  ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("* ");
            }
            System.out.println();           
        }
        for(int i = n-1; i > 0; i--){
            for(int space = n-i+1; space > 0; space--){
                System.out.print("  ");
            }
            for(int j = 2*i-1; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
