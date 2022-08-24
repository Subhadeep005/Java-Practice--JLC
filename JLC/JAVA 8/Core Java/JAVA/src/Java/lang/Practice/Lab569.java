package Java.lang.Practice;

public class Lab569 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		try{
			StudentService2 serv=new StudentService2();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main() Completed");
	}

}

class StudentService2{
	String getNameBySid(String sid){
		if(sid==null || sid.isEmpty() || !(sid.equals("JLC-099"))){
			throw new StudentNotFoundException2(sid);
		}else
			return "Srinivas";
	}
}
class StudentNotFoundException2 extends RuntimeException{
	StudentNotFoundException2(String sid) {
		super(sid);
	}
	@Override
	public String toString() {
		return "StudentNotFoundException";
	}
}