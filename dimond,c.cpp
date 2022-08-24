#include<stdio.h>
#include <conio.h>
main()
{
int i,j,l,n,s,k=9;
for(i=1;i<=9;i+=2)
{
for(l=1;l<=k;l++)
printf(" ");
for(j=1;j<=i;j++)
printf("\n");
k=k-2;
}
k=k+4;
for(n=7;n>=1;n-=2)
{
for(i=1;i<=k;i++)
printf(" ");
for(s=1;s<n;s++)
printf("%d",s);
printf("\n");
k=k+2;
}
getch( );
}
