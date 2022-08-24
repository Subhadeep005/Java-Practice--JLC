#include<stdio.h>
#include<conio.h>
int binser(int a[] ,int i ,int l,int x);
main()
{
      int a[100],n,i,x,pos;
      printf("enter the no of element");
      scanf("%d",&n);
      printf("enter the element of array");
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("enter the no which you want to found");
      scanf("%d",&x);
      pos=binser(a,0,n-1,x);
       if(pos==0)
      printf("no. is not found");
      else
      {
      pos=pos+1; 
      printf("the no is at position %d",pos);
      }
      getch();
      }
      int binser(int a[],int i,int l,int x)
      {
           int mid;
           if(l==i)
           {
                   if(x==a[i])
                   return i;
                   else
                   return 0;
                   }
                   else
                   {
                       mid=((i+l)/2);
                       if(x==a[mid])
                       return mid;
                       else if (x<a[mid])
                       return binser(a,i,mid-1,x);
                       else
                       return binser(a,mid+1,l,x);
                       }
                       }
                       
                       
                       
      
      
      

