//153: 13 + 53 + 33 = 1 + 125+ 27 = 153
package projetc1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int temp=n;
		
		int r,sum=0,cube;
		
		while(n>0) {
			r=n%10;
			System.out.println(r);
			sum=sum+(r*r*r);
			System.out.println(sum);
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("It is Armstrong ");
		}
		else {
			System.out.println("It is not Armstrong");
		}
	}
	

}
