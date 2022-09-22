/* Task-2
3. Write a Java program to print the area and perimeter of a circle.
Input : Radius=7.5
Output : Perimeter=47.12388980384689
         Area=176.71458676442586 */

import java.util.Scanner;
public class AreaPerimeter{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the Radius : ");
double r=scan.nextDouble();
double a=3.14159265358979*r*r;
double p=2*3.14159265358979*r;

System.out.printf("Area = %.14f\n",p);
System.out.printf("Perimeter = %.14f",a);
}
}