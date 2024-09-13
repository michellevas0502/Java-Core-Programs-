package projetc1;

class add1{
	public void add() {
		int a=10,b=30;
		int c=a+b;
		System.out.println("The additive result is: "+c);
	}
	public void c() {
		System.out.println("Addition is a maths function");
	}
}

class Subtraction extends add1{
	public void sub() {
		int a=40,b=4;
		int c=a-b;
		System.out.println("The result of subtraction is: "+c);
	}
	public void c() {
		System.out.println("Both addition and subtraction are maths functions");
	}
}

public class Maths_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1 obj=new Subtraction();
		obj.add();
		obj.c();

	}

}
