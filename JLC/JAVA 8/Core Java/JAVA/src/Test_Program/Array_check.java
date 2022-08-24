package Test_Program;

public class Array_check {

	public static void main(String[] args) {
		int []x[]={{1,2},{3,4,5},{6,7,8,9}};
		x[2]=new int[]{10,20,30,40};
		int[][]y=x;
		System.out.println(y[2][1]);
	}

}
