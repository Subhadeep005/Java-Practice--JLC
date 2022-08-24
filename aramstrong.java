class aramstrong
{
	public static void main(String args[])
	{
		int i,k,k1,k2,k3,p,p1,p2,p3,p4;
		System.out.print("the aramstrongs no. 1 to 1000 is==");
		for(i=1;i<=9;i++)
		System.out.print(i+",");
		for(i=10;i<1000;i++)
		{
			if(i<100)
			{
			k=i;
			k1=k%10;
			k1=k1*k1;
			k2=k/10;
			k2=k2*k2;
			k3=k1+k2;
			if(k==k3)
			System.out.print(i+",");
			}
			else
			{
			p=i;
			p1=p%10;
			p1=p1*p1*p1;
			p2=p%100;
			p2=p2/10;
			p2=p2*p2*p2;
			p3=p/100;
			p3=p3*p3*p3;
			p4=p1+p2+p3;
			if(p==p4)
			System.out.print(i+",");
			}
		}
		
	}
}
			