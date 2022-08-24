#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<stdlib.h>
typedef struct link
{
        int no;
        struct link *next;
}node;
node *head=NULL,*ptr;
node* create(node*);
void display(node*);
main()
{
      int ch;
      while(1)
      {
              printf("\n 1 for create, 2 for display, 3 for exit.");
              printf("\n enter your coice:");
              scanf("%d",&ch);
              if (ch==1)
              head=create(head);
              else if(ch==2)
              display(head);
              else if(ch==3)
              exit(0);
              }
              
getch();
}
node* create(node*p)
{
      int x;
      if(p==NULL)
      {
                  p=(node*)malloc(sizeof(node));
                  printf("\n enter the node value");
                  scanf("%d",&x);
                  p->no=x;
                  p->next=NULL;
                  ptr=p;
                  }
                  else
                  {
                      ptr->next=(node*)malloc(sizeof(node));
                      ptr=ptr->next;
                      printf("\n enter the node value");
                      scanf("%d",&x);
                      ptr->no=x;
                      ptr->next=NULL;
                      }
                      return(p);
}
void display(node*pt)
{
     while(pt!=NULL)
     {
                   printf("%d->",pt->no);
                   pt=pt->next;
                   }
}
                   
                                         

                                       
                      
