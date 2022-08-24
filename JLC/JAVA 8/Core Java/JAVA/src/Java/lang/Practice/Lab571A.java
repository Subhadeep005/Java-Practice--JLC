package Java.lang.Practice;

public class Lab571A {
public static void main(String[] args) {
	System.out.println("Main() Started");
	try(JLCResource res1=new JLCResource(1); JLCResource res2=new JLCResource(2);){
		System.out.println("try Block Execution");
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		System.out.println("finally Block");
	}
}
}

class JLCResource implements AutoCloseable{
	int rid;
	public JLCResource(int rid) {
		this.rid=rid;
	}
	@Override
	public void close() throws Exception {
		System.out.println("Resource are closed "+rid);
	}
}