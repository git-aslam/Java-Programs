/* String & Array
3. Check Twisted Prime Number. */

import java.util.Scanner;

public class TwistedPrime{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the number : ");
int n=scan.nextInt();

int rev, sum=0, flag=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
System.out.println("Not a Prime Number.");
flag=1;
}
}

if(flag==0){
while(n!=0){
rev=n%10;
sum=sum*10+rev;
n=n/10;
}

for(int i=2;i<=sum/2;i++){
if((sum%i)==0){
flag=1;
break;
}
}

if(flag==0)
System.out.println("Twisted Prime Number.");
else
System.out.println("Not a Twisted Prime Number.");
}
}
}