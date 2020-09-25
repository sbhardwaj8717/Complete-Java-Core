import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      // nested if-else :: just to check the wheter it is divisibile by a umber or not

       if(n%2==0){
           if(n% 3 ==0){
               if(n%5==0){
                   System.out.println("number is divisible by 2 and 3 and 5");
               }

               else{
                   System.out.println(" number is divisible by 2 and 3 but not by 5");
               }
           }

           else if(n % 5 ==0){
               System.out.println("nuber divisible by 2 and 5 but not divisible by 3");
           }

           else{
               System.out.println("number is divisible by 2 but not divisible  by 3 and 5");
           }
       } 
       else if(n % 3 ==0){
           if(n % 5==0){
               System.out.println("number is divisible by 3 and 5 but not by 2");
           }

           else{
               System.out.println("number is divisble by 3 but not divisible by 2 and 5");
           }
       }

       else if(n % 5==0){
           System.out.println("number is divible by 5 but not by 2 and 3");
       }

       else{
           System.out.println("number not divisible by 2 bor by 3 nor by 5");
       }


       
       
       
       
       // lader if-else
       
       
        // if(n % 5==0) 
        // System.out.println("number is divisible by 5 ");

        // else if(n % 3 ==0){
        //     System.out.println("number is divisible by 3 ");
        // }

        // else if(n % 2 == 0){
        //     System.out.println( " number is divisible by 2");
        // }

        // else{
        //     System.out.println("number not divisible by 2 or 3 or 5");
        // }

    }
}
