class Armstrong
{
	public static void main(String A[])
	{
		int q,a,b,c,z,x,n=1;
		while(n<1000)
		{
			a=n%10;
			q=n/10;
			b=q%10;
			c=q/10;
			z=((c*100)+(b*10)+a);
			x=a*a*a*+b*b*b+c*c*c;
			if(x==z)
			System.out.println();
			n++;
		}
	}
}
			
