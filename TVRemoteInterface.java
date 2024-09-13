package projetc1;

interface TVRemote{
	void SwitchOn();
	void Manual();
}

class SmartTVRemote{
	public void SwitchOnAutomaticlly() {
		System.out.println("In a smart TV remote we can switch it on by voice control");
	}
	public void notManually() {
		System.out.println("In a Smart TV Remote Manual implementation is not required");
	}
}

class TV extends SmartTVRemote implements TVRemote{
	public void SwitchOn() {
		System.out.println("Ths is a normal TV remote which has to be operated manually");
	}
	public void Manual() {
		System.out.println("This is a manually operated TV Remote");
	}
}
public class TVRemoteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV obj=new TV();
		obj.SwitchOn();
		obj.Manual();
		obj.SwitchOnAutomaticlly();
		obj.notManually();

	}

}
