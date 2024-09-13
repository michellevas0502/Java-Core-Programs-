package projetc1;
import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking input from user: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		float a = sc.nextFloat();
		
		System.out.println("Enter the number: ");
		float b = sc.nextFloat();
		
		float c = a-b;
		System.out.println("The subtraction is: "+c);
	}

}
