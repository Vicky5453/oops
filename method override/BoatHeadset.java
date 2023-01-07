package methodOverride;

public class BoatHeadset {

	public static void main(String[] args) {
		
		BoatHeadset bh = new BoatHeadset();
		bh.noise();
		bh.connection();

	}
	
	public void noise()
	{
		System.out.println("smooth noise");
	}
	
	public void connection()
	{
		System.out.println("wireless connection");
	}

}
