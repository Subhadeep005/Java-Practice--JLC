package Test_Program;

public class is_binary_no {

	public static void main(String[] args) {
		String s="0101010";
		int flag=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++){
		if(arr[i]>'0' && arr[i]>'1'){
			flag=1;
			break;
		}
		}
		if(flag==0)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
