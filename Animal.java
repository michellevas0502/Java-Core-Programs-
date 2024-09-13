package projetc1;

public class Animal {
	String color;
	int age;
	void data(String c, int a) {
		color=c;
		age=a;
	}
	
	void diaplay() {
		System.out.println(color+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Animal();
		obj.data("red",2);
		obj.diaplay();

	}

}
