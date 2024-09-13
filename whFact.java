package projetc1;
import java.util.Scanner;
public class whFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int i=1;
		int fact=1;
		while(i<=n) {
			fact = fact*i;
			System.out.println(fact);
			i++;
			
		}
		}

}
