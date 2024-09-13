package projetc1;
class MyNewThread1 extends Thread{
	public void run() {
		int i=0;
		System.out.println("Thank you 1");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		i++;
	}
}

class MyNewThread2 extends Thread{
	public void run() {
		System.out.println("Thank you 2");
	}
}

class MyNewThread3 extends Thread{
	public void run() {
		System.out.println("Thank you 3");
	}
}
public class thread_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNewThread1 t1=new MyNewThread1();
		MyNewThread2 t2=new MyNewThread2();
		MyNewThread3 t3=new MyNewThread3();
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		t3.start();

	}

}
