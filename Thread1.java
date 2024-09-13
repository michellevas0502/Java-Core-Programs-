package projetc1;

class MyThread1 implements Runnable{
	public void run() {
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
		System.out.println("This is a thread of class 1");
	}
}

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		System.out.println("This is a thread of class 2");
		
	}
}

class MyThread3 implements Runnable{
	public void run() {
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
		System.out.println("This is a thread of class 3");
	}
}

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 obj1=new MyThread1();
		Thread o1=new Thread(obj1);
		
		MyThread2 obj2=new MyThread2();
		Thread o2=new Thread(obj2);
		
		MyThread3 obj3=new MyThread3();
		Thread o3=new Thread(obj3);
		
		o1.start();
		o2.start();
		o3.start();

	}

}
