import java.util.Scanner;
class Pal
{
   public static void main(String args[])
   {
     
      String s1,s2="";
	int i,l;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      s1 = in.nextLine();
 
      l = s1.length();
 
      for(i=l-1;i>=0;i--)
         s2 = s2+s1.charAt(i);
 
      if (s1.equals(s2))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
	
	
 
   }
}	