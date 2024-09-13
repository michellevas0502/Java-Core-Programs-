package projetc1;

class V1 {
	  protected String brand = "Ford";
	  public void honk() {
	    System.out.println("Tuut, tuut!");
	  }
	}


class C1 extends V1 {
	   String modelName = "Mustang";
	  
}

public class Vehicle{
	public static void main(String[] args) {
	    C1 myFastCar = new C1();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
}