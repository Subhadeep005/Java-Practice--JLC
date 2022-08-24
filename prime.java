class prime
{
	public static void main(String args[])
	{
		int i,j;
		System.out.print("\nprime nos. are=");
		for(j=1;j<=30;j++)
		{
			for(i=2;i<=30;i++)
			{
				if(j%i==0)
				break;
			}
			if(j==i)
			{	
			System.out.print(i+",");
			}
			
		}
		System.out.print("\ncomposite nos. are=");
		for(j=1;j<=16;j++)
		{
			for(i=2;i<=16;i++)
			{
			if(j%i==0)
			break;
			}
			if(j!=i)
			{	
			System.out.print(j+",");
			}
		}
			
	}
}
				