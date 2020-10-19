public class Functions {
    public static void main(String[] args) {
        int a=5, b=7;        // initialition of values
        maxOfNum(a,b);       // function calling

        maxOfNum(8717, 80);

        maxOfNum(10, 12);
    }

    static void maxOfNum(int num1,int num2){            // this is pass by value for primative data types & pass by refrence for non- primative data types.
        System.out.println(num1 > num2 ? num1 : num2);
    }
}







