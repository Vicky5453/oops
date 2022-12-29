package oops.basic;

public class Library {
	
	static String libraryname="thala pola varuma";
    static String address="south street(ariyalur)";
     String bookname;
     String author; 
     int page;
     
     // object specific information(non static information)
     // instance specific information 
     //objects-initializing object specific information
     // constructor 
     public Library(String s1,String s2,int i)
     {
    	bookname=s1;
    	author=s2;
    	page=i;
     }
   
     
     public void lend()
     {
    	 System.out.println("bookname is :"+bookname);
    	 System.out.println("authorname is :"+author);
    	 System.out.println("page no :"+page);
     }

	public static void main(String[] args) {
		  System.out.println("library name is :"+libraryname);
			System.out.println("address is :"+address);
			
		Library book1 = new Library("thenaliraman","parathiraja",50);
	//	book1.bookname = "thenaliraman";
	//	book1.author= "parathiraja";
	//	book1.page=50;
		book1.lend();
		Library book2 = new Library("leo tolstoy","leo",100);
	//	book2.bookname="leo tolstoy";
	//	book2.author="leo";
	//	book2.page=100;
		book2.lend();
		Library book3 = new Library("peer bal","kannadhasan",150);
	//	book3.bookname="peer bal";
	//	book3.author="kannadhasan";
	//	book3.page=150;
		book3.lend();
		
	}
	
}
