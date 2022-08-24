
class All extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("From ThreadA : i = " + i);
}
System.out.println("exit from A");
}
}
class Dem
{
public static void main(String args[])
{
new All().start();
}
}