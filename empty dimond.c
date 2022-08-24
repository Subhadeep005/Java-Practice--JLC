#include<stdio.h>
#include<conio.h>
main()
{
int n,i,j,l,x,y,k,p,b,ch;
while(1)
{
printf("1-Start\n2-Exit ");
scanf("%d",&ch);
if(ch==1)
{
printf("Enter the only odd value which is greter than two:");
scanf("%d",&n);
k=40;b=1;p=0;
y=(n-4);
for(i=1;i<=5;i++)
printf("\n");
for(i=1;i<=n;i+=2)
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
j=i-1;
}
}
}
printf("\n");
k-=1;
}
p=(k+2);
for(i=n-2;i>=1;i-=2)
{
for(l=1;l<=p;l++)
printf(" ");
for(j=1;j<=i;j++)
{
if(j==1||j==i)
printf("*");
else
{
for(x=1;x<=y;x++)
printf(" ");
y-=2;
j=i-1;
}
}
printf("\n");
p+=1;
}
}
else
exit(0);
}
getch( );
}
