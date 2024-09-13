package projetc1;

import java.util.Scanner;

public class MethodAge {
	static int age(int x) {
		
		if(x>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int a = sc.nextInt();
		int c = age(a);
		

	}

}
