/* String & Array
4. Check for pair in A[] with sum as x. */

import java.util.Scanner;

public class CheckPair{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of elements : ");
int n=scan.nextInt();

int a[]=new int[n];

System.out.println("Enter the elements : ");
for(int i=0;i<n;i++)
a[i]=scan.nextInt();

System.out.println("Enter a number to check its pairs : ");
int x=scan.nextInt();

int count=0;

for(int i=0;i<a.length-1;i++)
for(int j=i+1;j<a.length;j++)
if(a[i]+a[j]==x){
++count;
System.out.printf("(%d, %d) ",a[i],a[j]);
}

System.out.print(count);
}
}