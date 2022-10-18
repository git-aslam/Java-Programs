// Railway Reservation System
import java.util.*;
public class RailwayReservation{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int input;
		do{
			System.out.println("\t----------------------\n\t|1.Book Ticket.      |\n\t|2.Cancel Ticket.    |\n\t|3.Booked Tickets.   |\n\t|4.Available Tickets.|\n\t|5.Exit.             |\n\t----------------------");
			input=scan.nextInt();
			switch(input){
				case 1:
					BookTicket bt=new BookTicket();
					bt.TicketBooking();
					break;
				case 2:
					CancelTicket ct=new CancelTicket();
					ct.TicketCanceling();
					break;
				case 3:
					BookedTickets bdt=new BookedTickets();
					bdt.ShowBookedTickets();
					break;
				case 4:
					AvailableTickets at=new AvailableTickets();
					at.ShowAvailableTickets();
					break;
			}
		}while(input!=5);
	}
}

class Passenger{
	Scanner scan=new Scanner(System.in);
	static int lower=2, middle=2, upper=2, totalseats=6, rac=2, wl=2;
	static String Pnr[]=new String[20], Name[]=new String[20], Gender[]=new String[20], Berth[]=new String[20];
	static int Age[]=new int[20], Fare[]=new int[20], Seatno[]=new int[20], SlNo[]=new int[20];
}

class BookTicket extends Passenger{
	static int pvalue=1351, count=0, seatno=1, slno=0;
	static String pnr;
	static BookTicket obj=new BookTicket();
	
	void TicketBooking(){
		System.out.println("\n----TICKET BOOKING PAGE----");
		System.out.println("No. of tickets : ");
		int n=scan.nextInt();
		if(n+seatno<=11){
			pnr=Integer.toString(pvalue);
			obj.SetTicket(n,pnr);
		}
		else{
			System.out.println("Ticket Unavailable");
			obj.TicketBooking();
		}
	}
	
	void SetTicket(int n, String pnr){
		for(int i=0;i<n;i++){
			SlNo[count]=++slno;
			Pnr[count]=pnr;
			System.out.println("Enter the name : ");
			String name=scan.next();
			Name[count]=name;
			System.out.println("Enter the age : ");
			int age=scan.nextInt();
			Age[count]=age;
			System.out.println("Enter the gender : ");
			String gender=scan.next();
			Gender[count]=gender;
			if(lower==0 && middle==0 && upper==0 && rac==0){
				Berth[count]="WL";
				--wl;
			}
			else if(lower==0 && middle==0 && upper==0){
				Berth[count]="RAC";
				--rac;
			}
			if(age>5){
				Seatno[count]=seatno++;
				Fare[count]=400;
			}
			else{
				Seatno[count]=0;
				Fare[count]=200;
			}
			boolean check=false;
			if(totalseats>0){
				if(age>=60){
					check=lower!=0?true:false;
					if(check==true){
						Berth[count]="Lower";
						--lower;
						--totalseats;
					}
					else{
						System.out.println("Lowerberth Unavailable");
						obj.BerthPreference(count);
					}
				}
				else{
					if(age>5)
						obj.BerthPreference(count);
					else
						Berth[count]="No Berth";
				}
			}
			count++;
		}
		++pvalue;
		System.out.println("----Ticket Booked Successfully----");
	}
	
	void BerthPreference(int count){
		System.out.println("Enter the berth preference :\n1.Lower.\n2.Middle.\n3.Upper.");
		int be=scan.nextInt();
		if(be==1)
			obj.LowerBerth(count);
		else if(be==2)
			obj.MiddleBerth(count);
		else if(be==3)
			obj.UpperBerth(count);
	}
	
	void LowerBerth(int count){
		if(lower!=0){
			Berth[count]="Lower";
			--lower;
			--totalseats;
		}
		else
			obj.MiddleBerth(count);
	}
	
	void MiddleBerth(int count){
		if(middle!=0){
			Berth[count]="Middle";
			--middle;
			--totalseats;
		}
		else
			obj.UpperBerth(count);
	}
	
	void UpperBerth(int count){
		if(upper!=0){
			Berth[count]="Upper";
			--upper;
			--totalseats;
		}
		else
			obj.LowerBerth(count);
	}
}

class CancelTicket extends Passenger{
	void TicketCanceling(){
		System.out.println("\n----TICKET CANCELING PAGE----");
		System.out.println("Enter the SlNo to cancel : ");
		int n=scan.nextInt();
		for(;n-1<19&&n<20;n++)
			if(SlNo[n-1]==n){
				Pnr[n-1]=null;
				Pnr[n-1]=Pnr[n];
				Name[n-1]=null;
				Name[n-1]=Name[n];
				Age[n-1]=0;
				Age[n-1]=Age[n];
				Gender[n-1]=null;
				Gender[n-1]=Gender[n];
			}
	}
}

class BookedTickets extends Passenger{
	void ShowBookedTickets(){
		System.out.println("SlNo\tPnr\tName\tAge\tGender\tBerth\tSeatno\tFare");
		for(int i=0;i<Seatno.length;i++)
			if(Fare[i]!=0&&Pnr[i]!=null&&Name[i]!=null&&Age[i]!=0&&Gender[i]!=null)
				System.out.println(SlNo[i]+"\t"+Pnr[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Gender[i]+"\t"+Berth[i]+"\t"+Seatno[i]+"\t"+Fare[i]);
	}
}

class AvailableTickets extends Passenger{
	void ShowAvailableTickets(){
		System.out.println("Lower\tMiddle\tUpper\tTotal Seats");
		System.out.println(lower+"\t"+middle+"\t"+upper+"\t"+totalseats);
	}
}
