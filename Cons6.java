package projetc1;

public class Cons6 {
	String name;
	int emp_id;
	Cons6(String name, int emp_id){
		this.name=name;
		this.emp_id=emp_id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons6 e1=new Cons6("michelle",101);
		Cons6 e2=new Cons6("cara",102);
		System.out.println(e1.name+" "+e1.emp_id);
		System.out.println(e2.name+" "+e2.emp_id);
	}

}
