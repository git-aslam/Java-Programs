/* Diwali Task
21. Print the elements which are greater than its previous elements. */
import java.util.*;
public class GreatPre{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0,j=i+1;i<n-1&&j<n;i++,j++)
			if(a[j]>a[i])
				System.out.print(a[j]+" ");
			else
				continue;
	}
}