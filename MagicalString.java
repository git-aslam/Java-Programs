/* String set 1
3. Magical String consists of only '1' and '2'. */

import java.util.Scanner;
public class MagicalString{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		String str="1221121221221121122";
		System.out.println("Enter a number : ");
		int n=scan.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
			if(str.charAt(i)=='1')
				count++;
		System.out.println(count);
	}
}