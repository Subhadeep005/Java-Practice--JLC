package Java.lang.Practice;

public class Lab572 {

	public static void main(String[] args) {
		Student11 sarr[]=new Student11[500];
		try{
			for(int i=0;i<sarr.length;i++){
				sarr[i]=new Student11();
				System.out.println((i+1) +" Object Created");
			}
			}catch(Error e){
				System.out.println("Error Occured :"+e);
		}
		System.out.println("After Handiling");
		Student11 st=new Student11();
	}

}

class Student11{
	long arr[]=new long[215833];
}