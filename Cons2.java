package projetc1;

public class Cons2 {
	String name="michelle";
    int emp_id=101;
    
    Cons2(String name, int emp_id){
    	this.name=name;
    	this.emp_id=emp_id;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons2 e1=new Cons2("michelle",101);
		Cons2 e2=new Cons2("cara",102);
		System.out.println(e1.name);
		System.out.println(e1.emp_id);
		System.out.println(e2.name);
		System.out.println(e2.emp_id);
		

	}

}
