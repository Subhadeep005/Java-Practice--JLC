package OOPS.program;

public class Lab225 {

	public static void main(String[] args) {
	
		Customer c1=new Customer();
		System.out.println("From c1 object");
		c1.show();
		Customer c2=new Customer();
		System.out.println("From c2 object");
		c2.cid=99;
		c2.cname="subha";
		c2.phone=12345;
		c2.show();
	}

}

class Customer{
	
	int cid;
	String cname;
	long phone;
	void show(){
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(phone);
	}
	
}