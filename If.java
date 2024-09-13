package projetc1;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int a = 10, b = 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.print("True");
		}else {
			System.out.print("Not True");
		}
	}

}
