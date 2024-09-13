package projetc1;
import java.util.Scanner;

public class whPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		while(sum<100) {
			System.out.println("Enter value of a: ");
			int a = sc.nextInt();
			System.out.println("Enter value of b: ");
			int b = sc.nextInt();
			System.out.println("Enter value of c: ");
			int c = sc.nextInt();
			
			 sum = a+b+c;
			System.out.println("Sum is: "+sum);
			sum++;
		}
		
	}

}
