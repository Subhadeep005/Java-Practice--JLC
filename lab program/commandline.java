class commandline
{
	public static void main(String args[])
	{
		int i;
		int count=(args.length-2);
		for(i=0;i<count;i++)
		{
			if(i==0)
			System.out.println("Java is="+args[i]);
			else
			System.out.println("\t"+args[i]);
		}
		for(i=count;i<args.length;i++)
		{
			System.out.print("\t"+args[i]);
			System.out.print(" ");
		}
		
	}
}