#include <stdio.h>
#include<conio.h>
main(char *argv[])
{
    int i = 0,n;
    //char *argv[];
     printf("enter the how many name:");
     scanf("%d",&n);
     for(i = 1; i <= n; i++) {
        scanf("%s\n", argv[i]);
    }
    for(i = 1; i <=n; i++) {
        printf(" %d: %s\n", i, argv[i]);
    }
    getch();
}
