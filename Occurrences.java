/* String & Array
8. Number of occurrences of each number.
Input : {2,3,2,6,1,6,2}
Output : 1-1, 2-3, 3-1, 6-2. */

import java.util.Scanner;

public class Occurrences{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of elements : ");
int n=scan.nextInt();

int a[]=new int[n];

System.out.println("Enter the elements : ");
for(int i=0;i<n;i++)
a[i]=scan.nextInt();

for(int i=0;i<a.length;i++)
for(int j=i+1;j<a.length;j++)
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}

boolean visited[]=new boolean[n];
int count=0;

for(int i=0;i<n;i++){
count=1;
if(visited[i]==true)
continue;

for(int j=i+1;j<n;j++)
if(a[i]==a[j]){
visited[j]=true;
count++;
}

System.out.println(a[i]+ "-" +count);
}
}
}