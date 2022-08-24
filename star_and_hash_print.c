#include<stdio.h>
#include<conio.h>
main()
{
      int n,i,j,k;
      printf("Enter a value of N=");
      scanf("%d",&n);
      for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
      printf("*");
      }
      for(k=n-1;k>=i;k--){
      printf("#");
      } 
      printf("\n");
      }
      getch();
      }
