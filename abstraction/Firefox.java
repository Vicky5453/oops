package abstraction;

public class Firefox extends Browser{

	public static void main(String[] args) {
		
		Firefox f = new Firefox();
		f.browse();
		f.icon();
		f.problem();
		
	}
	
	public void browse()
	{
		System.out.println("used a average users");
	}
	public void icon()
	{
		System.out.println("circle and fox shape logo");
	}
	public void problem()
	{
		System.out.println("third party cookies indract the user low information");
	}

}
