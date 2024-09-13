package projetc1;
import java.util.Scanner;

public class methodTry {
	static void t(int a) {
		int res=a;
		System.out.println("I am "+res+" years old");
	}
	
	static void t(int a,int b) {
		int res1 = a;
		int res2 = b;
		System.out.println("I am "+res1+" years old."+" My brother is "+res2+" years old.");
	}
	
	float area(double pi, float r) {
		float res = (float) (2*pi*r*r);
		System.out.println("Area of the circle is: "+res);
		return res;
	}
	
	int area(int l, int b, int h) {
		int res = l*b*h;
		System.out.println("The area of the rectangle is: "+res);
		return res;
	}
	
    static int age(int x) {
		
		if(x>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	    return x;
	}
    
     static int fibonacci(int n) {
    	 int a=0;
 		int b=1;
 		int sum;
 		System.out.print("The series are: ");
 		int i=0;
 		while(i<=n) {
 			System.out.print(a+" ");
 			sum=a+b;
 			a=b;
 			b=sum;
 			i++;
    	
    	    }
    	   return a; 
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		t(20);
		t(20,16);
		
		methodTry obj = new methodTry();
		System.out.println(obj.area(3.14, 2));
		System.out.println(obj.area(2, 3, 4));
		
		
		System.out.println("Enter your age: ");
		int a = sc.nextInt();
		int c = age(a);
		
		System.out.println("Enter the number: ");
		int y = sc.nextInt();
		int z =fibonacci(y);
		
		
		
	}

}
