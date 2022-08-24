#include<stdio.h>
#include<conio.h>
int a[100];
void quicksort(int,int);
int partition(int,int);
void main()
{
int i,n;
clrscr();
printf("\nenter the no. of elements");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
quicksort(0,n-1);
printf("\nsorted elements are=");
for(i=0;i<n;i++)
{
printf("%d,",a[i]);
}
getch();
}
void quicksort(int p,int q)
{
int j;
if(p<q)
{
j=partition(p,q+1);
quicksort(p,j-1);
quicksort(j+1,q);
}
}
int partition(int m,int p)
{
int v,j,i,temp;
v=a[m];
i=m;
j=p;
do
{
do
{
i=i+1;
}
while(a[i]<v);
do
{
j=j-1;
}
while(a[j]>v);
if(i<j)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
while(i<j);
a[m]=a[j];
a[j]=v;
return(j);
}

