package projetc1;

import java.util.Scanner;

public class MatrixRowColumnSum {

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
		System.out.println("Matrix is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println("");
		}
		
		//cal row
		int rowsum[] = new int[row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				rowsum[i] += a1[i][j];
			}
		}
		
		//cal col
		int colsum[] = new int[col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				colsum[j] += a1[i][j];
			}
		}
		
		//result
		System.out.println("Sum of each row: ");
		for(int i=0;i<row;i++) {
			System.out.println("rows: "+rowsum[i]);
		}
		
		System.out.println("Sum of each column: ");
		for(int j=0;j<col;j++) {
			System.out.println("columns: "+colsum[j]);
		}

	}

}
