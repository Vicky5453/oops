package scenario;

public class Samsung extends Factorydemo {

	static int price = 5000;

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.browse1();
		sam.browse();
		System.out.println("samsung price :" + sam.price);
		System.out.println("demo price :" + Factorydemo.price);
		System.out.println("original piece :" + sam.isOriginalpiece);
		int duration = sam.call(5);
		System.out.println("call second :" + duration);

		sam.verifyFingerprint();
		sam.providePattern();
		sam.sendmessage();
		sam.receivecall();

	}

	@Override
	public void verifyFingerprint() {
		System.out.println("verify fingerprint :" + "success process");

	}

	@Override
	public void providePattern() {
		System.out.println("provide pattern :" + "swipe pattern");

	}

	public int call(int second) { // return type
		return second;
	}

	public void sendmessage() {
		System.out.println("send message :" + "hello");

	}

	public void receivecall() {

		System.out.println("received call :" + "duration 30 min");

	}

}
