/* Ram a english student wants to help a programmer to write the property names in the correct form of mutators and accessors. 
Help Ram to do so.

input = name
size
mutators
mutators
output =
setName(datatype name)
setSize(datatype size)


input = marks
age
mutators
accessor
output = 
setMarks(datatype marks)
datatype getAge()


Help Ram to write the necessary Java code to print the output as shown above.
Assume only 2 properties followed by 2 mutators/accessors



 */
import java.util.*;

public class JavaBeanNotation {    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a1 = in.next();
        String a2 = in.next();
        String f1 = in.next();
        String f2 = in.next();
        
        if(f1.equals("mutators")){
            // setName(datatype name)
            System.out.println("set" + a1.substring(0, 1).toUpperCase() + a1.substring(1, a1.length()) + "(datatype " + a1 + ")");
        }
        else{
             System.out.println("datatype get" + a1.substring(0, 1).toUpperCase() + a1.substring(1, a1.length()));
        }
        if(f2.equals("accessor")){
            //datatype getAge()
            System.out.println("datatype get" + a2.substring(0, 1).toUpperCase() + a2.substring(1, a2.length()));
        }
        else{
             System.out.println("set" + a2.substring(0, 1).toUpperCase() + a2.substring(1, a2.length()) + "(datatype " + a2 + ")");
        }
        in.close();
    }
}

