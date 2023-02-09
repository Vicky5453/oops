package scenario;

public abstract class India {
	static String capital = "new delhi";

	public India(String primeMinister) {
		System.out.println("our prime minister is :" + primeMinister);
	}

	public abstract void speakLanguage();

	public abstract void eat();

	public abstract void dress();

}
