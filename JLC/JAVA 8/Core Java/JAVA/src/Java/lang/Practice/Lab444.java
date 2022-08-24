package Java.lang.Practice;

public class Lab444 {

	public static void main(String[] args) {
		System.out.println("\n***with student***");
		student1 st1=new student1(99, 31903290);
		student1 st2=new student1(99, 31903290);
		student1 st3=new student1(88, 65799999);
		student1 st4=st1;
		String str=new String("JLC");
		String str1=new String("JLC");
		String str2=new String("JLC INDIA");

		System.out.println(st1.hashCode()); //It is a normal hashCode() method of Object class.
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println(str.hashCode()); //It is a overloaded hashCode() method of String class.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st3==st4);
	}

}
class student1{
	int id;
	long phone;
	student1(int id,long phone){
		this.id=id;
		this.phone=phone;
	}
}
