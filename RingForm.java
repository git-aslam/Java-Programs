import java.util.Scanner;

public class RingForm{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of strings : ");
int n=scan.nextInt();
int count=0, flag=-1;

System.out.println("Enter the strings : ");
String a[]=new String[n];
for(int i=0;i<n;i++)
a[i]=scan.next();

for(int i=0;i<n-1;i++){
if(a[i].charAt(a[i].length()-1)==a[i+1].charAt(0)){
++count;
flag=1;
}
else 
flag=-1;
}

if(a[n-1].charAt(a[n-1].length()-1)==a[0].charAt(0)){
++count;
flag=1;
}
else
flag=-1;

if(flag==1)
System.out.println(count);
else
System.out.println(flag);
}
}