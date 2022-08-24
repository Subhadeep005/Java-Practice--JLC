#include<stdio.h>
#include<conio.h>
main()
{
      char str[30];
      int i,l=0;
      printf("enter a line of text:");
      gets(str);
      printf("\n reverse order is:");
      for(i=0;str[i]!='\0';i++);
      for(i--;i>=0;i--)
      {
      printf("%c",str[i]);
      }
      getch();
      }
