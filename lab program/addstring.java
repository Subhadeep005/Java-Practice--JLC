import java.io.*;
import java.util.*;
class addstring
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the 1st string:");
String w=s.nextLine();
StringBuffer str=new StringBuffer(w);
System.out.println("Enter the 2nd string:");
String q=s.nextLine();
StringBuffer st=new StringBuffer(q);
str.insert(1,st);
System.out.println("String after addition is:"+str);
char a,b;
a=w.charAt(1);
b=q.charAt(1);
if(a<b)
{
System.out.println("String in alphabetical order is:");
System.out.println(""+q+""+w);
}
else
{
System.out.println("String in alphabetical order is:");
System.out.println(""+w+""+q);
}
}
}