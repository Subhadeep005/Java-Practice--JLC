#include<stdio.h>
#include<conio.h>
main()
{
    int a[]={10,20,30,40,50,60};
    int x;
    int *i,*j;
    i=&a[1];
    j=&a[5];
     /*printf("%d",sizeof(a[4]));
    printf("\n%d",sizeof(j));
    printf("\n%d",sizeof(x));*/
   
    printf("\n%d   %d",j-i,*j-*i);
    getch();
}
