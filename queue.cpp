#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int queue[5],f=-1,r=-1,maxsize=5;
void insertion()
{
     int x;
     printf("\nenter the no. u want to insert");
     scanf("%d",&x);
     if((f==0 && r=maxsize-1)) || ((f==r+1))
     {
                  printf("\nqueue is full");
                  exit(0);
                  }
                  else
                  {
                      if(r==-1)
                      {
                               f=r=0;
                               queue[r]=x;
                               printf("\nsuccessfull");
                               }
                               else
                               {
                                   r=(r+1)%maxsize;
                                   f=f+1;
                                   queue[r]=x;
                                   printf("\nsuccessfull");
                                   }
                                   }
                                   void deletion()
                                   {
                                        if(f==-1)
                                        {
                                                 printf("\nqueue is empty");
                                                 return;
                                                 }
                                                 else
                                                 if(f==r)
                                                 {
                                                         f=-1;
                                                         r=-1;
                                                         printf("\nsuccessfull");
                                                         }
                                                         else
                                                         {
                                                             printf("\nitem deleted is %d",queue);
                                                             f=(f+1)%maxsize;
                                                             printf("\nsuccessfull");
                                                             }
                                                             }
                                                             }
                                                             void display()
                                                             {
                                                                  int i;
                                                                  if(f==-1)
                                                                  {
                                                                           printf("\nqueue is empty");
                                                                           return();
                                                                           }
                                                                           else
                                                                           {
                                                                               if(r>=f)
                                                                               {
                                                                                       for(i=f;i<r;i++)
                                                                                       {
                                                                                                       printf("\n%d",queue[i]);
                                                                                                       }
                                                                                                       }
                                                                                                       else
                                                                                                       {
                                                                                                           for(i=f;i<maxsize;i++)
                                                                                                           {
                                                                                                                                 printf("\n%d",queue[i]);
                                                                                                                                 }
                                                                                                                                 }
                                                                                                                                 }
                                                                                                                                 }
                                                                                                                                 main()
                                                                                                                                 {
                                                                                                                                       int c,ans;
                                                                                                                                       do
                                                                                                                                       {
                                                                                                                                           printf("\n1.insertion\n2.deletion\n3.display");
                                                                                                                                           scanf("%d",&c);
                                                                                                                                           switch(c)
                                                                                                                                           {
                                                                                                                                                    case 1:insertion();
                                                                                                                                                    break;
                                                                                                                                                    case 2:deletion();
                                                                                                                                                    break;
                                                                                                                                                    case 3:display();
                                                                                                                                                    break;
                                                                                                                                                    default:printf("\nwrong ststemaent");
                                                                                                                                                    }
                                                                                                                                                    printf("\ndo u want to continue");
                                                                                                                                                    scanf("%d",&ans);
                                                                                                                                                    }while(ans==1);
                                                                                                                                                    getch();
                                                                                                                                                    }
                                                                                                                                                    
                                                                                                                                           
                                                                                                                                           
                                                                                                                                           
                                                                                                                                           
                                                                                                            
                                                              
