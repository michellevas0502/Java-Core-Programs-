package projetc1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int a[] =new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2]= 60;
//		a[3] = 30;
//    	a[4] = 40;
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
//		int b[] = {10,20,30};
//		System.out.println(b[0]);
//		System.out.println(b[1]);
		
		int num[] = new int[10];
		int average = 0;
		int i = 0;
		int sum = 0;
		
		for(i=0;i<5;i++) {
			System.out.println("Enter a number: ");
			num[i] = sc.nextInt();
			
			sum=sum+num[i];
			System.out.println("Sum= "+sum);
		}
		average = sum/5;
		System.out.println("Average= "+average);
		
	}

}
