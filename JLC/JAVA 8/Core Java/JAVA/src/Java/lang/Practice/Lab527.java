package Java.lang.Practice;

public class Lab527 {

	public static void main(String[] args) {
		JlcService3 serv=new JlcService3();
		byte b1=12; byte b2=23;
		serv.show(b1,b2);
	}

}

class JlcService3{
	void show(byte...ab){ //------>(1)
		System.out.println("\n---show(byte...)");
	}
	/*void show(Byte...ab){ //------>(1)
		System.out.println("\n---show(Byte...)");
	}*/
}