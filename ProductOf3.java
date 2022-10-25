/* Diwali Task
11. Find if the product of the 3 candidates is maximum. */
import java.util.*;
public class ProductOf3{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		System.out.println(a[n-1]*a[n-2]*a[n-3]);
	}
}