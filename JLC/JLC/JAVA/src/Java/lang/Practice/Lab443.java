package Java.lang.Practice;

public class Lab443 {

	public static void main(String[] args) {
		showClassinfo("JLC");
		student stu=new student();
		showClassinfo(stu);
		Object obj=new Object();
		showClassinfo(obj);
	}
static void showClassinfo(Object obj){
	Class cls=obj.getClass();
	System.out.println("Class Name :"+cls.getName());
	Class scls=cls.getSuperclass();
	System.out.println(scls);
	if(scls!=null)
		System.out.println("Super class Name :"+scls.getName());
	else
		System.out.println("No super class");
}
}
class person{}
class student extends person{}