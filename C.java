package projetc1;

public class C {
	int a=10;
	static int b=20;
	void add() {
		int g=30, d;
		d=a+b+g;
		System.out.println(d);
	}
	void mul() {
		int e=40, f;
		f=a*b*e;
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C d=new C();
		d.add();
		d.mul();
	}

}
