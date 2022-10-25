/* Diwali Task
7. Find the 3rd largest number. */
import java.util.*;
public class ThirdLargestNum{
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
		if(n>=3)
			System.out.println(a[n-3]);
		else
			System.out.println("-1");
	}
}