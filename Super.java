package projetc1;

class one{
	int a,p,k;
	public int getA(int a) {
		return a;
	}
	
//	public int return_none(){
//		return 1;
//	}
	
	one(int v){
		this.a=v;
	}
	
	one(int x,int y){
		this.p = x;
		this.k = y;
	}
	
	public int getB(int p,int k) {
		return p+k;
	}
}

class second {
	void second(){
//		super(c);
		System.out.println("I am a constructor");
		
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one A=new one(0);
		System.out.println(A.getA(5));
		System.out.println(A.getB(12,3));
//		second B=new second();
//		B.second();
		
//		System.out.println(B.getB(3, 3));
		

	}

}
