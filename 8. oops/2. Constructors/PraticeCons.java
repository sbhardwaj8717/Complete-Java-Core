class Car{
    int wheels;
    Car(){                          // null constructor
        wheels = 4;
    }

    Car(int wheels){                // parameterized constructor && method overloading with THIS keyword
        this.wheels = wheels;
    }
}
public class PraticeCons {

    public static void main(String[] args) {
        // MyCons myCons = new MyCons(); 

        Car car1 = new Car();
       // car.wheels = 4;
       System.out.println(car1.wheels);
    }
}

// class MyCons{
//     MyCons(){
//         System.out.println("hnn bhaiya main he hu constructor");
//     }
// }