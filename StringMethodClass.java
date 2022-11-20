package StringMethods;
import java.util.Scanner;
public class StringMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=new String("Ravindraverma");
		System.out.println(name.charAt(0));
		System.out.println(name.concat("Ravi"));
		System.out.println(name.length());
		System.out.println(name.substring(4));
		System.out.println(name.replace('R','v'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.substring(3, 6));
		System.out.println(name.trim());
		System.out.println(name.indexOf('&'));
		System.out.println(name.isEmpty());
		System.out.println(name.equals("Ravi"));
		System.out.println(name.equalsIgnoreCase("RAVI"));
		
		
	}

}
