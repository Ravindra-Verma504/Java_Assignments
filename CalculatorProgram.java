package Calculator;
import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
	      System.out.println("-:calculator:-");
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter first number:-");
	      int num1=scan.nextInt();
	      System.out.println("1.+");
	      System.out.println("2.-");
	      System.out.println("3.*");
	      System.out.println("4.%");
	      System.out.println("5./");
	      System.out.println("Choose number of your sign,what you want do(1 to 5):-");
	      int  chooseNum=scan.nextInt();
	      System.out.println("Enter second number:-");
	      int num2=scan.nextInt();
	      if(chooseNum==1){
	          System.out.println("The Sum of two number is:-"+(num1+num2));
	      }
	      else if(chooseNum==2){
	          System.out.println("The Deffernce of two number is:-"+(num1-num2));
	      }
	      else if(chooseNum==3){
	          System.out.println("The product of two number is:-"+(num1*num2));
	      }
	      else if(chooseNum==4){
	          System.out.println("The Module of two number is:-"+(num1%num2));
	      }
	      else if(chooseNum==5){
	          System.out.println("The Division of two number is " + (num1/num2));
	      }
	      else{
	          System.out.println("Invalid input,Please correct it");
	      }

	}

}
