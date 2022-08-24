class A{
void m1(){
System.out.println("m1()");
}
}
class B extends A{
void m2(){
System.out.println("m2()");
m1();
}
}
class Sss extends B{
public static void main(String args[]){
Sss bobj = new Sss();
bobj.m1();
bobj.m2();
}
}