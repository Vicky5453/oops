package abstraction;

public class Chrome extends Browser{

	public static void main(String[] args) {
                
		Chrome c = new Chrome();
		c.browse();
		c.icon();
		c.problem();
		
	}
	
	public void browse()
	{
		System.out.println("used a lot users");
	}
	public void icon()
	{
		System.out.println("circle shape logo");
	}
	public void problem()
	{
		System.out.println("third party cookies indract the user a lot information");
	}

}
