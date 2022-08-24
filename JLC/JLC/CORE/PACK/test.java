class test { 
public static void main(String args[]) {
System.out.println("Main Started");
}
}
class A{
private int a=10;
}
class B extends A{
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}