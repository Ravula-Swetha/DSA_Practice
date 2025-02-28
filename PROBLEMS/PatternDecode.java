import java.util.*;

public class PatternDecode {
    public static LinkedList<String>[] sol(String s, int n, int val){
        int i = 0; 
        int j = 1;
        boolean down = true;
        boolean up = false;
        LinkedList<String>[] a = new LinkedList[val];
        for(int p = 0 ; p < val; p++){
            a[p] = new LinkedList<>();
        }
        
        while(i < n){
            while(down && j<=val && i < n){
                a[j-1].add(s.substring(i, i+1));
                // System.out.println("added value in down:  " + s.substring(i, i+1) + "\\\\ j value: " + j);
                i++;
                if(j%val == 0){
                    down= false;
                    up = true;
                    break;
                }
                j++;
            }
            while(up && j > 0 && i<n){
                j--;
                // System.out.println("J vslues inside up statement: " + j);
                if(j == 1){
                    down= true;
                    up = false;
                }
                a[j-1].add(s.substring(i, i+1));
                // System.out.println("added value in up:  " + s.substring(i, i+1) + "\\\\ j value: " + j);
                i++;
            }
            j++;
        }
        return a;
    }
    public static void printRes(LinkedList<String>[] l){
        for(LinkedList<String> str: l){
            for(String ans: str){
                System.out.print(ans);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int row = in.nextInt();
        int n = s.length();
        printRes(sol(s, n, row));
        in.close();
     }
}
