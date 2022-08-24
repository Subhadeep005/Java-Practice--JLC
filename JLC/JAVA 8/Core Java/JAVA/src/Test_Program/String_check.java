package Test_Program;

public class String_check {

	public static void main(String[] args) {
		String str="JLCINDIA";
		char arr[]=str.toCharArray();
		char temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		String str1=new String(arr);
		System.out.println(str1);
		System.out.println();
		String mid=str.substring(1,str.length()-1);
		System.out.println(str.charAt(str.length()-1)+mid+str.charAt(0));
	}

}
