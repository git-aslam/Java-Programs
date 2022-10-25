/* Diwali Task
9. Find the median of 2 sorted arrays. */
import java.util.*;
public class MedianOfArrays{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in 1st Array : ");
		int m=scan.nextInt();
		int a[]=new int[m];
		System.out.println("Enter the elements of 1st Array in Ascending Order : ");
		for(int i=0;i<m;i++)
			a[i]=scan.nextInt();
		System.out.println("Enter the number of elements in 2nd Array : ");
		int n=scan.nextInt();
		int b[]=new int[n];
		System.out.println("Enter the elements of 2nd Array in Ascending Order : ");
		for(int i=0;i<n;i++)
			b[i]=scan.nextInt();
		a=new int[m+n];
		for(int i=m,j=0;i<m+n&&j<n;i++,j++)
			a[i]=b[j];
		for(int i=0;i<m+n-1;i++)
			for(int j=0;j<m+n;j++)
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		float median=(a[(m+n)/2-1]+a[(m+n)/2])/2;
		System.out.println("Median : "+median);
	}
}