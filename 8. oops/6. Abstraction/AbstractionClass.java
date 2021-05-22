abstract class Parent{
    public void sayHello(){
        System.out.println("Hellooo coder...");
    }
    abstract public void greet();
    abstract public void keyNote();
}

abstract class ChildClass extends Parent{
    
    public void about(){
        System.out.println(" Hey Great coder this is also a abstract class");
    }
}
class Child extends Parent{
    
   @Override
   public void sayHello() {
       super.sayHello();
   }

   @Override
   public void greet() {
       System.out.println("Good morning coder...have a cup of coffee");
   }

    @Override
    public void keyNote() {
    System.out.println("All the abstract methods should be implemented");
    
    }
}

public class AbstractionClass {
    public static void main(String[] args) {        
        Child c1 = new Child();
        c1.greet();
        c1.sayHello();
    }
}