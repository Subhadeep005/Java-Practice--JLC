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
node* insert(node*);
node* del(node*);
main()
{
      int ch;
      while(1)
      {
              printf("\n1.create ");
               printf("2.display ");
                printf("3.insert ");
                 printf("4.delete ");
                  printf("5.exit ");
                  printf("\nenter ur choice:");
                  scanf("%d",&ch);
                  if(ch==1)
                  head=create(head);
                  else if(ch==2)
                  disp(head);
                  else
                   if(ch==3)
                  head=insert(head);
                  else if(ch==4)
                  head=del(head);
                  else if(ch==5)
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
                                  printf("\nenter a node value");
                                    scanf("%d",&x);
                                  p->no=x;
                                  p->next=NULL;
                                  ptr=p;
                                  }
                                  else
                                  {
                                      ptr->next=(node*)malloc(sizeof(node));
                                      ptr=ptr->next;
                                      printf("\nenter a node value");
                                      scanf("%d",&x);
                                      ptr->no=x;
                                      ptr->next=NULL;
                                      }
                                      return p;
                                      }
                                      void disp(node*pt)
                                       {
                                           while(pt!=NULL)
                                           {
                                                          printf("%d->",pt->no);
                                                          pt=pt->next;
                                                          }
                                                          }
                                                          node* insert(node *p)
                                                          {
                                                                node *pt1,*new1;
                                                                int x,x1,ch;
                                                                new1=(node*)malloc(sizeof(node));
                                                                printf("\nenter the node value");
                                                                scanf("%d",&x);
                                                                new1->no=x;
                                                                new1->next=NULL;
                                                                printf("\n1. insert as head");
                                                                printf("\n2. insert as after");
                                                                printf("\n3. insert as before");
                                                                printf("\nenter ur choice");
                                                                scanf("%d",&ch);
                                                                if(ch==1)
                                                                {
                                                                         new1->next=p;
                                                                         p=new1;
                                                                         }
                                                                         else if(ch==2)
                                                                         {
                                                                              printf("\nenter a node value after which u want to insert the new node");
                                                                              scanf("%d",&x1);
                                                                              for(pt1=p;pt1!=NULL;pt1=pt1->next)
                                                                              {
                                                                                                                if(pt1->no==x1)
                                                                                                                break;
                                                                                                                }
                                                                                                                new1->next=pt1->next;
                                                                                                                pt1->next=new1;
                                                                                                                }
                                                                                                                else if(ch==3)
                                                                                                                {
                                                                                                                     printf("\nenter the node value before which u want to insert the new node ");
                                                                                                                     scanf("%d",&x1);
                                                                                                                     for(pt1=p;pt1!=NULL;pt1=pt1->next)
                                                                                                                     {
                                                                                                                                                       if(pt1->next->no==x1)
                                                                                                                                                       break;
                                                                                                                                                       }
                                                                                                                                                       new1->next=pt1->next;
                                                                                                                                                       pt1->next=new1;
                                                                                                                                                       }
                                                                                                                                                       return p;
                                                                                                                                                       }
                                                                                                                                                       node* del(node *p)
                                                                                                                                                       {
                                                                                                                                                             node *pt1,*new1,*pt2;
                                                                                                                                                             int ch,x1;
                                                                                                                                                             printf("\n1.delete as head");
                                                                                                                                                             printf("\n2.delete as a specific node");
                                                                                                                                                             printf("\nenter ur choice");
                                                                                                                                                             scanf("%d",&ch);
                                                                                                                                                             if(ch==1)
                                                                                                                                                             {
                                                                                                                                                                      pt1=p;
                                                                                                                                                                      p=p->next;
                                                                                                                                                                      free(pt1);
                                                                                                                                                                      }
                                                                                                                                                                      else if(ch==2)
                                                                                                                                                                      {
                                                                                                                                                                           printf("\nenter the node value corresponding which node u want to delete");
                                                                                                                                                                           scanf("%d",&x1);
                                                                                                                                                                           for(pt1=p;pt1!=NULL;pt1=pt1->next)
                                                                                                                                                                           {
                                                                                                                                                                                                             if(pt1->next->no==x1)
                                                                                                                                                                                                             break;
                                                                                                                                                                                                             }
                                                                                                                                                                                                             pt2=pt1->next;
                                                                                                                                                                                                             pt1->next=pt2->next;
                                                                                                                                                                                                             free(pt2);
                                                                                                                                                                                                             }
                                                                                                                                                                                                             return p;
                                                                                                                                                                                                             }
              
                                                                                                                                                                                                             
                                                                              
                                                                                                                                                                                                                      
                                                                
                                                           
                                           
                  
                  
