public class PassByValue{

	static void passByValue(int a){
		a = 30;
		
		System.out.println("a = " +a +" is changed");
	}
	
	public static void main(String... args){
		int a = 20;
		passByValue(a);
		System.out.println("a = " +a +" is not changed");
	}
}