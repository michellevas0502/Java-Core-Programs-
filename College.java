package projetc1;

public class College {
	String name;
	String fathers_name;
	String surname;
	int mobile_no;
	int Roll_No;
	String std;
	String div;
	String subj;
	
	College(String name,String fathers_name,String surname,int mobile_no,int Roll_No,String std,String div,String subj){
		this.name=name;
		this.fathers_name=fathers_name;
		this.surname=surname;
		this.mobile_no=mobile_no;
		this.Roll_No=Roll_No;
		this.std=std;
		this.div=div;
		this.subj=subj;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj=new College("michelle","jerson","vas",911234316,31071,"BE","A","Full Stack Java");
		System.out.println(obj.name);
		System.out.println(obj.fathers_name);
		System.out.println(obj.surname);
		System.out.println(obj.mobile_no);
		System.out.println(obj.Roll_No);
		System.out.println(obj.std);
		System.out.println(obj.div);
		System.out.println(obj.subj);
	}

}
