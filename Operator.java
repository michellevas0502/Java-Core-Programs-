package projetc1;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		if(a>b && b<a) {
			System.out.println("Condition of Logical AND is satisfied");
		}
		else {
			System.out.println("Condition of Logical AND is not satisfied");
		
		}
		
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();
		
		System.out.println("Enter the value of d: ");
		int d = sc.nextInt();
		
		if(c>d && c<d) {
			System.out.println("Condition of Logical AND is satisfied");
		}
		else {
			System.out.println("Condition of Logical AND is not satisfied");
		}
	}

}
