package projetc1;

import java.util.Scanner;

public class Prime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int i,flag=0;
		
		if(n<=1) {
			System.out.println(n+" is not a prime number");
		}
		else {
			for( i=2;i<n;i++) {
				if(n%i==0) {
					flag=1;
				}
			}
		}
		
		if(flag==0) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		

	}

}
