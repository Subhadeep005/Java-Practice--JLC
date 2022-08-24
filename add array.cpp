#include<stdio.h>
#include<conio.h>
#define size 5
main()
{
      int n[size],i,max=0;
      printf("\nenter the no of element of the array:");
      for(i=0;i<size;i++)
      {
      scanf("%d",&n[i]);
      }
      for(i=0;i<size;i++)
      if(max<n[i])
          max=n[i];         
         printf("max no is =%d",max);
          getch();
          }
