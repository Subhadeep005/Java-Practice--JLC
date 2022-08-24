class commandsum
{
	public static void main(String args[])
	{
		int i,j=args.length,sum=0,x;
		for(i=0;i<j;i++)
		{
			x=Integer.valueOf(args[i]);
			sum=sum+x;

		}
		System.out.println("Sum is="+sum);
	}
}