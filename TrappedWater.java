/* Diwali Task
1. Compute how much water can be trapped between the blocks. */
import java.util.*;
public class TrappedWater{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int count=0, k=0;
		for(int i=0;i<n;i++)
			if(a[0]>=a[i]&&a[i]<=a[n-1])
				if(a[i]!=a[n-1]){
					k=a[0]-a[i];
					count+=k;
				}
		System.out.println(count);
	}
}