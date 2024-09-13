package projetc1;

public class inheritance_single {
	protected String brand = "Ford";
	  public void honk() {
	    System.out.println("Tuut, tuut!");
	  }
	}

	class Y extends inheritance_single {
	  private String modelName = "Mustang";
	  
	  public static void main(String[] args) {
	    Y myFastCar = new Y();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	
	  }}




