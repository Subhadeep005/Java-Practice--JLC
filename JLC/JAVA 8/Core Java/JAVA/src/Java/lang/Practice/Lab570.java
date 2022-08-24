package Java.lang.Practice;

public class Lab570 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		try{
			StudentService3 serv=new StudentService3();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main() Completed");
	}

}

class StudentService3{
	String getNameBySid(String sid) throws StudentNotFoundException3{
		if(sid==null || sid.isEmpty() || !(sid.equals("JLC-099"))){
			throw new StudentNotFoundException3(sid);
		}else
			return "Srinivas";
	}
}
class StudentNotFoundException3 extends Exception{
	StudentNotFoundException3(String sid) {
		super(sid);
	}
	@Override
	public String toString() {
		return "StudentNotFoundException";
	}
}