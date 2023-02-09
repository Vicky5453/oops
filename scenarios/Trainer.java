package scenario;

public class Trainer {

	String dept;
	String institute;

	private int salary = 10000;

	public int getSalary() {
		return this.salary;
	}

	public void training() {
		System.out.println("payilagam training :" + "good training");
	}

	public Trainer(String a, String b) {
		dept = a;
		institute = b;
		System.out.println("department :" + dept);
		System.out.println("institute :" + institute);
	}

	public static void main(String[] args) {
		Trainer t = new Trainer("CSE", "payilagam");
	}
}
