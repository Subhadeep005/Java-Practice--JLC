#include<stdio.h>
#include<conio.h>
main()
{
      int a[100],i,j,no,temp;
      printf("\nenter the no.");
      scanf("%d",&no);
      printf("\nenter %d no.:",no);
      for(i=0;i<no;i++)
      scanf("%d",&a[i]);
      for(i=no-1;i>0;i--)
      {
                        for(j=0;j<i;j++)
                        {
                                   if(a[j]>a[j+1])
                                   {
                                                    temp=a[j];
                                                    a[j]=a[j+1];
                                                    a[j+1]=temp;
                                                    }
                                                    }
                                                    }
                                                    printf("\nsorted array is");
                                                    for(i=0;i<no;i++)
                                                    {
                                                                     printf("%d->",a[i]);
                                                                     }
                                                                     getch();
                                                                     }
                                        
      
