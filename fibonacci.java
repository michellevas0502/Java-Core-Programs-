package projetc1;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int a=0;
		int b=1;
		int sum;
		System.out.print("The series are: ");
		int i=0;
		while(i<=n) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
			i++;
		}
		
	}

}
