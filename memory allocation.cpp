#include<stdio.h>
#include<conio.h>
#include<malloc.h>
typedef struct ABC
{
        int a;
        float b;
        }abc;
        main()
        {
              abc *p;
              int n,i,t1;
              float t2;
              printf("\nenter the size of array");
              scanf("%d",&n);
              p=(abc *)malloc(n*(sizeof(abc)));
              printf("\n enter the value of t1 & t2 \n");
              for(i=0;i<n;i++)
              {
                              scanf("%d%f",&t1,&t2);
                              (p+i)->a=t1;
                              (p+i)->b=t2;
                              }
                              for(i=0;i<n;i++)
                              {
                              printf("%d%f",(p+i)->a,(p+i)->b);
                              }
                              getch();
                              }
                              
