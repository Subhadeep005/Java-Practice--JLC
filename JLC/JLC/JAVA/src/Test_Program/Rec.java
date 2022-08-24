package Test_Program;

public class Rec {
	public static void main(String[] args) {
		int n=1;
		Rec r=new Rec();
		r.disp(n);
	}
	
void disp(int a){
	if(a<=10){
	System.out.println(a);
	Rec r=new Rec();
	r.disp(a+1);
	}
}
}

/*int disp(int a){
	if(a>10)
		return 0;
	else{
		System.out.println(a);
		return disp(a+1);
	}
}
}*/
