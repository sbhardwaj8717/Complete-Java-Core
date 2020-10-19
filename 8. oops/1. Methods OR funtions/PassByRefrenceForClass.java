
/**
 * PassByRefrenceForClass
 */
public class PassByRefrenceForClass {

    static void ref(Cat billi, Cat billa){
        billi.legs = 10;
        billi.eyes = 20;

        billa.legs = 30;
        billa.eyes = 40;

        System.out.println("BIlli Eyes = "+ billi.eyes + " and BIlli leges = " + billi.legs);
        System.out.println("BIlla Eyes = "+ billa.eyes + " and BIlla leges = " + billa.legs);

    }

    public static void main(String[] args) {
        Cat billi = new Cat();
        Cat billa = new Cat();

        billi.legs = 4;
        billi.eyes = 2;

        billa.legs = 2;
        billa.eyes = 3;
        
        ref(billi , billa);

        System.out.println("BIlli Eyes = "+ billi.eyes + " and BIlli leges = " + billi.legs);
        System.out.println("BIlla Eyes = "+ billa.eyes + " and BIlla leges = " + billa.legs);
    }
}

class Cat{
    int legs, eyes;
}