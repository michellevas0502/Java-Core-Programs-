package projetc1;
class MyThr1 extends Thread{
	public MyThr1(String name) {
		super(name);
	}
	public void run() {
		int i=0;
//		while(i<=2) {
			System.out.println("I am a thread");
			System.out.println("Thank you: "+ this.getName());
//		}
	}
}
public class threadpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr1 t1= new MyThr1("michelle1");
		MyThr1 t2= new MyThr1("michelle2");
		MyThr1 t3=new MyThr1("michelle3");
		MyThr1 t4=new MyThr1("michelle4");
		MyThr1 t5=new MyThr1("michelle5 (most Important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);

//		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	

	}

}
