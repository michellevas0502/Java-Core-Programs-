package projetc1;

import java.util.Scanner;

public class Book {
	private static final String String = null;
	String bookname;
	String author;
	String publisher;
	int no_of_pages;
	
	
	void name(String n) {
		bookname=n;
	}
	void author(String t) {
		author=t;
	}
	void publisher(String u) {
		publisher=u;
	}
	void pages(int r) {
		no_of_pages=r;
	}

	void display() {
		System.out.println("Name of the book: "+bookname);
		System.out.println("Name of the author: "+author);
		System.out.println("Name of the publisher: "+publisher);
		System.out.println("Nummber of pages: "+no_of_pages);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the book: ");
		String n=sc.nextLine();
		System.out.println("Enter the name of the author: ");
		String t=sc.nextLine();
		System.out.println("Enter the name of the publisher: ");
		String u=sc.nextLine();
		System.out.println("Enter the no of pages: ");
		int r=sc.nextInt();
		Book obj = new Book();
		
		obj.name(n);
		obj.author(t);
		obj.publisher(u);
		obj.pages(r);
		obj.display();
	}

}
