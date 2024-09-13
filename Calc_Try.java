package projetc1;

import java.util.Scanner;

class Calci{
	int add(int a,int b) {
		
		return a+b;
	}
	int subtract(int a,int b) {
		
		return a-b;
	}
	int mult(int a,int b) {
		
		return a*b;
	}
	int div(int a,int b) {
		
		return a/b;
	}
	
}

class M1 extends Calci{
	int sq(int a) {
		
		return a*a;
	}
	int cube(int b) {
		return b*b*b;
	}
}
public class Calc_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		M1 obj=new M1();
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
	
		System.out.println("Enter the choice: ");
		System.out.println("1.Addition ");
		System.out.println("2.Subtraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		System.out.println("5.Square ");
		System.out.println("6.Cube ");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: 
			System.out.println("The sum is: "+obj.add(a,b));
		break;
		case 2:
			System.out.println("The subtraction is: "+obj.subtract(a, b));
		break;
		case 3: 
			System.out.println("The multiplication is: "+obj.mult(a, b));
		break;
		case 4: 
			System.out.println("The division is: "+obj.div(a, b));
			break;
		case 5:
			System.out.println("The result of square is: "+obj.sq(a));
			break;
		case 6:
			System.out.println("The result of cube is: "+obj.cube(b));
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
