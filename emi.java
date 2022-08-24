class emi
{
	public static void main(String args[])
	{
		double prin1=500000;
		double prin=500000;
		double time=120;
		double m=prin/time;
		double n=10.0/12.0;
		double intrst=0;
		double newpr=0;
		for(int i=1;i<=time;i++)
		{
			intrst=(prin*n*1)/100;
			newpr=newpr+intrst;
			prin=(prin-m);
			
		}
		prin1=((prin1+newpr)/time);
		System.out.println("EMI is="+prin1);
	}
}