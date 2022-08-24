#include<stdio.h>
#include<conio.h>
#include<string.h>
main(){
     char q[30];
     int n,i;
     printf("enter the how many name:");
     scanf("%d",&n);
     for(i=1;i<=n;i++)
     {
     printf("enter the %d name:",i);
     scanf("%s",q);
     //gets(q);
     }
     printf("%c",q[0]);
     //puts(q);
     getch();
     }
