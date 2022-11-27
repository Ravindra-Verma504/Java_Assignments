package factorialCodeEx;
import java.util.Scanner;
public class FactorialCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial:-");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of number:-"+fact);

	}

}
