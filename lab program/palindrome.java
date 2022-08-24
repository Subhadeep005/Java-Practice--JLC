import java .io.*;
class palindrome
{
	public static void main(String args[])throws IOException
	{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    String s1,s2="";
	     int i,l;
	    System.out.println("ENTER STRING TO CHECK");
	    s1=in.readLine();
	    l=s1.length();
	    for(i=l-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);
		}
	if(s1.equals(s2))
	      System.out.println("PALINDROME");
	
	else
              System.out.println("NOT PALINDROME");
	}
}