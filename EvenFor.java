package projetc1;
import java.util.Scanner;
public class EvenFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which multiples that you want to obtain: ");
		int n = sc.nextInt();
		int i, a;
		for(i=1;i<=10;i++)
		{
			a=n*i;
			System.out.println(a);
			
		}
	}
}
