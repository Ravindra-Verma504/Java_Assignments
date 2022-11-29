package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		Thread t1=new Thread();
		list.add("Database");
		list.add(5);
		list.add('y');
		list.add(78.6f);
		list.add(t1);
		//transvering the list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
