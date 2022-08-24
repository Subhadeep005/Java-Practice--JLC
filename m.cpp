#include<stdio.h>
#include<>conio.h
main()
{
      int no,i,j,b;
      printf("enter the value ");
      scanf("%d",&no);
      b=no-1;
      for(i=1;i<=no;i++);
      {
            for(j=1;j<=b;j++)
            {
                             printf("");
                             for(j=1;j<=i;j++)
                             {
                                 printf("*");
                                     }
                            printf("\n");
      
                                 b-- ;       
                                      getch();
                                              }
                                              }
