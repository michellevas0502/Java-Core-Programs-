package projetc1;
import java.util.Scanner;

public class Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking iout from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		boolean b = sc.hasNextInt();
		
		System.out.println(b);
	}

}
