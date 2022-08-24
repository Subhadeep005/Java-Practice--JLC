#include<stdio.h>
#include<conio.h>
main()
{
int i,n,a[100],key,f=0;
printf("\nenter the elements u want to use");
scanf("%d",&n);
for(i=0;i<n;i++)
scanf("%d",&a[i]);
printf("\nenter the key of the searching element u want to  use");
scanf("%d",&key);
for(i=0;i<n;i++)
{               
if(a[i]==key)
{
             printf("\nelement found at pos%d",i=i+1);
             f=1;
             }
             }
             if(f==0)
             printf("\nelement not found");
             getch();
             }
             
