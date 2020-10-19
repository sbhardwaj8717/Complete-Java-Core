import sun.tools.tree.ReturnStatement;

public class Parent {
    void info(){
        System.out.println("The object of parent class");
    }

    private String name = null;
    private int age ;
    private boolean alive = false;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        if(age != 0)
            return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        if(age != null)
            return age;
    }

    void setAlive(boolean alive){
        this.alive = alive;
    }
    boolean getAlive(){
        return alive;
    }

    void completeInfo(String clas){
        System.out.println("This is the object of "+ clas +

        "\n" +"parent name::-- "+ name + 
        "\nParent Age::-- " + age + 
        "\nLiving Status::-- "+ alive);
    }
}