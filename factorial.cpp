#include<stdio.h>
#include<conio.h>
int show(int);
main()
{
      int i,n,r;
      printf("\nenter the no.");
      scanf("%d",&n);
      printf("\nfactoial of %d is:",n);
      r=show(n);
      printf("%d",r);
      getch();
      }
      int show(int n)
      {
          if(n==0)
          return(1);
          else
          return(show(n-1)*n);
          }
