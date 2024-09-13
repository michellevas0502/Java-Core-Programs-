package projetc1;

class A7{
	public int a;
	public int komal() {
		return 4;
	}
	public void exam() {
		System.out.println("I am giving exam of class A");	
	}
}

class B7 extends A7{
	@Override
	public void exam() {
		System.out.println("I am giving exam of class B");
	}
	public void exam2() {
		System.out.println("I m giving exam3 of class B");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B7 obj = new B7();
		obj.exam();
		obj.exam2();
//		A7 obj1 = new A7();
//		obj1.exam();
//		System.out.println(obj1.komal());
//		
	}

}
