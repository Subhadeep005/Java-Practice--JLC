#include<stdio.h>
#include<conio.h>
int fib(int);
main()
{
      int i,j,n;
      printf("\nenter the no.");
      scanf("%d",&n);
      printf("\nfibonacci series of %d is:",n);
      for(i=0;i<n;i++)
      {
                      printf("%d",fib(i));
                      }
                      getch();
                      }
                      int fib(int n)
                      {
                          if(n==0)
                          return(0);
                          else if(n==1)
                          return(1);
                          else 
                          return(fib(n-1)+fib(n-2));
                          }
       
