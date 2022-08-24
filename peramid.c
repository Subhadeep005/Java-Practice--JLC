#include<stdio.h>
#include<conio.h>
main()
{
int i,j,l,x,k=10,p=7,b=1;
for(i=1;i<=9;i+=2)
{
for(l=1;l<=k;l++)
printf(" ");
for(j=1;j<=i;j++)
{
if(i==j)
printf("*");
else if(j<i)
{
printf("*");
if(i!=1)
{
for(x=1;x<=b;x++)
printf(" ");
b+=2;
j=b-1;
}
}
}
printf("\n");
k-=1;
}
for(i=7;i>=1;i-=2)
{
for(l=1;l<=p;l++)
printf(" ");
for(j=1;j<=i;j++)
printf("*");
printf("\n");
p+=1;
}
getch( );
}
