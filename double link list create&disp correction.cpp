#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct dlink
{
        int no;
        struct dlink *next;
        struct dlink *prev;
        }node;
        node *head=NULL,*ptr;
        node* create(node*);
        void disp(node*);
        void display(node*);
        node* insert(node*);
        node* del(node*);
        main()
        {
             int ch;
             while(1)
             {
                     printf("\n1.create");
                     printf("2.normal display ");
                     printf("3.reverse display");
                     printf("4.insert ");
                     printf("5.delete ");
                     printf("6.exit");
                     printf("\nenter ur choice");
                     scanf("%d",&ch);
                     if(ch==1)
                     head=create(head);
                     else if(ch==2)
                     disp(head);
                     else if(ch==3)
                     display(ptr);
                     if(ch==4)
                     head=insert(head);
                     if(ch==5)
                     head=del(head);
                     if(ch==6)
                     exit(0);
                     }
                     getch();
                     }
                     node* create(node *p)
                     {
                           int x;
                           if(p==NULL)
                           {
                                      p=(node*)malloc(sizeof(node));
                                      printf("\nenter the value");
                                      scanf("%d",&x);
                                      p->no=x;
                                      p->next=NULL;
                                      p->prev=NULL;
                                      ptr=p;
                                      }
                                      else
                                      {
                                          ptr->next=(node*)malloc(sizeof(node));
                                          ptr->next->prev=ptr;
                                          ptr=ptr->next;
                                          printf("\nenter a node value");
                                          scanf("%d",&x);
                                          ptr->no=x;
                                          ptr->next=NULL;
                                          }
                                          return p;
                                          }
                                          void disp(node *p)
                                          {
                                               node *pt;
                                               for(pt=p;pt!=NULL;pt=pt->next)
                                               {
                                                              printf("%d->",pt->no);
                                                              }
                                                              }
                                                              void display(node*p)
                                                              {
                                                                   node *pt;
                                                                   for(pt=p;pt!=NULL;pt=pt->prev)
                                                                   {
                                                                                                 printf("%d->",pt->no);
                                                                                                 }
                                                                                                 }
                                                              node*insert(node*p)
                                                              {
                                                                       int x,x1,ch;
                                                                       node *pt1,*new1;
                                                                       new1=(node*)malloc(sizeof(node));
                                                                                 printf("\n enter the node value");
                                                                                 scanf("%d",&x);
                                                                                 new1->no=x;
                                                                                 new1->next=NULL;
                                                                                 new1->prev=NULL;
                                                                                 printf("1-insert as a head, 2-insert as a after, 3-insert as a before");
                                                                                 printf("\n enter ur choice");
                                                                                 scanf("%d",&ch);
                                                                                 if(ch==1)
                                                                                 {
                                                                                          new1->next=p;
                                                                                          p->prev=new1;
                                                                                          p=new1;
                                                                                          }
                                                                                          if(ch==2)
                                                                                          {
                                                                                                   printf("\n enter the node value after which uyou want to insert the new node");
                                                                                                   scanf("%d",&x1);
                                                                                                   for(pt1=p;pt1!=NULL;pt1=pt1->next)
                                                                                                   {
                                                                                                                                     if(pt1->no==x1)
                                                                                                                                     break;
                                                                                                                                     }
                                                                                                                                     new1->next=pt1->next;
                                                                                                                                     new1->prev=pt1;
                                                                                                                                     pt1->next=new1;
                                                                                                                                     new1->next->prev=new1;
                                                                                                                                     }
                                                                                                                                     
                                                                                                                                     if(ch==3)
                                                                                                                                     {
                                                                                                                                              printf("\n enter the node value before which uyou want to insert the new node");
                                                                                                                                              scanf("%d",&x1);
                                                                                                                                              for(pt1=p;pt1!=NULL;pt1=pt1->next)
                                                                                                                                              {
                                                                                                                                                                                if(pt1->next->no==x1)
                                                                                                                                                                                break;
                                                                                                                                                                                }
                                                                                                                                                                                new1->prev=pt1;
                                                                                                                                                                                new1->next=pt1->next;
                                                                                                                                                                                pt1->next=new1;
                                                                                                                                                                                new1->next->prev=new1;
                                                                                                                                                                                }
                                                                                                                                                                                return(p);
                                                                                                                                                                                }
                                               
                                                                                                                                                                                node* del(node *p)
                                                                                                                                                                                {
                                                                                                                                                                                                   node *pt,*pt1,*pt2;
                                                                                                                                                                                                   int x1,ch;
                                                                                                                                                                                                   printf("\n 1-delete as a haad,2-delete as a specific node");
                                                                                                                                                                                                   printf("\n enter ur choice");
                                                                                                                                                                                                   scanf("%d",&ch);
                                                                                                                                                                                                   if(ch==1)
                                                                                                                                                                                                   {
                                                                                                                                                                                                           pt=p;
                                                                                                                                                                                                           p->next->prev=NULL; 
                                                                                                                                                                                                           p=p->next;
                                                                                                                                                                                                           free(pt);
                                                                                                                                                                                                           }
                                                                                                                                                                                                   if(ch==2)
                                                                                                                                                                                                   {
                                                                                                                                                                                                            printf("enter the node value crrosponding which you want to delete");
                                                                                                                                                                                                            scanf("%d",&x1);
                                                                                                                                                                                                            for(pt1=p;pt1!=NULL;pt1=pt1->next)
                                                                                                                                                                                                            {
                                                                                                                                                                                                                                              if(pt1->next->no==x1)
                                                                                                                                                                                                                                              break;
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                              pt2=pt1->next;
                                                                                                                                                                                                                                              pt1->next=pt2->next;
                                                                                                                                                                                                                                              pt2->next->prev=pt1;
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                              return(p);
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                            
                                                                                                                                                                                                                                              
                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                              
        
