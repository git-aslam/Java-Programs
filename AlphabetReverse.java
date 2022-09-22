import java.util.Scanner;

public class AlphabetReverse{
public static void main(String[]args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter a String : ");
String s=scan.nextLine();

char sa='a';
char ba='A';
int temp=0;

for(int i=0;i<s.length();i++){
if('a'<=s.charAt(i) && s.charAt(i)<='z'){
temp='z'-s.charAt(i);
System.out.printf("%c",sa+temp);
}

else if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
temp='Z'-s.charAt(i);
System.out.printf("%c",ba+temp);
}

}
}
}