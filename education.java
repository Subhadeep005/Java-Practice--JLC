class staff
{
	int code;String name;
	staff(int co,String na)
	{
		code=co;
		name=na;
	}
void disp()
{
        System.out.println("\ncode is:"+code);
	System.out.println("name is:"+name+"\n");
}
}
class teacher extends staff
{
	int publication;String subject;
	teacher(int pu,String su,int co,String na)
	{
		super(co,na);
		publication=pu;
		subject=su;
	}
void disp()
{
	System.out.println("publication is:"+publication);
	System.out.println("subject is:"+subject);
	System.out.println("code is:"+code);
	System.out.println("name is:"+name+"\n");
}
}
class typist extends staff
{
	double speed;
	typist(double sp,int co,String na)
	{
		super(co,na);
		speed=sp;
	}
void disp()
{
	System.out.println("speed is:"+speed);
	System.out.println("code is:"+code);
	System.out.println("name is:"+name+"\n");
}
}
class officer extends staff
{
	String grade;
	officer(String gr,int co,String na)
	{
		super(co,na);
		grade=gr;
	}
void disp()
{
	System.out.println("grade is:"+grade);
	System.out.println("code is:"+code);
	System.out.println("name is:"+name+"\n");
}
}
class regular extends typist
{
	regular(double sp,int co,String na)
	{
		super(sp,co,na);
	}
void disp()
{
	System.out.println("speed is:"+speed);
	System.out.println("code is:"+code);
	System.out.println("name is:"+name+"\n");
}
}
class casual extends typist
{
	int dailywages;
	casual(int dw,double sp,int co,String na)
	{
		super(sp,co,na);
		dailywages=dw;
	}
void disp()
{
	System.out.println("daily wages is:"+dailywages);
	System.out.println("speed is:"+speed);
	System.out.println("code is:"+code);
	System.out.println("name is:"+name+"\n");
}
}
class education
{
	public static void main(String args[])
	{
		staff ob=new staff(6,"babai");
		ob.disp();
		teacher ob1=new teacher(23,"physics",11,"Subho");
		ob1.disp();
		typist ob2=new typist(34.5,50,"mono");
		ob2.disp();
		officer ob3=new officer("A",12,"samir");
		ob3.disp();
		regular ob4=new regular(12.5,10,"subha");
		casual ob5=new casual(33,33.5,77,"subby");
		ob5.disp();
	}
}
