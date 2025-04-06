import java.util.*;

class EveryAlp{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = in.nextLine();
        }

        boolean flag = true;
        String letters = "abcdefghijklmnopqrstuvwxyz ";
        for(int j = 0; j < n; j++){
            flag = true;
            for(int i = 0; i < 26; i++){
                if(!s[j].contains(letters.substring(i, i+1)))
                {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("1");
            else System.out.println("-1");
        }
        in.close();
    }
}