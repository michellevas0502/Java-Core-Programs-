package projetc1;

interface Bicycle{
	int a=45;
	//we can make properties
	void applyBreak(int decreement);
	void speedUp(int increement);
	//we can create multiple interface
}

class Avancycle implements Bicycle{
	void horn () {
		System.out.println("Hello please....");
	}
	
	@Override
	public void applyBreak(int decreement) {
		System.out.println("Apply Break");
	}
	
	@Override
	public void speedUp(int increement) {
		System.out.println("Increase Speed");
	}
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avancycle obj=new Avancycle();
		obj.applyBreak(1);
		obj.horn();
		System.out.println(obj.a);
		obj.speedUp(12);
		

	}

}
