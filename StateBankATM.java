package State_bank_ATM;

import java.util.Scanner;

public class StateBankATM {

	public static void main(String[] args) {
		
		System.out.println("Welcome to state bank of ATM");
		System.out.println("1.English");
		System.out.println("2.hindi");
		System.out.println("Choose one option out of two language(1-2):- ");
		Scanner sc=new Scanner(System.in);
		int language =sc.nextInt();
		if (language==1){
			System.out.println("English");
		}
		else if (language==2) {
			System.out.println("Hindi");
		}
		int Amount=30000;
		System.out.println("Enter Your 4 digit password:-");
		int password=sc.nextInt();
		if (password==1234) {
			System.out.println("1.Withdrawal");
			System.out.println("2.Balance Enquary");
			System.out.println("3.Deposit");
			System.out.println("4.Pin change");
			System.out.println("please choose your Transection(1-4):-");
			int Transection=sc.nextInt();
			if (Transection==1) {
				System.out.println("Enter your withdrawalAmount:-");
				int withdrawalAmount=sc.nextInt();
				if ((withdrawalAmount<Amount)&&(withdrawalAmount%100==0)) {
					System.out.println("please take your Amount:-"+withdrawalAmount);
					System.out.println("Your remain balance is:-"+(Amount-withdrawalAmount));
				}
				else {
					System.out.println("Insufficent balance");
				}
			}
			else if(Transection==2) {
				System.out.print("Your available balance is:-");
				System.out.println(Amount);
			}
			else if(Transection==3) {
				System.out.println("Enter your deposit balance:-");
				int Depositbalance=sc.nextInt();
				System.out.println("Your total balance is:-"+(Amount+Depositbalance));
			}
			else if(Transection==4) {
				System.out.println("Enter your 4 digit oldPin:-");
				int oldPin=sc.nextInt();
				System.out.println("Enter your 4 digit newPin:-");
				int newPin=sc.nextInt();
				System.out.println("Your Pin has been sucessfully change");
			}
			else {
				System.out.println("Invalid choose");
			}
		}
		else {
			System.out.println("Worng pin");
		}
	}

}
