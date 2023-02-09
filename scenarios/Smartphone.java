package scenario;

public abstract class Smartphone {

	public abstract int call(int second);

	public abstract void sendmessage();

	public abstract void receivecall();

	public Smartphone() {          // constructor
		System.out.println("smartphone under development");
	}

	public void browse1() {

		System.out.println("smartphone browsing");
	}

}
