package Exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayindexoutofbound
		
		try {
			int[] numarray=new int[5];
			numarray[7]=500;
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		finally {
			System.out.println("I am in finally block");
		}
		
	}

}
