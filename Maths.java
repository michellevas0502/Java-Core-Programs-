package projetc1;

class Mathematics{
	void add() {
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
}

class Maths2 extends Mathematics{
	void multiply() {
		int a=20,b=10;
		int c=a*b;
		System.out.println(c);
	}
}

class Square extends Maths2{
	int a=2;
	int s() {
		return a*a;
	}
	int c() {
		return a*a*a;
	}
}


public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square obj=new Square();
		obj.add();
		obj.multiply();
		
		System.out.println(obj.s());

		System.out.println(obj.c());

	}

}
