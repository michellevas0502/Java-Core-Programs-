package projetc1;

class A1
{
	void eat() {
		System.out.println("I am eating");
	}
}

class Dog extends A1{
	void run() {
		System.out.println("I aam running");
	}
}
public class Ani {
	public static void main(String[] args) {
		
//		Animal a=new Animal();
//		a.eat();
		
		Dog d=new Dog();
		d.eat();
		d.run();
	}
}
