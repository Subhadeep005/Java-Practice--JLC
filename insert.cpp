#include<stdio.h>
#include<conio.h>
main()
{
      int pos,key,n,i,a[100];
      printf("\nenter the no.of elements");
      scanf("%d",&n);
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\nenter the new element and pos");
      scanf("%d%d",&key,&pos);
      for(i=n-1;i>=pos-1;i--)
      {
                             a[i+1]=a[i];
                             }
                             a[pos-1]=key;
                             printf("\nthe elements of array after insertion is");
                             for(i=0;i<n+1;i++)
                             printf("\n%d",a[i]);
                             getch();
                             }
                             
      
      
