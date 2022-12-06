import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("ravi");
        Name.add("raja");
        Name.add("book");

        System.out.println(Name);
        Name.add("Anish");
        System.out.println(Name);
        Name.add(1,"Ram");
        System.out.println(Name);
        Name.add(null);
        Name.add(" ");
        System.out.println(Name);
//        Name.remove(1);
        System.out.println(Name);
        Name.set(2,"Neha");
        System.out.println(Name);
//        System.out.println(Name.get(2));
//        Name.clear();
//        System.out.println(Name);

        Iterator<String> itr=Name.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
