/* String & Array
5. Dictionary Words */

import java.util.Scanner;

public class WordBreak{
static int flag=0;
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

String a[]={"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
int n=a.length;

System.out.println("Enter a string to find : ");
String input=scan.next();

find(0, a, n, "", input);

if(flag==0)
System.out.println("No");

else
System.out.println("Yes");

}

public static void find(int index, String a[], int n, String str, String input){
String str2=str;
str+=a[index];

if(flag==1)
return;

if(str.equals(input)){
flag=1;
return;
}

if(index==n-1)
return;

find(index+1, a, n, str, input);
find(index+1, a, n, str2, input);
}

}