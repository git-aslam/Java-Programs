/* Minimum and Maximum */

import java.util.Scanner;

public class MiniMax{
public static void main(String[]args){

System.out.println("Enter the number of elements : ");
Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int a[]=new int[n];

System.out.println("Enter the elements : ");
for(int i=0;i<n;i++)
a[i]=scan.nextInt();

int min=a[0];
int max=a[n-1];

for(int i=0;i<n;i++){
if(min>a[i])
min=a[i];
if(max<a[i])
max=a[i];
}
System.out.println("\nMinimum = "+min);
System.out.println("\nMaximum = "+max);
}
}