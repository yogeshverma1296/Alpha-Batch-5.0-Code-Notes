import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        int num1, num2, product;
        System.out.println("Enter the Value of Two Numbers = ");
        Scanner input = new Scanner(System.in);

        // input 
        System.out.print("Enter the Value of Number 1 = ");
        num1 = input.nextInt();
        System.out.print("Enter the Value of Number 2 = ");
        num2 = input.nextInt();

        // sum 
        product = num1 * num2;
        System.out.println("Product of Two Numbers = "+product);

        // input close
        input.close();
    }    
}

