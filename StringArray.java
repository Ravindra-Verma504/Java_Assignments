package twoDimensionalStringArray;
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int column;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column:-");
		row=sc.nextInt();
		column=sc.nextInt(); 
		System.out.println("Enter the  string value of array:-");
		String[][] name=new String[row][column];
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				name[i][j]=sc.next();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}

	}

}
