class Box
{
int length,breath,height;
void areaBox(int a,int b)
{
length=a;
breath=b;
int area=length*breath;
System.out.println("area of the box is :"+area);
}
void volume(int a,int b,int c)
{
int vol;

length=a;
breath=b;
height=c;
vol=length*breath*height;
System.out.println("volume of the box is :"+vol);
}
}
class BoxDemo
{
public static void main(String[] args)
{
Box ob=new Box();
ob.areaBox(12,13);
ob.volume(12,13,15);
}
}

