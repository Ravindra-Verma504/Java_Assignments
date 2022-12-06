package ArrayList;
import java.util.Vector;
import java.util.Iterator;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		Vector v2=new Vector();
		Vector<String> v3=new Vector<String>();
		v3.add("collection");
		v1.add(1);
		v1.add("Vector");
		v2.addAll(v1);
		v2.add(8.9f);
		v2.add(true);
		Iterator itr=v1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
