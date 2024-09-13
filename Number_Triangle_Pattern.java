// Java Program to print pattern: Number triangle pattern
package projetc1;

public class Number_Triangle_Pattern {
	
	public static void printPattern(int n) {
		int i,j;
		//Outer loop to print number of rows
		for(i=0;i<n;i++) {
			//Inner loop to print space
			for(j=0;j<n-i;j++) {
				System.out.print(" ");
			} 
			for(j=0;j<i;j++) {
				System.out.print(i+" ");
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
