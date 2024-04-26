import java.util.Scanner;

class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Number 1 = ");
        int num1 = input.nextInt();
        System.out.println("Enter Value of Number 2 = ");
        int num2 = input.nextInt();

        System.out.println("Relational Operator in Java = ");
        System.out.println("Number 1 Greater than Number 2 = "+(num1>num2));
        System.out.println("Number 1 Lesser than Number 2 = "+(num1<num2));
        System.out.println("Number 1 Greater than or Equal to Number 2 = "+(num1>=num2));
        System.out.println("Number 1 Lesser than or Equal to Number 2 = "+(num1<=num2));
        System.out.println("Number 1 is equal to Number 2 = "+(num1==num2));
        System.out.println("Number 1 is not equal to Number 2 = "+(num1!=num2));


        input.close();
    }
}
