//Java program to print pattern: Number increasing pattern
package projetc1;

public class Number_Increasing_Pattern {
	
	public static void printPattern(int n) {
		int i,j;
		//Outer loop to handle number of rows
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		printPattern(n);

	}

}
