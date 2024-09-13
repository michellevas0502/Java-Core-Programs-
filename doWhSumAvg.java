package projetc1;
import java.util.Scanner;
public class doWhSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int sum=0;
		do {
			System.out.println("Enter value of a: ");
			int a = sc.nextInt();
			System.out.println("Enter value of b: ");
			int b = sc.nextInt();
			System.out.println("Enter value of c: ");
			int c = sc.nextInt();
			
			sum = a+b+c;
			System.out.println("Sum is: "+sum);
			int avg=sum/3;
			System.out.println("The average is: "+avg);
			sum++;
		}
		while(sum<=100);

	}

}
