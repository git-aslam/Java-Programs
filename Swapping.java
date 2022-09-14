import java.util.Scanner;
class Swapping{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int temp=a;
a=b;
b=temp;
System.out.println(a+"\n");
System.out.println(b);
}
}