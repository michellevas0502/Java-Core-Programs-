package projetc1;

class watch {
	public void showTime() {
		System.out.println("The time is: 12 O clock");
	}
	public void watchOn() {
		System.out.println("Please turn the watch on");
	}
}

class smartWatch extends watch{
	public void connect() {
		System.out.println("We can connect this smartwatch to my mobile...");
	}
	public void watchOn() {
		System.out.println("Please connect ths smartwatch to bluetooth device...");
	}
}
public class Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		watch obj = new smartWatch();
		
		obj.showTime();
		obj.watchOn();
	}

}
