#include<stdio.h>
#include<conio.h>
int a[100];
void mergesort(int,int);
void merge(int,int,int);
void main()
{
int i,n;
clrscr();
printf("\nenter the no. of elements");
scanf("%d",&n);
printf("\nenter the array elements");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
mergesort(0,n-1);
printf("\nsorted order of elements=");
for(i=0;i<n;i++)
{
printf("%d,",a[i]);
}
getch();
}
void mergesort(int l,int h)
{
int m;
if(l<h)
{
m=(l+h)/2;
mergesort(l,m);
mergesort(m+1,h);
merge(l,m,h);
}
}
void merge(int l,int m,int h)
{
int i,j,b[10],k;
i=h=l;
j=m+1;
while((h<=m)&&(j<=h))
{
if(a[h]<=a[j])
{
b[i]=a[h];
h=h+1;
}
else
{
b[i]=a[j];
j=j+1;
}
i=i+1;
}
if(h>m)
{
for(k=j;k<=h;k++)
{
b[i]=a[k];
i=i+1;
}
}
else
{
for(k=h;k<=m;k++)
{
b[i]=a[k];
i=i+1;
}
}
for(k=l;k<=h;k++)
{
a[k]=b[k];
}
}