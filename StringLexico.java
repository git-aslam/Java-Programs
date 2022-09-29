/* String set 1
2. Remove duplicates and in lexicographical order. */

import java.util.Scanner;
public class StringLexico{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.next();
		boolean visited[]=new boolean[str.length()];
		for(int i=0;i<str.length();i++){
			if(visited[i]==true)
			continue;
		for(int j=i+1;j<str.length();j++)
			if(str.charAt(i)==str.charAt(j))
			visited[j]=true;
		System.out.print(str.charAt(i));
		}
	}
}