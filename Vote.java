package projetc1;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("You are Eligible to vote!!!");
		}
		else {
			System.out.println("You are not Eligible to vote.");
		}

	}

}
