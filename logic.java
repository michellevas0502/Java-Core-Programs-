package projetc1;
import java.util.Scanner;
public class logic {

	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a: ");
			int a = sc.nextInt();
			
			System.out.println("Enter the value of b: ");
			int b = sc.nextInt();
			
			
			boolean c=(a==b);
			System.out.println(c);
			
			boolean d=(a>b && b<a);
			System.out.println("AND Condition is satisfied");
			
			boolean e=(a>b||b>a);
			System.out.println("OR Condition is satified");
			
			boolean f=(!(a>b));
			System.out.println("NOT Condition is satisfied");
			
			
	}
}
