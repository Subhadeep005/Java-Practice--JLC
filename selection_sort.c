#include<stdio.h>
#include<conio.h>
#define size 5
main()
{
      int i,j,k,no[size],max;
      printf("Enter the unsorted array:");
      for(i=0;i<size;i++)
      scanf("%d",&no[i]);
      for(i=size-1;i>0;i--)
      {
                           max=0;
                           k=0;
                           for(j=0;j<=i;j++)
                           {
                                           if(max<no[j])
                                           {
                                                            max=no[j];
                                                            k=j;
                                                            }
                                                            }
                                                            no[k]=no[i];
                                                            no[i]=max;
                                                            }
                                                            printf("Sorted array is=");
                                                            for(i=0;i<size;i++)
                                                            {
                                                            printf(" %d ",no[i]);
                                                            }
                                                            getch();
                                                            }
      
      
