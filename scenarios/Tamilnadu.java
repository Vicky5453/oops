package scenario;

public class Tamilnadu extends SouthIndia {
	static String capital = "chennai";

	public Tamilnadu(String primeMinister) {
		super(primeMinister);
	}

	public static void main(String[] args) {
		Tamilnadu t = new Tamilnadu("modi");
		// t.cultivate();
		// t.livingStyle();
		System.out.println("india capital :" + India.capital);
		System.out.println("tamilnadu capital :" + t.capital);
		SouthIndia si = new Tamilnadu("nehru");
		si.cultivate();
		si.livingStyle();
		si.speakLanguage();
		si.eat();
		si.dress();

	}

	@Override
	public void speakLanguage() {
		System.out.println("mother language :" + "tamil");
	}

	@Override
	public void eat() {
		System.out.println("mostly use foods :" + "crop type food");
	}

	@Override
	public void dress() {
		System.out.println("tamilnadu mostly using :" + "traditional dresses");
	}

	@Override
	public void cultivate() {
		System.out.println("rice and sugarcane cultivation");
	}

	@Override
	public void livingStyle() {
		System.out.println("above average development");
	}

}
