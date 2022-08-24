#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct link
{
        int no;
        struct link *next;
        }node;
        node *head=NULL,*ptr;
        node* create(node*);
        void disp(node*);
        main()
        {
              int ch;
              while(1)
              {
                      printf("\n1.create");
                      printf("\n2.display");
                      printf("\n3.exit");
                      printf("\nenter ur choices");
                      scanf("%d",&ch);
                      if(ch==1)
                      head=create(head);
                      if(ch==2)
                      disp(head);
                      if(ch==3)
                      exit(0);
                      }
                      getch();
                      }
                      node*create(node*p)
                      {
                                         int x;
                      if(p==NULL)
                      {
                               p=(node*)malloc(sizeof(node));
                               printf("\nenter the value");
                               scanf("%d",&x);
                               p->no=x;
                               p->next=NULL;
                               ptr=p;
                               }
                               else
                               {
                                   ptr->next=(node*)malloc(sizeof(node));
                                   ptr=ptr->next;
                                   printf("\nenter the value");
                                   scanf("%d",&x);
                                   ptr->no=x;
                                   ptr->next=NULL;
                                   }
                                   return p;
                                   }
                      void disp(node *pt)
                      {
                           while(pt!=NULL)
                           {
                                          printf("%d->",pt->no);
                                          pt=pt->next;
                                          }
                                          }
