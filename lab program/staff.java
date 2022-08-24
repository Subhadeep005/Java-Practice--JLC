import java.io.*;
class staff
{
int code;
string name[10]; 
staff(int c,string n)
	{
	code=c;
	name=n;
	}
		public void display()
		{
		System.out.println("code is:"+code);
		System.out.println("name is:"+name);
		}
}
class teacher extends staff
{
int publication;
string subject;
teacher(int c,string n,int pub,string sub)
	{
	super(c,n)
	publication=pub;
	subject=sub;
	}
		public void display1()
		{
		System.out.println("publication is:"+pub);
		System.out.println("subject is:"+sub);
		}
}
class typist extends staff
{
int speed;
typist(int c,string n,int sp)
	{
	super(c,n);
	speed=sp;
	}
		public void display2()
		{
		System.out.println("speed is:"+sp);
		}
}
class officer extends staff
{
string grade;
officer(int c,string n,string gr)
	{
	super(c,n);
	grade=gr;
	}
		public void display3()
		{
		System.out.println("grade is:"+gr);
		}
class regular extends typist
{
int salary;
regular(int c,string n,int sp,int sal)
	{
	super(c,n,sp);
	salary=sal;
	}
		public void display4()
		{
		System.out.println("salary is:"+sal);
		}
class casual extends typist
{
int dailywage;
casual(int c,string n,int sp,int dlwge)
	{
	super(c,n,sp);
	dailywage=dlwge;
	}
		public void display5()
		{
		System.out.println("wage  is:"+dlwg);
		}
class officer
public static void main(String args[])
{
 staff a1=new staff("sri");
 a1.display();
teacher t1=new teacher(2000);
 officer o1=new officer(a);
 regular r1=new regular(35000);
 casual c1=new casual(1200);
}	
