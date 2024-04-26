import java.util.*;

class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of Circle = ");
        double radius = input.nextFloat();
        double Area = Math.PI * Math.pow(radius, 2);
        System.out.println("Pi is = "+Math.PI);
        System.out.println("Area of Circle is = "+Area);
        input.close();
    }    
}
