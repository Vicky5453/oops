package scenario;

public class SQLtrainer extends Trainer {

	public SQLtrainer(String a, String b) {
		super(a, b);

	}

	public static void main(String[] args) {

		SQLtrainer ram = new SQLtrainer("CSE", "Payilagam");
		System.out.println("child constructor :" + ram.dept);
		System.out.println("child constructor :" + ram.institute);
		ram.training();
		System.out.println("trainer salary :" + ram.getSalary());

	}

}
