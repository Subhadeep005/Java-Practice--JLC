package Java.lang.Practice;

public class Lab525 {

	public static void main(String[] args) {
		JlcService1 serv=new JlcService1();
		byte b1=12; byte b2=23;
		serv.show(b1,b2);
	}

}

class JlcService1{
	void show(int ab, int bc){ //------>(1)
		System.out.println("\n---show(int,int)");
	}
	void show(Byte ab,Byte bc){ //------>(2)
		System.out.println("\n---show(Byte,Byte)");
	}
	void show(byte...ab){ //------>(3)
		System.out.println("\n---show(byte...)");
	}
}