package scenario;

public class ActorSivakumar implements Actor {

	static String address = "coimbatore";
	int age;
	String car;

	public ActorSivakumar(int a, String b) {
		age = a;
		car = b;
		System.out.println("sivakumar age :" + age);
		System.out.println("car name :" + car);
	}

	public static void main(String[] args) {
		ActorSivakumar s = new ActorSivakumar(60, "BMW");
		System.out.println("makeUp required :" + Actor.makeUprequired);
		System.out.println("address :" + Actor.address);
		System.out.println("sivakumar address :" + s.address);
		s.act();
		s.dance();
		s.sing();
		s.speaking();
		Actor a = new ActorSivakumar(20, "HONDA"); // dynamic binding
		a.act();
		s.dance();
		s.sing();
		s.speaking();

	}

	@Override
	public void act() {
		System.out.println("acting :" + "cinema");
	}

	@Override
	public void dance() {
		System.out.println("popular dancer :" + "prabudeva");
	}

	@Override
	public void sing() {
		System.out.println("popular singer :" + "yuvan sankaraja");
	}

	public void speaking() {
		System.out.println("actor sivakumar :" + "speak for tamil history");
	}

}
