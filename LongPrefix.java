/* Simple String 
2. Find the longest prefix string an array of strings.
Input: {"flower", "flow", "flight"}
Output : "fl" */

import java.util.Scanner;
public class LongPrefix{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);

System.out.println("Enter the number of strings : ");
	int n=scan.nextInt();
	String a[]=new String[n];
System.out.println("Enter the strings : ");
	for(int i=0;i<n;i++)
		a[i]=scan.next();
	int l=a.length;
	String lcp=a[0];
	for(int i=1;i<=l-1;i++){
	lcp=commonPrefixutil(lcp,a[i]);
	}
	if(lcp.length()>0)
		System.out.println(lcp);
	else
		System.out.println("There is no LCP.");
	}

public static String commonPrefixutil(String str1, String str2){
	String res="";
	int i,j;
	int n1=str1.length(), n2=str2.length();
	for(i=0, j=0;i<=n1-1 && j<=n2-1;i++,j++){
		if(str1.charAt(i)!= str2.charAt(j)){
			break;
		}
		res+=str1.charAt(i);
	}
		return res;
	}
}