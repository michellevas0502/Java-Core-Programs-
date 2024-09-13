package projetc1;

import java.util.Scanner;

public class Elif {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();
		
		if(a>b && a>x && a>y) {
			System.out.println("Good Morning");
		}
		else if(b>a && b>x && b>y) {
			System.out.println("Good Afternoon");
		}
		else if(x>a && x>b && x>y) {
			System.out.println("Good Evening");
		}
		else if(y>b && y>x && y>a) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("Invalid");
		}
 }
}