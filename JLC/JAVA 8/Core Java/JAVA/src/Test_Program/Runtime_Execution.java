package Test_Program;

interface Bank{
	String getBranch();
}
class BranchA implements Bank{
	@Override
	public String getBranch() {
		return "This is -- BranchA";
	}
}
class BranchB implements Bank{
	@Override
	public String getBranch() {
		return "This is -- BranchB";
	}
}
class BranchC implements Bank{
	@Override
	public String getBranch() {
		return "This is -- BranchC";
	}
}

public class Runtime_Execution {

	public static void main(String[] args) throws Exception {
		Bank bank=(Bank)Class.forName("Test_Program."+args[0]).newInstance();
		String str1=bank.getBranch();
		System.out.println(str1);
	}

}
