package interfac;

public  class Firefox implements Google {

	public static void main(String[] args) {
	       Firefox f = new Firefox();
	       System.out.println(f.bonus);
	       System.out.println(Firefox.name);
	       f.fastsearch();
	       f.slowsearch();
	       f.freesnacks();
	       f.giveSalary();
	       f.giveLeave();
	    
	   
	}

	@Override
	public void fastsearch() {
		System.out.println("duckduckgo is fast");
		
	}

	@Override
	public void slowsearch() {
		System.out.println("operamini is slow ");
		
	}

	@Override
	public void freesnacks() {
		System.out.println("lays");
		
	}

	@Override
	public void giveSalary() {
		System.out.println("10000");
		
	}

	@Override
	public void giveLeave() {
		System.out.println("weekly one days");
		
	}

}
