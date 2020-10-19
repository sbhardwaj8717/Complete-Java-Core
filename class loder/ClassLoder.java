// programm to print the name of the classloder

public class ClassLoder{
	public static void main(String... args){
		// Let's print the class loder of the current class.
		// Application / system classLoder will load this class
		
		Class c =  ClassLoder.class;
		System.out.println(c.getClassLoader());

		// If we print the class loder name of String, it will print null because it is an in-built class which is found in rt.jar, so it is loded by bootstrap class loader

		System.out.println(String.class.getClassLoader());
		System.out.println(Integer.class.getClassLoader());
	}
}