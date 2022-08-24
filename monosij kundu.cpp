#include<stdio.h>
#include<conio.h>
void insert(void);
void del(void);
void disp(void);
int a[20],size,r=-1,f=-1; 
main() 

{
     int i,x,ch;
     printf("enter the size");
     scanf("%d",&size);
     while(1)
     {
            printf("\n1. insert");
            printf("\n2. delete");
            printf("\n3. disp");
             printf("4. exit");
           printf("enter your choice");
           scanf("%d",&ch);
           if(ch==4)
           break;
           getch();
           }
           if(ch==1)
           insert();
 {
      int x;
      if(r==size-1)
      printf("\n queue is full");
      else
          if(r==-1&&f==-1)
          {
                          r=r+1;
                          f=f+1;
                          }
                          else
                          r=r+1;
                          printf("\n enter new element");
                          scanf("%d",&x);
                          a[r]=x;
                          }
                           if(ch==2)
                          del();
                          {
                               if(f==-1) 
                               printf("\n queue is empty");
                               else
                               {
                                   x=a[f];
                                   printf("%dis deleted",x);
                                   if(r==f)
                                   {
                                           r=-1;
                                           f=-1;
                                           }
                                           else  
                                           f=f+1;      
                                           }
                                           }
                                            if(ch==3)
                                           disp();
                                           {
                                                int i;
                                                if(f==-1)
                                                printf("queue is empty");
                                                else
                                                    for(i=f;i<=r;i++)
                                                    printf("%d",a[i]);
                                                    }
                                                    
                                                                                                        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
             
