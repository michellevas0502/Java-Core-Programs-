package projetc1;
import java.util.Scanner;

public class Switch_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. Even or Odd ");
		System.out.println("2. Numbers from 1 to 10");
		System.out.println("3. Leap Year");
		System.out.println("4. Eligibility to Vote");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			if(n%2 ==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
			break;
		case 2:
			int i;
			for(i=0;i<=10;i++) {
				System.out.println(i);
			}
			break;
		case 3:
			System.out.println("Enter the year: ");
			int y = sc.nextInt();
			if(y%4 == 0) {
				System.out.println("It is a Leap Year");
			}
			else {
				System.out.print("It is not a leap year");
			}
			break;
		case 4:
			System.out.println("Enter the age: ");
			int a = sc.nextInt();
			if(a>18) {
				System.out.println("You are eligible to vote");
			}
			else {
				System.out.println("You are not eligible to vote");
			}
			break;
		default:
			System.out.println("Invalid");
		}
				

	}

	

}
