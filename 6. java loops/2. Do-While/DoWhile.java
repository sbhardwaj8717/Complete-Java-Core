import java.util.*;


public class DoWhile{
	public static void main(String... spapaji){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		do{
			System.out.println(i);
			i--;
		}while(i >0);
	}
}