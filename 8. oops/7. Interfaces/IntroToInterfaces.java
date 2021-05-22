 interface New{
    void acceleration(int increcrement);
    String str = "By default this is final so you can not change the value of interfaces";
    String str2 = "But can be changed by class that impliments it";
}

interface Car {
   void acceleration(int increment);
   void deacceleration(int decrement);
   void discription(); 
}

class Tesla implements Car,New {
    private int speed;
    void initSpeed(int speed){
        this.speed = speed;
        System.out.println("Current Speed ::-  " + this.speed);
    }
    @Override
    public void acceleration(int increment) {
        speed = speed + increment;
        System.out.println("Incremented speed ::-  " + this.speed);
    }
    @Override
    public void deacceleration(int decrement) {
        speed -= decrement;
        System.out.println("Decremented speed ::-  "+ this.speed);
    }
    @Override
    public void discription() {
        System.out.println("This is an Example of a  Interface.");
    }

    public String str2 = "yes it can be changed or you may say it can be overridable";
}

public class IntroToInterfaces {
     public static void main(String[] args) {
         Tesla tesla = new Tesla();
         tesla.initSpeed(10);
         tesla.acceleration(90);
         tesla.deacceleration(20);
         System.out.println(tesla.str);
         System.out.println(tesla.str2);
     }
}
