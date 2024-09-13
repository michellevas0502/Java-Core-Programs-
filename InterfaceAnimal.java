package projetc1;

interface Ani_mal{
	//default method
	default void say() {
		System.out.println("Hello this is default method");
	}
	//Abstract Method 
	void bark();
}

class Cat implements Ani_mal{
	@Override
	public  void bark() {
		System.out.println("Dog barks!");
	}
}
public class InterfaceAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.bark();
		obj.say();

	}

}
