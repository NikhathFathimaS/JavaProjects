package p1;

import java.util.Scanner;

public class User {
	public void screen(int pinc) {
		int ip,balance=15000,withdraw,deposit;
		System.out.println("1.Balance");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		Scanner s = new Scanner(System.in);
		ip = s.nextInt();
		switch(ip) {
		case 1:
			System.out.println("Your Balance is "+ balance);
			break;
		case 2:
			System.out.println("Enter Amount to be withdrawn: ");
			withdraw = s.nextInt();
			if(withdraw%100 == 0) {
				balance -=withdraw;
				System.out.println("Your Balance is "+ balance);
			}
			else
			{
				System.out.println("Invalid amount entered!!");
				System.out.println("Your Balance is "+ balance);
			}
			break;
		case 3:
			System.out.println("Enter Amount to be deposited: ");
			deposit=s.nextInt();
			if(deposit%100 == 0) {
				balance += deposit;
				System.out.println("Your Balance is "+ balance);
			}
			else
			{
				System.out.println("Invalid amount entered!!");
				System.out.println("Your Balance is "+ balance);
			}
			break;
		case 4:
			System.out.println("Thanks Visit Again !!");
		System.exit(0);
			
			
			
		}
		
	}

	
}
