

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fr.close();
            System.out.println("Successful Read!!");
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
}
