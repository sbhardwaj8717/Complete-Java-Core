import java.util.Scanner;

public class Add{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		float f = a.nextFloat();
		double d = a.nextDouble();
		String s= a.nextLine();
		System.out.println(n + "\n" + "\n"+f + "\n"+ d+ "\n" + s);
	}
}