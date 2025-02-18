// 1.	Write a Java program to create a text file named "data.txt" and write "Hello, Java!" into it. 


import java.io.FileWriter;
import java.io.IOException;
public class WriteFile{
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello, Java!");
            fw.close();
            System.out.println("Successfully Write!!");
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
}
