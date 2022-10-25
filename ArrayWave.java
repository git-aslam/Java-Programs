/* Diwali Task
2. Sort the array int wave form. */
import java.util.*;
public class ArrayWave{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in Ascending Order : ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		 for(int i=0;i<n-1;i+=2){
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		 }
		 for(int i=0;i<n;i++)
			 System.out.print(a[i]+" ");
	}
}
	