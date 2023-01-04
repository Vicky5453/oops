package Encapsulation;

public class SBIcustomer {

	public static void main(String[] args) {

		Statebank rep = new Statebank();
		rep.custname="siva";
		
		rep.deposit();
	//	rep.withdraw();
		System.out.println(rep.minbalance);
		System.out.println(rep.custname);
		
		

	}

}
