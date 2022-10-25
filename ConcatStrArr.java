/* Diwali Task
16. Return true if 2 concatenated string arrays are equal. */
import java.util.*;
public class ConcatStrArr{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of strings in 1st Array : ");
		int n1=scan.nextInt();
		String str1[]=new String[n1];
		System.out.println("Enter the strings : ");
		for(int i=0;i<n1;i++)
			str1[i]=scan.next();
		System.out.println("Enter the number of strings in 2nd Array : ");
		int n2=scan.nextInt();
		String str2[]=new String[n2];
		System.out.println("Enter the strings : ");
		for(int i=0;i<n1;i++)
			str2[i]=scan.next();
		String s1="", s2="";
		for(int i=0;i<n1;i++)
			s1+=str1[i];
		for(int i=0;i<n2;i++)
			s2+=str2[i];
		if(s1.equals(s2))
			System.out.println("true");
		else
			System.out.println("false");
	}
}