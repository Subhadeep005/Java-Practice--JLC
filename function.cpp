#include<stdio.h>
#include<conio.h>
void add(void);
int x,y;
main()
{
      printf("\nenter two value");
      scanf("%d%d",&x,&y);
      add();
      getch();
      }
      void add()
      {
           int s;
           s=x+y;
           printf("\nsum is %d",s);
           }
