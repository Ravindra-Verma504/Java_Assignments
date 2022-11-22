package fibonaciSeries;
import java.util.Scanner;
public class FibonaciSeriesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which you want fibonaci series:-");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<n;i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;	
		}
	}

}
