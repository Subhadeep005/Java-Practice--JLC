class table
{
   public static void main(String arg[])
   {
       int i,k;
       i= Integer.parseInt(arg[0]);
       System.out.println("Table of "+i); 
       for(int j=1; j<=10; j++)
       {
           k=i*j;
           System.out.println(i+" * "+j+" = "+k);
       }
   }
}