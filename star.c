#include<stdio.h>
#include<conio.h>
main()
{
      int n,i,j,s=1;
      printf("\nenter the any integer no:=");
      scanf("%d",&n);
      for(i=n;i>=1;i--)
      {
                        printf("%d=",s);
                       for(j=1;j<=i;j++)
                       {
                                        printf("*");
                                        }
                                        printf("%d\n",s);
                                        s++;
                                        }
                                        getch();
                                        }
