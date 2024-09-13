package projetc1;
import java.util.Scanner;
public class wh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int i=0;
		while(i<=10) {
			int c = n*i;
			System.out.println(n+"*"+i+"="+c);
			i++;
		}

	}

}
