/* Task-2
4. Calculate Average. */

import java.util.Scanner;

public class Average{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

float a=scan.nextFloat();
float b=scan.nextFloat();
float c=scan.nextFloat();

float avg=(a+b+c)/3;

System.out.printf("Average = %.2f",avg);
}
}