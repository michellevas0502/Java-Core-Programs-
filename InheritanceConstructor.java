package projetc1;

class Base1{
	Base1(){
		System.out.println("I am a Constructor");
	}
	Base1(int x){
		System.out.println("I am an overloaded Constructor with value of x as: "+x);
	}
}

class Derived1 extends Base1{
	Derived1(){
	super(12);
		System.out.println("I am a derived class constructor");
	}
	Derived1(int x,int y){
		super(x);
		System.out.println("I am an overloaded constructor of derived class with value of y as: "+y);
	}
}

class ChildOfDerived extends Derived1{
	ChildOfDerived(){
		super(3,6);
		System.out.println("I m a child of derived class");
	}
	ChildOfDerived(int x,int y,int z){
		super(x,y);
		System.out.println("I am an overloaded constructor of child of derived class with value of z as: "+z);	
	}
}

public class InheritanceConstructor {

	public static void main(String[] args) {
		Base1 b=new Base1();
		Derived1 d=new Derived1();
		ChildOfDerived c=new ChildOfDerived();
		
	}


}
