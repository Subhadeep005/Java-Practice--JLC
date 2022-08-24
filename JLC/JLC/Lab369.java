package dev.p1.app;
import org.jlc.stu.*;
import com.jlc.emp.*;
import edu.org.clt.*;
public class Lab369{
public static void main(String[] args) {
	System.out.println("Main Started");
	student st=new student();
	st.show();
	employee emp=new employee();
	emp.display();
	client clt=new client();
	clt.m1();
}
}