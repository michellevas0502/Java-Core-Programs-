package projetc1;

public class method1 {
	
	static int  logic(int x, int y) {
		int z;
		if(x>y) {
			z = x+y;
		}
		else {
			z = (x+y)*5;
		}
//		x=566;
		return z;
		//if we change the value of x
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=logic(a,b);
		int a1=20;
		int b1=15;
		int c1=logic(a1,b1);
		System.out.println(c);
		System.out.println(c1);
	}

}
