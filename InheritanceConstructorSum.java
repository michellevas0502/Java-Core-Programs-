package projetc1;

class Sum {
    Sum(){
		System.out.println("I am addition");
	}
    Sum(int a){
    	System.out.println("I am addition with the value of a: "+a);
    }
}

class Subs extends Sum{
	Subs(){
		//If you want to access sum class constructor with value then use super keyword
		//if you do not use super(0) then constructor prints null value
		//super(10);
		System.out.println("I am Subs");
	}
	Subs(int a, int b){
		super(a);
		System.out.println("I am Subs with the value of b: "+b);
	}
}

class Mul extends Subs{
	Mul(){
		System.out.println("I am Mul");
	}
	Mul(int a,int b,int c){
		super(a,b);
		System.out.println("I am multiplication with the value of c: "+c);
	}
}

public class InheritanceConstructorSum {
	public static void main(String[] args) {
//		Sum  s=new Sum();
//		Sum  s1=new Sum(10);
//		Subs obj=new Subs();
//		Subs obj1=new Subs(3,2);
//		Mul m=new Mul();
		Mul m1=new Mul(12,13,2);
	}

}
