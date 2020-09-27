// fabinici series 0 1 1 2 3 5 8 13 21 34 55 89 144......


public class Febi{
	public static void main(String[] ars){
		long a=0,b=1,sum;
		System.out.print(a+"  "+b);
		for (int i=1; i<101 ; i++){
			sum=a+b;
			System.out.print("  "+sum);
			a=b;
			b=sum;
		}
	}
}