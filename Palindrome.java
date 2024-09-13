package projetc1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum=0,temp;
		int n=454;
		temp=n;
		
		while(n>0) {
			r=n%10;//getting remainder
			System.out.println(r);
			sum=(sum*10)+r;
			System.out.println(sum);
			n=n/10;
			System.out.println(n);
		}
		
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");	
		}

	}

}
