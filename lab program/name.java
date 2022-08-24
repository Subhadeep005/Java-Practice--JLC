class name
{
	public static void main(String args[])
	{
		int count=4,i=0;
		String string;
		count=args.length;
		System.out.println("number of arguments="+count);
		while(i<count)
		{
			for(i=0;i<=4;i++)
			string=args[i];
			i=i+1;
		System.out.println(i+"."+"my name is" +string);
	}}
}