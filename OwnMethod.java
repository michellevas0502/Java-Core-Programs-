package projetc1;

public class OwnMethod {
	static int add(int x,int y) {
		int sum=x+y;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c = add(a,b);
		int a1=30;
		int b1=40;
		int c1=add(a1,b1);
		System.out.println(c);
		System.out.println(c1);
	}

}
