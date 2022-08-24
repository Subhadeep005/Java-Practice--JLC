#include<stdio.h>
#include<conio.h>
main(){
     //char q[3][20];
     int n,i;
     printf("enter the how many name:");
     scanf("%d",&n);
     char q[n][20];
     for(i=1;i<=n;i++)
     {
     printf("enter the %d name:",i);
     scanf("%s",&q[i]);
     }
      for(i=1;i<=n;i++)
     {
     printf("%d name is:",i);
    printf("%s\n",q[i]);
     }
     getch();
     }
