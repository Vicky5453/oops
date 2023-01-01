package Returntype;

public class Kitchen {
	String name;
	int experiance;
	
	public Kitchen(String a,int b)
	{
		name=a;
		experiance=b;
		System.out.println("welcome "+name+"!");
		System.out.println(experiance+" month of cooking experiance");
	}
	
	public String preparefood(String b)
	{
		return (b+" is like a food");
	}
	
	public String preparefood(String b,int c)
	{
		return (b+" like a food and "+c+" members");
	}
	
	public String preparefood(String t,String b,int c,boolean nonveg)
	{
		return (t+" morning food "+b+" like a food "+c+" members "+nonveg);
	}
	
	public String preparefood(int a,String b)
	{
		return (a+" members"+" likely food "+b);
	}

	public static void main(String[] args) {
		
		Kitchen chef = new Kitchen("magasivam",5);
		String cook1=chef.preparefood("biryani");
		String cook2=chef.preparefood("biryani",5);
		String cook3=chef.preparefood("tiffin","biryani",5,true);
		String cook4=chef.preparefood(5,"biryani");
		System.out.println(cook1);
		System.out.println(cook2);
		System.out.println(cook3);
		System.out.println(cook4);

	}

}
