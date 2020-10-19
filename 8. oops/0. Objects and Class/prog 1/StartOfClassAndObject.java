 class Cat{
    boolean hasFur;
    String color, breed;                        // state of the class
    int legs, eyes;
    public void walk(){                         // behaviour of the class
        System.out.println("Cat is walking");   
    }
    public void eat(){
        System.out.println("Cat is eating");     // behaviour of the calss
    }

    public void discription(){
        System.out.println("My cat has " + legs + " legs and "+ eyes + " eyes" );
    }


}

public class StartOfClassAndObject{
    public static void main(String... args){
         Cat cat1 = new Cat();
         Cat cat2 = new Cat();
         
        cat1.walk();
        cat2.eat();

        cat1.legs = 4;
        cat1.eyes = 2;
        cat2.legs = 5;
        cat2.eyes = 3;

        cat1.discription();
        cat2.discription();

    }
}