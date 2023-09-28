package ATMP;
import p1.*;
import java.util.*;

public class Atm {

	public static void main(String[] args) {
		int pin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin:");
		pin=sc.nextInt();
		User u = new User();
		if(pin == 1111 || pin == 2222 || pin == 3333) {
			u.screen(pin);
		}
		else {
			for(int i=0;i<2;i++) {
				System.out.println("Enter pin again");
				pin=sc.nextInt();
				if(pin == 1111 || pin == 2222 || pin == 3333) {
					u.screen(pin);
					break;
				}
			}
			if(pin != 1111 || pin == 2222 || pin == 3333) {
			System.out.println("Invalid pin!! Thanks");}
		
		}
		System.out.println("Thanks Visit Again !!");
		
		
	}

}
