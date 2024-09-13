package projetc1;

class MyThreadRunnable1 implements Runnable{
	public void run() {
		System.out.println("I am in thread 1");
		System.out.println("I am not a threat 1");
		System.out.println("I am in thread 1");
		System.out.println("I am not a threat 1");
		System.out.println("I am in thread 1");
		System.out.println("I am not a threat 1");
	}
}

class MyThreadRunnable2 implements Runnable{
	public void run() {
		System.out.println("I am in thread 2");
		System.out.println("I am not a threat 2");
		System.out.println("I am in thread 2");
		System.out.println("I am not a threat 2");
		System.out.println("I am in thread 2");
		System.out.println("I am not a threat 2");
	}
}
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable1 bullet1=new MyThreadRunnable1();
		Thread gun1 = new Thread(bullet1);
		
		MyThreadRunnable2 bullet2=new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();

	}

}
