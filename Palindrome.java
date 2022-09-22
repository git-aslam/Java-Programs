/* String & Array
1. Palindrome or not. 
Input : RACE CAR 
Input : I DID, DID I? */

import java.util.Scanner;

public class Palindrome{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter a string : ");
String str=scan.nextLine();

String org="";
String rev="";
int i;

for(i=0;i<str.length();i++)
if('a'<=str.charAt(i) && str.charAt(i)<='z' || 'A'<=str.charAt(i) && str.charAt(i)<='Z')
org=org+str.charAt(i);

for(i=org.length()-1;i>=0;i--)
rev=rev+org.charAt(i);

boolean flag[]=new boolean[str.length()];

for(i=0;i<org.length();i++)
if(org.charAt(i)==rev.charAt(i))
flag[i]=true;

for(i=0;i<flag.length;i++){
if(flag[i]==false){
System.out.println("Not a Palindrome.");
break;
}

else{
System.out.println("Its a Palindrome.");
break;
}
}

}
}
