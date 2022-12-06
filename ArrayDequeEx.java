import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> Name= new ArrayDeque<String>();

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
