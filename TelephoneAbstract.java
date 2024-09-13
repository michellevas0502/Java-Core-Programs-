package projetc1;

abstract class Telephone {
	abstract public void lift();
	abstract public void disconnected();
}

class SmartTelephone extends Telephone{
	@Override
	public void lift() {
		System.out.println("A telephone needs to be picked on ringing");
	}
	@Override
	public void disconnected() {
		System.out.println("Once the call is ended we tend to disconnect the call");
	}
}
public class TelephoneAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelephone obj=new SmartTelephone();
		obj.disconnected();
		obj.lift();

	}

}
