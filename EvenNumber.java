package evenNumberProgram;
import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a last number:-");
		int lastNumber=sc.nextInt();
		int sum=0;
		int i=0;
		while(i<lastNumber) {
			i+=1;
			if (i%2==0) {
				System.out.println("\nThe Even number is:-"+ i);
				sum+=i;
			}
		}
		System.out.println("The Sum of even number:-"+sum);
	}

}
