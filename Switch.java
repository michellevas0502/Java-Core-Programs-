package projetc1;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice: ");
		System.out.println("1.Addition ");
		System.out.println("2.Subtraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		int ch = sc.nextInt();
		
		System.out.println("Enter the the value of the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the the value of the second number: ");
		int b = sc.nextInt();
		
		int c;
		
		switch(ch) {
		case 1: c=a+b;
				System.out.println("The sum is: "+c);
		break;
		case 2: c=a-b;
			    System.out.println("The subtraction is: "+c);
		break;
		case 3: c=a*b;
			System.out.println("The multiplication is: "+c);
		break;
		case 4: c=a/b;
		System.out.println("The division is: "+c);
	break;
		default:
			System.out.println("Invalid");
		}
	}

}
