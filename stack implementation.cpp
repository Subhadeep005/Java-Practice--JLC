#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct stack
{
        int no;
        struct stack *next;
        }node;
        node *top=NULL;
        node* push(node*);
        void disp(node*);
        main()
        {
              int ch;
              while(1)
              {
                      printf("\n1.push");
                      printf("\n3.display");
                      printf("\n4.exit");
                      printf("\nenter ur choices");
                      scanf("%d",&ch);
                      if(ch==1)
                      top=push(top);
                      if(ch==3)
                      disp(top);
                      if(ch==4)
                      exit(0);
                      }
                      getch();
                      }
                      node* push(node *p)
                            {
                            node *new1;
                            int x;
                            if(p==NULL)
                            {
                            p=(node*)malloc(sizeof(node));
                            printf("\nenter the node value");
                            scanf("%d",&x);
                            p->no=x;
                            p->next=NULL;
                            }
                            else
                            {
                                new1=(node*)malloc(sizeof(node));
                                printf("\nenter the node value");
                                scanf("%d",&x);
                                new1->no=x;
                                new1->next=p;
                                p=new1;
                                }
                                return(p);
                                }
                                void disp(node *p)
                                {
                                     node *pt;
                                     for(pt=p;pt!=NULL;pt=pt->next)
                                     {
                                                                   printf("\n%d",pt->no);
                                                                   }
                                                                   }
                      
        
        
        
