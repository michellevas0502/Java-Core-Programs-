package projetc1;
import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		System.out.println("Enter the fourth number: ");
		int d = sc.nextInt();
		System.out.println("Enter the fifth number: ");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		System.out.println("The sum is: "+sum);
		
		int avg = (a+b+c+d+e)/5;
		System.out.println("The average is: "+avg);
		
		// Formula one
		
		int f1 = ((b*b)-(4*a*c))/(2*a);
		System.out.println("The result is: "+f1);
		
		//Simple interest
		System.out.println("Enter p: ");
		int p = sc.nextInt();
		System.out.println("Enter r: ");
		int r = sc.nextInt();
		System.out.println("Enter t: ");
		int t = sc.nextInt();
		
		int SI = (p*r*t)/100;
		System.out.println("Simple Interest is: "+SI);
		
		//Formula 3
		System.out.println("Enter l: ");
		int l = sc.nextInt();
		
		System.out.println("Enter h: ");
		int h = sc.nextInt();
		
		int f3 = (l*b)+(b*h)+(h*l);
		System.out.println("Result is: "+f3);

	}

}
