/* Diwali Task
15. Return the only number in the range that is missing. */
import java.util.*;
public class MissingNumber{
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
		for(int i=0;i<n;i++)
			if(a[i]!=i){
				System.out.println(i);
				break;
			}
			else if(i+1==n)
				System.out.println(i+1);
	}
}