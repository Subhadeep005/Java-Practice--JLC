package Java.lang.Practice;

public class Lab524 {

	public static void main(String[] args) {
		JlcService serv=new JlcService();
		byte b1=12; byte b2=23;
		serv.show(b1,b2);
	}

}

class JlcService{
	void show(int ab, int bc){ //------>(2)
		System.out.println("\n---show(int,int)");
	}
	void show(byte ab, byte bc){ //------>(1)
		System.out.println("\n---show(byte,byte)");
	}
	void show(Byte ab,Byte bc){ //------>(3)
		System.out.println("\n---show(Byte,Byte)");
	}
	void show(byte...ab){ //------>(4)
		System.out.println("\n---show(byte...)");
	}
}