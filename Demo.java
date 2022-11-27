package twoDimensionArray;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] number=new int[4][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:-");
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				number[i][j]=sc.nextInt();
			}
		}
//		number[0][0]=2;
//		number[0][1]=4;
//		number[1][0]=6;
//		number[1][1]=9;
//		number[2][0]=5;
//		number[2][1]=8;
//		number[3][0]=3;
//		number[3][1]=7;
		System.out.println("My array is:-");
		for(int i=0;i<4;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		} 
					
		
	}

}
