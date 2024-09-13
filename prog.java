package projetc1;

public class prog {
	int r=3;
	void SI() {
		int p=5, t=4;
		int res = p*r*t/100;
		System.out.println(res);
	}
	void aoc() {
		double pi=3.14; 
		double area = 2*pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog obj = new prog();
		obj.SI();
		obj.aoc();
	}

}
