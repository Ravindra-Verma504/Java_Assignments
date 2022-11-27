package Exception;

public class nestedtryex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int num1[]=new int[2];
//			num1[3]=10;
			try {
				int num=45/0;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			int num1[]=new int[2];
			num1[3]=10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
