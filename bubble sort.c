#include<stdio.h>
#include<conio.h>
#define size 5
main()
{
      int i,j,no[size],temp;
      printf("Enter the unsorted array:");
      for(i=0;i<size;i++)
      scanf("%d",&no[i]);
      for(i=size-1;i>0;i--)
      {
                           for(j=0;j<i;j++)
                           {
                                           if(no[j]>no[j+1])
                                           {
                                                            temp=no[j];
                                                            no[j]=no[j+1];
                                                            no[j+1]=temp;
                                                            }
                                                            }
                                                            }
                                                            printf("Sorted array is=");
                                                            for(i=0;i<size;i++)
                                                            {
                                                            printf(" %d ",no[i]);
                                                            }
                                                            getch();
                                                            }
      
      
