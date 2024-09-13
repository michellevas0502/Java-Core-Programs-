package projetc1;
class Number{
	int num;
	Number(int num){
		this.num = num;
	}
}

class Add1 extends Number{
	int num2;
	
	Add1(int num1,int num2){
		super(num1);
		this.num2=num2;
	}
	
	int add() {
		return num+num2;
	}
}

class subtraction extends Add1{
	int num3;
	int num4;
	subtraction(int num3,int num4){
		super(num3,num4);
		this.num3=num3;
		this.num4=num4;
	}
	int sub() {
		return num3-num4;
	}
}
public class prof {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subtraction add=new subtraction(5,10);
		System.out.println(add.add());
		System.out.println(add.num);
		System.out.println(add.sub());
	}

}
