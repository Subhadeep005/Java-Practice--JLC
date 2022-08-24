package OOPS.program;

public class Lab312 {

	public static void main(String[] args) {
		
		Hello45 h=new Hello45();
		h.sum(new int[0]);
		h.sum(new int[]{12,34,54});
		h.sum(new int[]{10,20,50,30});

	}

}
class Hello45{
	void sum(int arr[]){
		System.out.println("sum int[]");
		System.out.println("Length:"+arr.length);
		int s=0;
		for(int a:arr){
			s=s+a;
		}
		System.out.println("Sum is:"+s);
	}
}