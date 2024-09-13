package projetc1;

class Calc{
	int add() {
		int a=10,b=30;
		return a+b;
	}
	int subtract() {
		int a=40,b=23;
		return a-b;
	}
	int mult() {
		int a=55,b=10;
		return a*b;
	}
	int div() {
		int a=44,b=4;
		return a/b;
	}
	
}

class M extends Calc{
	int sq() {
		int a=5;
		return a*a;
	}
	int cube() {
		int b=9;
		return b*b*b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M obj=new M();
		System.out.println("This is a calcultor: ");
		System.out.println("The result of addition is: "+obj.add());
		System.out.println("The result of subtraction is: "+obj.subtract());
		System.out.println("The result of multiplication is: "+obj.mult());
		System.out.println("The result of division is: "+obj.div());
		System.out.println("The result of square is: "+obj.sq());
		System.out.println("The result of cube is: "+obj.cube());
	}

}
