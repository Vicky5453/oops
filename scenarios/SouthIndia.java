package scenario;

public abstract class SouthIndia extends India {

	public SouthIndia(String primeMinister) {
		super(primeMinister);

	}

	public void cultivate() {
		System.out.println("rice and wheat cultivation");
	}

	public void livingStyle() {
		System.out.println("average development");
	}

}
