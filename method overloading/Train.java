package methodOverloading;

public class Train {             // method overloading 

	public static void main(String[] args) {

		Train t = new Train();
		t.travel("delhi");
		t.travel("chennai", 500);
		t.travel(95);

	}

	public void travel(String s) {
		System.out.println("send place " + s);
	}

	public void travel(String s, int i) {
		System.out.println("receive place " + s + " total ticket cost " + i);
	}

	public void travel(int i) {
		System.out.println("diesel price 1 ltr -----> " + i);
	}
}
