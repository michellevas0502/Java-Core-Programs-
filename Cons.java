package projetc1;

public class Cons {
	//String name="Michelle";
	//int ep_id=101;
	
	String name;
	int emp_id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons e1 = new Cons();
		//o/p default values e1 name=null emp_id=0;
		
		e1.name="michelle";
		e1.emp_id=101;
		
		Cons e2=new Cons();
		e2.name="cara";
		e2.emp_id=102;
		
		System.out.println(e1.name);
		System.out.println(e1.emp_id);
		System.out.println(e2.name);
		System.out.println(e2.emp_id);
	}

}
