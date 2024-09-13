
package projetc1;

import java.util.Scanner;

public class Student {
	String name;
	String std;
	String div;
	int rollNo;
	String fathers_name;
	String mothers_name;
	
	void data(String n,String s,String d,int r,String f,String m) {
		name=n;
		std=s;
		div=d;
		rollNo=r;
		fathers_name=f;
		mothers_name=m;
	}
	
	void display() {
		System.out.println("Students Name: "+name);
		System.out.println("Students Class: "+std);
		System.out.println("Students Division: "+div);
		System.out.println("Students RollNo: "+rollNo);
		System.out.println("Students Fathers Name: "+fathers_name);
		System.out.println("Students Mothers Name: "+mothers_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Student obj = new Student();
		obj.data("Michelle Vas", "BE", "A", 31071, "Jerson Vas", "Anilda Vas");
		obj.display();
		
	}

}
