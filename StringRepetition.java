/* String set 1
1. Strings Repetition */

import java.util.Scanner;
public class StringRepetition{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.next();
		System.out.println("Enter the count : ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(str+" ");
	}
}