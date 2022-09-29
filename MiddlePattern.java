/* String & Array 
7. Print the pattern from the middle */

import java.util.Scanner;

public class MiddlePattern{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.next();
		int n=(str.length()-1)*2;
		char arr[]=new char[str.length()];
		int i=0, j=0;
		for(i=str.length()/2;i<str.length();i++){
			arr[j]=str.charAt(i);
			j++;
		}
		for(i=0;i<str.length()/2;i++){
			arr[j]=str.charAt(i);
			j++;
		}
		for(i=0;i<str.length();i++){
			if(n>0)
				System.out.format(" %1$"+n+"s", "");
		for(int k=0;k<i+1;k++)
			System.out.print(arr[k]);
		System.out.println();
		n=n-2;
		}
	}
}