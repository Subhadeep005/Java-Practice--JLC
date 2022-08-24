#include<stdio.h>
#include<conio.h>
main()
{
      int n,i,j,x,b;
      printf("enter the value");
      scanf("%d",&n);
      b=n-1;
      for(i=1;i<=n;i++)
      {
                       for(j=1;j<=b;j++)
                       printf(" ");
                       x=65;
                       for(j=1;j<=i;j++)
                       {
                       printf("%c",x);
                       x=x+1;
                       }
                       printf("\n");
                       b--;
                       }
                       getch();
                       }
                       
