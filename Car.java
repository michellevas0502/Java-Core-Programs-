package projetc1;

public class Car {
	String name;
	String color;
	int price;
	Car(String name,String color, int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car t=new Car("bmw","black",3400);
		Car t1=new Car("jaguar","white",4200);
		System.out.println(t.name);
		System.out.println(t.color);
		System.out.println(t.price);
		System.out.println(t1.name);
		System.out.println(t1.color);
		System.out.println(t1.price);
	}

}
