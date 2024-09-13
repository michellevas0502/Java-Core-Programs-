package projetc1;

public class Prac {
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumRec(n-1);
	}
	
	//fib
	static int fib(int n) {
		if(n==1||n==2) {
			return n-1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	static void mul(int n) {
		for(int i=0;i<10;i++) {
			System.out.format("%dx%d=%d\n", n,i,n*i);
			
		}
	}
	
	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int c=sumRec(2);
		System.out.println(c);
		int d=fib(8);
		System.out.println(d);
		mul(2);
		pattern(9);
		}

}
