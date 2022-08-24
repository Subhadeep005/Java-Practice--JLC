#include<stdio.h>
#include<conio.h>
main()
{
      int n,i,s=0,a[100];
      float t;
      printf("\nenter the no.");
      scanf("%d",&n);
      printf("\nenter %d no.",n);
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      for(i=0;i<n;i++)
      {
                       s=s+a[i];
                       }
                       t=s%n;
                       printf("\naverage is=%f",t);
                       getch();
                       }
