package inheritance;

public class Mobile extends Laptop {

	public static void main(String[] args) {
		
		Mobile mo = new Mobile();
        mo.browse();
        mo.draw();
        mo.song();
        mo.type();
        mo.monitor();
	}
     
	public void monitor()
	{
		System.out.println("view movie");
	}
}
