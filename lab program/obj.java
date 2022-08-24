class demo
{
		int l,b;
		public void area()
		{
		System.out.println("Area is="+(l*b));
		}
	
}
class obj
{
	public static void main(String args[])
	{
	demo ob=new demo();
	ob.l=5;ob.b=3;
	ob.area();
	}
}