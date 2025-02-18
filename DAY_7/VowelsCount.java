package DAY_7;

public class VowelsCount {
    public static int count(String s, int n){
        String vowels = "aeiou";
        int c = 0;
        for(int i = 0; i < n; i++){
            if(vowels.contains(s.substring(i, i+1))){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
       String s = "DataStructure";
       int n = s.length();
       int v = count(s, n);
       int con = n-v;
       System.out.println("Vowels: " + v + " Consonents: " + con);
    }
}
