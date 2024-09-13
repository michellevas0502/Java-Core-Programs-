package projetc1;
import java.util.Scanner;
public class whEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		while(i<10) {
			System.out.println(i);
			if (i%2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
			i++;
		}
		
	}

}
