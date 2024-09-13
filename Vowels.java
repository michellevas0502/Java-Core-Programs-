package projetc1;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice: ");
		int ch = sc.nextInt();
		
		
		switch(ch) {
		case 1: 
				System.out.println("a");
		break;
		case 2: 
			    System.out.println("e");
	    break;
		case 3: 
			System.out.println("i");
	    break;
		case 4: 
			System.out.println("o");
	    break;
		case 5: 
			System.out.println("u");
	    break;

		default:
			System.out.println("Invalid");
		}
	}

}
