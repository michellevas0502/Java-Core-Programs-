package projetc1;

class T1 implements Runnable{
	public void  run() {
		for(int i=0;i<10;i++) {
			System.out.println("I am a thread in class 1");
		}
	}
}

class T2 implements Runnable{
	public void run() {
		int j=0;
		while(j<10) {
			System.out.println("I am a thread in class 2");
			j++;
		}
	}
}

class T3 implements Runnable{
	public void run() {
		int k=0;
		do {
			System.out.println("I am a thread in class 3");
			k++;
		}
		while(k<10);
	}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 r1 =new T1();
		Thread ob1=new Thread(r1);
		
		T2 r2=new T2();
		Thread ob2=new Thread(r2);
		
		T3 r3=new T3();
		Thread ob3=new Thread(r3);
		
		ob1.start();
		ob2.start();
		ob3.start();
	}

}
