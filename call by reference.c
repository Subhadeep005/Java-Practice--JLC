#include<stdio.h>
#include<conio.h>
int a,b;
main()
{
      int *p;
      void change(int **);
      a=50;
      p=&a;
      change(&p);
      printf("Value of p=%d",*p);
      getch();
      }
      void change(int **q)
      {
           b=100;
           *q=&b;
           printf("Value of q=%d\n",**q);
           }
