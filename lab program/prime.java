class prime
{
	public static void main(String args[])
	{
		int i,j;
                              System.out.print("prime no of 1 to 100=");
		for(j=1;j<=100;j++)
		{
			for(i=2;i<=100;i++)
			{
				if(j%i==0)
				break;
			}
			if(j==i)
			System.out.print(i+",");
		}
                System.out.print("\ncomposite no of 1 to 100=");
		for(j=1;j<=100;j++)
		{
			for(i=2;i<=100;i++)
			{
				if(j%i==0)
				break;
			}
			if(j!=i)
			System.out.print(j+",");
		}
	}
}
	