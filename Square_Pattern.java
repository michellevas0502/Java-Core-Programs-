//Java program to print pattern:Square hollow pattern
package projetc1;
import java.util.Scanner;

public class Square_Pattern {
	//Function to print pattern
	public static void printPattern(int n) {
		int i,j;
		//Outer loop to handle number of rows
		for( i=0;i<n;i++){
			//Inner loop to handle number of columns
			for(j=0;j<n;j++) {
				// star will print only when  it is in first row or last row or first column or last column
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
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
