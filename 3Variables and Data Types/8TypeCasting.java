import java.util.Scanner;

class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of Double Number = ");
        double d1 = input.nextDouble();
        int i1 = (int) d1;
        System.out.println("Double to int Type Casting is = "+i1);
        input.close();
    }
}
