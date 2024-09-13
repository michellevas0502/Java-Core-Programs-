package projetc1;

import java.util.Scanner;

public class ModMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		int [][] a1 = new int[row][col];
		int [][] a2 = new int[row][col];
		
		System.out.println("Enter the elements of the first matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix 1: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Enter the elements of the second matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix 2: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println("");
		}
		
		//Sum of two matrix
		int [][] mod = new int[row][col];
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				mod[i][j] = a1[i][j]%a2[i][j];
			}
		}
		
		System.out.println("Mod of two matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mod[i][j]);
			}
			System.out.println("");
		}

	}

}
