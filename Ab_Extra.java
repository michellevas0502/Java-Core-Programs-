package projetc1;

abstract class Yesterday{
	//To-Do List
	public void implement() {
		System.out.println("Implement all the components of the To-Do List");
	}
	abstract public void getUpEarly();
	abstract public void exercise();
	abstract public void practise();
	abstract public void study();
	abstract public void leetCode();
}

class Today extends Yesterday{
	@Override
	public void getUpEarly() {
		System.out.println("I have gotten up on time");
	}
	@Override
	public void exercise() {
		System.out.println("I have completed my exercise successfully");
	}
	@Override
	public void practise() {
		System.out.println("I have completed my practice successfully");
	}
	@Override
	public void study() {
		System.out.println("I have completed my study successfully");
	}
	@Override
	public void leetCode() {
		System.out.println("I have completed practicing leetCode questions successfully");
	}
}

public class Ab_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Today obj=new Today();
		obj.implement();
		obj.getUpEarly();
		obj.exercise();
		obj.practise();
		obj.study();
		obj.leetCode();

	}

}
