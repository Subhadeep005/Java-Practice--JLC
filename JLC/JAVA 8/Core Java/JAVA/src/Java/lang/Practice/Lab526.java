package Java.lang.Practice;

public class Lab526 {

	public static void main(String[] args) {
		JlcService2 serv=new JlcService2();
		byte b1=12; byte b2=23;
		serv.show(b1,b2);
	}

}

class JlcService2{
	void show(Byte ab,Byte bc){ //------>(1)
		System.out.println("\n---show(Byte,Byte)");
	}
	void show(byte...ab){ //------>(2)
		System.out.println("\n---show(byte...)");
	}
}