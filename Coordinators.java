/* 1. Print all the Coordinators.
Input : {-1,17,4,3,5,2}
Output : {17,5} */

import java.util.Scanner;

public class Coordinators{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of array elements : ");
int n=scan.nextInt();

int a[]=new int[n];
int i, j;

System.out.println("Enter the elements : ");
for(i=0;i<n;i++)
a[i]=scan.nextInt();

for(i=0;i<n;i++){
for(j=i+1;j<n;j++)

if(a[i]<=a[j])
break;

if(j==n)
System.out.print(a[i]+ " ");
}
}
}