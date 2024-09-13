package projetc1;

public class recursion {
//	static void fact(int n) {
//		if(n>0) {
//			System.out.println(n);
//			fact(n-1);
//		}
//	}
	
	static void fact(int n) {
		int a=1;
		for(int i=1;i<n;i++) {
			a=a*i;
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fact(n);

	}

}
