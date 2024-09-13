package projetc1;

import java.util.Scanner;

public class Percent {

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
		
		if(avg>80 && avg>70) {
			System.out.println("First Class");
		}
	    if(avg<=70  && avg>60) {
			System.out.println("Second Class");
	    }
		else
	     {
	    	System.out.println("Fail");
	    	
	    }
		
	}

}
