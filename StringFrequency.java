/* String set 1
5. Return the frequency of each character in string. */

import java.util.Scanner;
public class StringFrequency{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.next();
		System.out.println("Enter a number : ");
		int k=scan.nextInt();
		int ans=0, count=0;
		boolean visited[]=new boolean[str.length()];
		for(int i=0;i<str.length();i++){
			if(visited[i]==true)
			continue;			
			count=1;
		for(int j=i+1;j<str.length();j++)
			if(str.charAt(i)==str.charAt(j)){
			visited[j]=true;
			count++;
			}
		if(count>=k)
			ans+=count;
		}
		System.out.print(ans);
	}
}
					