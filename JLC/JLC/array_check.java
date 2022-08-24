class test{
public static void main(String args[]){
int arr[]={11,22,33};
System.out.println(arr);
for(int i:arr)
System.out.println(i);
int arr1[]=arr;
arr1[0]=44;
arr1[1]=55;
arr1[2]=66;
System.out.println("****************");
System.out.println(arr1);
for(int i:arr1)
System.out.println(i);
System.out.println("****************");
System.out.println(arr);
for(int i:arr)
System.out.println(i);
}
}