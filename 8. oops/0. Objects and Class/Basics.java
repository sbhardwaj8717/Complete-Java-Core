public class Basics {
    public static void main(String[] args) {
        girlfriends bhavna= new girlfriends();
        bhavna.name= "Bhavna Chauhan";
        bhavna.currentStatus="we are in relationship";
        bhavna.yearOfRelation= 2019;
        bhavna.relation= "more than a Girlfriend and Boyfriend";
        bhavna.present();
    }
}


class girlfriends{
    String name, currentStatus, relation;
    int yearOfRelation;
    public void present() {
        System.out.println(name+ " and " + currentStatus +" since " +yearOfRelation+ "." );
        System.out.println("now we are "+ relation + ".");
    }
}
