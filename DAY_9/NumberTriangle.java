/* 
1   
1 2   
1 2 3   
1 2 3 4   
*/
package DAY_9;

public class NumberTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
