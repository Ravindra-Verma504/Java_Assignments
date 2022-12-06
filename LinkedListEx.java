import java.util.*;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> Name=new LinkedList<String>();

        Name.add("Ravi");
        Name.add("Ravindra");
        Name.add("Rohit");

//        System.out.println(Name);
        Name.addFirst("Misti");
        Name.addLast("Love");
//        System.out.println(Name);
        Name.add(2,"Aakash");
//        System.out.println(Name);
//        Name.removeFirst(); //it remove begin eliments.
//        Name.removeLast(); //it remove last eliments.
        System.out.println(Name);
        for(String str:Name)
        {
            System.out.println(str);
        }
    }
}
