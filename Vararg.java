package projetc1;

public class Vararg {
	
	static int add(int ...array) {
		int res=0;
		for(int a:array) {
			res = res+a;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,6));

	}

}
