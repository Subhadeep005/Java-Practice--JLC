class circle
{
	double r,s;

	double circal()
	{
	    s=3.14*2*r;
            return(s);
	}
	double areacal()
	{
	    s=3.14*r*r;
	    return(s);	
        }
}
class circlecal
{
	public static void main(String args[])
	
	{
                double k,p;
		circle c1=new circle();
		{
		c1.r=5;
		k=c1.circal();
		System.out.println("cir.is="+k);
		p=c1.areacal();
		System.out .println("area is="+p);
		}
	}
}
