#include<iostream>
#include <conio.h>
using namespace std;
class temp
{
      private:
              float f,c;
      public:
             void getdata();
             void display()
             {
               cout<<"\nThe centrigrade value is:="<<c;
               }
};
void temp :: getdata()
{      
          cout<<"\nEnter the fharenheit value:=";
          cin>>f;
          c=(5*(f-32))/9;
          }
main()
{
      temp t;
      t.getdata();
      t.display();
      getch();
      }
