package projetc1;

public class MethodObj {
	int logic(int x,int y) {
		int z;
		if(x>y) {
			z=(x+y);
		}
		else {
			z=(x+y)*5;
		}
		return z;
	}

	public static void main(String[] args) {
		
		//method invocation using object creation
		MethodObj obj = new MethodObj();
		
		int a=10;
		int b=20;
		int c;
		c = obj.logic(a, b);
		System.out.println(c);
		
		int a1=20;
		int b1=4;
		int c1;
		c1 = obj.logic(a1, b1);
		System.out.println(c1);
	}

}
