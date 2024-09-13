package projetc1;

interface Bicycle1{
	int a=45;
	//we can make properties
	void applyBreak(int decreement);
	void speedUp(int increement);
	//we can create multiple interface
}

interface hornBicycle1{
	int a=45;
	//we can make properties
	void horn1();
	void horn2();
	//we can create multiple interface
}

class AdvCycle implements Bicycle1,hornBicycle1{
	void horn() {
		System.out.println("Hello Please......");
	}
	
	@Override
	public void applyBreak(int increement) {
		System.out.println("Apply Break");
	}
	
	@Override
	public void speedUp(int increement) {
		System.out.println("Apply Speed");
	}
	public void horn1(){
		System.out.println("Play Music");
	}
	public void horn2() {
		System.out.println("Play instrument music");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCycle obj=new AdvCycle();
		obj.horn1();
		obj.horn2();

	}

}
