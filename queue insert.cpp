#include<stdio.h>
#include<conio.h>
void insert (void);
main()
{
int a[20],size,r=-1,f=-1;
insert();
 {
        int x;
     printf("enter the size");
     scanf("%d",&size);
     if(r==size-1)
     printf("\nqueque is full");
     else
     {
      if(r==-1&&f==-1)
      {
                      r=r++;
                      f=f++;
          }
          else
          r=r+1;
          printf("\nenter new element");
          scanf("%d",&x);
          a[r]=x;
      } 
 }
          getch();
}
      
          
