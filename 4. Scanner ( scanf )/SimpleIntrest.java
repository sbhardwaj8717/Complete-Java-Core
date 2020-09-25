//PROGRAM FOR SIMPLE INTREST ON USER DATA


import java.util.Scanner;
public class SimpleIntrest{
	public static void main(String[] args){

		Scanner ob=new Scanner(System.in);
		System.out.print("Principal=");
		int pri=ob.nextInt();
		System.out.print("Rate=");
		float rate=ob.nextFloat();
		System.out.print("Time=");
		int time=ob.nextInt();
		
		float si=pri*rate*time/100;
		System.out.print("Simple Interest=");
		System.out.print(si);
	}
}