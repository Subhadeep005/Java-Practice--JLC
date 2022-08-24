package Java.lang.Practice;

public class Lab568A {

	public static void main(String[] args) {
		System.out.println("Checked Exception Example");
		System.out.println("Main Started");
		String nm="";
		
			StudentService1 serv=new StudentService1();
			//nm=serv.getNameBySid(null);
			//nm=serv.getNameBySid("");
			//nm=serv.getNameBySid("JLC-088");
			nm=serv.getNameBySid("JLC-099");
			System.out.println("Name :"+nm);
		
		System.out.println("Main Completed");
	}

}

class EmptySidException1 extends Exception{
	/*@Override
	public String getMessage() {
		return "Student Sid is Empty";
	}*/
}

class StudentService1{
	String getNameBySid(String sid){
		if(sid==null){
			throw new NullPointerException();
		}
		else if(sid.isEmpty()){
			try {
				throw new EmptySidException1();
			} catch (EmptySidException1 e) {
				e.printStackTrace();
				return "";
			}
		}
		else if(sid.equals("JLC-099")){
			return "Srinivas";
		} else
			try {
				throw new StudentNotFoundException1(sid);
			} catch (StudentNotFoundException1 e) {
				e.printStackTrace();
				return "";
			}
	}
}

class StudentNotFoundException1 extends Exception{
	StudentNotFoundException1(String sid) {
		super(sid);
	}
	/*@Override
	public String toString() {
		return "Enter Student Sid is Not Found";
	}*/
}