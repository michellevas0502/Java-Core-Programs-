package projetc1;

interface MyCamera{
	void takeSnap();
	void recordVideo();
	private void greet() {
		System.out.println("Good Morning");
	}
	default void record4kVideo() {
		greet();
		System.out.println("Recording in 4k.");
	}
}

interface MyWifi{
	String[] getNetworks();
	void connectToNetwork(String network);
}

class MyCellPhone{
	void callNumber(int phoneNumber) {
		System.out.println("Calling"+phoneNumber);
	}
	void pickCall() {
		System.out.println("Connecting...");
	}
}
 class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
	public void takeSnap() {
		System.out.println("Taking snap");
	}
	public void recordVideo() {
		System.out.println("Taking snap and recording in 4k");
	}
	
	
	public String[] getNetworks() {
		System.out.println("Getting List Of Networks");
		String[] networkList = {"Caress","Sara","Ursella"};
		return networkList;
	}
	public void ConnectToNetwork(String  network) {
		System.out.println("Connecting to "+network);
	}
	@Override
	public void connectToNetwork(String network) {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceCellPhone {
	
	public static void main(String[] args) {
		MySmartPhone ms=new MySmartPhone();
		ms.record4kVideo();
//		ms.greet(); -->throws error
		String[] ar = ms.getNetworks();
		for(String item:ar) {
			System.out.println(item);
		}
		
	}

}
