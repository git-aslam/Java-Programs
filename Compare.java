/* Task-2
5. Compare two numbers.
Input : a=25 and b=39
Output : 25!=39 25<39 25<=39 */

import java.util.Scanner;

public class Compare{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter two numbers : ");
int a=scan.nextInt();
int b=scan.nextInt();

System.out.println((a==b)?a+"=="+b:a+"!="+b);
System.out.println((a<b)?a+"<"+b:a+">"+b);
System.out.println((a<=b)?a+"<="+b:a+">="+b);
}
}