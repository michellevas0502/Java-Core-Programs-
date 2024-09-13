package projetc1;

class H1 implements Runnable{
	public void run() {
		System.out.println("I am rolling chapatis");
	}
}

class H2 implements Runnable{
	public void run() {
		System.out.println("I am sweeping the floor");
	}
}

class H3 implements Runnable{
	public void run() {
		System.out.println("I am listening to music");
	}
}

class H4 implements Runnable{
	public void run() {
		System.out.println("I am Talking to my mum");
	}
}
public class Mutitasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A woman plays multiple roles");
		H1 ob1=new H1();
		Thread oo1=new Thread(ob1);
		
		H2 ob2=new H2();
		Thread oo2=new Thread(ob2);
		
		H3 ob3=new H3();
		Thread oo3=new Thread(ob3);
		
		H4 ob4=new H4();
		Thread oo4=new Thread(ob4);
		
		oo1.start();
		oo2.start();
		oo3.start();
		oo4.start();
	}

}
