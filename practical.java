package projetc1;

import java.util.Scanner;

public class practical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Physics marks: ");
		int physics=sc.nextInt();
		
		System.out.println("Enter your English marks: ");
		int english=sc.nextInt();
		
		System.out.println("Enter your Chemistry marks: ");
		int chemistry=sc.nextInt();
		
		float percentage=((physics+english+chemistry)/500.0f)*100;
		
		System.out.println("Percentage: "+percentage);
	}

}
