package Test_Program;
;

public class ReduceString {

	public static void main(String[] args) {
		String str = reduce();	
		System.out.println("Reduce String : "+str);
	}

	public static String reduce() {
		String s="abcdefghijkllkjihgfedcb", str=""; int c=1;
		char arr[]=s.toCharArray();
		System.out.println("Actual String : "+s);
		for(int j=0;j<=arr.length+7;j++){
			//System.out.println(str);
			str="";
			//System.out.println(arr.length);
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]!=arr[i+1]){
						str=str+arr[i];
						if(i==arr.length-2){
							str=str+arr[i+1];
						}
					}else{
						if(i==arr.length-3){
							str=str+arr[arr.length-1];
						}
						i++;
					}
			}
			arr=str.toCharArray();
		}
		return str;
	}
}
