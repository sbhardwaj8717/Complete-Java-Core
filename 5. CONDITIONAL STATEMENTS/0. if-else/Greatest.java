// program for greatest one

import java.util.Scanner;
public class Greatest{
	public static void main(String[] shiiHai){
		Scanner ob= new Scanner(System.in);
		System.out.print("num 1=");		
		int a=ob.nextInt();
		System.out.print("num 2=");		
		int b=ob.nextInt();
		System.out.print("num 3=");		
		int c=ob.nextInt();

		if(a>b){
			if(a>c){
				System.out.println("num 1="+ a + "is greatest");		
			}
			else{
				System.out.println("num 3="+ c + "is greatest");
			}
		}
		else{
			if(b>c){
				System.out.println("num 1="+ a + "is greatest");
			}
			else{
				System.out.println("num 3="+ c + "is greatest");
			}
		}
	}
}