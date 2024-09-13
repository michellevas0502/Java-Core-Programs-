package projetc1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		
		int [][] a1 = new int[row][col];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Mtrix is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
