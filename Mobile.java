package projetc1;

class Mob1 {
	public void call() {
		System.out.println("Calling takes place here");
	}
	public void on() {
		System.out.println("Turn on M1");
	}
}

class SM extends Mob1{
	public void con() {
		System.out.println("Since it is a Smart Phone connect to bluetooth");
	}
	public void on() {
		System.out.println("Turn on SM");
	}
}
public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mob1 obj=new SM();
		obj.call();
		obj.on();
	}

}
