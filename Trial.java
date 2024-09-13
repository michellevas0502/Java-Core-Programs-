package projetc1;
import java.util.Scanner;

public class Trial {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int y = sc.nextInt();
		
		if(y%4==0) {
			System.out.println("The year is a Leap Year");
		}
		else {
			System.out.println("The year is not a Leap Year");
		}
	}

}
