package Java.lang.Practice;

public class Lab561 {

	public static void main(String[] args) {
		System.out.println("Stmt 0"); //JVM
		try{
					System.out.println("Stmt 1"); //Outer catch
					try{
								System.out.println("Stmt 2"); //Inner catch
					}catch(Exception e){
								System.out.println("Stmt 3"); //Outer catch
					}finally{
								System.out.println("Stmt 4"); //Outer catch
					}
					System.out.println("Stmt 5"); //Outer catch
		}catch(Exception e){
					System.out.println("Stmt 6"); //JVM
					try{
								System.out.println("Stmt 7"); //Inner catch
					}catch(Exception e1){
								System.out.println("Stmt 8"); //JVM
					}finally{
								System.out.println("Stmt 9"); //JVM
					}
					System.out.println("Stmt 10"); //JVM
		}finally{
					System.out.println("Stmt 11"); //JVM
					try{
								System.out.println("Stmt 12"); //inner catch
					}catch(Exception e){
								System.out.println("Stmt 13"); //JVM
					}finally{
							System.out.println("Stmt 14"); //JVM
					}
					System.out.println("Stmt 15"); //JVM
		}
		System.out.println("Stmt 16"); //JVM
	}

}
