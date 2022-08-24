package Java.lang.Practice;

public class Lab571 {

	public static void main(String[] args) throws StudentNotFoundException4 {
		System.out.println("Main() Started");
			StudentService4 serv=new StudentService4();
			serv.getNameBySid(null);
		System.out.println("Main() Completed");
	}

}

class StudentService4{
	String getNameBySid(String sid) throws StudentNotFoundException4{
		if(sid==null || sid.isEmpty() || !(sid.equals("JLC-099"))){
			throw new StudentNotFoundException4(sid);
		}else
			return "Srinivas";
	}
}
class StudentNotFoundException4 extends Exception{
	StudentNotFoundException4(String sid) {
		super(sid);
	}
	@Override
	public String toString() {
		return "StudentNotFoundException";
	}
}
