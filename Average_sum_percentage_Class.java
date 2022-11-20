package Average_sum_percentage;
import java.util.Scanner;
public class Average_sum_percentage_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of subject's marks:-");
		int n=sc.nextInt();
		System.out.println("Enter the marks of subjects in one subject");
		int array[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Arrays values are:-");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
			sum+=array[i];
		}
		System.out.println("\nThe sum of student's marks:-"+sum);
		System.out.println("\nThe total number all subjects:-"+(n*100));
		System.out.println("\nThe Average of student's marks:-"+(sum/n));
		System.out.println("\nThe percentage of students marks:-"+((sum*100)/(n*100))+"%");

	}

}
