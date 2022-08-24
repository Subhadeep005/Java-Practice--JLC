#include<stdio.h>
#include<conio.h>
int binsearch(int a[],int i,int l,int x);
main()
{
int i,n,a[100],pos,x;
printf("\nenter the no. of element");
scanf("%d",&n);
printf("\nenter the elements of the array");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
printf("\nenter the no. which u wants to search");
scanf("%d",&x);
pos=binsearch(a,0,n-1,x);
if(pos==-1)
{
printf("\nelement not found");
}
else
{
pos=pos+1;
printf("\nelement is found at position=%d",pos);
}
getch();
}
int binsearch(int a[],int i,int l,int x)
{
int mid;
if(l==i)
{
if(x==a[i])
return(i);
else
return(0);
}
else
{
mid=(i+l)/2;
if(x==a[mid])
return(mid);
else if(x<a[mid])
return binsearch(a,i,mid-1,x);
else
return binsearch(a,mid+1,l,x);
}
}
