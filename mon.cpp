#include<stdio.h>
#include<conio.h>
main()
{
      int i,no,j;
      printf("enter the value ");
      scanf("%d",&no);
      {
                      for(i=1;i<=no;i++)
                      {
                                       for(j=i;j<=no;j++)
                                       {
                                                        printf("%d",j);
                                                        }
                                                        printf("\n");
                                                        no=no+1;
                                                        }
                                                        }
                                                        getch();
                                                        }
