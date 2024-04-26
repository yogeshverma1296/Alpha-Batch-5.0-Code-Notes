import java.util.Scanner;

class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of Number = ");
        float n1 = input.nextInt();
        // allowed in java, int -> float implicit type conversion
        System.out.println("Number is = "+n1); 
        input.close();
    }
}