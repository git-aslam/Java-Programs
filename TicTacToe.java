// TIC-TAC-TOE Game. ST-11:30 & ET-12:45
import java.util.*;
public class TicTacToe{
	static char a[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	static char p1='X', p2='O';
	static int count=0, check=0;
	static Scanner scan=new Scanner(System.in);
	public static void main(String[]args){
		Print(a);
		System.out.println("Choose 'X' or 'O' : ");
		char choice=scan.next().charAt(0);
		if(choice=='X')
			Player1(a,p1,p2);
		else
			Player2(a,p2,p1);
	}
	
	public static void Player1(char a[][], char p1, char p2){
		System.out.println("\nPlayer 1");
		System.out.println("\nEnter a slot number : ");
		char x=scan.next().charAt(0);
		boolean c=true;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(x==a[i][j]){
					c=false;
					a[i][j]=p1;
				}
		CheckSlot(a,p1);
		if(c){
			System.out.println("\nRenter a slot number correctly!");
			Player1(a,p1,p2);
		}
		++count;
		Print(a);
		if(count==9){
			System.out.println("Game is Draw!");
			return;
		}
		if(check==0)
			Player2(a,p2,p1);
	}
	
	public static void Player2(char a[][], char p2, char p1){
		System.out.println("\nPlayer 2");
		System.out.println("\nEnter a slot number : ");
		char o=scan.next().charAt(0);
		boolean c=true;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(o==a[i][j]){
					c=false;
					a[i][j]=p2;
				}
		CheckSlot(a,p2);
		if(c){
			System.out.println("\nRenter a slot number correctly!");
			Player2(a,p2,p1);
		}
		++count;
		Print(a);
		if(count==9){
			System.out.println("Game is Draw!");
			return;
		}
		if(check==0)
			Player1(a,p1,p2);
	}
	
	public static void CheckSlot(char a[][], char s){
		int count1=0, count2=0, count3=0, count4=0;
		for(int i=0;i<3;i++){
			int m=0;
			for(int j=0;j<3;j++){
				if(a[i][m]==s){
					m++;
					count1++;
					if(count1==3){
						check=1;
						Print(a);
						System.out.println("Congratulations! "+s+"'s have won!");
						return;
					}
				}
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j&&a[i][j]==s){
					count2++;
					if(count2==3){
						check=1;
						Print(a);
						System.out.println("Congratulations! "+s+"'s have won!");
						System.exit(0);
					}
				}
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]==s){
					count3=0;
					for(int m=i;m<3;m++){
						if(a[m][j]==s)
						{
							count3++;
							if(count3==3){
								check=1;
								Print(a);
								System.out.println("Congratulations! "+s+"'s have won!");
								System.exit(0);
							}
						}
					}
				}
			}
		}
		for(int i=0,j=2;i<3&&j>=0;i++,j--){
			if(a[i][j]==s){
				count4++;
				if(count4==3){
					check=1;
					Print(a);
					System.out.println("Congratulations! "+s+"'s have won!");
					System.exit(0);
				}
			}
		}
	}
	
	public static void Print(char a[][]){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}