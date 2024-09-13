package projetc1;

import java.util.Scanner;

public class method2 {
	static void f(int a) {
		int res1=a;
		System.out.println("Good Morning "+res1+" !");
	}
	
	static void f(int a,int b) {
		int res2=a*b;
		System.out.println(res2);
	}
	
	static void f(int a,int b, int c) {
		int res3=a*b*c;
		System.out.println(res3);
	}
	
	int sum(int a,int b) {
		return a*b;
	}
	
	int sum(int p,int r,int t) {
		return p*r*t/100;
	}
	
	int sum(int sq) {
		return sq*sq;
	}
	
	static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	
	static void avg(int a,int b, int c) {
		int res = a+b+c;
		int avg = res/3;
		System.out.println("The sum is: " + res);
		System.out.println("The avg is: "+avg);
		if(avg>16) 
			System.out.println("Avg is greater");
		else
			System.out.println("Avg is smaller");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		f(2);
		f(2,2);
		f(2,2,2);
		method2 obj = new method2();
		System.out.println(obj.sum(3,4));
		System.out.println(obj.sum(2000,3,10));
		System.out.println(obj.sum(9));
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter the value of a: ");
		int  x= sc.nextInt();
		System.out.println("Enter the value of b: ");
		int  y= sc.nextInt();
		System.out.println("Enter the value of z: ");
		int  z= sc.nextInt();
		avg(x,y,z);

	}

}
