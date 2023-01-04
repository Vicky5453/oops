package Returntype;

public class Laptop {
                
	      static String laptopmodel="240 g8";
	      static String brand="hp";
	      
	      public String type()
	      {
	    	 System.out.println("typing my name"); 
	    	 return "good morning";
	      }
	      
	     public void type1(String name)
	      {
	    	  System.out.println(name);
	      }
	      
	public static void main(String[] args) {
		
		System.out.println(Laptop.laptopmodel);
		System.out.println(Laptop.brand);
		
		Laptop l1 = new Laptop();   //  object create 
		String file=l1.type();      // return value assign
		System.out.println(file);   // print
		l1.type1("vicky");
		
		
		
	}

}
