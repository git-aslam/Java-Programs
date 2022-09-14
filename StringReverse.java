//1.
class StringReverse{
public static void main(String[]args){
String s="i.like.this.program.very.much";
String a[]=s.split("[.]");
for(int i=a.length-1;i>=0;i--)
System.out.print(a[i]+".");
}
}
