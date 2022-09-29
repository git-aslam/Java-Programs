/* Login Form */
import java.util.Scanner;

public class LoginForm2{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
String uname="Aslam", password="Aslam7812";
	System.out.println("1. CreateAccount.");
	System.out.println("2. LoginAccount.");
	int n=scan.nextInt();	
	switch(n){
		case 1:
			Log.CreateAccount();
			break;
		case 2:
			Log.LoginAccount(uname, password);
			break;
		}
	}
}

class Log{
public static void CreateAccount(){
Scanner scan=new Scanner(System.in);
	System.out.println("\n----SIGN-UP PAGE----");

	System.out.println("\nEnter Username : ");
		String uname=scan.next();
	System.out.println("Enter Email-ID : ");
		String email_id=scan.next();
	System.out.println("Create Password : ");
		String password=scan.next();
	System.out.println("Confirm Password : ");
		String con_password=scan.next();
	if(password.equals(con_password)){
		System.out.println("\n----Your Account is Created----");
		Log.LoginAccount(uname, password);
	}
	else{
		System.out.println("\nRe-enter your details correctly");
		Log.CreateAccount();
	}
}

public static void LoginAccount(String uname, String password){
Scanner scan=new Scanner(System.in);
	System.out.println("\n----LOG-IN PAGE----");
	
	System.out.println("\nEnter Username : ");
		String uname1=scan.next();
	System.out.println("Enter Password : ");
		String password1=scan.next();
	if((uname.equals(uname1))&&(password.equals(password1)))
		System.out.println("\n------Logged In Sussessfully------");
	else{
		System.out.println("\nInvalid Username or Password");
		Log.LoginAccount(uname, password);
	}
}
}