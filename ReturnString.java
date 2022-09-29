/* Simple String 
5. Given an integer and return a string array */

import java.util.Scanner;

public class ReturnString{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
String str[]={"Fizz", "Buzz"};
System.out.println("Enter a number : ");
int n=scan.nextInt();
for(int i=1;i<=n;i++){
	if(i%3==0 && i%5==0)
		System.out.print(str[0]+str[1]);
	else if(i%3==0)
		System.out.print(str[0]+" ");
	else if(i%5==0)
		System.out.print(str[1]+" ");
	else
		System.out.print(i+" ");
	}
}
}
