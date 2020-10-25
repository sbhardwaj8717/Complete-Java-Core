public class ThisKeyword {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0,2.0,3.0);
        // Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(c1);
        Circle c4 = new Circle();
    
        System.out.println("Circumference of c1 " + c1.circumference());
        System.out.println("Area of c1  " + c1.area());
        
        System.out.println("Circumference of c3 " + c3.circumference());
        System.out.println("Area of c3  " + c3.area());
        
        System.out.println("Circumference of c4 " + c4.circumference());
        System.out.println("Area of c4  " + c4.area());
    }
}
class Circle {

   double x,y,r;
   
   Circle(double x,double y,double r){
       this.x = x;
       this.y = y;
       this.r = r; 
   }

   Circle(Circle c){
       this(c.x,c.y,c.r);
   }
   
   Circle(){
       this(1.0,2.0,3.0);
   }

   double circumference(){
       return 2*Math.PI*r;
   } 
   
   double area(){
    return Math.PI*r*r;
}

}
