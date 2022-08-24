#include<stdio.h>
#include<conio.h>
main() {
   FILE *fp;

   fp = fopen("test.txt", "wb");
   fprintf(fp, "This is testing for fprintf... ba\n");
   fputs("This is testing for fputs...su\n", fp);
   fclose(fp);
   getch();
}
