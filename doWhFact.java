package projetc1;
import java.util.Scanner;

public class doWhFact {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int i=1;
		int fact=1;
		do {
			fact = fact*i;
			System.out.println(fact);
			i++;
		}
		while(i<=n);
		
	}

}
