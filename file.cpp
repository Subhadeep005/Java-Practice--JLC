#include<stdio.h>
#include<conio.h>
main()
{
      FILE *fp;
      char ch;
      fp=fopen("PR1.C","r");
      while(1)
      {
              ch=fgetc(fp);
              if(ch==EOF)
              break;
              printf("%c",ch);
              }
              printf("\n");
              fclose(fp);
              return(0);
              getch();
              }
