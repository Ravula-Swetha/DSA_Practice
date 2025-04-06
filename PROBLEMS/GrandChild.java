/* write a program to count the GrandChild/Child for given name 

Assume the relations here limit only to child and grandChild only 

All the inputs will be given in lower case characters(a-z) and are valid relations 

The first line of input consists of number of relations followed by child name and fathers name 
seperated by ',' 
followed by a name. 

Where the first string is "Child", second string is "Father".
If the given name is Father print the count of his childrean
If the given name is GrandFather print the count of his GrandChild

Print -1 for any other boundary conditions 

for given input like this

input =
5
kishore,ramesh
dev,gopal
gopal,ramu
srinu,gopal
praveen,ranjit
ramu
output = 2

And given input "ramu" we have to find his no of grandchildren/child
Here "ramu" has one direct child gopal and gopal has 2 children(dev,srinu).
So ramu has 2 grand children dev,srinu. so output is 2

example:2 

input =
5
ranjit,knr
ramesh,pradeep
kittu,ranjit
yogesh,ranjit
praveen,ranjit
knr
output=
3

//given data for knr we need print the count of grand childern. 
here knr direct child ranjit and ranjit has three children   ---- kittu,yogesh,praveen so print 3


input = 
8
a,b
c,b
d,b
f,a
g,a
e,a
m,c
z,d
b
output =
5 */
import java.util.*;

public class GrandChild{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, String> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            String[] s = in.nextLine().split(",");
            h.put(s[0], s[1]);
        }
        String target = in.nextLine();

        List<String> value = new ArrayList<>();
        for(Map.Entry<String, String> entry : h.entrySet()){
            if(target.equals(entry.getValue())){
                value.add(entry.getKey());
                

// System.out.println(" values: " + entry.getKey());
            }
        }

        int c = 0;
        
        
        for(String val : value){
            for(Map.Entry<String, String> entry : h.entrySet()){
                if(val.equals(entry.getValue())){
                    c++;
                    // System.out.println(" grandchildren: " + entry.getKey());
                }
            }
        }
        if(value.size() == 0){ System.out.println("-1"); }
        if(c == 0) System.out.println(value.size());
        else { System.out.println(c); }
        
        in.close();
    }

}