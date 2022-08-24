#include<stdio.h>
#include<conio.h>
main()
{
      int i,n,pos,key,a[100];
      printf("\n enter the no. of elements u want to use");
      scanf("%d",&n);
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\n enter the new element and pos");
      scanf("%d%d",&key,&pos);
      for(i=n-1;i>=pos-1;i--)
      {
      a[i+1]=a[i];
      }
      a[pos-1]=key;
      printf("\n after insertion");
      for(i=0;i<n+1;i++)
      printf("\n%d",a[i]);
      getch();
      }
      
