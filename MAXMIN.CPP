#include<stdio.h>
#include<conio.h>
int a[100];
void main()
{
int i,n,max,min;
clrscr();
printf("\nenter the no. of elements");
scanf("%d",&n);
printf("\nenter the elements of array");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
maxmin(0,n-1,&max,&min);
printf("\nmaximum element is=%d",max);
printf("\nminimum element is=%d",min);
getch();
}
maxmin(int i,int j,int *max,int *min)
{
int *max1,*min1;
int mid;
if(i==j)
*max=*min=a[i];
else if(i==j-1)
{
if(a[i]<a[j])
{
*max=a[j];
*min=a[i];
}
else
{
*max=a[i];
*min=a[j];
}
}
else
{
mid=(i+j)/2;
maxmin(i,mid,*max,*min);
maxmin(mid+1,j,*max1,*min1);
}
if(*max<*max1)
*max=*max1;
else if(*min>*min1)
*min=*min1;
return(0);
}