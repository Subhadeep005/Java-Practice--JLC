#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void push(void);
void pop(void);
void disp(void);
int a[20],i,top=-1,size=5;
main()
{
     int ch;
     while(1)
     {
             printf("\npress 1 for push");
             printf("\npress 2 for pop");
             printf("\npress 3 for display");
             printf("\npress 4 for exit");
             printf ("\nenter ur choice");
             scanf("%d",&ch);
             if(ch==1)
             push();
             else if(ch==2)
             pop();
             else if(ch==3)
             disp();
             else if(ch==4)
             exit(0);
             }
             getch();
             }
             void push()
             {
                  int x;
                 if(top==size-1)
                 printf("overflow");
                 else
                 {
                     top=top+1;
                     printf("\nenter the new stack element");
                     scanf("%d",&x);
                     a[top]=x;
                     }
                     }
                        void pop()
                        {
                     int x;
                         if(top==-1)
                         printf("\n underflow");
                         else
                         {
                             x=a[top];
                             printf("\n %d is remove from the stack");
                             top=top-1;
                             }
                             }
                                void disp()
                             {
                                  if(top==-1)
                                  printf("\nempty stack");
                                  else
                                  {
                                       for(i=top;i>=0;i--)
                                         printf("%d,",a[i]);
                                      }
                                      }
                                      
                                      
                                      
                             
