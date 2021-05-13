import java.util.Scanner;

class Student{
    String name;
    int age;
    int roll;
    
    void info(){
        System.out.println("Name : " + name);
        System.out.println("age  : " + age );
        System.out.println("roll : " + roll );
    }
    
}

public class ObjArray {
    public static void main(String[] args) {
        Student obj[]=new Student[5] ;
        for (int i = 0; i < 5; i++) {
            obj[i]= new Student();
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < obj.length; i++){
            System.out.println("Enter the name of Student "+ (i+1));
            sc.next();
            obj[i].name = sc.nextLine();
            System.out.println("Enter the age of Student "+ (i+1));
            obj[i].age = sc.nextInt();
            System.out.println("Enter the roll of Student "+ (i+1));
            obj[i].roll = sc.nextInt();
            
            obj[i].info();
        }
         sc.close();
    }
}
