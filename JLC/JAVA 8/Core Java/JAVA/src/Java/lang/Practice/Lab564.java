package Java.lang.Practice;

public class Lab564 {

	public static void main(String[] args) {
		Exception ex1=new ClassNotFoundException();
		Exception ex2=new NullPointerException();
		System.out.println(ex1 instanceof RuntimeException); //Checked
		System.out.println(ex2 instanceof RuntimeException); //UnChecked
	}

}
