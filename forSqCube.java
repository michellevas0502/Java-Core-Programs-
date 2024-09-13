package projetc1;
import java.util.Scanner;

public class forSqCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			int b=i*i;
			System.out.println(b);
			int c=i*i*i;
			System.out.println(c);
			
		}
	}

}
