package encapsulation;
class Demo{
	private int x=20;
	public void setter(int x) {
		this.x=x;
	}
	public int getter() {
		return x;
	}
}

public class PrivateKeyword {
	public static void main(String [] args) {
		Demo obj = new Demo();
		//System.out.println(obj.x);
		obj.setter(29);
		System.out.println(obj.getter());

	}
}
