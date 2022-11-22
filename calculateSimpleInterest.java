package calculateSimpleInterest;
import java.util.Scanner;
public class calculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:-");
    int n=sc.nextInt();
    System.out.println("Enter principle,Rate of Interest,Time:-");
    int array[]=new int[n];
    int product=0;
    for(int i=0;i<n;i++) {
    	array[i]=sc.nextInt();
    	
    }
    System.out.println("Arrays values are:-");
    for(int i=0;i<n;i++) {
		System.out.println(array[i]);
//		product=array[0]*array[1]*array[2];
    }
    product=array[0]*array[1]*array[2];
    System.out.println("\nThe Simple interest is:-"+(product/100));
	}

}
