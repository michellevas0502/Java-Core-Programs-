package projetc1;

interface BasicAnimal{
	
	void eat();
	void sleep();
}

class Monkey{
	void jump() {
		System.out.println("Monkey jumps in this class");
	}
	void bite() {
		System.out.println("Monkey bites in this class");
	}
}


class Human extends Monkey implements BasicAnimal{
	public void eat() {
		System.out.println("Every Animal eats");
	}
	public void sleep() {
		System.out.println("Every Animal sleeps");
	}
	public void bite() {
		System.out.println("Every animal including monkey bites");
	}
}
public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.eat();
		obj.sleep();
		obj.jump();
		obj.bite();

	}

}
