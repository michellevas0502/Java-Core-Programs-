package projetc1;
class myThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("I am Thread no: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class thread_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread obj=new myThread();
		obj.start();
		try {
			obj.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
