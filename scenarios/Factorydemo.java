package scenario;

public abstract class Factorydemo extends Smartphone {

	boolean isOriginalpiece = false;

	static int price = 0;

	public abstract void verifyFingerprint();

	public abstract void providePattern();

	public void browse() {

		System.out.println("factory demo browsing");
	}

}
