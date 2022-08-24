#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct stack
{
        int no;
        struct stack *next;
        }node;
        node* push (node*);
        node* pop (node*);
        void disp (node*);
        node *top=NULL;
        main()
        {
              int ch;
              while(1)
              {
              printf("\n 1-push, 2-pop, 3-display, 4-exit");
              printf("\n enter your choice");
              scanf("%d",&ch);
                      if(ch==1)
                      top=push(top);
                      if(ch==2)
                      top=pop(top);
                      if(ch==3)
                      disp(top);
                      if(ch==4)
                      exit(0);
                      }
                      getch();
                      }
                      node* push(node*p)
                      {
                            int x;
                            node *new1;
                            if(p==NULL)
                            {
                                       p=(node*)malloc(sizeof(node));
                                       printf("\n enter the node value");
                                       scanf("%d",&x);
                                       p->no=x;
                                       p->next=NULL;
                                       }
                                       else
                                       {
                                           new1=(node*)malloc(sizeof(node));
                                           printf("\n enter the node value");
                                           scanf("%d",&x);
                                           new1->no=x;
                                           new1->next=p;
                                           p=new1;
                                           }
                                           return(p);
                                           }
                                           node* pop(node*p)
                                           {
                                                 node *pt;
                                                 if(p==NULL)
                                                 {
                                                            printf("\n stack is empty");
                                                            }
                                                            else
                                                            {
                                                 pt=p;
                                                 p=p->next;
                                                 free(pt);
                                                 }
                                                 return(p);
                                                 }
                                                 void disp(node*p)
                                                 {
                                                      node *pt;
                                                      if(p==NULL)
                                                      {
                                                      printf("\n stack is empty");
                                                      }
                                                      else
                                                      {
                                                      for(pt=p;pt!=NULL;pt=pt->next)
                                                      {
                                                                                    printf("\n %d",pt->no);
                                                                                    }
                                                                                    }
                                                                                    }
                                                      
                                                 
                                               
        
        
