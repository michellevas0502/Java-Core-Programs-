package projetc1;
import java.util.Scanner;
public class SI_wh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int si = 0;
		while(si<100) {
			System.out.println("Enter the value of p: ");
			int p = sc.nextInt();
			System.out.println("Enter the value of r: ");
			int r = sc.nextInt();
			System.out.println("Enter the value of t: ");
			int t = sc.nextInt();
			si = p*r*t/100;
			System.out.println(si);
			si++;
		}
	}

}
