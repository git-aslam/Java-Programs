/* Diwali Task
6. Find the index of the extra element. */
import java.util.*;
public class ExtraIndex{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int [n-1];
		System.out.println("Enter the elements of 1st Array in Ascending Order : ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println("Enter the elements of 2nd Array(1 index less than 1st array) in Ascending Order : ");
		for(int i=0;i<n-1;i++)
			b[i]=scan.nextInt();
		for(int i=0;i<n;i++)
			if(a[i]!=b[i]){
				System.out.println(i);
				break;
			}
	}
}