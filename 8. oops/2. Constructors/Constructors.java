public class Constructors {

    // this is used to initialize the value in the objects at the time of creatting them. This method is known is constructors.
    // it is similar to method...there is no return type...name is same as the class name

    //4 example ::---
        //   class Test{
        //     Text(){
        //         Constructor's body
        //     }
        //   }

        public static void main(String[] args) {
            Friends billli = new Friends("yuvraj");
            Friends shik = new Friends("Shikhar");


            This useOfThisKeyword= new This(5);


            ConsOverLoad first= new ConsOverLoad();
            ConsOverLoad second= new ConsOverLoad("second");
            ConsOverLoad third= new ConsOverLoad(3);
        }
}

class Friends{
    
    Friends(String name){
        System.out.println( name+ " chutiya hai tu bhosdike");
    }
} 

class This{
    int number;
    This(int number){
        this.number = number;     // this holds the refrence of the current object in it  
        System.out.println(number + " is a number");
    }
}

// constructor overloding....
// this is the process in which more than one single constructor can be created with the same name but must be diffrent in parameters passing through them.

class ConsOverLoad{
    ConsOverLoad(){
        System.out.println("This is the first constroctor");
    }
    ConsOverLoad(String second){
        System.out.println("this is " + second + " constructor.");
    }
    ConsOverLoad(int num){

        System.out.println("this is "+ num + "rd constructor.");
    }
}