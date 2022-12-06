import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        Stack<String> Name=new Stack<String>();//last in fist out
        Name.push("Ravi");
        Name.push("Ravindra");
        Name.push("Rohit");

        System.out.println(Name);
        Name.pop();
        System.out.println(Name);
        Iterator<String> itr=Name.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
