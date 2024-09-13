package projetc1;

abstract class Pen1{
	abstract public void write();
	abstract public void refill();
	
}

class Pen2 extends Pen1{
	public void write() {
		System.out.println("Write");	
	}
	public void refill() {
		System.out.println("Refill");
	}
	
}

class FountainPen extends Pen2{
	public void changeNib() {
		System.out.println("change Nib");
	}
}
public class Pen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen obj = new FountainPen();
		obj.write();
		obj.refill();
		obj.changeNib();

	}

}
